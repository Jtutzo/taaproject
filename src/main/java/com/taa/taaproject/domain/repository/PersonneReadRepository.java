package com.taa.taaproject.domain.repository;

import com.taa.taaproject.domain.repository.entity.PersonneEntity;

import java.util.List;

public interface PersonneReadRepository {
    List<PersonneEntity> findAll();
}
