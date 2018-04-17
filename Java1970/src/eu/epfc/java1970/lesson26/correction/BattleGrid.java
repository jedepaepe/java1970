package eu.epfc.java1970.lesson26.correction;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import java.util.ArrayList;

public abstract class BattleGrid {
    protected int size;
    protected ArrayList<Ship> ships = new ArrayList<>();
    protected ArrayList<Bomb> bombs = new ArrayList<>();

    public BattleGrid(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }
    
    public CellState[][] getCellsState() {
        CellState[][] cells = new CellState[size][size];
        for(int l=0; l<size; l++) {
            for(int c=0; c<size; c++) {
                cells[l][c] = CellState.WATER;
            }
        }
        return cells;
    }
    
    FireResult fire(int x, int y) {
        return FireResult.WATER;
    }
}
