package com.taa.taaproject.domain.service;

import com.taa.taaproject.domain.model.Personne;
import com.taa.taaproject.domain.repository.PersonneReadRepository;
import com.taa.taaproject.domain.repository.entity.PersonneEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonneReadService {

    private PersonneReadRepository personneReadRepository;

    @Inject
    PersonneReadService(PersonneReadRepository personneReadRepository) {
        this.personneReadRepository = personneReadRepository;
    }

    public List<Personne> findAll() {
        return personneReadRepository.findAll().stream().map(this::mapToPersonne).collect(Collectors.toList());
    }

    private Personne mapToPersonne(PersonneEntity personneEntity) {
        return Personne.builder().id(personneEntity.getId()).nom(personneEntity.getNom()).prenom(personneEntity.getPrenom()).build();
    }
}
