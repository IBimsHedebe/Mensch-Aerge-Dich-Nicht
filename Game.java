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
        super(13,15,tileGröße);
        Greenfoot.setSpeed(50);
        prepare();
    }
    
    private void prepare()
    {
        // Spawn
        // Black
        addObject(new Tile_Map(41, "black"), 1, 1);
        addObject(new Tile_Map(42, "black"), 1, 2);
        addObject(new Tile_Map(43, "black"), 2, 1);
        addObject(new Tile_Map(44, "black"), 2, 2);

        // Blue
        addObject(new Tile_Map(45, "blue"), 11, 1);
        addObject(new Tile_Map(46, "blue"), 10, 1);
        addObject(new Tile_Map(47, "blue"), 10, 2);
        addObject(new Tile_Map(48, "blue"), 11, 2);

        // White
        addObject(new Tile_Map(49, "white"), 10, 10);
        addObject(new Tile_Map(50, "white"), 11, 10);
        addObject(new Tile_Map(51, "white"), 11, 11);
        addObject(new Tile_Map(52, "white"), 10, 11);

        // Green
        addObject(new Tile_Map(53, "green"), 1, 11);
        addObject(new Tile_Map(54, "green"), 1, 10);
        addObject(new Tile_Map(55, "green"), 2, 10);
        addObject(new Tile_Map(56, "green"), 2, 11);

        // STARTFELDER
        addObject(new Tile_Map(1, "black"), 4, 1);

        addObject(new Tile_Map(11, "blue"), 11, 4);

        addObject(new Tile_Map(21, "white"), 8, 11);

        addObject(new Tile_Map(31, "green"), 1, 8);

        // NORMALE LAUFFELDER
        addObject(new Tile_Map(2, "blank"), 5, 1);
        addObject(new Tile_Map(3, "blank"), 6, 1);
        addObject(new Tile_Map(4, "blank"), 7, 1);
        addObject(new Tile_Map(5, "blank"), 8, 1);
        addObject(new Tile_Map(6, "blank"), 8, 2);
        addObject(new Tile_Map(7, "blank"), 8, 3);
        addObject(new Tile_Map(8, "blank"), 8, 4);
        addObject(new Tile_Map(9, "blank"), 9, 4);
        addObject(new Tile_Map(10, "blank"), 10, 4);

        addObject(new Tile_Map(12, "blank"), 11, 5);
        addObject(new Tile_Map(13, "blank"), 11, 6);
        addObject(new Tile_Map(14, "blank"), 11, 7);
        addObject(new Tile_Map(15, "blank"), 11, 8);
        addObject(new Tile_Map(16, "blank"), 10, 8);
        addObject(new Tile_Map(17, "blank"), 9, 8);
        addObject(new Tile_Map(18, "blank"), 8, 8);
        addObject(new Tile_Map(19, "blank"), 8, 9);
        addObject(new Tile_Map(20, "blank"), 8, 10);

        addObject(new Tile_Map(22, "blank"), 7, 11);
        addObject(new Tile_Map(23, "blank"), 6, 11);
        addObject(new Tile_Map(24, "blank"), 5, 11);
        addObject(new Tile_Map(25, "blank"), 4, 11);
        addObject(new Tile_Map(26, "blank"), 4, 10);
        addObject(new Tile_Map(27, "blank"), 4, 9);
        addObject(new Tile_Map(28, "blank"), 4, 8);
        addObject(new Tile_Map(29, "blank"), 3, 8);
        addObject(new Tile_Map(30, "blank"), 2, 8);

        addObject(new Tile_Map(32, "blank"), 1, 7);
        addObject(new Tile_Map(33, "blank"), 1, 6);
        addObject(new Tile_Map(34, "blank"), 1, 5);
        addObject(new Tile_Map(35, "blank"), 1, 4);
        addObject(new Tile_Map(36, "blank"), 2, 4);
        addObject(new Tile_Map(37, "blank"), 3, 4);
        addObject(new Tile_Map(38, "blank"), 4, 4);
        addObject(new Tile_Map(39, "blank"), 4, 3);
        addObject(new Tile_Map(40, "blank"), 4, 2);

        // ZIELFELDER
        // BLACK
        addObject(new Tile_Map(57, "black"), 6, 2);
        addObject(new Tile_Map(58, "black"), 6, 3);
        addObject(new Tile_Map(59, "black"), 6, 4);
        addObject(new Tile_Map(60, "black"), 6, 5);

        // BLUE
        addObject(new Tile_Map(61, "blue"), 10, 6);
        addObject(new Tile_Map(62, "blue"), 9, 6);
        addObject(new Tile_Map(63, "blue"), 8, 6);
        addObject(new Tile_Map(64, "blue"), 7, 6);

        // WHITE
        addObject(new Tile_Map(65, "white"), 6, 10);
        addObject(new Tile_Map(66, "white"), 6, 9);
        addObject(new Tile_Map(67, "white"), 6, 8);
        addObject(new Tile_Map(68, "white"), 6, 7);

        //GREEN
        addObject(new Tile_Map(69, "green"), 2, 6);
        addObject(new Tile_Map(70, "green"), 3, 6);
        addObject(new Tile_Map(71, "green"), 4, 6);
        addObject(new Tile_Map(72, "green"), 5, 6);

        //Player
        //Black
        Black_Player BlackPlayer1 = new Black_Player();
        addObject(BlackPlayer1,1,1);
        
        
        // Dice
        Dice dice = new Dice();
        addObject(dice,6,13);
    }
    
    public void pruefeGewinner()
    {
    if(blackHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Grau"));
        return;
    }

    if(blueHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Blau"));
        return;
    }

    if(greenHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Gruen"));
        return;
    }

    if(whiteHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Weiss"));
        return;
    }
    }
    
    public boolean blackHatGewonnen()
    {
    return false;
    }

    public boolean blueHatGewonnen()
    {
    return false;
    }

    public boolean greenHatGewonnen()
    {
    return false;
    }

    public boolean whiteHatGewonnen()
    {
    return false;
    }
    
    public void act()
    {
    pruefeGewinner();
    }
    
    public void pruefeGewinner()
    {
    if(blackHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Grau"));
        return;
    }

    if(blueHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Blau"));
        return;
    }

    if(greenHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Gruen"));
        return;
    }

    if(whiteHatGewonnen())
    {
        Greenfoot.setWorld(new victory_screen("Weiss"));
        return;
    }
    }
    
    public boolean blackHatGewonnen()
    {
    return false;
    }

    public boolean blueHatGewonnen()
    {
    return false;
    }

    public boolean greenHatGewonnen()
    {
    return false;
    }

    public boolean whiteHatGewonnen()
    {
    return false;
    }
    
    public void act()
    {
    pruefeGewinner();
    }
}
