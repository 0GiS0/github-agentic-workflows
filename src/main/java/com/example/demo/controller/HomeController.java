package com.example.demo.controller;

import com.example.demo.service.WeekendPlanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final WeekendPlanService weekendPlanService;

    public HomeController(WeekendPlanService weekendPlanService) {
        this.weekendPlanService = weekendPlanService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("headline", weekendPlanService.getFridayHeadline());
        model.addAttribute("plans", weekendPlanService.getWeekendPlans());
        return "index";
    }
}
