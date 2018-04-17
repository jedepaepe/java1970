/*
https://moodle.epfc.eu/mod/page/view.php?id=25986
 */
package eu.epfc.java1970.lesson25.battleship.model;

import java.util.ArrayList;

/**
 * (5) Créez la classe BattleGrid public abstract class BattleGrid
 *
 * 5.1 Attributs
 *
 * int size ?
 *
 * ArrayList<Ship> ships
 *
 * ArrayList<Bomb> bombs
 *
 * 5.2 Méthodes
 *
 * BattleGrid(int size)
 *
 * abstract CellState[][] getCellsState()
 *
 * FireResult fire(int x, int y)
 *
 * getter
 */
public abstract class BattleGrid {

    int size;
    ArrayList<Ship> ships = new ArrayList<>();
    ArrayList<Bomb> bombs = new ArrayList<>();

    public BattleGrid(int size) {
        this.size = size;
    }

    CellState[][] getCellsState() {
        CellState[][] cells = new CellState[size][size];

        // clean list
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = CellState.NOTHING;
            }
        }

        // set the bombs
        for (Bomb bomb : bombs) {
            cells[bomb.getX()][bomb.getY()] = CellState.WATER;
        }

        // set the ships
        for (Ship ship : ships) {
            boolean sunk = true;
            int x = ship.getX();
            int y = ship.getY();
            if (ship.getOrientation() == Orientation.HORIZONTAL) {
                for (int i = x; i < x + ship.getType().getSize(); x++) {;
                    if (cells[i][y] == CellState.WATER) {
                        cells[i][y] = CellState.TOUCH;
                    } else {
                        cells[i][y] = CellState.SHIP;
                        sunk = false;
                    }
                }
            } else {
                for (int j = y; j < y + ship.getType().getSize(); j++) {
                    if (cells[x][j] == CellState.WATER) {
                        cells[x][j] = CellState.TOUCH;
                    } else {
                        cells[x][j] = CellState.SHIP;
                        sunk = false;
                    }
                }
            }
            if (sunk) {
                if (ship.getOrientation() == Orientation.HORIZONTAL) {
                    for (int i = x; i < x + ship.getType().getSize(); x++) {;
                        cells[i][y] = CellState.SUNK;
                    }
                } else {
                    for (int j = y; y < y + ship.getType().getSize(); j++) {
                        cells[x][j] = CellState.SUNK;
                    }
                }
            }
        }
        return cells;
    }

    FireResult fire(int x, int y) {
        Bomb bomb = new Bomb(x, y);
        bombs.add(bomb);
        for(Ship ship : ships) {
            
        }
        return FireResult.WATER;
    }

}
