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
		private int b_userid;
		private String blogname;
		private String blogdesc;
		private String blogtime;
		
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public int getB_userid() {
			return b_userid;
		}
		public void setB_userid(int b_userid) {
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
	
}