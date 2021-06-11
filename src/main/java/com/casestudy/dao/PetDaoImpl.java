package com.casestudy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.model.Pet;
import com.casestudy.model.User;
import com.casestudy.validator.UserValidator;


public class PetDaoImpl implements PetDao{
	
	@Autowired
	private User userPojo;
	
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/casestudy/hibernate.cfg.xml").build();
	Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory sessionfactory = metadata.getSessionFactoryBuilder().build();
	Session session = null;
	Transaction transaction = null;
	
	@Override
	public List<Pet> getAllPets() {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		
		List<Pet> getList = null;
		String query = "from Pet";
		List<Pet> petList = session.createQuery(query).list();
		for(Pet petObj : petList) {
			if(petObj != null) {
				petObj.getUser().getPets();
				getList.add(petObj);
			}
		}
		transaction.commit();
		session.close();
		sessionfactory.close();
		return getList;
	}

	@Override
	public void savePet(Pet pet) {
		sessionfactory.openSession();
		transaction = session.beginTransaction();
		session.save(pet); 
		transaction.commit();
		session.close();
	}

}
