package com.niit.service;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.niit.collab.dao.ForumDAO;
import com.niit.collab.model.Forum;

@Service
public class ForumServiceImpl  implements ForumService{

	@Autowired
	private ForumDAO forumDAO;
	
	/*Create New Forum Service*/
	public void createForum(Forum forum,HttpSession session) 
	{	
		/*Saving userid from session and time to forum object*/
		/*forum.setB_userid((int)session.getAttribute("userid"));*/
		forum.setForumtime(new java.util.Date().toString());
		
		/*Saving forum in database*/
		forumDAO.saveOrUpdate(forum);
	}

	/*Retrive All Forum List and convert to JSON and saving in String */
	public String  getAllForums() 
	{
		List<Forum> list=forumDAO.getForums();
		Gson gson=new Gson();
		String data=gson.toJson(list);
		return data;
	}

	/*Delete single forum based on forum id*/
	public void deleteForum(int forumid) 
	{
		Forum forum= forumDAO.getForum(forumid);
		forumDAO.deleteForum(forum);
	}

	/*Edit individual forum based on forum id*/
	public Forum editForum(int forumid)
	{
		 return forumDAO.getForum(forumid);
	}
	/*public Forum getForum(int forumid)
	{
		 return forumDAO.getForum(forumid);
	}*/
	/*Retrive Single Forum data and convert to JSON and saving in String */
	public List<Forum> getSingleForum(int forumid) 
	{
		return forumDAO.getIndividualForum(forumid);
	}

	

	/*@Transactional
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public Forum getforum(int id) {
		String hql = "from Forum where id= "+ "'"+ id+"'" ;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Forum>list= query.list();
		
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}*/
	}
