package com.example.careerpath.controller;

import com.example.careerpath.model.RecommendationResponse;
import com.example.careerpath.model.UserProfile;
import com.example.careerpath.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @PostMapping("/recommend")
    public RecommendationResponse recommend(@RequestBody UserProfile userProfile) {
        List<String> careers = recommendationService.recommendCareers(userProfile);
        return new RecommendationResponse(careers);
    }
}
