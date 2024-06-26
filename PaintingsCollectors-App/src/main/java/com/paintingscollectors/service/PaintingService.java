package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.AddPaintingDto;
import com.paintingscollectors.model.entity.Painting;

public interface PaintingService {

    boolean addPainting(AddPaintingDto addPaintingDto);
}
