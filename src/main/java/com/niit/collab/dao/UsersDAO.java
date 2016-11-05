package com.niit.collab.dao;

import com.niit.collab.model.User;

public interface UsersDAO {
	
	/*Used for creating or updating user*/
	public void saveOrUpdate(User users);
	
	/*	Used for deleting user*/
	public void delete(User user);
	
	/*Used to retrieve single user based on username*/
	public User getUser(String username);
	
	public User viewUser(int blogid);
}


