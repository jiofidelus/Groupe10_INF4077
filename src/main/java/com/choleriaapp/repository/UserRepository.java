package com.choleriaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.choleriaapp.entity.User;
@CrossOrigin(origins="*")
public interface UserRepository extends JpaRepository<User, Long>{

}
