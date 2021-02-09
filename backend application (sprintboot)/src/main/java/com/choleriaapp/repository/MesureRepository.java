package com.choleriaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.choleriaapp.entity.Mesure;
@CrossOrigin(origins="*")
public interface MesureRepository extends JpaRepository<Mesure, Long>{

}
