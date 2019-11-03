package com.taa.taaproject.domain.service;

import com.taa.taaproject.api.dto.CreatePersonneDTO;
import com.taa.taaproject.domain.repository.PersonneWriteRepository;
import com.taa.taaproject.domain.repository.entity.PersonneEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class PersonneWriteService {

    private PersonneWriteRepository personneWriteRepository;

    @Inject
    PersonneWriteService(PersonneWriteRepository personneWriteRepository) {
        this.personneWriteRepository = personneWriteRepository;
    }

    public void create(CreatePersonneDTO createPersonneDTO) {
        PersonneEntity personneEntity = PersonneEntity.builder().nom(createPersonneDTO.getNom()).prenom(createPersonneDTO.getPrenom()).build();
        personneWriteRepository.save(personneEntity);
    }

}
