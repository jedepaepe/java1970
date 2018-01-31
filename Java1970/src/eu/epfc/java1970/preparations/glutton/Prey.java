package eu.epfc.java1970.preparations.glutton;

/**
 * Proie
 * une Proie est un petit carré défini par 
 * sa taille, le caractère qui compose le carré et sa position (x,y)
 * example {size:2, c:x}:
 *    xx
 *    xx
 * @author jedepaepe@epfc.eu
 */
public class Prey {
    private long x;      // position X du sommet gauche
    private long y;      // position Y du sommet gauche
    private char c;     // caractère composant la simulation de l'image
    private int size;   // taille du carré

    /**
     * Constructor : Prey est immuable
     * @param x
     * @param y
     * @param c
     * @param size 
     */
    public Prey(int x, int y, char c, int size) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.size = size;
    }
    
    /**
     * déplace la proie
     * @param speed vitesse de déplacement de la proie
     */
    public void move(int speed) {
        x += Math.round(Math.random() * speed * 2) - speed;
        y += Math.round(Math.random() * speed * 2) - speed;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public char getC() {
        return c;
    }

    public int getSize() {
        return size;
    }
    
    
}
