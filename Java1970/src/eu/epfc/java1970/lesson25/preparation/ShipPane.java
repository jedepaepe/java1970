package eu.epfc.java1970.lesson25.preparation;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Pane for ships
 */
public class ShipPane extends GridPane {

    private int nrCells = 5;
    private int size = 25;

    public ShipPane(int nrCells, int size) {
        setHgap(2);
        setVgap(2);

        setNrCells(nrCells);
        setSize(size);

        for (int col = 0; col < nrCells; col++) {
            for (int line = 0; line < nrCells; line++) {
                Rectangle rectangle = new Rectangle(size, size);
                this.add(rectangle, col, line);
                rectangle.setOnMouseClicked(event -> {
                    if (rectangle.getFill().equals(Color.BLUE)) {
                        rectangle.setFill(Color.WHITE);
                    } else {
                        rectangle.setFill(Color.BLUE);
                    }
                });
            }
        }
    }
    
    private void setNrCells(int nrCells) {
        if (nrCells > 2 && nrCells < 100) {
            this.nrCells = nrCells;
        }
    }

    private void setSize(int size) {
        if (size > 2 && size < 500) {
            this.size = size;
        }
    }
}
