package com.kodlama.io.Devs.homeWork52.business.abstracts;

import java.util.List;

import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.CreateLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.RemoveLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.languageRequests.UpdateLanguageRequest;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetAllLanguagesResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.languageResponses.GetByIdLanguageResponse;

public interface LanguageService {
	
	   void add(CreateLanguageRequest createLanguageRequest);

	   void update(UpdateLanguageRequest updateLanguageRequest);

	   void remove(RemoveLanguageRequest removeLanguageRequest);

	   List<GetAllLanguagesResponse> getAll();

	   GetByIdLanguageResponse getById(int id);

}
