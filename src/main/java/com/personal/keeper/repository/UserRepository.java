package com.personal.keeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.keeper.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findUserByUsername(String username);
}
