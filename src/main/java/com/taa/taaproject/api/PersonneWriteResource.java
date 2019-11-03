package com.taa.taaproject.api;

import com.taa.taaproject.api.dto.CreatePersonneDTO;
import com.taa.taaproject.domain.service.PersonneWriteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("api/personne")
public class PersonneWriteResource {

    private PersonneWriteService personneWriteService;

    @Inject
    PersonneWriteResource(PersonneWriteService personneWriteService) {
        this.personneWriteService = personneWriteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CreatePersonneDTO createPersonneDTO) {
        personneWriteService.create(createPersonneDTO);
    }

}
