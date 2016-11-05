package com.niit.collab.dao;

import java.util.List;

import com.niit.collab.model.Blog;



public interface BlogDAO {

	/*Used for creating or updating Blog*/
	
	
	/*Retrieves all Blogs*/
	public List<Blog> getBlogs();
	
	/*Delete single Blog object*/
	public void deleteBlog(Blog blog);
	
	/*Fetch single blog object based on blogid*/
	public Blog getBlog(int blogid);

	public List<Blog> getIndividualForum(int blogid);

	public void saveOrUpdate(Blog blog);

}



