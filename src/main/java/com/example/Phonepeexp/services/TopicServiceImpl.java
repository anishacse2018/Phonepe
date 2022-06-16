package com.example.Phonepeexp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phonepeexp.entity.Topic;
import com.example.Phonepeexp.repo.Blogdb;
import com.example.Phonepeexp.repo.Topicdb;

@Service
public class TopicServiceImpl implements TopicService{

	@Autowired
	private Topicdb topics;
	
	@Override
	public Topic posttopics(int blog_id, Topic t) {
		// TODO Auto-generated method stub
		topics.save(t);
		return t;
	}

}
