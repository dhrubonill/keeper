package com.personal.keeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.keeper.entity.Attempts;

import java.util.Optional;

@Repository
public interface AttemptsRepository extends JpaRepository<Attempts, Integer> {
   
    Optional<Attempts> findAttemptsByUsername(String username);

}
