package com.niit.collab.dao;

import java.util.List;

import com.niit.collab.model.Users;

public interface UsersDAO {

	public boolean saveOrUpdate(Users users);
	public boolean delete(Users users);
	public List<Users>list();
	public List<Users> getuser(int id);
	public Users oneuser(int id);
	/*public Users logout(int id);*/
	public Users authuser(String username,String password);
	public Users profileof(String username);
	public List<Users> nonfriends(int id);
}
