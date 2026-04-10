import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dice class
 * 
 * made by Ole
 * added 10.04.26
 */
public class Dice extends Dice_Screen
{
    public int rolledNumber;
    
    public void Roll_Number(){
        rolledNumber = Greenfoot.getRandomNumber(6) + 1;
    }
}
