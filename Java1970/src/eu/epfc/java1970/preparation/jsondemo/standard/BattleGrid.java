package eu.epfc.java1970.preparation.jsondemo.standard;

// https://moodle.epfc.eu/mod/page/view.php?id=25986
import eu.epfc.java1970.lesson27.correction.*;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

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
    
    public JsonObjectBuilder getJsonObjectBuilder() {
        JsonArrayBuilder jsonArrayBuilderShips = Json.createArrayBuilder();
        ships.forEach((ship) -> {
            jsonArrayBuilderShips.add(ship.getJsonObjectBuilder());
        });
        JsonArrayBuilder jsonArrayBuilderBombs = Json.createArrayBuilder();
        bombs.forEach((bomb) -> {
            jsonArrayBuilderBombs.add(bomb.getJsonObjectBuilder());
        });
        return Json.createObjectBuilder()
                .add("ships", jsonArrayBuilderShips)
                .add("bombs", jsonArrayBuilderBombs);
    }
}
