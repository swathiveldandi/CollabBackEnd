package com.niit.collab.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.collab.dao.ForumDAO;
import com.niit.collab.model.Forum;
import com.niit.service.ForumService;

@RestController
public class ForumController {
	
	@Autowired
	private ForumService forumService;
	@Autowired
	ForumDAO forumDAO;

	@PostMapping("/CreateForum")
	public void CreateForum(@RequestBody Forum forum,HttpSession session) 
	{
		forumService.createForum(forum,session);
	}
	
	@GetMapping("/getAllForums")
	public String getAllForums()
	{
		return forumService.getAllForums();
	}	
	
	@DeleteMapping("/deleteForum/{forumid}")
	public void deleteForum(@PathVariable("forumid") int forumid)
	{
		forumService.deleteForum(forumid);
	}
	
	@GetMapping("/editForum/{forumid}")
	public ResponseEntity<Forum> editForum(@PathVariable("forumid") int forumid)
	{
		Forum forum=forumService.editForum(forumid);
		return new ResponseEntity<Forum>(forum, HttpStatus.OK);
	}
	@GetMapping("/forumAccess")
	 	public Boolean forumAccess()
	 	{
	 		return false;
	 	}	
	@GetMapping(value="/individualforum/{id}")
	public ResponseEntity<Forum> individualforum(@PathVariable("id") int id){
		Forum forum=forumDAO.getForum(id);
		return new ResponseEntity<Forum>(forum,HttpStatus.OK);
	}
}


