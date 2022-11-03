package com.kodlama.io.Devs.homeWork52.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.Devs.homeWork52.business.abstracts.LanguageService;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.CreateLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.RemoveLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.UpdateLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetAllLanguagesResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetByIdLanguageResponse;
import com.kodlama.io.Devs.homeWork52.dataAccess.abstracts.LanguageRepository;
import com.kodlama.io.Devs.homeWork52.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		List<Language> languages = languageRepository.findAll();
		for (Language language : languages) {
			if (createLanguageRequest.getName().equals(language.getName())) {
				System.out.println("The name cannot be repeated : " + createLanguageRequest.getName());
				return;
			}
		}
		if (createLanguageRequest.getName().equals("")) {
			System.out.println("You cannot leave the name blank.");
		}

		Language language = new Language();
		language.setName(createLanguageRequest.getName());

		this.languageRepository.save(language);

	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {

		Language language = new Language();
		language.setId(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void remove(RemoveLanguageRequest removeLanguageRequest) {
		languageRepository.deleteById(removeLanguageRequest.getId());
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languageResponses = new ArrayList<GetAllLanguagesResponse>();

		for (Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());

			languageResponses.add(responseItem);
		}

		return languageResponses;
	}

	@Override
	public GetByIdLanguageResponse getById(int id) {

		Language language = languageRepository.getReferenceById(id);
		GetByIdLanguageResponse languageResponse = new GetByIdLanguageResponse();

		languageResponse.setId(language.getId());
		languageResponse.setName(language.getName());

		return languageResponse;
	}

}
