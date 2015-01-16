package diamondkata;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public class DiamondGenerator {

    private final DiamondRowGenerator diamondRowGenerator;

    public DiamondGenerator(DiamondRowGenerator diamondRowGenerator) {
        this.diamondRowGenerator = diamondRowGenerator;
    }

    public List<String> generate(char c) {
        int size = (c - 'A') * 2 + 1;

        List<String> rows = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            rows.add(diamondRowGenerator.generate(i, size));
        }
        return rows;
    }

}
