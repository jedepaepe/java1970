/*
This is a stupid class to test the battle model
 */
package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * point d'entrée du programme (de test)
 */
public class TestBattleModel {

    public static void main(String[] args) {
        try {   // essaie de "jouer"
            BattleController battleController = new BattleController(5);
            battleController.createShip(1, Ship.Orientation.HORIZONTAL, 0, 0);
            battleController.createShip(1, Ship.Orientation.HORIZONTAL, 2, 2);
            battleController.createShip(1, Ship.Orientation.HORIZONTAL, 4, 4);
            battleController.setPlay();

            System.out.println("Fire 0,0");
            battleController.fire(0, 0);
            System.out.println("Done? " + battleController.isDone());
            System.out.println("Enemi");
            showCells(battleController.getEnemiCellsState());
            System.out.println("Friend");
            showCells(battleController.getFriendCellsState());

            battleController.saveGame(new File("game.json"));
            
            try {
                battleController.loadModel(new File("game.json"));
                showCells(battleController.getEnemiCellsState());
            } catch (Exception ex) {
                Logger.getLogger(TestBattleModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IllegalArgumentException ex) { // une exception s'est produite
            System.out.println("Erreur:\n\t" + ex.getMessage() + "\nImpossible de jouer, sorry");
        } catch (IOException ex) {
            Logger.getLogger(TestBattleModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void showCells(CellState[][] cells) {
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < cells.length; l++) {
            for (int c = 0; c < cells[l].length; c++) {
                sb.append(convertCellState(cells[l][c]));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static char convertCellState(CellState cellState) {
        switch (cellState) {
            case BOMB_WATER:
                return 'B';
            case SHIP:
                return 'S';
            case SUNK:
                return 'U';
            case TOUCH:
                return 'T';
            case WATER:
                return 'W';
        }
        return '0';
    }
}
