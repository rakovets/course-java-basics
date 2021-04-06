package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        final int secondsInHours = 3600;
        final int secondsInMinutes = 60;
        hours = totalSeconds / secondsInHours;
        minutes = totalSeconds % secondsInHours / secondsInMinutes;
        seconds = totalSeconds % secondsInHours % secondsInMinutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getTotalseconds(){
        return hours * 3600 + minutes * 60 + seconds;
    }
}
