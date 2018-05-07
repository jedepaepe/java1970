package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;

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
    @JsonIgnore
    public CellState[][] getEnemiCellsState() {
        return enemi.getCellsState();
    }
    
    /**
     * get the state of the cells of the friend grid
     * @return a matric of CellState
     */
    @JsonIgnore
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
    
    @JsonIgnore
    public boolean isDone() {
        return state == State.DONE; // check if it is done
    }
    
    @JsonIgnore
    public Player getWinner() {
        return Player.FRIEND;
    }

/////////////// AUTOMATION


    /**
     * Empty constructor for automation
     */
    public BattleModel() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FriendGrid getFriend() {
        return friend;
    }

    public void setFriend(FriendGrid friend) {
        this.friend = friend;
    }

    public EnemiGrid getEnemi() {
        return enemi;
    }

    public void setEnemi(EnemiGrid enemi) {
        this.enemi = enemi;
    }
    
}
