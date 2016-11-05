package com.niit.collab.dao;

import java.util.List;

import com.niit.collab.model.ForumComments;



public interface ForumCommentsDAO {

	/*Used for creating or updating Forum Comments*/
	public void saveOrUpdate(ForumComments comment);
	
	/*Retrieves all Comments*/
	public List<ForumComments> getComments(int fid);
}



