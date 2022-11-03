package com.kodlama.io.Devs.homeWork52.business.abstracts;

import java.util.List;

import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.CreateTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.RemoveTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.UpdateTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.responses.technologyResponses.GetAllTechnologyResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.technologyResponses.GetByIdTechnologyResponse;

public interface TechnologyService {
	
    void add(CreateTechnologyRequest createTechnologyRequest);

    void update(UpdateTechnologyRequest updateTechnologyRequest);

    void remove(RemoveTechnologyRequest removeTechnologyRequest);

    List<GetAllTechnologyResponse> getAll();

    GetByIdTechnologyResponse getById(int id);

}
