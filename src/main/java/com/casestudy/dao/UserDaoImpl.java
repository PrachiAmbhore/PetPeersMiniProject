package com.casestudy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Query;
import java.util.List;

import com.casestudy.model.User;

public class UserDaoImpl implements UserDao{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/casestudy/hibernate.cfg.xml").build();
	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory sessionfactory = metadata.getSessionFactoryBuilder().build();
	Session session = null;
	Transaction transaction = null;

	@Override
	public boolean authenticateUser() {
		User user = new User();
		String userName = user.getuserName();
		String userPassword = user.getuserPassword();
		boolean userFound = false;
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		
		String SQL_QUERY =" from Users as o where o.userName=? and o.userPassword=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,userName);
		query.setParameter(1,userPassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		transaction.commit();
		session.close();
		return userFound; 
	}

	@Override
	public void saveUser(User user) {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		session.save(user); 
		transaction.commit();
		session.close();
	}

	@Override
	public List<User> getMyPets(int id) {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		
		User user = new User();
		id = user.getUserid();
		
		List<User> getList = null;
		String query = "from User where userid =:id";
		List<User> userList = session.createQuery(query).list();
		for(User userObj : userList) {
			if(userObj != null) {
				userObj.getPets();
				getList.add(userObj);
			}
		}
		transaction.commit();
		session.close();
		sessionfactory.close();
		return getList;
	}

	@Override
	public void buyPet(int id) {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		session.delete(id);
		transaction.commit();
	}

}
