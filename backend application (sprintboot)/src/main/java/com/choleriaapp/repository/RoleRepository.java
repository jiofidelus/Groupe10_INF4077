package com.choleriaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.choleriaapp.entity.Role;
@CrossOrigin(origins="*")
public interface RoleRepository extends JpaRepository<Role, Long>{

}
