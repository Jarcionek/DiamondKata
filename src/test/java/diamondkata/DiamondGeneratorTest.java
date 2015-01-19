package diamondkata;

import org.junit.Test;

import java.util.List;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiamondGeneratorTest {

    private final DiamondRowGenerator diamondRowGenerator = mock(DiamondRowGenerator.class);

    private final DiamondGenerator diamondGenerator = new DiamondGenerator(diamondRowGenerator);

    @Test
    public void createsRowsForDiamondOneByOneForA() {
        List<String> expectedRows = asList(
                "A"
        );
        when(diamondRowGenerator.generate(rowIndex(0), rowLength(1))).thenReturn("A");

        List<String> actualRows = diamondGenerator.generate('A');

        assertThat(actualRows, is(sameBeanAs(expectedRows)));
    }

    @Test
    public void createsRowsForDiamondThreeByThreeForB() {
        List<String> expectedRows = asList(
                " A ",
                "B B",
                " A "
        );
        when(diamondRowGenerator.generate(rowIndex(0), rowLength(3))).thenReturn(" A ");
        when(diamondRowGenerator.generate(rowIndex(1), rowLength(3))).thenReturn("B B");
        when(diamondRowGenerator.generate(rowIndex(2), rowLength(3))).thenReturn(" A ");

        List<String> actualRows = diamondGenerator.generate('B');

        assertThat(actualRows, is(sameBeanAs(expectedRows)));
    }


    private static int rowIndex(int rowNumber) {
        return rowNumber;
    }

    private static int rowLength(int rowLength) {
        return rowLength;
    }

}
