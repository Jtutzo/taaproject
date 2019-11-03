package com.taa.taaproject.api;

import com.taa.taaproject.api.dto.CreatePersonneDTO;
import com.taa.taaproject.domain.service.PersonneWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/personne")
public class PersonneWriteResource {

    @Autowired
    private PersonneWriteService personneWriteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CreatePersonneDTO createPersonneDTO) {
        personneWriteService.create(createPersonneDTO);
    }

}
