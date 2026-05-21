import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


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
    

    public void act(){
        animate();
        
        List<Dice> dices = getWorld().getObjects(Dice.class);
        if (!dices.isEmpty()){
            Dice dice = dices.get(0);
            int rolledNumber = dice.getRandomNumber();
            boolean clicked = dice.getIsClicked();
            
            if (clicked){
                move(rolledNumber);
                dice.setIsClicked(false);
            }
            }
        
        }

    boolean istZuhause = true;
    boolean istUnterwegs = false;

    
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
        
        setImage(idleImages[1]); // Erstellt ein Start Bild
    }
    
    public void move(int schritte){
        List<Tile_Map> tiles = getIntersectingObjects(Tile_Map.class);
        
        if (!tiles.isEmpty()){
            Tile_Map aktuellesFeld = tiles.get(0);
            int aktuelleNummer = aktuellesFeld.getFeldNumber();
            
            int ziel = aktuelleNummer + schritte + 1;
            
            if (ziel > 40){
                ziel = ziel - 40;
            }
            
            moveToTile(ziel);
            System.out.println(ziel);
        }
    }
    
    private void moveToTile(int Ziel){
        List<Tile_Map> allTiles = getWorld().getObjects(Tile_Map.class);
        
        for (Tile_Map tile : allTiles) {
            if (tile.getFeldNumber() == Ziel){
                setLocation(tile.getX(), tile.getY());
                break;
            }
        }
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
    
    
    private int position = 0; // Die Variable für das Feld, auf dem der Spieler steht
    
    public int getPosition() {
        return position;
    }
    
    public void setPosition(int neuePosition) {
        this.position = neuePosition;
        // Hier könntest du auch direkt den Actor auf dem Bildschirm bewegen:
        // setLocation(x, y); 
    }
}
