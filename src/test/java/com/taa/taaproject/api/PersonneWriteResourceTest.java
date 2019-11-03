package com.taa.taaproject.api;

import com.taa.taaproject.domain.repository.entity.PersonneEntity;
import com.taa.taaproject.provider.repository.JpaPersonneReposiroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.taa.taaproject.util.PersonneTestUtil.*;

@SpringBootTest
class PersonneWriteResourceTest {

    @Autowired
    private PersonneWriteResource personneWriteResource;

    @Autowired
    private JpaPersonneReposiroy jpaPersonneReposiroy;

    @AfterEach
    void reset() {
        jpaPersonneReposiroy.deleteAll();
    }

    @Test
    void should_create_personne() {
        // When
        personneWriteResource.create(mapToCreatePersonneDTO(JOHN_DOE));

        // Then
        List<PersonneEntity> actual = jpaPersonneReposiroy.findAll();
        Assertions.assertThat(actual).usingElementComparatorIgnoringFields("id").contains(mapToPersonneEntity(JOHN_DOE));
    }

}
