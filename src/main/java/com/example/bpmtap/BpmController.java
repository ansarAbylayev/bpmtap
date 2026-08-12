package com.example.bpmtap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BpmController {

    @GetMapping("/api/ping")
    public String ping() {
        return "работает";
    }
}