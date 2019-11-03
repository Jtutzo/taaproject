package com.taa.taaproject.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class CreatePersonneDTO {
    private String nom;
    private String pernom;
}
