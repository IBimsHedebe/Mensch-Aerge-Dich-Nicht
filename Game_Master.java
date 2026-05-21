import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * made by Ole
 * 
 * added 28.04.26
 */
public class Game_Master
{
    private List <Player> spielerListe;
    private int aktiverSpielerIndex = 0;

    public Game_Master(List <Player> spieler) {
        this.spielerListe = spieler;
    }

    // Diese Methode wird aufgerufen, wenn das Würfeln beendet ist
    public void naechsterSpieler() {
        // Index erhöhen und bei Erreichen der Spieleranzahl zurück auf 0 setzen
        aktiverSpielerIndex = (aktiverSpielerIndex + 1) % spielerListe.size();
        
        Player aktuellerPlayer = getAktiverSpieler();
        System.out.println("Spieler " + aktiverSpielerIndex + " ist jetzt dran!");
    }

    public Player getAktiverSpieler() {
        return spielerListe.get(aktiverSpielerIndex);
    }
    
    public void verarbeiteWurf(int wurfErgebnis) {
        Player p = getAktiverSpieler();
        int aktuellePosition = p.getPosition(); // Getter im Actor
        p.setPosition(aktuellePosition + wurfErgebnis); // Setter im Actor
        
        naechsterSpieler(); // Danach zum nächsten Spieler wechseln
    }
}
