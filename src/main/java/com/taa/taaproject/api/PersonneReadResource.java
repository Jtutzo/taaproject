package com.taa.taaproject.api;

import com.taa.taaproject.domain.model.Personne;
import com.taa.taaproject.domain.repository.PersonneReadRepository;
import com.taa.taaproject.domain.service.PersonneReadService;
import com.taa.taaproject.provider.repository.JpaPersonneReposiroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personne")
public class PersonneReadResource {

    @Autowired
    private PersonneReadService personneReadService;

    @GetMapping
    public List<Personne> findAll() {
        return personneReadService.findAll();
    }

}
