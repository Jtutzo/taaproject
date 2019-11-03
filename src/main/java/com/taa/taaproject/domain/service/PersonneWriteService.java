package com.taa.taaproject.domain.service;

import com.taa.taaproject.api.dto.CreatePersonneDTO;
import com.taa.taaproject.domain.repository.PersonneWriteRepository;
import com.taa.taaproject.domain.repository.entity.PersonneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneWriteService {

    @Autowired
    private PersonneWriteRepository personneWriteRepository;

    public void create(CreatePersonneDTO createPersonneDTO) {
        PersonneEntity personneEntity = PersonneEntity.builder().nom(createPersonneDTO.getNom()).prenom(createPersonneDTO.getPernom()).build();
        personneWriteRepository.save(personneEntity);
    }

}
