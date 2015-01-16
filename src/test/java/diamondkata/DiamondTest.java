package diamondkata;

import org.junit.Test;

import java.util.List;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;

public class DiamondTest {

    @Test
    public void createsDiamondSevenBySevenForD() {
        List<String> expectedRows = asList(
                "   A   ",
                "  B B  ",
                " C   C ",
                "D     D",
                " C   C ",
                "  B B  ",
                "   A   "
        );

        Diamond diamond = Diamond.newDiamond('D');

        assertThat(diamond.asListOfRows(), is(sameBeanAs(expectedRows)));
    }

}
