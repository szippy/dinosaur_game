package com.szippy.Dinosaurs;

public class Game {
    private int time = 0;
    private int score = 0;
    private boolean isLost = false;

    // constructor
    public Game(){
    }

    //constructor with time and score
    public Game(int time, int score){
        setTime(time);
        setScore(score);
    }
    //setters and getters
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isLost(){
        return isLost;
    }

    public void setLost(boolean lost) {
        isLost = lost;
        //@todo determine if actually lost
    }

    public void exit(){
        //@todo make this less shitty
        System.out.print("Thank you for playing. Bye.");
        System.exit(0);
    }
}

