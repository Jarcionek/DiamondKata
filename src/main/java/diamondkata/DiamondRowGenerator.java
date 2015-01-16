package diamondkata;

import java.util.Arrays;

public class DiamondRowGenerator {

    public String generate(int rowNumber, int rowLength) {
        char[] array = new char[rowLength];
        Arrays.fill(array, ' ');

        array[rowLength / 2] = 'A';

        return new String(array);
    }

}
