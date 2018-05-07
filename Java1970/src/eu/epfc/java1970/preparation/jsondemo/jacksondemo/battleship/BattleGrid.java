package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

// https://moodle.epfc.eu/mod/page/view.php?id=25986
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;

public abstract class BattleGrid {

    protected int size;
    protected ArrayList<Ship> ships = new ArrayList<>();
    protected ArrayList<Bomb> bombs = new ArrayList<>();

    public BattleGrid() {
    }

    
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

    public void setSize(int size) {
        this.size = size;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public void setBombs(ArrayList<Bomb> bombs) {
        this.bombs = bombs;
    }

    
    @JsonIgnore
    public CellState[][] getCellsState() {
        CellState[][] cells = new CellState[size][size];
        for (int l = 0; l < size; l++) {
            for (int c = 0; c < size; c++) {
                cells[l][c] = CellState.WATER;
            }
        }
        return cells;
    }

    FireResult bombed(int x, int y) {
        bombs.add(new Bomb(x, y));
        return FireResult.WATER;
    }
}
