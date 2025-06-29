package com.example.careerpath.model;

import java.util.List;

public class UserProfile {
    private String education;
    private List<String> skills;
    private List<String> interests;

    // Getters and Setters

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
