package com.paintingscollectors.repository;

import com.paintingscollectors.model.entity.Painting;
import com.paintingscollectors.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsUserByUsernameOrEmail(String username, String email);
    Optional<User> findFirstByUsername(String username);
    Optional<User> findFirstById(long id);
    @Modifying
    @Transactional
    @Query("UPDATE User AS u SET u.ratedPaintings=:newRatedPaintings WHERE u.id=:id")
    void updateUser(@Param("id") Long id, @Param("newRatedPaintings") Set<Painting> newRatedPaintings);





}
