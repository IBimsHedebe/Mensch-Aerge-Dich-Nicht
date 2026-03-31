import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Tile_Map
 * made by Ole
 * added 31.03.26
 */
public class Tile_Map extends Actor
{
    private GreenfootImage tileColor;
    
    public Tile_Map(String color){
        tileColor = new GreenfootImage("Map/" + color + ".png");
        tileColor.scale(48,48);
        setImage(tileColor);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
