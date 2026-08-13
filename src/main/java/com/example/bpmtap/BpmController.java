package com.example.bpmtap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BpmController {

    @GetMapping("/api/ping")
    public String ping() {
        return "working";
    }
    @PostMapping("/api/bpm")
    public BpmResponse calculateBPM(@RequestBody int[] taps){
        BpmCalculator calc = new BpmCalculator();
        int bpm = calc.getBpm(taps);
        return new BpmResponse(bpm, taps.length);
    }

}