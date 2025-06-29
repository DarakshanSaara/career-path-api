package com.example.careerpath.service;

import com.example.careerpath.model.UserProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
//public class RecommendationService {
//    public List<String> recommendCareers(UserProfile user) {
//        List<String> careers = new ArrayList<>();
//
//        if (user.getSkills().contains("Java")) {
//            careers.add("Backend Developer");
//        }
//        if (user.getInterests().contains("Tech")) {
//            careers.add("Software Engineer");
//        }
//        if (user.getSkills().contains("Writing")) {
//            careers.add("Technical Writer");
//        }
//
//        return careers;
//    }
//}

@Service
public class RecommendationService {

    public List<String> recommendCareers(UserProfile userProfile) {
        List<String> recommendations = new ArrayList<>();

        String education = userProfile.getEducation().toLowerCase();
        List<String> skills = userProfile.getSkills().stream().map(String::toLowerCase).toList();
        List<String> interests = userProfile.getInterests().stream().map(String::toLowerCase).toList();

        // Flexible rule: match if any keyword is present
        if (education.contains("12") && skills.contains("java") && interests.contains("tech")) {
            recommendations.add("Software Engineer");
        } else if (skills.contains("design") || interests.contains("creativity")) {
            recommendations.add("Graphic Designer");
        } else if (skills.contains("writing") || interests.contains("media")) {
            recommendations.add("Content Writer");
        }

        // Default fallback
        if (recommendations.isEmpty()) {
            recommendations.add("No Match Found");
        }

        return recommendations;
    }
}
