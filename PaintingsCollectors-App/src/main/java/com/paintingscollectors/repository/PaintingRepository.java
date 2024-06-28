package com.paintingscollectors.repository;

import com.paintingscollectors.model.entity.Painting;
import com.paintingscollectors.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface PaintingRepository extends JpaRepository<Painting, Long> {
    List<Painting> findAllByOwner(User owner);
    List<Painting> findAllByOwnerNot(User owner);
    List<Painting> findAllByUsersFavorites(User user);
    List<Painting> findAllByVotesIsGreaterThan(int votes);

    @Override
    void deleteById(Long aLong);

    Optional<Painting> findFirstById(Long id);



}