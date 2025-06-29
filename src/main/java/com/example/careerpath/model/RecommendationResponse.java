package com.example.careerpath.model;

import java.util.List;

public class RecommendationResponse {
    private List<String> recommendedCareer;

    public RecommendationResponse(List<String> recommendedCareer) {
        this.recommendedCareer = recommendedCareer;
    }

    public List<String> getRecommendedCareer() {
        return recommendedCareer;
    }

    public void setRecommendedCareer(List<String> recommendedCareer) {
        this.recommendedCareer = recommendedCareer;
    }
}
