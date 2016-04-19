package com.logos.demo.dao;

import java.util.List;

import com.logos.demo.model.Role;

public interface RoleDao extends BaseDao<Role, Long>{
	
	public static Role findById(Role Id){
		return null;
	}
	
	public void save(Role role);
	
	public void remove(Role role);
	
	public Role update(Role role);
	
	public List<Role> findAll();

}
