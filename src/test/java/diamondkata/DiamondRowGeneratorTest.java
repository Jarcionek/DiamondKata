package diamondkata;

import org.junit.Test;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class DiamondRowGeneratorTest {

    private final DiamondRowGenerator diamondRowGenerator = new DiamondRowGenerator();

    @Test
    public void returnsFirstRowOfDiamondOneByOne() {
        String actualRow = diamondRowGenerator.generate(rowIndex(0), rowLength(1));

        assertThat(actualRow, is(equalTo("A")));
    }

    @Test
    public void returnsFirstRowOfDiamondThreeByThree() {
        String actualRow = diamondRowGenerator.generate(rowIndex(0), rowLength(3));

        assertThat(actualRow, is(equalTo(" A ")));
    }

    @Test
    public void returnsThirdRowOfDiamondFiveByFive() {
        String actualRow = diamondRowGenerator.generate(rowIndex(2), rowLength(5));

        assertThat(actualRow, is(equalTo("C   C")));
    }

    @Test
    public void returnsFourthRowOfDiamondFiveByFive() {
        String actualRow = diamondRowGenerator.generate(rowIndex(3), rowLength(5));

        assertThat(actualRow, is(equalTo(" B B ")));
    }


    private static int rowIndex(int rowNumber) {
        return rowNumber;
    }

    private static int rowLength(int rowLength) {
        return rowLength;
    }

}
