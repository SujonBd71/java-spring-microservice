package com.appdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser(@RequestParam(value="page",  defaultValue="1") int page,
						  @RequestParam(value="limit", defaultValue="50") int limit,
						  @RequestParam(value="sort",  defaultValue="desc", required=false) String sort)
	{
		return "get user called with page: " + page +",limit:" + limit; 
	}
	
	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId) {
		return "get user called with id: " + userId; 
	}

	@PostMapping
	public String createUser() {
		return "Post user called";
	}
	
	@PutMapping
	public String updateeUser() {
		return "update user called";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user called";
	}
}
