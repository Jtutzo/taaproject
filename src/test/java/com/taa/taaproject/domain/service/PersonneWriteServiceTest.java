package com.taa.taaproject.domain.service;

import com.taa.taaproject.api.dto.CreatePersonneDTO;
import com.taa.taaproject.domain.repository.PersonneWriteRepository;
import com.taa.taaproject.domain.repository.entity.PersonneEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static com.taa.taaproject.util.PersonneTestUtil.*;
import static org.mockito.Mockito.*;

class PersonneWriteServiceTest {

    private PersonneWriteService personneWriteService;

    @Mock
    private PersonneWriteRepository personneWriteRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        personneWriteService = new PersonneWriteService(personneWriteRepository);
    }

    @Test
    void should_create_a_personne() {
        // Given
        CreatePersonneDTO createPersonne = mapToCreatePersonneDTO(JOHN_DOE);

        // When
        personneWriteService.create(createPersonne);

        // Then
        verify(personneWriteRepository).save(PersonneEntity.builder().nom(JOHN_DOE.getNom()).prenom(JOHN_DOE.getPrenom()).build());
    }

}
