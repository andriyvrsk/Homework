package com.logos.demo.dao.impl;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.logos.demo.dao.PersonDao;
import com.logos.demo.model.Person;

@Repository
public class PersonDaoImpl extends BaseDaoImpl<Person, Long> implements
		PersonDao {

	public PersonDaoImpl() {
		super(Person.class);
	}

	@Override
	public Person findByName(String name) {
		
		try{
			return (Person) entityManager.createQuery("from Person p where p.name = :name").setParameter("name", name).getSingleResult();
		} catch(NoResultException exception){
			System.out.println(exception);
		}
		
		return new Person();
	}

}
