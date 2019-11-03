package com.taa.taaproject.domain.model;

import lombok.*;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Personne {
    private UUID id;
    private String nom;
    private String prenom;
}
