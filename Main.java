package com.szippy.Dinosaurs;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){

        System.out.print("Project Initialized.");
        Player p = new Player();

        System.out.print("\nPlayer has " + p.getHealth() + " health");

        //testing existing window
        Game g = new Game();
        g.startGame();
    }
}
