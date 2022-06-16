package com.example.Phonepeexp.repo;

import com.example.Phonepeexp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Blogdb extends JpaRepository<Blog,Integer>{

}
