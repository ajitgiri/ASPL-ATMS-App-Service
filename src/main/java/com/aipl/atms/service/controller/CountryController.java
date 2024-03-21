package com.aipl.atms.service.controller;

import com.aipl.atms.service.common.CommonConstants;
import com.aipl.atms.service.repo.CountryRepository;
import com.aspl.crm.app.service.api.model.admin.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryRepository countryRepo;

    @PostMapping(path = "crm/api/get",
            consumes = CommonConstants.API_CONSUMER_MEDIA_TYPE,
            produces = CommonConstants.API_PRODUCER_MEDIA_TYPE)
    public ResponseEntity<List<Country>> findCountry(
            @RequestHeader (value = "applicationId", required = false) String applicationId,
            @RequestHeader (value = "interactionId") String interactionId){
        List<Country> countryResponse = countryRepo.findAll();
        return new ResponseEntity<>(countryResponse, HttpStatus.CREATED);
    }

    @PostMapping(path = "crm/api",
            consumes =CommonConstants.API_CONSUMER_MEDIA_TYPE,
            produces = CommonConstants.API_PRODUCER_MEDIA_TYPE)
    public ResponseEntity<Country> saveCountry(@RequestBody Country countryObj){
        Country countryResponse = countryRepo.save(countryObj);
        return new ResponseEntity<>(countryResponse, HttpStatus.CREATED);
    }
}
