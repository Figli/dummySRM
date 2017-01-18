package com.becomejavasenior.dao;


import com.becomejavasenior.model.User;

import java.util.List;

public interface UserDao {

	User findById(int id);
	
	User findByLogin(String login);

	void saveUser(User user);

	void deleteUserByEmail(String email);

	public List<User> findAllUsers();
	
}

