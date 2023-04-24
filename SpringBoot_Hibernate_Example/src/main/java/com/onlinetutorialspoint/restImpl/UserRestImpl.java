package com.onlinetutorialspoint.restImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetutorialspoint.constents.CafeConstant;
import com.onlinetutorialspoint.rest.UserRest;
import com.onlinetutorialspoint.service.UserService;
import com.onlinetutorialspoint.utils.CafeUtils;

@CrossOrigin
@RestController
public class UserRestImpl implements UserRest {
	
	private static final Map<String, String> requestMap = null;
	
	@Autowired
	UserService userService;

	@Override
	 public ResponseEntity<String> signup(Map<String, String> requestMap) {
	  
	  try { return userService.signup(requestMap); }catch (Exception ex) {
	  ex.printStackTrace(); } return
	  CafeUtils.getResponseEntity(CafeConstant.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR); 
	}

	@Override
	public ResponseEntity<String> login(Map<String, String> requestMap) {
		try { return userService.login(requestMap); }catch (Exception ex) {
			  ex.printStackTrace(); } return
			  CafeUtils.getResponseEntity(CafeConstant.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR); 
			}
	}

