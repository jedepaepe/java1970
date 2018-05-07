package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

public enum CellState {
    WATER,      // la cellule n'a pas de bateau
    BOMB_WATER, // la cellule n'a pas de bateau et une bombe a été tirée
    SHIP,       // la cellule porte un bateau,
    TOUCH,      // le bateau est touché mais pas coulé => cellules touchés sont TOUCH
    SUNK        // le bateau est coulé => les cellules sont SUNK 
}
