package com.masai.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/api")
public class MyController {

	@GetMapping("/admin/dashboard")
	public ResponseEntity<String> adminDashboard(){
		String msg = "Welcome to Admin Dashboard!";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/user/dashboard")
	public ResponseEntity<String> userDashboard(){
		String msg = "Welcome to User Dashboard!";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/admin/new")
	public ResponseEntity<String> newUser(){
		String msg = "New User page!";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/user/{userid}")
	public ResponseEntity<String> userWithId(@PathVariable int userid){
		String msg = "User = ";
		return new ResponseEntity<String>(msg+userid,HttpStatus.OK);
	}
	
}
