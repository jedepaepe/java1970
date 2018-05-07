/*
 */
package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class BattleController {
    
    private BattleModel battleModel;

    public BattleController() {
    }
    
    public BattleController(int size) {
        battleModel = new BattleModel(size);
    }
    
    public void loadModel(File file) throws Exception {
        try {
            battleModel = new ObjectMapper().readValue(file, BattleModel.class);
        } catch (IOException ex) {
            Logger.getLogger(BattleController.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Not possible to load BattleModel");
        }
    }
    
    /**
     * create a ship in the friend grid
     * @param size : size of the ship
     * @param orientation : orientation of the ship
     * @param x : x position
     * @param y : y position
     */
    public void createShip(int size, Ship.Orientation orientation, int x, int y) {
        battleModel.createShip(size, orientation, x, y);
    }

    /**
     * fire the enemi
     * @param x : x position
     * @param y : y position
     * @return a FireResult
     */
    public FireResult fire(int x, int y) {
        return battleModel.fire(x, y);
    }
    
    /**
     * get the state of the cells of the enemi grid
     * @return a matrix of CellState
     */
    public CellState[][] getEnemiCellsState() {
        return battleModel.getEnemiCellsState();
    }
    
    /**
     * get the state of the cells of the friend grid
     * @return a matric of CellState
     */
    public CellState[][] getFriendCellsState() {
        return battleModel.getFriendCellsState();
    }
    
    /**
     * start the game
     */
    public void setPlay() {
        battleModel.setPlay();
    }
    
    public boolean isDone() {
        return battleModel.isDone();
    }
    
    public void saveGame(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.writeValue(file, battleModel);
    }
    
    
}
