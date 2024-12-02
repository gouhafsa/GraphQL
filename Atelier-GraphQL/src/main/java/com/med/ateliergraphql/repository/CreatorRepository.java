package com.med.ateliergraphql.repository;

import com.med.ateliergraphql.entity.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
}
