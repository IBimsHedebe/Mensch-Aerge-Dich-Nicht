import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Player
 * made by Ole
 * added 7.3.26
 */
public class Player extends Actor{
    int posX;
    int posY;
    
    // Variabeln für Animation
    private GreenfootImage[] idleImages;
    private int frame = 0; // Aktueller Frame
    private int animationDelay = 10; // Geschwindigkeit
    private int animationTimer = 0; // Bremst die Geschwindigkeit
    private int count = 0;
    
    public Player(String spriteColour){
        idleImages = new GreenfootImage[3]; // Anzahl der Bilder in der Animation
        
        // laden der Bilder
        for (int i = 0; i < idleImages.length; i++){
            idleImages[i] = new GreenfootImage(spriteColour + "_idle_" + i + ".png");
            idleImages[i].scale(48, 48); // verändert die Größe beim Laden der Spielfigur
        }
    }
    
    public void act(){
        animate();
    }
    
    private void animate(){
        animationTimer ++;
        
        // Wechselt jede Sekunde durch 10 Bilder
        if (animationTimer >= 10) {
            frame = (frame + 1) % idleImages.length; // Erhöt frame um 1. Wenn Wenn das Ende fom Array erreicht ist frame = 0
            setImage(idleImages[frame]); // ändert das Bild
            animationTimer = 0; // Setzt den Timer zuzrück
        }
    }
    
}
