/*
https://moodle.epfc.eu/mod/page/view.php?id=25986
*/
package eu.epfc.java1970.lesson25.battleship.model;

/**
 * (2) Créez la classe Ship
2.1 définir le type Orientation:

public enum Orientation { HORIZONTAL, VERTICAL }

2.2 définir les attributs

ShipType type

int x

int y

Orientation orientation

2.3. les méthodes

Ship(ShipType type, Orientation orientation, int x, int y)

getter
 */
public class Ship {
    ShipType type;

    Orientation orientation;
}
