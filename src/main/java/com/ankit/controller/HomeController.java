package com.ankit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.clinet.UserClient;
import com.ankit.dao.UserResponse;

@RestController
public class HomeController {
	
	@Autowired
	private UserClient client;

	@GetMapping("/all")
	public List<UserResponse> getAllUser() {
		return client.getUsers();
	}
}
