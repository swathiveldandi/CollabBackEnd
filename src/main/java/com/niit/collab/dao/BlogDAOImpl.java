package com.niit.collab.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collab.model.Blog;



@Repository

public class BlogDAOImpl implements BlogDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*Used for creating or updating Blog*/
	@Transactional
	public void saveOrUpdate(Blog blog) {
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
	}

	/*Retrieves all Blogs*/
	@Transactional
	public List<Blog> getBlogs() {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Blog.class);
		List<Blog> list=c.list();
		return list;
	}

	/*Delete single Blog object*/
	@Transactional
	public void deleteBlog(Blog blog) {
		sessionFactory.getCurrentSession().delete(blog);
	}

	/*Fetch single blog object based on blogid*/
	/*@Transactional
	public Blog getBlog(int blogid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Blog.class);
		c.add(Restrictions.eq("bid", blogid));
		Blog blog=(Blog) c.uniqueResult();
		return blog;
	}
*/
	@Transactional
	public Blog get(int id) {
		String hql = "from Blog where id='"+ id+"'" ;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Blog>list= query.list();
		
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
	@Transactional
	public List<Blog> getIndividualForum(int blogid) {
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Blog.class);
		c.add(Restrictions.eq("bid", blogid));
		List<Blog> list=c.list();
		return list;
	}

}

