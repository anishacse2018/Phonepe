package com.example.Phonepeexp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Phonepeexp.entity.Topic;
import com.example.Phonepeexp.services.TopicService;

@Controller
@CrossOrigin
public class Topiccontroller {
    @Autowired
    private TopicService topicservice;
    
	@PostMapping("/{blog_id}/topictags")
	public Topic posttopics(@PathVariable int blog_id,@RequestBody Topic t) {
		return this.topicservice.posttopics(blog_id, t);
	}
	
}
