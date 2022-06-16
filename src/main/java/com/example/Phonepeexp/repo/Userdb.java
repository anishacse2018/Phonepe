package com.example.Phonepeexp.repo;
import com.example.Phonepeexp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdb extends JpaRepository<User,String>{

}
