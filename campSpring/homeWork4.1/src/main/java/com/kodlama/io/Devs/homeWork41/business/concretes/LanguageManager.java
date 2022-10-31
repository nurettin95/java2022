package com.kodlama.io.Devs.homeWork41.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.Devs.homeWork41.business.abstracts.LanguageService;
import com.kodlama.io.Devs.homeWork41.dataAccess.abstracts.LanguageRepository;
import com.kodlama.io.Devs.homeWork41.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Language> getAll() {
		
		//iş kuralları
		return languageRepository.getAll();
	}


	@Override
	public void add(Language language) {
		languageRepository.add(language);
		
	}


	@Override
	public void update(int id, Language language) {
		
		languageRepository.update(id, language);
		
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}




	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

}
