package diamondkata;

import java.util.ArrayList;
import java.util.List;

public class DiamondGenerator {

    private final DiamondRowGenerator diamondRowGenerator;

    public DiamondGenerator(DiamondRowGenerator diamondRowGenerator) {
        this.diamondRowGenerator = diamondRowGenerator;
    }

    public List<String> generate(char c) {
        int diamondSize = (c - 'A') * 2 + 1;

        List<String> rows = new ArrayList<>(diamondSize);
        for (int rowIndex = 0; rowIndex < diamondSize; rowIndex++) {
            rows.add(diamondRowGenerator.generate(rowIndex, diamondSize));
        }
        return rows;
    }

}
