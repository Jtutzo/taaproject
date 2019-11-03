package com.taa.taaproject.domain.service;

import com.taa.taaproject.domain.model.Personne;
import com.taa.taaproject.domain.repository.PersonneReadRepository;
import com.taa.taaproject.util.PersonneTestUtil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.stream.Collectors;

import static com.taa.taaproject.util.PersonneTestUtil.JOHN_DOE;
import static com.taa.taaproject.util.PersonneTestUtil.UNCLE_BOB;
import static org.mockito.Mockito.when;

class PersonneReadServiceTest {

    private PersonneReadService personneReadService;

    @Mock
    private PersonneReadRepository personneReadRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        personneReadService = new PersonneReadService(personneReadRepository);
    }

    @Test
    void should_return_all_personne() {
        // Given
        List<Personne> expected = List.of(JOHN_DOE, UNCLE_BOB);
        when(personneReadRepository.findAll()).thenReturn(expected.stream().map(PersonneTestUtil::mapToPersonneEntity).collect(Collectors.toList()));

        // When
        List<Personne> result = personneReadService.findAll();

        // Then
        Assertions.assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }


}
