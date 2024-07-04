package com.bonappetit.repo;

import com.bonappetit.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByUsernameOrEmail(String username, String email);
    Optional<User> findFirstByUsername(String username);
    Optional<User> findFirstById(long id);

}
