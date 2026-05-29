package com.example.demo.controller;

import com.example.demo.service.WeekendPlanService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(HomeController.class)
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WeekendPlanService weekendPlanService;

    @Test
    void rendersHomePageWithHeadlineAndPlans() throws Exception {
        given(weekendPlanService.getFridayHeadline()).willReturn("Titular de prueba");
        given(weekendPlanService.getWeekendPlans()).willReturn(List.of());

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("headline"))
                .andExpect(model().attributeExists("plans"))
                .andExpect(content().string(
                        org.hamcrest.Matchers.containsString("Que hacer este fin de semana sin pensar demasiado")));
    }
}