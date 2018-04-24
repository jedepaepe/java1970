package eu.epfc.java1970.lesson27.correction;

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
        this.size = size;
        friend = new FriendGrid(size);
        enemi = new EnemiGrid(size);
    }

    public State getState() {
        return state;
    }

    public void createShip(int size, Ship.Orientation orientation, int x, int y) {
        friend.createShip(size, orientation, x, y);
    }

    public FireResult fire(int x, int y) {
        FireResult result = enemi.bombed(x, y);
        // fire friend
        friend.bombed((int)(Math.random() * size), (int)(Math.random() * size));
        // fire enemi
        return result;
    }
    
    public CellState[][] getEnemiCellsState() {
        return enemi.getCellsState();
    }
    
    public CellState[][] getFriendCellsState() {
        return friend.getCellsState();
    }
    
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
    
}
