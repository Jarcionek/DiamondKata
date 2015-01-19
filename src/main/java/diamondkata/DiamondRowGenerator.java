package diamondkata;

import java.util.Arrays;

public class DiamondRowGenerator {

    public String generate(int rowIndex, int rowLength) {
        char[] array = new char[rowLength];
        Arrays.fill(array, ' ');

        int distanceFromCentre = distanceFromCentre(rowIndex, rowLength);

        char character = (char) ('A' + distanceFromCentre);
        array[rowLength / 2 - distanceFromCentre] = character;
        array[rowLength / 2 + distanceFromCentre] = character;

        return new String(array);
    }

    private static int distanceFromCentre(int rowIndex, int rowLength) {
        if (rowIndex <= rowLength / 2) {
            return rowIndex;
        } else {
            return rowLength - 1 - rowIndex;
        }
    }

}
