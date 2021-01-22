package com.choleriaapp.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.choleriaapp.entity.Personne;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource

@CrossOrigin(origins="*")
public interface PersonneRepository extends JpaRepository<Personne, Long>{

	@RestResource(path="/byTelephone")
	public Personne findByTelephone(@Param("telephone") String telephone);
	@RestResource(path="/byRole")
	public List <Personne> findByRole(@Param("role") String role);
	
	@RestResource(path="/byEtat")
	public List <Personne> findByEtatAndRole(@Param("etat") String etat,@Param("role") String role);
	
	@RestResource(path="/byUser")
	public List <Personne> findByEmailOrPassword(@Param("email") String email,@Param("password") String password);
	
}


