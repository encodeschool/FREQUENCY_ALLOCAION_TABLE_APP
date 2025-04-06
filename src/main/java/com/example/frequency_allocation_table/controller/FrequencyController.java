package com.example.frequency_allocation_table.controller;

import com.example.frequency_allocation_table.service.FrequencyAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrequencyController {

    @Autowired
    private FrequencyAllocationService frequencyAllocationService;

    @GetMapping("/table")
    public String getMainPage(Model model) {

        model.addAttribute("frequencies", frequencyAllocationService);

        return "main/index";
    }

}
