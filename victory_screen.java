import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class victory_screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class victory_screen extends World
{
    public victory_screen(String farbe)
    {
        super(300, 200, 1);

        showText("SPIEL ENDE", 150, 60);

        showText(farbe + " gewinnt!", 150, 100);

        showText("Reset fuer neues Spiel", 150, 140);
    }
}