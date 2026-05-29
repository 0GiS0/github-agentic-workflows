package com.example.demo.model;

public class WeekendPlan {

    private final String title;
    private final String vibe;
    private final String budget;
    private final String socialBattery;
    private final String punchline;

    public WeekendPlan(String title, String vibe, String budget, String socialBattery, String punchline) {
        this.title = title;
        this.vibe = vibe;
        this.budget = budget;
        this.socialBattery = socialBattery;
        this.punchline = punchline;
    }

    public String getTitle() {
        return title;
    }

    public String getVibe() {
        return vibe;
    }

    public String getBudget() {
        return budget;
    }

    public String getSocialBattery() {
        return socialBattery;
    }

    public String getPunchline() {
        return punchline;
    }
}
