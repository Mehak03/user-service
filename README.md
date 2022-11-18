# springboot-userservice
This project retrieves/updates user details into the database.
Technologies used in this project are : 
1. Java 8
2. Spring Boot
3. JPA
4. Maven
5. H2 database

Once you run the application, spring boot will load the sql file to create a table in H2 databse.You can view the table created at this URL : 
http://localhost:8000/h2-console.

#Instructions

Unzip the contents manually and expand the contents someplace on your system

#Prerequisites Have a jdk installed Have Maven installed and available on your PATH or IDE

#Assumptions
1. user can only update and retrieve details, not create new one.
2. db password has been written as clear text. Program can be enhanced to use encryption to encrypt keys.

#Notes:
1. Screenshots attached for onloaded db data in src/main/api
2. postman collection is also added in src/main/api
3. pact contract file gets generated in target/mypacts

#Verify Installation

Open a command prompt & run mvn clean install

[INFO] Scanning for projects...
[INFO] 
[INFO]  ----------------------< [0;36mcom.au.asx:user-service[0;1m >-----------------------[m
[INFO]  Building user-service 0.0.1-SNAPSHOT[m
[INFO]  --------------------------------[ jar ]---------------------------------[m
[INFO] 
[INFO]  --- [0;32mmaven-resources-plugin:3.2.0:resources[m [1m(default-resources)[m @ [36muser-service[0;1m ---[m
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 2 resources
[INFO] 
[INFO]  --- [0;32mmaven-compiler-plugin:3.10.1:compile[m [1m(default-compile)[m @ [36muser-service[0;1m ---[m
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO]  --- [0;32mmaven-resources-plugin:3.2.0:testResources[m [1m(default-testResources)[m @ [36muser-service[0;1m ---[m
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory C:\Users\mehak\eclipse-workspace\user-service\src\test\resources
[INFO] 
[INFO]  --- [0;32mmaven-compiler-plugin:3.10.1:testCompile[m [1m(default-testCompile)[m @ [36muser-service[0;1m ---[m
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to C:\Users\mehak\eclipse-workspace\user-service\target\test-classes
[INFO] 
[INFO]  --- [0;32mmaven-surefire-plugin:2.22.2:test[m [1m(default-test)[m @ [36muser-service[0;1m ---[m
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.au.asx.user.controller.[1mUserDetailsApiControllerTest[m
[INFO ] 2022-11-18 13:22:23.802 [main] DefaultTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.au.asx.user.controller.UserDetailsApiControllerTest], using DelegatingSmartContextLoader
[INFO ] 2022-11-18 13:22:23.811 [main] AbstractContextLoader - Could not detect default resource locations for test class [com.au.asx.user.controller.UserDetailsApiControllerTest]: no resource found for suffixes {-context.xml, Context.groovy}.
[INFO ] 2022-11-18 13:22:23.812 [main] AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.au.asx.user.controller.UserDetailsApiControllerTest]: UserDetailsApiControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
[INFO ] 2022-11-18 13:22:23.857 [main] DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
[INFO ] 2022-11-18 13:22:23.875 [main] DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@f9390f, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@d7c83, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@16b75f7, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@165be2d, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@9c54f, org.springframework.test.context.support.DirtiesContextTestExecutionListener@1e74829, org.springframework.test.context.transaction.TransactionalTestExecutionListener@16f416f, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@18f0a79, org.springframework.test.context.event.EventPublishingTestExecutionListener@1e693fa, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@793bef, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@1286fb6, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@b77ea8, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@18b43c7, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@aca91a, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@c73c26]
[WARN ] 2022-11-18 13:22:24.343 [main] DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer - 

Found multiple occurrences of org.json.JSONObject on the class path:

	jar:file:/C:/Users/mehak/.m2/repository/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar!/org/json/JSONObject.class
	jar:file:/C:/Users/mehak/.m2/repository/org/json/json/20160212/json-20160212.jar!/org/json/JSONObject.class

You may wish to exclude one of them to ensure predictable runtime behavior

[INFO ] 2022-11-18 13:22:24.682 [main] MockServletContext - Initializing Spring TestDispatcherServlet ''
[INFO ] 2022-11-18 13:22:24.682 [main] TestDispatcherServlet - Initializing Servlet ''
[INFO ] 2022-11-18 13:22:24.684 [main] TestDispatcherServlet - Completed initialization in 2 ms
[INFO ] 2022-11-18 13:22:24.728 [main] UserDetailsApiController - inside retrieveUserDetails for user: 123
[INFO ] 2022-11-18 13:22:24.802 [main] MockServletContext - Initializing Spring TestDispatcherServlet ''
[INFO ] 2022-11-18 13:22:24.802 [main] TestDispatcherServlet - Initializing Servlet ''
[INFO ] 2022-11-18 13:22:24.802 [main] TestDispatcherServlet - Completed initialization in 0 ms
[INFO ] 2022-11-18 13:22:24.845 [main] UserDetailsApiController - inside updateUserDetails for user: 123
[INFO] [1;32mTests run: [0;1;32m2[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.373 s - in com.au.asx.user.controller.[1mUserDetailsApiControllerTest[m
[INFO] Running com.au.asx.user.integration.[1mUserDetailsApiControllerIntegrationTest[m
[INFO ] 2022-11-18 13:22:24.857 [main] SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.au.asx.user.integration.UserDetailsApiControllerIntegrationTest], using SpringBootContextLoader
[INFO ] 2022-11-18 13:22:24.858 [main] AbstractContextLoader - Could not detect default resource locations for test class [com.au.asx.user.integration.UserDetailsApiControllerIntegrationTest]: no resource found for suffixes {-context.xml, Context.groovy}.
[INFO ] 2022-11-18 13:22:24.917 [main] SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
[INFO ] 2022-11-18 13:22:24.918 [main] SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@16e281a, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@1cda16e, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@1d903be, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@e0f1cb, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@163575, org.springframework.test.context.support.DirtiesContextTestExecutionListener@642b88, org.springframework.test.context.transaction.TransactionalTestExecutionListener@1350309, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@cec90d, org.springframework.test.context.event.EventPublishingTestExecutionListener@188f63c, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@6fa56e, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@181d861, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@18ffcfd, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1f4c1e6, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@174a23, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@142d610]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.5)

[WARN ] 2022-11-18 13:22:25.529 [main] DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer - 

Found multiple occurrences of org.json.JSONObject on the class path:

	jar:file:/C:/Users/mehak/.m2/repository/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar!/org/json/JSONObject.class
	jar:file:/C:/Users/mehak/.m2/repository/org/json/json/20160212/json-20160212.jar!/org/json/JSONObject.class

You may wish to exclude one of them to ensure predictable runtime behavior

[INFO ] 2022-11-18 13:22:25.535 [main] UserDetailsApiControllerIntegrationTest - Starting UserDetailsApiControllerIntegrationTest using Java 1.8.0_202 on mehak_pc with PID 5880 (started by mehak in C:\Users\mehak\eclipse-workspace\user-service)
[INFO ] 2022-11-18 13:22:25.538 [main] UserDetailsApiControllerIntegrationTest - No active profile set, falling back to 1 default profile: "default"
[INFO ] 2022-11-18 13:22:25.997 [main] RepositoryConfigurationDelegate - Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[INFO ] 2022-11-18 13:22:26.041 [main] RepositoryConfigurationDelegate - Finished Spring Data repository scanning in 35 ms. Found 1 JPA repository interfaces.
[INFO ] 2022-11-18 13:22:26.667 [main] TomcatWebServer - Tomcat initialized with port(s): 0 (http)
[INFO ] 2022-11-18 13:22:26.726 [main] Http11NioProtocol - Initializing ProtocolHandler ["http-nio-auto-1"]
[INFO ] 2022-11-18 13:22:26.727 [main] StandardService - Starting service [Tomcat]
[INFO ] 2022-11-18 13:22:26.727 [main] StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.68]
[INFO ] 2022-11-18 13:22:26.811 [main] [/api] - Initializing Spring embedded WebApplicationContext
[INFO ] 2022-11-18 13:22:26.811 [main] ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 1102 ms
[INFO ] 2022-11-18 13:22:26.852 [main] HikariDataSource - HikariPool-1 - Starting...
[INFO ] 2022-11-18 13:22:27.026 [main] HikariDataSource - HikariPool-1 - Start completed.
[INFO ] 2022-11-18 13:22:27.037 [main] H2ConsoleAutoConfiguration - H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:dcbapp'
[INFO ] 2022-11-18 13:22:27.180 [main] LogHelper - HHH000204: Processing PersistenceUnitInfo [name: default]
[INFO ] 2022-11-18 13:22:27.229 [main] Version - HHH000412: Hibernate ORM core version 5.6.12.Final
[INFO ] 2022-11-18 13:22:27.269 [main] Version - HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
[INFO ] 2022-11-18 13:22:27.384 [main] Dialect - HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
[INFO ] 2022-11-18 13:22:27.784 [main] JtaPlatformInitiator - HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
[INFO ] 2022-11-18 13:22:27.793 [main] LocalContainerEntityManagerFactoryBean - Initialized JPA EntityManagerFactory for persistence unit 'default'
[WARN ] 2022-11-18 13:22:28.069 [main] JpaBaseConfiguration$JpaWebConfiguration - spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[INFO ] 2022-11-18 13:22:28.513 [main] Http11NioProtocol - Starting ProtocolHandler ["http-nio-auto-1"]
[INFO ] 2022-11-18 13:22:28.536 [main] TomcatWebServer - Tomcat started on port(s): 64113 (http) with context path '/api'
[INFO ] 2022-11-18 13:22:28.542 [main] UserDetailsApiControllerIntegrationTest - Started UserDetailsApiControllerIntegrationTest in 3.225 seconds (JVM running for 5.555)
[INFO ] 2022-11-18 13:22:28.644 [http-nio-auto-1-exec-1] [/api] - Initializing Spring DispatcherServlet 'dispatcherServlet'
[INFO ] 2022-11-18 13:22:28.644 [http-nio-auto-1-exec-1] DispatcherServlet - Initializing Servlet 'dispatcherServlet'
[INFO ] 2022-11-18 13:22:28.645 [http-nio-auto-1-exec-1] DispatcherServlet - Completed initialization in 1 ms
[INFO ] 2022-11-18 13:22:28.658 [http-nio-auto-1-exec-1] UserDetailsApiController - inside updateUserDetails for user: 2
[INFO ] 2022-11-18 13:22:28.658 [http-nio-auto-1-exec-1] UserServiceImpl - Inside method updateUserDetails for userId: 2
[INFO ] 2022-11-18 13:22:28.747 [http-nio-auto-1-exec-1] UserServiceImpl - Exisitng method updateUserDetails for userId: 2
[INFO ] 2022-11-18 13:22:28.784 [http-nio-auto-1-exec-2] UserDetailsApiController - inside retrieveUserDetails for user: 1
[INFO ] 2022-11-18 13:22:28.784 [http-nio-auto-1-exec-2] UserServiceImpl - Inside method retrieveUserDetails for userId: 1
[INFO ] 2022-11-18 13:22:28.787 [http-nio-auto-1-exec-2] UserServiceImpl - Exisitng method retrieveUserDetails for userId: 1
[INFO] [1;32mTests run: [0;1;32m2[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.924 s - in com.au.asx.user.integration.[1mUserDetailsApiControllerIntegrationTest[m
[INFO] Running com.au.asx.user.pact.[1mPactUserProviderTest[m

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.5)

[INFO ] 2022-11-18 13:22:28.841 [main] ForkedBooter - Starting ForkedBooter v2.22.2 using Java 1.8.0_202 on mehak_pc with PID 5880 (started by mehak in C:\Users\mehak\eclipse-workspace\user-service)
[INFO ] 2022-11-18 13:22:28.841 [main] ForkedBooter - No active profile set, falling back to 1 default profile: "default"
[INFO ] 2022-11-18 13:22:29.036 [main] RepositoryConfigurationDelegate - Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[INFO ] 2022-11-18 13:22:29.045 [main] RepositoryConfigurationDelegate - Finished Spring Data repository scanning in 9 ms. Found 1 JPA repository interfaces.
[INFO ] 2022-11-18 13:22:29.112 [main] TomcatWebServer - Tomcat initialized with port(s): 8000 (http)
[INFO ] 2022-11-18 13:22:29.113 [main] Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8000"]
[INFO ] 2022-11-18 13:22:29.113 [main] StandardService - Starting service [Tomcat]
[INFO ] 2022-11-18 13:22:29.113 [main] StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.68]
[INFO ] 2022-11-18 13:22:29.119 [main] [/api] - Initializing Spring embedded WebApplicationContext
[INFO ] 2022-11-18 13:22:29.119 [main] ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 275 ms
[INFO ] 2022-11-18 13:22:29.128 [main] HikariDataSource - HikariPool-2 - Starting...
[INFO ] 2022-11-18 13:22:29.129 [main] HikariDataSource - HikariPool-2 - Start completed.
[INFO ] 2022-11-18 13:22:29.129 [main] H2ConsoleAutoConfiguration - H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:dcbapp'
[INFO ] 2022-11-18 13:22:29.145 [main] LogHelper - HHH000204: Processing PersistenceUnitInfo [name: default]
[INFO ] 2022-11-18 13:22:29.149 [main] Dialect - HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
[INFO ] 2022-11-18 13:22:29.177 [main] JtaPlatformInitiator - HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
[INFO ] 2022-11-18 13:22:29.178 [main] LocalContainerEntityManagerFactoryBean - Initialized JPA EntityManagerFactory for persistence unit 'default'
[WARN ] 2022-11-18 13:22:29.202 [main] JpaBaseConfiguration$JpaWebConfiguration - spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[INFO ] 2022-11-18 13:22:29.280 [main] Http11NioProtocol - Starting ProtocolHandler ["http-nio-8000"]
[INFO ] 2022-11-18 13:22:29.282 [main] TomcatWebServer - Tomcat started on port(s): 8000 (http) with context path '/api'
[INFO ] 2022-11-18 13:22:29.285 [main] ForkedBooter - Started ForkedBooter in 0.47 seconds (JVM running for 6.299)

Verifying a pact between userservice_consumer and userservice_provider
  Given test GET
  GET REQUEST
[INFO ] 2022-11-18 13:22:30.069 [http-nio-8000-exec-1] [/api] - Initializing Spring DispatcherServlet 'dispatcherServlet'
[INFO ] 2022-11-18 13:22:30.069 [http-nio-8000-exec-1] DispatcherServlet - Initializing Servlet 'dispatcherServlet'
[INFO ] 2022-11-18 13:22:30.070 [http-nio-8000-exec-1] DispatcherServlet - Completed initialization in 1 ms
[INFO ] 2022-11-18 13:22:30.086 [http-nio-8000-exec-1] UserDetailsApiController - inside retrieveUserDetails for user: 1
[INFO ] 2022-11-18 13:22:30.086 [http-nio-8000-exec-1] UserServiceImpl - Inside method retrieveUserDetails for userId: 1
[INFO ] 2022-11-18 13:22:30.090 [http-nio-8000-exec-1] UserServiceImpl - Exisitng method retrieveUserDetails for userId: 1
    returns a response which
      has status code 200 (OK)
      includes headers
        "Content-Type" with value "application/json" (OK)
      has a matching body (OK)

Verifying a pact between userservice_consumer and userservice_provider
  Given test POST
  POST REQUEST
[INFO ] 2022-11-18 13:22:30.394 [http-nio-8000-exec-2] UserDetailsApiController - inside updateUserDetails for user: 2
[INFO ] 2022-11-18 13:22:30.395 [http-nio-8000-exec-2] UserServiceImpl - Inside method updateUserDetails for userId: 2
[INFO ] 2022-11-18 13:22:30.398 [http-nio-8000-exec-2] UserServiceImpl - Exisitng method updateUserDetails for userId: 2
    returns a response which
      has status code 200 (OK)
      has a matching body (OK)
[WARN ] 2022-11-18 13:22:30.405 [main] TestResultAccumulator - Skipping publishing of verification results as it has been disabled (pact.verifier.publishResults is not 'true')
[INFO] [1;32mTests run: [0;1;32m2[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.592 s - in com.au.asx.user.pact.[1mPactUserProviderTest[m
[INFO] Running com.au.asx.user.pact.[1mUserDetailsApiControllerPactTest[m
[INFO] [1;32mTests run: [0;1;32m1[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.357 s - in com.au.asx.user.pact.[1mUserDetailsApiControllerPactTest[m
[INFO] Running com.au.asx.user.service.[1mUserServiceImplTest[m
[INFO ] 2022-11-18 13:22:30.769 [main] DefaultTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.au.asx.user.service.UserServiceImplTest], using DelegatingSmartContextLoader
[INFO ] 2022-11-18 13:22:30.769 [main] AbstractContextLoader - Could not detect default resource locations for test class [com.au.asx.user.service.UserServiceImplTest]: no resource found for suffixes {-context.xml, Context.groovy}.
[INFO ] 2022-11-18 13:22:30.769 [main] AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.au.asx.user.service.UserServiceImplTest]: UserServiceImplTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
[INFO ] 2022-11-18 13:22:30.771 [main] DefaultTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
[INFO ] 2022-11-18 13:22:30.771 [main] DefaultTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@138ee0e, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@40e456, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@1f40273, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@1467fc6, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@128a07e, org.springframework.test.context.support.DirtiesContextTestExecutionListener@e19b99, org.springframework.test.context.transaction.TransactionalTestExecutionListener@18bfeec, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@1490054, org.springframework.test.context.event.EventPublishingTestExecutionListener@1487d13, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@1bd10f0, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@1d7e8b5, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@e71bbb, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1d49d1, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@11eff72, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@1f43664]
[INFO ] 2022-11-18 13:22:30.818 [main] UserServiceImpl - Inside method retrieveUserDetails for userId: 0
[ERROR] 2022-11-18 13:22:30.818 [main] UserServiceImpl - User for userId 0 does not exists
[INFO ] 2022-11-18 13:22:30.824 [main] UserServiceImpl - Inside method retrieveUserDetails for userId: 0
[INFO ] 2022-11-18 13:22:30.824 [main] UserServiceImpl - Exisitng method retrieveUserDetails for userId: 0
[INFO] [1;32mTests run: [0;1;32m2[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.054 s - in com.au.asx.user.service.[1mUserServiceImplTest[m
[INFO ] 2022-11-18 13:22:30.931 [SpringApplicationShutdownHook] LocalContainerEntityManagerFactoryBean - Closing JPA EntityManagerFactory for persistence unit 'default'
[INFO ] 2022-11-18 13:22:30.931 [SpringApplicationShutdownHook] SchemaDropperImpl$DelayedDropActionImpl - HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
[INFO ] 2022-11-18 13:22:31.045 [SpringApplicationShutdownHook] HikariDataSource - HikariPool-1 - Shutdown initiated...
[INFO ] 2022-11-18 13:22:31.049 [SpringApplicationShutdownHook] HikariDataSource - HikariPool-1 - Shutdown completed.
[INFO ] 2022-11-18 13:22:31.143 [SpringApplicationShutdownHook] LocalContainerEntityManagerFactoryBean - Closing JPA EntityManagerFactory for persistence unit 'default'
[INFO ] 2022-11-18 13:22:31.143 [SpringApplicationShutdownHook] SchemaDropperImpl$DelayedDropActionImpl - HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
[INFO ] 2022-11-18 13:22:31.147 [SpringApplicationShutdownHook] HikariDataSource - HikariPool-2 - Shutdown initiated...
[INFO ] 2022-11-18 13:22:31.148 [SpringApplicationShutdownHook] HikariDataSource - HikariPool-2 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 
[INFO] 
[INFO] 
[INFO]  --- [0;32mmaven-jar-plugin:3.2.2:jar[m [1m(default-jar)[m @ [36muser-service[0;1m 
[INFO] 
[INFO]  --- [0;32mmaven-install-plugin:2.5.2:install[m [1m(default-install)[m @ [36muser-service[0;
[INFO] Installing C:\Users\mehak\eclipse-workspace\user-service\target\user-service-0.0.1-SNAPSHOT.jar to C:\Users\mehak\.m2\repository\com\au\asx\user-service\0.0.1-SNAPSHOT\user-service-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\mehak\eclipse-workspace\user-service\pom.xml to C:\Users\mehak\.m2\repository\com\au\asx\user-service\0.0.1-SNAPSHOT\user-service-0.0.1-SNAPSHOT.pom
[INFO]  ------------------------------------------------------------------------
[INFO] mBUILD SUCCESS[m
[INFO]  ------------------------------------------------------------------------
[INFO] Total time:  11.533 s
[INFO] Finished at: 2022-11-18T13:22:31+11:00
[INFO]  ------------------------------------------------------------------------
