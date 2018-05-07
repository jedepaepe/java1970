/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author FHA576
 */
public class TestJackson {
    public static void main(String[] args) throws JsonProcessingException, IOException {
        FriendGrid grid = new FriendGrid(10);
        ArrayList<Bomb> bombs = new ArrayList<>();
        bombs.add(new Bomb(0, 0));
        bombs.add(new Bomb(1,1));
        grid.setBombs(bombs);
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(new Ship(new ShipType("a", 1), Ship.Orientation.HORIZONTAL, 3, 3));
        ships.add(new Ship(new ShipType("b", 2), Ship.Orientation.HORIZONTAL, 4, 4));
        grid.setShips(ships);
        
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(grid);
        BattleGrid fromJ = mapper.readValue(json, BattleGrid.class);
        System.out.println(fromJ.getCellsState());
        File file = new File("testJack.json");
        mapper.writeValue(file, fromJ);
        BattleGrid fromF = mapper.readValue(file, BattleGrid.class);
        System.out.println(fromF.getSize());
    }
    
}
