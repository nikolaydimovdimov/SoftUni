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
        return this.paintingRepository
                .findAllByUsersFavorites(this.userRepository.getById(this.currentUser.getId()));
    }

    @Override
    public List<Painting> getTwoMostFavoritePaintings() {

        List<Painting> votedPaintings = this.paintingRepository.findAllByVotesIsGreaterThan(0);
        if (votedPaintings.size() > 1) {
            votedPaintings.sort((p1, p2) -> p2.getVotes() - p1.getVotes());
            if (votedPaintings.size() > 2) {
                votedPaintings.subList(0,2);
            }
        }
        return votedPaintings;
    }
}
