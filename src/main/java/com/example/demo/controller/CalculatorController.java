package com.example.demo.controller;

import com.example.demo.service.SumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final SumService sumService;

    public CalculatorController(SumService sumService) {
        this.sumService = sumService;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return sumService.sum(a, b);
    }
}
