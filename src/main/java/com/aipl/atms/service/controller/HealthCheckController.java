package com.aipl.atms.service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @PostMapping(value = "app/health")
    public String appHealthCheck(){
        return "Application is Running properly with expected behaviours : . . . ";
    }
}
