import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Game
 * made by Ole
 * added 31.03.26
 */
public class Game extends World
{
    private static int tileGröße = 50;
    public Game()
    {    
        super(13,13,tileGröße);
        Greenfoot.setSpeed(50);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Home
        addTileGroup(new Black_Tile_Map(), 1, 1);// Oben links
        addTileGroup(new Blue_Tile_Map(), 10, 1);  // Oben rechts (Beispielwert für x)
        addTileGroup(new Green_Tile_Map(), 1, 10); // Unten links (Beispielwert für y)
        addTileGroup(new White_Tile_Map(), 10, 10); // Unten rechts
        
        // Player
        addPlayerGroup(new Black_Player(), 1, 1); // Oben links
        addPlayerGroup(new Blue_Player(), 10, 1);  // Oben rechts (Beispielwert für x)
        addPlayerGroup(new Green_Player(), 1, 10); // Unten links (Beispielwert für y)
        addPlayerGroup(new White_Player(), 10, 10); // Unten rechts
        
        
        int mid = 6; // Die Mitte bei 13 Feldern (0-12)
    
        // Die Arme des Kreuzes sind jeweils 5 Felder lang (von 1-5 und 7-11)
        for (int i = 1; i <= 4; i++) {
            // Oben & Unten
            addBlankIfEmpty(mid - 2, i); // Linke Kante vertikal
            addBlankIfEmpty(mid + 2, i); // Rechte Kante vertikal
            addBlankIfEmpty(mid - 2, i + 7); 
            addBlankIfEmpty(mid + 2, i + 7);
    
            // Links & Rechts
            addBlankIfEmpty(i, mid - 2); // Obere Kante horizontal
            addBlankIfEmpty(i, mid + 2); // Untere Kante horizontal
            addBlankIfEmpty(i + 7, mid - 2);
            addBlankIfEmpty(i + 7, mid + 2);
        }
        
        // Oben
        for (int i = 0; i < 2; i++){
            addBlankIfEmpty(mid + 1 - i, 1);
        }
        // Unten
        for (int i = 0; i < 2; i++){
            addBlankIfEmpty(mid + 1 - i, 11);
        }
        // Links
        for (int i = 0; i < 2; i++){
            addBlankIfEmpty(1, mid + 1 - i);
        }
        // Rechts
        for (int i = 0; i < 2; i++){
            addBlankIfEmpty(11, mid + 1 - i);
        }
        
        // Spawn
        addBlackIfEmpty(mid - 1, 1);
        addWhiteIfEmpty(mid - 1, 11);
        addBlueIfEmpty(1, mid - 1);
        addGreenIfEmpty(11, mid - 1);
    }
    
    private void addTileGroup(Actor tile, int startX, int startY) {
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                // Wir müssen für jedes Feld ein neues Objekt erstellen
                try {
                    addObject(tile.getClass().getDeclaredConstructor().newInstance(), startX + x, startY + y);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
    
    private void addPlayerGroup(Actor tile, int startX, int startY) {
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                // Wir müssen für jedes Feld ein neues Objekt erstellen
                try {
                    addObject(tile.getClass().getDeclaredConstructor().newInstance(), startX + x, startY + y);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
    
    private void addBlankIfEmpty(int x, int y) {
        if (getObjectsAt(x, y, null).isEmpty()) {
            addObject(new Blank_Tile_Map(), x, y);
        }
    }
    
    private void addBlackIfEmpty(int x, int y) {
        if (getObjectsAt(x, y, null).isEmpty()) {
            addObject(new Black_Tile_Map(), x, y);
        }
    }
    
    private void addWhiteIfEmpty(int x, int y) {
        if (getObjectsAt(x, y, null).isEmpty()) {
            addObject(new White_Tile_Map(), x, y);
        }
    }
    
    private void addBlueIfEmpty(int x, int y) {
        if (getObjectsAt(x, y, null).isEmpty()) {
            addObject(new Blue_Tile_Map(), x, y);
        }
    }
    
    private void addGreenIfEmpty(int x, int y) {
        if (getObjectsAt(x, y, null).isEmpty()) {
            addObject(new Green_Tile_Map(), x, y);
        }
    }
}
