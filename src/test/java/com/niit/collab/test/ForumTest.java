package com.niit.collab.test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collab.dao.ForumDAO;
import com.niit.collab.model.Forum;

public class ForumTest {
	public static void main(String[] args) {
	      
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
		
		
		ForumDAO forumDAO =   (ForumDAO) context.getBean("forumDAO");
		Forum forum =   (Forum) context.getBean("Forum");
		
		forum.setFid(10);
		forum.setF_userid("goal");
		forum.setForumname("mobile");
		forum.setForumdesc("this is samsung mobile");
		forum.setForumtime("10");

		/*forumDAO.saveOrUpdate(forum);
		forumDAO.deleteForum("20");*/
		
		System.out.println("save");
	
		forumDAO.saveOrUpdate(forum);
		/*{
		System.out.println("Forum created successfully");
		
		
		
		
		
		}
		
		*/
	}

}



