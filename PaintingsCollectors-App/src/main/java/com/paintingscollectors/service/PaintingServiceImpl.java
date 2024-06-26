package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.AddPaintingDto;
import com.paintingscollectors.model.entity.Painting;
import com.paintingscollectors.model.entity.StyleEnum;
import com.paintingscollectors.model.entity.User;
import com.paintingscollectors.repository.PaintingRepository;
import com.paintingscollectors.repository.StyleRepository;
import com.paintingscollectors.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PaintingServiceImpl implements PaintingService {

    private final PaintingRepository paintingRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;
    private final UserRepository userRepository;
    private final StyleRepository styleRepository;

    public PaintingServiceImpl(PaintingRepository paintingRepository, ModelMapper modelMapper, CurrentUser currentUser, UserRepository userRepository, StyleRepository styleRepository) {
        this.paintingRepository = paintingRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
        this.userRepository = userRepository;
        this.styleRepository = styleRepository;
    }

    @Override
    public boolean addPainting(AddPaintingDto addPaintingDto) {
        Painting mappedPainting = modelMapper.map(addPaintingDto, Painting.class);
        User owner = this.userRepository.findFirstById(this.currentUser.getId()).get();
        mappedPainting.setOwner(owner);
        mappedPainting.setStyle(this.styleRepository
                .findFirstByStyleName(StyleEnum.valueOf(addPaintingDto.getStyle())).get());
        this.paintingRepository.save(mappedPainting);
        return true;
    }

    @Override
    public List<Painting> getMyPaintings() {
        return this.paintingRepository
                .findAllByOwner(this.userRepository.getById(this.currentUser.getId()));
    }

    @Override
    public List<Painting> getOtherPaintings() {
        return this.paintingRepository
                .findAllByOwnerNot(this.userRepository.getById(this.currentUser.getId()));
    }

    @Override
    public List<Painting> getMyFavoritePaintings() {
        return this.userRepository
                .findFirstById(this.currentUser.getId()).get()
                .getFavoritePaintings().stream().toList();

    }

    @Override
    public List<Painting> getTwoMostVotedPaintings() {

        List<Painting> votedPaintings = this.paintingRepository.findAllByVotesIsGreaterThan(0);
        if (votedPaintings.size() > 1) {
            votedPaintings.sort((p1, p2) -> p2.getVotes() - p1.getVotes());
        }
        if (votedPaintings.size() > 2) {
            return votedPaintings.subList(0, 2);
        }
        return votedPaintings;
    }

    @Override
    public void removePaintingById(Long id) {
        this.paintingRepository.deleteById(id);
    }

    @Override
    public void addToFavoritePainting(Long id) {
        User user = this.userRepository.findFirstById(this.currentUser.getId()).get();
        Painting painting = this.paintingRepository.findFirstById(id).get();
        painting.setFavorite(true);
        painting.getUsersFavorites().add(user);
        this.paintingRepository.save(painting);
    }

    @Override
    public void removeFromFavoritePainting(Long id) {
        User user = this.userRepository.findFirstById(this.currentUser.getId()).get();
        Painting painting = this.paintingRepository.findFirstById(id).get();
        for (User usersFavorite : painting.getUsersFavorites()) {
            if (usersFavorite.getId().equals(user.getId())) {
                painting.getUsersFavorites().remove(usersFavorite);
                break;
            }
        }
        if (painting.getUsersFavorites().size() == 0) {
            painting.setFavorite(false);
        }
        this.paintingRepository.save(painting);
    }

    @Override
    public void votePainting(Long id) {
        User user = this.userRepository.findFirstById(this.currentUser.getId()).get();
        Painting painting = this.paintingRepository.findFirstById(id).get();
        boolean isVoted = false;
        if (user.getRatedPaintings().size() > 0) {
            for (Painting ratedPainting : user.getRatedPaintings()) {
                if (ratedPainting.getId().equals(painting.getId())) {
                    isVoted = true;
                    break;
                }
            }
        }
        if (!isVoted) {
            painting.setVotes(painting.getVotes() + 1);
            user.getRatedPaintings().add(painting);
            this.paintingRepository.save(painting);
            this.userRepository.save(user);
        }
    }
}
