package com.kodlama.io.Devs.homeWork41.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.Devs.homeWork41.business.abstracts.LanguageService;
import com.kodlama.io.Devs.homeWork41.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageServise;

	@Autowired
	public LanguagesController(LanguageService languageServise) {
		this.languageServise = languageServise;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageServise.getAll();
		
	}
	
	 @GetMapping("/getbyid/{id}")
	 public Language getById(int id){
		 return languageServise.getById(id);

	    }
	 @DeleteMapping("/delete/{id}")
	 public void delete(int id){
		 languageServise.delete(id);
	    }
	 
	 @PutMapping("/update/{id}")
	 public void update(@PathVariable int id,@RequestBody Language language){
	    languageServise.update(id, language);
	    }
	    
	 @PostMapping("/add")
	 public void add(@RequestBody Language language){
		 languageServise.add(language);

	    }


}
