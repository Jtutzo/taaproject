package com.taa.taaproject.util;

import com.taa.taaproject.api.dto.CreatePersonneDTO;
import com.taa.taaproject.domain.model.Personne;
import com.taa.taaproject.domain.repository.entity.PersonneEntity;

import static java.util.UUID.randomUUID;

public class PersonneTestUtil {

    public static Personne JOHN_DOE = Personne.builder().id(randomUUID()).nom("John").prenom("Doe").build();

    public static Personne UNCLE_BOB = Personne.builder().id(randomUUID()).nom("Uncle").prenom("Bob").build();

    public static PersonneEntity mapToPersonneEntity(Personne personne) {
        return PersonneEntity
                .builder()
                .id(personne.getId())
                .nom(personne.getNom())
                .prenom(personne.getPrenom())
                .build();
    }

    public static CreatePersonneDTO mapToCreatePersonneDTO(Personne personne) {
        return CreatePersonneDTO
                .builder()
                .nom(personne.getNom())
                .prenom(personne.getPrenom())
                .build();
    }
}
