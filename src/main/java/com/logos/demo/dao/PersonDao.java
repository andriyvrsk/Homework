package com.logos.demo.dao;

import java.util.List;

import com.logos.demo.model.Person;

public interface PersonDao extends BaseDao<Person, Long> {
	
	public static Person findByID(long id) {
		return null;	
	}
	
	public void save(Person person);
	
	public void remove(Person person);
	
	public Person update(Person person);
	
	public List<Person> findAll();
	
	
}
