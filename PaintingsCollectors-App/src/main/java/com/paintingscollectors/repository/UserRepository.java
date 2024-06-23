package com.paintingscollectors.repository;

import com.paintingscollectors.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsUserByUsernameOrEmail(String username, String email);
    Optional<User> findFirstByUsername(String username);
    Optional<User> findFirstById(long id);





}
