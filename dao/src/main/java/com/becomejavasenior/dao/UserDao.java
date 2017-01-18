package com.becomejavasenior.dao;


import com.becomejavasenior.model.User;

public interface UserDao {

	User findById(int id);
	
	User findByLogin(String login);
	
}

