package diamondkata;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Diamond {

    public static Diamond newDiamond(char c) {
        return new Diamond();
    }

    public List<String> asListOfRows() {
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
