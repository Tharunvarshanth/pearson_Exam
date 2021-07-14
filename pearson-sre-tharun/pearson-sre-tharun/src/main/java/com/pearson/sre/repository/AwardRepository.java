package com.pearson.sre.repository;

import com.pearson.sre.model.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardRepository extends JpaRepository<Award,Integer> {
}
