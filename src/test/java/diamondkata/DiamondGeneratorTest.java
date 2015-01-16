package diamondkata;

import com.shazam.shazamcrest.MatcherAssert;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiamondGeneratorTest {

    private final DiamondRowGenerator diamondRowGenerator = mock(DiamondRowGenerator.class);

    private final DiamondGenerator diamondGenerator = new DiamondGenerator();

    @Test
    public void createsRowsForDiamondOneByOneForA() {
        List<String> expectedRows = asList(
                "A"
        );
        when(diamondRowGenerator.generate(rowNumber(0), rowLength(1))).thenReturn("A");

        List<String> actualRows = diamondGenerator.generate('A');

        MatcherAssert.assertThat(actualRows, is(sameBeanAs(expectedRows)));
    }


    private static int rowNumber(int rowNumber) {
        return rowNumber;
    }

    private static int rowLength(int rowLength) {
        return rowLength;
    }

}