import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * made by Ole
 * 
 * added 28.04.26
 */
public class Game_Master extends Actor
{
    private int aktivPlayer = 0;
    private String[] playerColour = {"Black", "Blue", "Green", "White"};
    
    // Referenz zum Würfel
    Dice dice = (Dice) getWorld().getObjects(Dice.class).get(0);
    
    public void act()
    {
        if(dice.diceRolled){
            aktivPlayer = (aktivPlayer + 1) % 4;
            dice.diceRolled = false;
        }
    }
}
