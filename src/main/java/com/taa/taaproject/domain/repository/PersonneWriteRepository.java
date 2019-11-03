package com.taa.taaproject.domain.repository;

import com.taa.taaproject.domain.repository.entity.PersonneEntity;

public interface PersonneWriteRepository {
    PersonneEntity save(PersonneEntity personneEntity);
}
