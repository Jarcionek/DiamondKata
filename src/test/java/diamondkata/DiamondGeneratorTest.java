package diamondkata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)
public class DiamondGeneratorTest {

    @Parameters(name = "{0}")
    public static Collection<Object[]> validInputs() {
        List<Object[]> validInputs = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            validInputs.add(new Object[] {c});
        }
        return validInputs;
    }

    private final DiamondGenerator diamondGenerator = new DiamondGenerator();

    private final char input;

    public DiamondGeneratorTest(char input) {
        this.input = input;
    }

    @Test
    public void isSquare() {
        List<String> rows = diamondGenerator.generate(input);

        for (String row : rows) {
            assertThat(row.length(), equalTo(rows.size()));
        }
    }

}
