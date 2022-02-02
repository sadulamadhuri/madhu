package com.vehiclelicenseapp.licenseapplication.ctrl;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclelicenseapp.licenseapplication.entity.User;
import com.vehiclelicenseapp.licenseapplication.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		return userService.createUser(user);
	}
	@GetMapping("/users")
	public List<User>getUsers(){
		return userService.getUsers();
	}
	@DeleteMapping("/users")
	public boolean deleteAllUser()
	{
		return userService.deleteAllUser();
	}
	@PutMapping("/users/{userId}")
	
	public User updateUser(@PathVariable int userId, @RequestBody User obj)
	{
		return userService.updateUser(userId,obj);
	}

}

