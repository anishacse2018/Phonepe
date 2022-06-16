package com.example.Phonepeexp.repo;

import com.example.Phonepeexp.entity.Topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Topicdb extends JpaRepository<Topic,Integer>{

}
