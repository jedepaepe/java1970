package eu.epfc.java1970.preparation.jsondemo.standard;

import eu.epfc.java1970.lesson27.correction.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumMap;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

public class BattleModel {

    /**
     * Etat du jeu
     */
    public enum State {
        CONFIGURING,
        PLAYING,
        DONE
    }
    
    public enum Player {
        FRIEND,
        ENEMI
    }
    
    private int size;
    private State state = State.CONFIGURING;
    private FriendGrid friend;
    private EnemiGrid enemi;

    /**
     * BattelModel constructor
     * @param size : int between [1, 100]
     * @throws IllegalArgumentException if size not valid (see above) 
     */
    public BattleModel(int size) {
        if(size < 1 || size > 100) {    // si la taille de la grille (size) est incorrecte
            throw new IllegalArgumentException("Invalid size " + size + " must be between 1 & 100");    // jette une exception (=> l'objet :BattleModel n'est pas créé)
        }
        // la taille est correcte => initialise l'objet :BattleModel
        this.size = size;
        friend = new FriendGrid(size);
        enemi = new EnemiGrid(size);
    }

    /**
     * getter state
     * @return state
     */
    public State getState() {
        return state;
    }
    
    /**
     * get the state of the game as a String
     * @return 
     */
    public String getStateAsString() {
        EnumMap<State, String> stateMap = new EnumMap<>(State.class);
        stateMap.put(State.CONFIGURING, "configuring");
        stateMap.put(State.PLAYING, "playing");
        stateMap.put(State.DONE, "done");
        return stateMap.get(state);
    }

    /**
     * create a ship in the friend grid
     * @param size : size of the ship
     * @param orientation : orientation of the ship
     * @param x : x position
     * @param y : y position
     */
    public void createShip(int size, Ship.Orientation orientation, int x, int y) {
        friend.createShip(size, orientation, x, y);
    }

    /**
     * fire the enemi
     * @param x : x position
     * @param y : y position
     * @return a FireResult
     */
    public FireResult fire(int x, int y) {
        FireResult result = enemi.bombed(x, y);
        // fire friend
        friend.bombed((int)(Math.random() * size), (int)(Math.random() * size));
        // fire enemi
        return result;
    }
    
    /**
     * get the state of the cells of the enemi grid
     * @return a matrix of CellState
     */
    public CellState[][] getEnemiCellsState() {
        return enemi.getCellsState();
    }
    
    /**
     * get the state of the cells of the friend grid
     * @return a matric of CellState
     */
    public CellState[][] getFriendCellsState() {
        return friend.getCellsState();
    }
    
    /**
     * start the game
     * @throws 
     */
    public void setPlay() {
        state = State.PLAYING;
        ArrayList<Ship> friendShips = friend.getShips();
        enemi.createShips(friendShips);
    }
    
    public boolean isDone() {
        if(state == State.DONE) return true;
        else {
            // check if it is done
            return false;
        }
    }
    
    public Player getWinner() {
        return Player.FRIEND;
    }
    
    public JsonObjectBuilder getJsonObjectBuilder() {
        return Json.createObjectBuilder()
                .add("size", size)
                .add("state", getStateAsString())
                .add("friend", friend.getJsonObjectBuilder()
                .add("enemi", enemi.getJsonObjectBuilder()));
    }
    
    public void write(String fileName) throws FileNotFoundException {
        OutputStream outputStream = new FileOutputStream(fileName);
        JsonWriter jsonWriter = Json.createWriter(outputStream);
        jsonWriter.writeObject(getJsonObjectBuilder().build());
    }
    
}
