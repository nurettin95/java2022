package com.kodlama.io.Devs.homeWork41.business.abstracts;

import java.util.List;

import com.kodlama.io.Devs.homeWork41.entities.concretes.Language;
public interface LanguageService {
	
	List<Language> getAll();
	void add(Language language);
	void update(int id,Language language);
	void delete(int id);
	Language getById(int id);

}
