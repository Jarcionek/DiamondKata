package diamondkata;

import java.util.List;

import static java.lang.Math.abs;
import static java.util.Arrays.fill;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class Diamond {

    private final char[][] chars;

    private Diamond(char[][] chars) {
        this.chars = chars;
    }

    public static Diamond newDiamond(char character) {
        int c = character - 'A';
        int size = c * 2 + 1;

        char[][] chars = new char[size][size];
        stream(chars).forEach(row -> fill(row, ' '));

        for (int dx = -c; dx <= c; dx++) {
            for (int dy = -c; dy <= c; dy++) {
                if (abs(dx) + abs(dy) == c) {
                    chars[c + dx][c + dy] =  (char) (character - c + abs(dy));
                }
            }
        }

        return new Diamond(chars);
    }

    public List<String> asListOfRows() {
        return stream(chars).map(String::new).collect(toList());
    }

}
