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
        // Spawn
        // Black
        Black_Tile_Map BlackSpawn1 = new Black_Tile_Map();
        addObject(BlackSpawn1,1,1);
        Black_Tile_Map BlackSpawn2 = new Black_Tile_Map();
        addObject(BlackSpawn2,2,1);
        Black_Tile_Map BlackSpawn3 = new Black_Tile_Map();
        addObject(BlackSpawn3,1,2);
        Black_Tile_Map BlackSpawn4 = new Black_Tile_Map();
        addObject(BlackSpawn4,2,2);

        // Blue
        Blue_Tile_Map BlueSpawn1 = new Blue_Tile_Map();
        addObject(BlueSpawn1,11,1);
        Blue_Tile_Map BlueSpawn2 = new Blue_Tile_Map();
        addObject(BlueSpawn2,10,1);
        Blue_Tile_Map BlueSpawn3 = new Blue_Tile_Map();
        addObject(BlueSpawn3,10,2);
        Blue_Tile_Map BlueSpawn4 = new Blue_Tile_Map();
        addObject(BlueSpawn4,11,2);

        // White
        White_Tile_Map WhiteSpawn1 = new White_Tile_Map();
        addObject(WhiteSpawn1,10,10);
        White_Tile_Map WhiteSpawn2 = new White_Tile_Map();
        addObject(WhiteSpawn2,11,10);
        White_Tile_Map WhiteSpawn3 = new White_Tile_Map();
        addObject(WhiteSpawn3,11,11);
        White_Tile_Map WhiteSpawn4 = new White_Tile_Map();
        addObject(WhiteSpawn4,10,11);

        // Green
        Green_Tile_Map GreenSpawn1 = new Green_Tile_Map();
        addObject(GreenSpawn1,1,11);
        Green_Tile_Map GreenSpawn2 = new Green_Tile_Map();
        addObject(GreenSpawn2,1,10);
        Green_Tile_Map GreenSpawn3 = new Green_Tile_Map();
        addObject(GreenSpawn3,2,10);
        Green_Tile_Map GreenSpawn4 = new Green_Tile_Map();
        addObject(GreenSpawn4,2,11);
        

        // STARTFELDER
        Black_Tile_Map Feld1 = new Black_Tile_Map();
        addObject(Feld1,4,1);

        Blue_Tile_Map Feld11 = new Blue_Tile_Map();
        addObject(Feld11,11,4);

        White_Tile_Map Feld21 = new White_Tile_Map();
        addObject(Feld21,8,11);

        Green_Tile_Map Feld31 = new Green_Tile_Map();
        addObject(Feld31,1,8);

        // NORMALE LAUFFELDER
        Blank_Tile_Map Feld2 = new Blank_Tile_Map();
        addObject(Feld2,5,1);
        Blank_Tile_Map Feld3 = new Blank_Tile_Map();
        addObject(Feld3,6,1);
        Blank_Tile_Map Feld4 = new Blank_Tile_Map();
        addObject(Feld4,7,1);
        Blank_Tile_Map Feld5 = new Blank_Tile_Map();
        addObject(Feld5,8,1);
        Blank_Tile_Map Feld6 = new Blank_Tile_Map();
        addObject(Feld6,8,2);
        Blank_Tile_Map Feld7 = new Blank_Tile_Map();
        addObject(Feld7,8,3);
        Blank_Tile_Map Feld8 = new Blank_Tile_Map();
        addObject(Feld8,8,4);
        Blank_Tile_Map Feld9 = new Blank_Tile_Map();
        addObject(Feld9,9,4);
        Blank_Tile_Map Feld10 = new Blank_Tile_Map();
        addObject(Feld10,10,4);

        Blank_Tile_Map Feld12 = new Blank_Tile_Map();
        addObject(Feld12,11,5);
        Blank_Tile_Map Feld13 = new Blank_Tile_Map();
        addObject(Feld13,11,6);
        Blank_Tile_Map Feld14 = new Blank_Tile_Map();
        addObject(Feld14,11,7);
        Blank_Tile_Map Feld15 = new Blank_Tile_Map();
        addObject(Feld15,11,8);
        Blank_Tile_Map Feld16 = new Blank_Tile_Map();
        addObject(Feld16,10,8);
        Blank_Tile_Map Feld17 = new Blank_Tile_Map();
        addObject(Feld17,9,8);
        Blank_Tile_Map Feld18 = new Blank_Tile_Map();
        addObject(Feld18,8,8);
        Blank_Tile_Map Feld19 = new Blank_Tile_Map();
        addObject(Feld19,8,9);
        Blank_Tile_Map Feld20 = new Blank_Tile_Map();
        addObject(Feld20,8,10);

        Blank_Tile_Map Feld22 = new Blank_Tile_Map();
        addObject(Feld22,7,11);
        Blank_Tile_Map Feld23 = new Blank_Tile_Map();
        addObject(Feld23,6,11);
        Blank_Tile_Map Feld24 = new Blank_Tile_Map();
        addObject(Feld24,5,11);
        Blank_Tile_Map Feld25 = new Blank_Tile_Map();
        addObject(Feld25,4,11);
        Blank_Tile_Map Feld26 = new Blank_Tile_Map();
        addObject(Feld26,4,10);
        Blank_Tile_Map Feld27 = new Blank_Tile_Map();
        addObject(Feld27,4,9);
        Blank_Tile_Map Feld28 = new Blank_Tile_Map();
        addObject(Feld28,4,8);
        Blank_Tile_Map Feld29 = new Blank_Tile_Map();
        addObject(Feld29,3,8);
        Blank_Tile_Map Feld30 = new Blank_Tile_Map();
        addObject(Feld30,2,8);

        Blank_Tile_Map Feld32 = new Blank_Tile_Map();
        addObject(Feld32,1,7);
        Blank_Tile_Map Feld33 = new Blank_Tile_Map();
        addObject(Feld33,1,6);
        Blank_Tile_Map Feld34 = new Blank_Tile_Map();
        addObject(Feld34,1,5);
        Blank_Tile_Map Feld35 = new Blank_Tile_Map();
        addObject(Feld35,1,4);
        Blank_Tile_Map Feld36 = new Blank_Tile_Map();
        addObject(Feld36,2,4);
        Blank_Tile_Map Feld37 = new Blank_Tile_Map();
        addObject(Feld37,3,4);
        Blank_Tile_Map Feld38 = new Blank_Tile_Map();
        addObject(Feld38,4,4);
        Blank_Tile_Map Feld39 = new Blank_Tile_Map();
        addObject(Feld39,4,3);
        Blank_Tile_Map Feld40 = new Blank_Tile_Map();
        addObject(Feld40,4,2);

        
        // ZIELFELDER
        // BLACK
        Black_Tile_Map BlackZiel1 = new Black_Tile_Map();
        addObject(BlackZiel1,6,2);
        Black_Tile_Map BlackZiel2 = new Black_Tile_Map();
        addObject(BlackZiel2,6,3);
        Black_Tile_Map BlackZiel3 = new Black_Tile_Map();
        addObject(BlackZiel3,6,4);
        Black_Tile_Map BlackZiel4 = new Black_Tile_Map();
        addObject(BlackZiel4,6,5);

        // BLUE
        Blue_Tile_Map BlueZiel1 = new Blue_Tile_Map();
        addObject(BlueZiel1,10,6);
        Blue_Tile_Map BlueZiel2 = new Blue_Tile_Map();
        addObject(BlueZiel2,9,6);
        Blue_Tile_Map BlueZiel3 = new Blue_Tile_Map();
        addObject(BlueZiel3,8,6);
        Blue_Tile_Map BlueZiel4 = new Blue_Tile_Map();
        addObject(BlueZiel4,7,6);

        // WHITE
        White_Tile_Map WhiteZiel1 = new White_Tile_Map();
        addObject(WhiteZiel1,6,10);
        White_Tile_Map WhiteZiel2 = new White_Tile_Map();
        addObject(WhiteZiel2,6,9);
        White_Tile_Map WhiteZiel3 = new White_Tile_Map();
        addObject(WhiteZiel3,6,8);
        White_Tile_Map WhiteZiel4 = new White_Tile_Map();
        addObject(WhiteZiel4,6,7);
        
        //GREEN
        Green_Tile_Map GreenZiel1 = new Green_Tile_Map();
        addObject(GreenZiel1,2,6);
        Green_Tile_Map GreenZiel2 = new Green_Tile_Map();
        addObject(GreenZiel2,3,6);
        Green_Tile_Map GreenZiel3 = new Green_Tile_Map();
        addObject(GreenZiel3,4,6);
        Green_Tile_Map GreenZiel4 = new Green_Tile_Map();
        addObject(GreenZiel4,5,6);
        
        
        //Player
        //Black
        Black_Player BlackPlayer1 = new Black_Player();
        addObject(BlackPlayer1,1,1);
        Black_Player BlackPlayer2 = new Black_Player();
        addObject(BlackPlayer2,2,1);
        Black_Player BlackPlayer3 = new Black_Player();
        addObject(BlackPlayer3,1,2);
        Black_Player BlackPlayer4 = new Black_Player();
        addObject(BlackPlayer4,2,2);

        //Blue
        Blue_Player BluePlayer1 = new Blue_Player();
        addObject(BluePlayer1,10,1);
        Blue_Player BluePlayer2 = new Blue_Player();
        addObject(BluePlayer2,11,1);
        Blue_Player BluePlayer3 = new Blue_Player();
        addObject(BluePlayer3,10,2);
        Blue_Player BluePlayer4 = new Blue_Player();
        addObject(BluePlayer4,11,2);

        // White
        White_Player WhitePlayer1 = new White_Player();
        addObject(WhitePlayer1,10,10);
        White_Player WhitePlayer2 = new White_Player();
        addObject(WhitePlayer2,11,10);
        White_Player WhitePlayer3 = new White_Player();
        addObject(WhitePlayer3,10,11);
        White_Player WhitePlayer4 = new White_Player();
        addObject(WhitePlayer4,11,11);

        // Green
        Green_Player GreenPlayer1 = new Green_Player();
        addObject(GreenPlayer1,1,10);
        Green_Player GreenPlayer2 = new Green_Player();
        addObject(GreenPlayer2,2,10);
        Green_Player GreenPlayer3 = new Green_Player();
        addObject(GreenPlayer3,1,11);
        Green_Player GreenPlayer4 = new Green_Player();
        addObject(GreenPlayer4,2,11);
    }
}
