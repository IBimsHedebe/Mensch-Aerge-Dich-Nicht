import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Player
 * made by Ole
 * added 7.3.26
 */
public class Player extends Actor{
    // Variabeln für Animation
    private GreenfootImage[] idleImages;
    private GreenfootImage[] moveImages;
    private int frame = 0; // Aktueller Frame
    private int animationTimer = 0; // Bremst die Geschwindigkeit
    
    public Player(String spriteColour){
        // Anzahl der Bilder in der Animation
        idleImages = new GreenfootImage[3];
        moveImages = new GreenfootImage[6];
        
        // laden der Bilder
        for (int i = 0; i < idleImages.length; i++){
            idleImages[i] = new GreenfootImage("player/idle/" + spriteColour + "_" + i + ".png");
            idleImages[i].scale(48, 48); // verändert die Größe beim Laden der Spielfigur
        }
        for (int i = 0; i < moveImages.length; i++){
            moveImages[i] = new GreenfootImage("player/move/" + spriteColour + "_" + i + ".png");
            moveImages[i].scale(48, 48); // verändert die Größe beim Laden der Spielfigur
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
