package com.taa.taaproject.provider.repository;

import com.taa.taaproject.domain.repository.PersonneReadRepository;
import com.taa.taaproject.domain.repository.PersonneWriteRepository;
import com.taa.taaproject.domain.repository.entity.PersonneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaPersonneReposiroy extends JpaRepository<PersonneEntity, UUID>, PersonneReadRepository, PersonneWriteRepository {
}
