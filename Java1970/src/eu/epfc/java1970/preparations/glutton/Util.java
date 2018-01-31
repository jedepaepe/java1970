package eu.epfc.java1970.preparations.glutton;

/**
 *
 * @author jedepaepe
 */
public class Util {
    static int getPosition(long position, int limit) {
        position = position % limit;
        if(position < 0) position += limit;
        return (int) position;
    }
}
