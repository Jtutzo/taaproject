package com.taa.taaproject.api.dto;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CreatePersonneDTO {
    private String nom;
    private String prenom;
}
