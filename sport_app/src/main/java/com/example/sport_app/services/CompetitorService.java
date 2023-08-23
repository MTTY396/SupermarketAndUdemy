package com.example.sport_app.services;

import com.example.sport_app.model.Competitor;

import java.util.List;
import java.util.UUID;

public interface CompetitorService {

    Competitor getCompetitorById(UUID id);

    List<Competitor> getAllCompetitors();
}
