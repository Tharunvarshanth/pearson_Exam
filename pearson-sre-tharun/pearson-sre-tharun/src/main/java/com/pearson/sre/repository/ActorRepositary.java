package com.pearson.sre.repository;


import com.pearson.sre.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepositary extends JpaRepository<Actor,Integer> {
}
