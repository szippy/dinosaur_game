package com.szippy.Dinosaurs;

import javax.swing.*;
import java.awt.*;

public class GamePanel {
    JFrame frame;

    public GamePanel(){
        //default constructor
        //@todo finish this
        createWindow();
        drawMap();
    }

    void createWindow(){
        //draw the new window
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Dinosaur Chase");

        int frameWidth = 600;
        int frameHeight = 600;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds((int) screenSize.getWidth() - frameWidth, 0, frameWidth, frameHeight);
        frame.setVisible(true);
        System.out.println("Frame created");
    }
    
     void drawMap(){
        System.out.println("drawMap called");
     }

    void refresh(){

    }
}

