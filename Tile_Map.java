import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Tile_Map
 * made by Ole
 * added 31.03.26
 */
public class Tile_Map extends Actor
{
    private GreenfootImage tileColor;
    private int tileNumber;
    private String color;
    
    public Tile_Map(int number, String color){
        this.tileNumber = number;
        
        tileColor = new GreenfootImage("Map/" + color + ".png");
        tileColor.scale(48,48);
        setImage(tileColor);
    }
    
    public int getFeldNumber(){
        return this.tileNumber;
    }
}
