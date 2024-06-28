package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.AddPaintingDto;
import com.paintingscollectors.model.entity.Painting;

import java.util.List;
import java.util.Set;

public interface PaintingService {

    boolean addPainting(AddPaintingDto addPaintingDto);

    List<Painting> getMyPaintings();
    List<Painting> getOtherPaintings();
    List<Painting> getMyFavoritePaintings();
    List<Painting> getTwoMostFavoritePaintings();
    void removePaintingById(Long id);
    void addToFavoritePainting(Long id);
}
