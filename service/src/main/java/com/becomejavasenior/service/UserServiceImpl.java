package com.becomejavasenior.service;

import com.becomejavasenior.dao.UserDao;
import com.becomejavasenior.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findByLogin(String login) {
		return dao.findByLogin(login);
	}

	@Override
	public void saveUser(User user) {
		dao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		User entity = dao.findById(user.getId());
		if (entity != null) {
			user.setfName(user.getfName());
			user.setlName(user.getlName());
			user.setEmail(user.getEmail());
			user.setPassword(user.getPassword());
			user.setUserProfiles(user.getUserProfiles());

		}
	}

	@Override
	public void deleteUserByEmail(String email) {
		dao.deleteUserByEmail(email);
	}

	@Override
	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	@Override
	public boolean isUserEmailUnique(Integer id, String email) {
		User user = findByLogin(email);
		return ( user == null || ((id != null) && (user.getId() == id)));
	}

}
