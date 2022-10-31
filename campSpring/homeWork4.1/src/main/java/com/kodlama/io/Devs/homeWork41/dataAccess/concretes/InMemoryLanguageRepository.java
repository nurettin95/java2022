package com.kodlama.io.Devs.homeWork41.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kodlama.io.Devs.homeWork41.dataAccess.abstracts.LanguageRepository;
import com.kodlama.io.Devs.homeWork41.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Python"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Php"));
		languages.add(new Language(4,"C#"));
		languages.add(new Language(5,"C++"));
		languages.add(new Language(6,"Kotlin"));
		languages.add(new Language(7, "JavaScript"));
		
	}
	
	@Override
	public List<Language> getAll() {
		
		
		return languages;
	}

	@Override
	public void add(Language language) {
		
		languages.add(language);
		
	}

	@Override
	public void update(int id, Language language) {
		for (Language item : languages) {
            if (item.getId() == id) {
                item = language;
                break;

            }
        }	
	}

	@Override
	public void delete(int id) {
		
		for (Language language : languages) {
            if (language.getId() == id) {
                languages.remove(language);
                break;
            }
        }	
		
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
            if (language.getId() == id) {
                return language;
            }
		}
		return null;
	}
}
