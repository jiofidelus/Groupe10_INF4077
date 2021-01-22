package com.choleriaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choleriaapp.entity.Consultation;

public interface ConsultationRepository  extends JpaRepository<Consultation, Long>{

}
