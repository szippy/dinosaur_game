package com.szippy.Dinosaurs;

public class Dinosaur {
    private int health;
    private int speed;
    private int damage;
    private String name = "Dinosaur";

    // super class for the subclasses of dinosaurs
    // default constructor
    public Dinosaur(){
        setHealth(150);
        setSpeed(1);
        setDamage(10);
    }

    public void Move(){
        //@todo move the dinosaur depending on some shit
    }

    public boolean isEating(){
        //@todo determine if the dinosaur is eating the player
        return false;
    }

    public boolean isStunned(){
        //todo determine if the dinosaur has run into walls.
        return false;
    }
    // setters and getters
    public void setHealth(int health){
        this.health = health;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
