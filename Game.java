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
        // Black
        addBlackIfEmpty(1,1);
        addBlackIfEmpty(1,2);
        addBlackIfEmpty(2,1);
        addBlackIfEmpty(2,2);

        // White
        addWhiteIfEmpty(10,10);
        addWhiteIfEmpty(10,11);
        addWhiteIfEmpty(11,10);
        addWhiteIfEmpty(11,11);

        // Blue
        addBlueIfEmpty(10,1);
        addBlueIfEmpty(10,2);
        addBlueIfEmpty(11,1);
        addBlueIfEmpty(11,2);

        // Green
        addGreenIfEmpty(1,10);
        addGreenIfEmpty(2,10);
        addGreenIfEmpty(1,11);
        addGreenIfEmpty(2,11);

        // Player
        // Black
        addBlackPlayer(1,1);
        addBlackPlayer(1,2);
        addBlackPlayer(2,1);
        addBlackPlayer(2,2);

        // White
        addWhitePlayer(10,10);
        addWhitePlayer(10,11);
        addWhitePlayer(11,10);
        addWhitePlayer(11,11);

        // Blue
        addBluePlayer(10,1);
        addBluePlayer(10,2);
        addBluePlayer(11,1);
        addBluePlayer(11,2);

        // Green
        addGreenPlayer(1,10);
        addGreenPlayer(2,10);
        addGreenPlayer(1,11);
        addGreenPlayer(2,11);

        // Blank Fields
        int mid = 6; // Die Mitte bei 13 Feldern (0-12)

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
        addBlueIfEmpty(11, mid - 1);
        addGreenIfEmpty(1, mid - 1);

        // Ziel
        // Black
        for (int i = 0; i < 4; i++){
            addBlackIfEmpty(mid, 2 + i);
        }
        // White
        for (int i = 0; i < 4; i++){
            addWhiteIfEmpty(mid, 10 - i);
        }
        // Blue
        for (int i = 0; i < 4; i++){
            addBlueIfEmpty(10 - i, mid);
        }
        //Green
        for (int i = 0; i < 4; i++){
            addGreenIfEmpty(2 + i, mid);
        }
        Black_Player black_Player5 = new Black_Player();
        addObject(black_Player5,1,3);
    }
    
    private void addBlackPlayer(int x, int y){
        addObject(new Black_Player(), x, y);
    }
    
    private void addBluePlayer(int x, int y){
        addObject(new Blue_Player(), x, y);
    }
    
    private void addWhitePlayer(int x, int y){
        addObject(new White_Player(), x, y);
    }
    
    private void addGreenPlayer(int x, int y){
        addObject(new Green_Player(), x, y);
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
