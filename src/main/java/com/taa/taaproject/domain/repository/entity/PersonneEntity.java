package com.taa.taaproject.domain.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "personne")
public class PersonneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nom;
    private String prenom;
}
