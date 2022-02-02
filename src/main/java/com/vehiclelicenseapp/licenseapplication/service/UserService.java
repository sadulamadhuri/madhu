package com.vehiclelicenseapp.licenseapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclelicenseapp.licenseapplication.entity.User;
import com.vehiclelicenseapp.licenseapplication.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
		public User createUser(User user) {
			return userRepository.save(user);
		}
		
		public List<User>getUsers(){
			return userRepository.findAll();
		}
		public boolean deleteAllUser() {
			try {
					userRepository.deleteAll();
				}
				catch(Exception e)
				{
					return false;
				}
				return true;
			}

			public User updateUser(int userId, User obj) {
				Optional<User> addContainer=userRepository.findById(userId);
				if(addContainer.isPresent())
				{
					User oldObj=addContainer.get();
					oldObj.setEmail(obj.getEmail());
					oldObj.setPassword(obj.getPassword());
					System.out.println("Successfully updated");
					return userRepository.saveAndFlush(oldObj);
				}
				System.out.println("Successfully Inserted");
				return userRepository.save(obj);
		}
}
