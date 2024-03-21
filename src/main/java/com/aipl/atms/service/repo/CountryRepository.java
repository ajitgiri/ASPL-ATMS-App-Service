package com.aipl.atms.service.repo;

import com.aspl.crm.app.service.api.model.admin.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends MongoRepository<Country, String> {



}
