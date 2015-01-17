package diamondkata;

import java.util.Arrays;

public class DiamondRowGenerator {

    public String generate(int rowNumber, int rowLength) {
        char[] array = new char[rowLength];
        Arrays.fill(array, ' ');

        int distanceFromCentre;
        if (rowNumber <= rowLength / 2) {
            distanceFromCentre = rowNumber;
        } else {
            distanceFromCentre = rowLength - 1 - rowNumber;
        }

        char character = (char) ('A' + distanceFromCentre);

        array[rowLength / 2 - distanceFromCentre] = character;
        array[rowLength / 2 + distanceFromCentre] = character;

        return new String(array);
    }

}
