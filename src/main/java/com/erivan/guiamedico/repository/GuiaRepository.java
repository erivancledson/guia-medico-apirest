package com.erivan.guiamedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erivan.guiamedico.model.Guia;

public interface GuiaRepository extends JpaRepository<Guia, Long>{
	
	Guia findById(long id);

}
