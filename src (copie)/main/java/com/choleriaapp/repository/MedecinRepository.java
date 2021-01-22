package com.choleriaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.choleriaapp.entity.Medecin;


@RepositoryRestResource

@CrossOrigin(origins="*")
public interface MedecinRepository  extends JpaRepository<Medecin, Long>{

}
