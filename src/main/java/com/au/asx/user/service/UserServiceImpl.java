package com.au.asx.user.service;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.asx.user.entity.UserDetails;
import com.au.asx.user.exception.CustomException;
import com.au.asx.user.model.UserDetailRequest;
import com.au.asx.user.repository.UserRepository;
import com.au.asx.user.util.UserDetailsUtil;

/**
 * UserServiceImpl to retrieve & update user details
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	private UserRepository userRepo;
	
	@Autowired
	public UserServiceImpl(final UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	/**
	 * @param userId
	 * @param UserDetailRequest
	 * @return 
	 */
	public void updateUserDetails(Long userId, UserDetailRequest userReq) {
		logger.info("Inside method updateUserDetails for userId: " + userId);
		UserDetails user = userRepo.findById(userId).orElse(null);
		
		if(Objects.isNull(user)) {
			logger.error("User details are null for userId : " + userId);
			throw new CustomException("User for userId : " + userId + " does not exists");
		}
		
		UserDetailsUtil.mapUserDetails(user, userReq);
		
		userRepo.save(user);
		
		logger.info("Exisitng method updateUserDetails for userId: " + userId);
	}

	/**
	 * @param userId
	 * @return UserDetails
	 */
	public UserDetails retrieveUserDetails(Long userId) {
		logger.info("Inside method retrieveUserDetails for userId: " + userId);
		UserDetails user =  userRepo.findById(userId).orElse(null);
		
		if(Objects.isNull(user)) {
			logger.error("User for userId " + userId + " does not exists");
			throw new CustomException("User for userId : " + userId + " does not exists");
		}
		logger.info("Exisitng method retrieveUserDetails for userId: " + userId);
		return user;
		
	}

}
