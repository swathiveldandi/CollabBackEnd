package com.niit.collab.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table
	public class Blog {
		
		@Id
		@GeneratedValue
		private int bid;
		private String b_userid;
		private String blogname;
		private String blogdesc;
		private String blogtime;
		private Integer bloglike;
		
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		
		public String getB_userid() {
			return b_userid;
		}
		public void setB_userid(String b_userid) {
			this.b_userid = b_userid;
		}
		public String getBlogname() {
			return blogname;
		}
		public void setBlogname(String blogname) {
			this.blogname = blogname;
		}
		public String getBlogdesc() {
			return blogdesc;
		}
		public void setBlogdesc(String blogdesc) {
			this.blogdesc = blogdesc;
		}
		public String getBlogtime() {
			return blogtime;
		}
		public void setBlogtime(String blogtime) {
			this.blogtime = blogtime;
		}
		public Integer getBloglike() {
			return bloglike;
		}
		public void setBloglike(Integer bloglike) {
			this.bloglike = bloglike;
		}
	
}