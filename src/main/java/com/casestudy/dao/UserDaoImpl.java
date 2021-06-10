package com.casestudy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.model.User;

public class UserDaoImpl implements UserDao{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/casestudy/hibernate.cfg.xml").build();
	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory sessionfactory = metadata.getSessionFactoryBuilder().build();
	Session session = null;
	Transaction transaction = null;

	@Override
	public User authenticateUser() {
		return  null;
		
	}

	@Override
	public void saveUser(User user) {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		session.persist(user); 
		transaction.commit();
		session.close();
	}

	@Override
	public List<User> getMyPets(int id) {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		
		List<User> getList = null;
		String query = "from User where userid = id";
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
	public void buyPet(int id, int a) {
	
	}

}
