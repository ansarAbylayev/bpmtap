package com.example.bpmtap;

public class BpmResponse {
    private final double bpm;
    private final int taps;
   public BpmResponse(double bpm, int taps){
        this.bpm = bpm;
        this.taps = taps;
    }

    public double getBpm() {
        return bpm;
    }

    public int getTaps() {
        return taps;
    }
}
