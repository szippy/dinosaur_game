package com.szippy.Dinosaurs;

public class Player {
    private int health;
    private int speed;
    private int x;
    private int y;
    private int direction;
    private String name;

    //null constructor
    public Player(){
        setHealth(100);
        setSpeed(2);
        setX(0);
        setY(0);
    }

    //constructor to set health and speed
    public Player(int health, int speed){
        setHealth(health);
        setSpeed(speed);
        setX(0);
        setY(0);
    }

    //move user
    public void Move(){
        //@todo move user in direction of arrow key push.
    }

    public boolean isSafe(){
        //@todo check if the user has hit any walls.
        return false;
    }

    //setters and getters

    public void setName(String name) {
        this.name = name;
    }
