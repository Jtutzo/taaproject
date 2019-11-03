package com.taa.taaproject.api;

import com.taa.taaproject.domain.model.Personne;
import com.taa.taaproject.domain.repository.PersonneWriteRepository;
import com.taa.taaproject.provider.repository.JpaPersonneReposiroy;
import com.taa.taaproject.util.PersonneTestUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.taa.taaproject.util.PersonneTestUtil.JOHN_DOE;
import static com.taa.taaproject.util.PersonneTestUtil.UNCLE_BOB;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonneReadResourceTest {

    @Autowired
    private PersonneReadResource personneReadResource;

    @Autowired
    private PersonneWriteRepository personneWriteRepository;

    @Autowired
    private JpaPersonneReposiroy jpaPersonneReposiroy;

    @AfterEach
    void reset() {
        jpaPersonneReposiroy.deleteAll();
    }

    @Test
    void should_find_all_personne() {
        List<Personne> expected = List.of(JOHN_DOE, UNCLE_BOB);
        expected.stream()
                .map(PersonneTestUtil::mapToPersonneEntity)
                .forEach(personneWriteRepository::save);

        List<Personne> actual = personneReadResource.findAll();

        assertThat(actual).usingElementComparatorIgnoringFields("id").containsExactlyInAnyOrderElementsOf(expected);
    }
}
