import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dice class
 * 
 * made by Ole
 * added 17.04.26
 */
public class Dice extends Actor
{
    public int randomNumber;
    public GreenfootImage[] idleImages;
    public GreenfootImage[] rollImages;
    
    public Dice(){
        // Anzahl Bilder
        idleImages = new GreenfootImage[1];
        rollImages = new GreenfootImage[6];
        
        // Lade Bilder
        idleImages[1] = new GreenfootImage("dice/" + "dice" + ".png");
        idleImages[1].scale(48, 48); // verändert die Größe beim Laden der Spielfigur
        
        for (int i = 0; i < rollImages.length; i++){
            rollImages[i] = new GreenfootImage("dice/" + i + ".png");
            rollImages[i].scale(48, 48); // verändert die Größe beim Laden der Spielfigur
        }
        
        setImage(idleImages[1]);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(Dice.class)){
            randomNumber = Greenfoot.getRandomNumber(6) + 1;
            animate();
        }
        
    }
    
    public void animate(){
        
    }
}
