package diamondkata;

import java.util.List;

public class Diamond {

    private static final DiamondGenerator DIAMOND_GENERATOR = new DiamondGenerator(new DiamondRowGenerator());

    private final List<String> rows;

    private Diamond(List<String> rows) {
        this.rows = rows;
    }

    public static Diamond newDiamond(char c) {
        return new Diamond(DIAMOND_GENERATOR.generate(c));
    }

    public List<String> asListOfRows() {
        return rows;
    }

}
