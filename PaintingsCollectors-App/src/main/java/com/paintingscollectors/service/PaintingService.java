package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.AddPaintingDto;
import com.paintingscollectors.model.entity.Painting;

import java.util.List;

public interface PaintingService {

    boolean addPainting(AddPaintingDto addPaintingDto);

    List<Painting> getMyPaintings();
    List<Painting> getOtherPaintings();
}
