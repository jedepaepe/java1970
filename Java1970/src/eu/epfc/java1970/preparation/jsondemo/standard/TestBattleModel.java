/*
This is a stupid class to test the battle model
 */
package eu.epfc.java1970.preparation.jsondemo.standard;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * point d'entrée du programme (de test)
 */
public class TestBattleModel {

    public static void main(String[] args) {
        try {   // essaie de "jouer"
            BattleModel battleModel = new BattleModel(5);
            battleModel.createShip(1, Ship.Orientation.HORIZONTAL, 0, 0);
            battleModel.createShip(1, Ship.Orientation.HORIZONTAL, 2, 2);
            battleModel.createShip(1, Ship.Orientation.HORIZONTAL, 4, 4);
            battleModel.setPlay();

            System.out.println("Fire 0,0");
            battleModel.fire(0, 0);
            System.out.println("Done? " + battleModel.isDone());
            System.out.println("Enemi");
            showCells(battleModel.getEnemiCellsState());
            System.out.println("Friend");
            showCells(battleModel.getFriendCellsState());

            // write the model on a file
            battleModel.write("test_battle_model.json");
            
        } catch (IllegalArgumentException ex) { // une exception s'est produite
            System.out.println("Erreur:\n\t" + ex.getMessage() + "\nImpossible de jouer, sorry");
        } catch (FileNotFoundException ex) {
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
