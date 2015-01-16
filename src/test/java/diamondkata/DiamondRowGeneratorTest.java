package diamondkata;

import org.junit.Test;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class DiamondRowGeneratorTest {

    private final DiamondRowGenerator diamondRowGenerator = new DiamondRowGenerator();

    @Test
    public void returnsFirstRowOfDiamondOneByOne() {
        String actualRow = diamondRowGenerator.generate(rowNumber(0), rowLength(1));

        assertThat(actualRow, is(equalTo("A")));
    }


    private static int rowNumber(int rowNumber) {
        return rowNumber;
    }

    private static int rowLength(int rowLength) {
        return rowLength;
    }

}
