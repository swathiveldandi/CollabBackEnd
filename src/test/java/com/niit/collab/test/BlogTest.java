package com.niit.collab.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collab.dao.BlogDAO;
import com.niit.collab.model.Blog;

public class BlogTest {
	public static void main(String[] args) {
	      
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
		
		
		BlogDAO blogDAO =   (BlogDAO) context.getBean("blogDAO");
		Blog blog =   (Blog) context.getBean("Blog");
		
		blog.setBid(10);
		blog.setB_userid(10);
		blog.setBlogname("mobile");
		blog.setBlogdesc("this is samsung mobile");
		blog.setBlogtime("10");

		/*blogDAO.saveOrUpdate(blog);
		blogDAO.deleteBlog("20");*/
		
		System.out.println("save");
	
		blogDAO.saveOrUpdate(blog);
		/*{
		System.out.println("Blog created successfully");
		
		
		
		
		
		}
		
		*/
	}

}


