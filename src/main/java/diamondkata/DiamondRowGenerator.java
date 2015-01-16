package diamondkata;

import java.util.Arrays;

public class DiamondRowGenerator {

    public String generate(int rowNumber, int rowLength) {
        char[] array = new char[rowLength];
        Arrays.fill(array, ' ');

        char character = (char) ('A' + rowNumber);

        array[rowLength / 2 - rowNumber] = character;
        array[rowLength / 2 + rowNumber] = character;

        return new String(array);
    }

}
