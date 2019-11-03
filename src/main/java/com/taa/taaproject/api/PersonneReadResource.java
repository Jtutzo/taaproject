package com.taa.taaproject.api;

import com.taa.taaproject.domain.model.Personne;
import com.taa.taaproject.domain.service.PersonneReadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/personne")
public class PersonneReadResource {

    private PersonneReadService personneReadService;

    @Inject
    PersonneReadResource(PersonneReadService personneReadService) {
        this.personneReadService = personneReadService;
    }

    @GetMapping
    public List<Personne> findAll() {
        return personneReadService.findAll();
    }

}
