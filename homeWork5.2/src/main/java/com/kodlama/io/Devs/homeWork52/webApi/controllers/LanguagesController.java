package com.kodlama.io.Devs.homeWork52.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.Devs.homeWork52.business.abstracts.LanguageService;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.CreateLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.RemoveLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.UpdateLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetAllLanguagesResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetByIdLanguageResponse;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		languageService.add(createLanguageRequest);
	}

	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		languageService.update(updateLanguageRequest);
	}

	@DeleteMapping("/remove")
	public void remove(RemoveLanguageRequest removeLanguageRequest) {
		languageService.remove(removeLanguageRequest);
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}

	@GetMapping("getbyid")
	public GetByIdLanguageResponse getByIdLanguageResponse(int id) {
		return languageService.getById(id);
	}
}