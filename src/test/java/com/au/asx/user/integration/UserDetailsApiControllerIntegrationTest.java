package com.au.asx.user.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.au.asx.user.Application;
import com.au.asx.user.model.UserDetailRequest;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserDetailsApiControllerIntegrationTest {
	
	@LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();
    
    @Test
    public void testRetrieveUserDetails() throws JSONException {

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/api/userDetails/1"),
                HttpMethod.GET, entity, String.class);

        String expected = "{\"title\":\"MRS\",\"firstName\":\"KAREN\",\"lastName\":\"OSKA\",\"gender\":\"FEMALE\",\"address\":{\"street\":\"LEONE AVE\",\"city\":\"SYDNEY\",\"state\":\"NSW\",\"postcode\":2000}}";

        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
	
    @Test
	public void updateUserDetails() {

    	UserDetailRequest userDetailRequest = new UserDetailRequest();
    	userDetailRequest.setFirstName("raj");
    	userDetailRequest.setLastName("romm");

		HttpEntity<UserDetailRequest> entity = new HttpEntity<UserDetailRequest>(userDetailRequest, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/api/userDetails/2"),
				HttpMethod.POST, entity, String.class);

		boolean actual = response.getStatusCode().is2xxSuccessful();

		assertEquals(true, actual);

	}

}
