package com.becomejavasenior.service;


import com.becomejavasenior.model.User;

public interface UserService {

	User findById(int id);
	
	User findByLogin(String email);
	
}