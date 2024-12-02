package com.med.ateliergraphql.repository;

import com.med.ateliergraphql.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
