package com.niit.collab.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ForumComments {

	@Id
	@GeneratedValue
	private int cid;
	private int c_userid;
	private int c_fid;
	private String commentdesc;
	private Date commenttime;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getC_userid() {
		return c_userid;
	}

	public void setC_userid(int c_userid) {
		this.c_userid = c_userid;
	}

	public int getC_fid() {
		return c_fid;
	}

	public void setC_fid(int c_fid) {
		this.c_fid = c_fid;
	}

	public String getCommentdesc() {
		return commentdesc;
	}

	public void setCommentdesc(String commentdesc) {
		this.commentdesc = commentdesc;
	}

	public Date getCommenttime() {
		return commenttime;
	}

	public void setCommenttime(Date commenttime) {
		this.commenttime = commenttime;
	}

}



