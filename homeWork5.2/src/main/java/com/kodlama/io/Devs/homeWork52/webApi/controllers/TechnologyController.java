package com.kodlama.io.Devs.homeWork52.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.Devs.homeWork52.business.abstracts.TechnologyService;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.CreateTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.RemoveTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.requests.technologyRequests.UpdateTechnologyRequest;
import com.kodlama.io.Devs.homeWork52.business.responses.technologyResponses.GetAllTechnologyResponse;
import com.kodlama.io.Devs.homeWork52.business.responses.technologyResponses.GetByIdTechnologyResponse;

@RestController
@RequestMapping("api/technologies")
public class TechnologyController {
    private TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        technologyService.add(createTechnologyRequest);
    }

    @PutMapping("update")
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        technologyService.update(updateTechnologyRequest);
    }

    @DeleteMapping("/remove")
    public void remove(RemoveTechnologyRequest removeTechnologyRequest) {
        technologyService.remove(removeTechnologyRequest);
    }

    @GetMapping("/getall")
    List<GetAllTechnologyResponse> getAll() {
        return technologyService.getAll();
    }

    @GetMapping("getbyid")
    GetByIdTechnologyResponse getByIdTechnologyResponse(int id) {
        return technologyService.getById(id);
    }
}