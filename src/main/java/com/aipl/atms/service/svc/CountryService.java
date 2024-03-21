package com.aipl.atms.service.svc;

import com.aipl.atms.service.repo.CountryRepository;
import com.aspl.crm.app.service.api.model.admin.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Country createCountry(Country countryReqObject){
        return countryRepository.save(countryReqObject);
    }
}
