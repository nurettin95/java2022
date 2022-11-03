package com.kodlama.io.Devs.homeWork52.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlama.io.Devs.homeWork52.entities.concretes.Language;


public interface LanguageRepository extends JpaRepository<Language, Integer> {
	
	
}