package com.becomejavasenior.dao;

import com.becomejavasenior.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public User findById(int id) {
		return getByKey(id);
	}

	public User findByLogin(String email) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("email", email));
		return (User) crit.uniqueResult();
	}

	public void saveUser(User user) {
		persist(user);
	}

	public void deleteUserByEmail(String email) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("email", email));
		User user = (User) crit.uniqueResult();
		delete(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria crit = createEntityCriteria().addOrder(Order.asc("fName"));
		return (List<User>) crit.list();
	}
	
}
