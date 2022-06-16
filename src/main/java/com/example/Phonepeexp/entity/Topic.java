package com.example.Phonepeexp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	private int blog_id;
	private String topic_tag1;
	private String topic_tag2;
	private String topic_tag3;
	
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public String getTopic_tag1() {
		return topic_tag1;
	}
	public void setTopic_tag1(String topic_tag1) {
		this.topic_tag1 = topic_tag1;
	}
	public String getTopic_tag2() {
		return topic_tag2;
	}
	public void setTopic_tag2(String topic_tag2) {
		this.topic_tag2 = topic_tag2;
	}
	public String getTopic_tag3() {
		return topic_tag3;
	}
	public void setTopic_tag3(String topic_tag3) {
		this.topic_tag3 = topic_tag3;
	}
	
}
