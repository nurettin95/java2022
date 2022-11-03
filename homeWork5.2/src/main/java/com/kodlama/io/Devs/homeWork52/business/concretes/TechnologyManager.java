package com.kodlama.io.Devs.homeWork52.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.Devs.homeWork52.business.abstracts.LanguageService;
import com.kodlama.io.Devs.homeWork52.business.abstracts.TechnologyService;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.CreateTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.RemoveTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.UpdateTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetByIdLanguageResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.technologyResponses.GetAllTechnologyResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.technologyResponses.GetByIdTechnologyResponse;
import com.kodlama.io.Devs.homeWork52.dataAccess.abstracts.TechnologyRepository;
import com.kodlama.io.Devs.homeWork52.entities.concretes.Language;
import com.kodlama.io.Devs.homeWork52.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private LanguageService languageService;

	public TechnologyManager(TechnologyRepository technologyRepository, LanguageService languageService) {

		this.technologyRepository = technologyRepository;
		this.languageService = languageService;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		Language language = new Language();
		GetByIdLanguageResponse getByIdLanguageResponse = languageService
				.getById(createTechnologyRequest.getLanguageId());

		language.setId(getByIdLanguageResponse.getId());
		language.setName(getByIdLanguageResponse.getName());

		technology.setName(createTechnologyRequest.getName());
		technology.setLanguage(language);

		technologyRepository.save(technology);

	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = new Technology();
		Language language = new Language();
		GetByIdLanguageResponse getByIdLanguageResponse = languageService
				.getById(updateTechnologyRequest.getLanguageId());

		language.setId(getByIdLanguageResponse.getId());
		language.setName(getByIdLanguageResponse.getName());

		technology.setName(updateTechnologyRequest.getName());
		technology.setId(updateTechnologyRequest.getId());
		technology.setLanguage(language);

		technologyRepository.save(technology);

	}

	@Override
	public void remove(RemoveTechnologyRequest removeTechnologyRequest) {
		technologyRepository.deleteById(removeTechnologyRequest.getId());

	}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> technologyResponses = new ArrayList<>();

		for (Technology technology : technologies) {
			GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			technologyResponses.add(responseItem);
		}
		return technologyResponses;
	}

	@Override
	public GetByIdTechnologyResponse getById(int id) {
		Technology technology = technologyRepository.getReferenceById(id);
		GetByIdTechnologyResponse responseItem = new GetByIdTechnologyResponse();

		responseItem.setId(technology.getId());
		responseItem.setName(technology.getName());

		return responseItem;
	}

}
