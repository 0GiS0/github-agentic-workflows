package com.example.demo.service;

import com.example.demo.model.WeekendPlan;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class WeekendPlanServiceTest {

    private final WeekendPlanService service = new WeekendPlanService();

    @Test
    void returnsAtLeastTwentyUniquePlans() {
        List<WeekendPlan> plans = service.getWeekendPlans();
        Set<String> titles = plans.stream()
                .map(WeekendPlan::getTitle)
                .collect(Collectors.toSet());

        assertThat(plans).hasSizeGreaterThanOrEqualTo(20);
        assertThat(titles).hasSize(plans.size());
        assertThat(plans)
                .allSatisfy(plan -> {
                    assertThat(plan.getTitle()).isNotBlank();
                    assertThat(plan.getVibe()).isNotBlank();
                    assertThat(plan.getBudget()).isNotBlank();
                    assertThat(plan.getSocialBattery()).isNotBlank();
                    assertThat(plan.getPunchline()).isNotBlank();
                });
    }

    @Test
    void returnsANonBlankHeadline() {
        assertThat(service.getFridayHeadline()).isNotBlank();
    }
}