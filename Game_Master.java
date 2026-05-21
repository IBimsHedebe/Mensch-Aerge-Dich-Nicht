import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * made by Ole
 * 
 * added 28.04.26
 */
public class Game_Master extends Actor
{
    public int aktiverSpielerIndex = 0;
    public int spieler = 0;
    List<String> spielerListe = new ArrayList<String>();
    String aktuellerSpieler;
    
    public Game_Master(){
        spielerListe.add("black");
        spielerListe.add("blue");
        spielerListe.add("green");
        spielerListe.add("white");
        
        aktuellerSpieler = spielerListe.get(0);
    }
    
    public void act(){
        List<Dice> dices = getWorld().getObjects(Dice.class);
        if (!dices.isEmpty()){
            Dice dice = dices.get(spieler);
            
            if (Greenfoot.mouseClicked(dice)){
                aktuellerSpieler = spielerListe.get(spieler);
                System.out.println(aktuellerSpieler);
                spieler = (spieler + 1) % spielerListe.size();
            }
        }
    }
    
    
    
    
    
}
