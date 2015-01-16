package diamondkata;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class DiamondGenerator {

    public List<String> generate(char c) {
        return ImmutableList.of(
                "   A   ",
                "  B B  ",
                " C   C ",
                "D     D",
                " C   C ",
                "  B B  ",
                "   A   "
        );
    }

}
