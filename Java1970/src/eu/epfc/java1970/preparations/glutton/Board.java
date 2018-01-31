package eu.epfc.java1970.preparations.glutton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Board est le tableau sur lequel se déroule le jeu
 * @author jedepaepe@epfc.eu
 */
public class Board {
    private int width;      // largeur
    private int height;     // hauteur
    private int tick;       // nombre de milliseconde entre chaque mouvement
    private int speed;      // vitesse de déplacement
    private Prey[] preyList = new Prey[3];

    public Board(int width, int height, int tick, int speed) {
        this.width = Math.max(width, 10);
        this.height = Math.max(height, 10);
        this.tick = Math.max( Math.min(tick, 5000), 100);
        this.speed = Math.max(Math.min(speed, 5), 1);
        preyList[0] = new Prey(11, 11, 'A', 1);
        preyList[1] = new Prey(12, 12, 'B', 1);
        preyList[2] = new Prey(13, 13, 'C', 1);
        print();
    }
    
    public void run() {
        int index = 0;
        while(true) {
            try {
                Thread.sleep(tick);
            } catch (InterruptedException ex) {
                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
            }
            doStep(index);
            index = (++index % preyList.length);
            print();
        }
    }
    
    private void doStep() {
        for (Prey prey : preyList) {
            prey.move(speed);
        }
    }
    
    private void doStep(int index) {
        if(index >= 0 && index < preyList.length)
            preyList[index].move(speed);
    }
    
    private void print() {
        char[][] panel = new char[width][height];
        // prepare le panel
        for (Prey prey : preyList) {
            for(long i = prey.getX(); i < (prey.getX() + prey.getSize()); i++) {
                for(long j = prey.getY(); j < (prey.getY() + prey.getSize()); j++) {
                    int x = Util.getPosition(i, width);
                    int y = Util.getPosition(j, height);
                    try {
                    panel[y][x] = prey.getC();
                    } catch(Exception ex) {
                        System.err.println(ex.getMessage());
                        System.exit(0);
                    }
                }
            }
        }
        clearScreen();
        // affiche le panel
        for(int i=0; i<width; i++) {
            System.out.println(panel[i]);
        }
    }
    
    private void clearScreen() {
        for(int i=0; i<25; i++) {
            System.out.println("");
        }
    }
    
    
}
