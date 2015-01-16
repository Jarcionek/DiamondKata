package diamondkata;

import org.junit.Test;

import java.util.List;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

        Diamond diamond = Diamond.newDiamond('A');

        assertThat(diamond.asListOfRows(), is(sameBeanAs(expectedRows)));
    }

}
