/*
 https://moodle.epfc.eu/mod/page/view.php?id=25986
 */
package eu.epfc.java1970.lesson25.battleship.model;

/**
 * (4) Créez l'enum CellState enum CellState {
 *
 * UNKNOWN,
 *
 * NOTHING,
 *
 * WATER,
 *
 * SHIP,
 *
 * TOUCH,
 *
 * SUNK }
 */
public enum CellState {
    UNKNOWN,    // for enemi : we don't know
    NOTHING,    // for friend : there is nothing here
    WATER,      // fired in water
    SHIP,       // for friend : there is a ship here
    TOUCH,      // there is a touched ship here
    SUNK        // there is a sunk ship here
}
