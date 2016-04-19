package com.logos.demo.dao;

import com.logos.demo.model.Person;

public interface PersonDao extends BaseDao<Person, Long> {
	
	Person findByName(String name);
}
