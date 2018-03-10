import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Test_Sudoku_Not_Solvable_Cases {

    @Test
    public void test_1() throws Exception {
        String puzzle = "906_070_403_000_400_200_070_023_010_500_000_100_040_208_060_003_000_005_030_700_050_007_005_000_405_010_708";
        try {
            new Sudoku(puzzle).solve();
            fail("Exception expected.");
        } catch (SudokuException e) {
            assertEquals(e.getMessage(), "Not eindeutig \n" +
                    "926571483351486279874923516582367194149258367763194825238749651617835942495612738");
        }
    }

    @Test
    public void test_2() throws Exception {

        // https://www.telegraph.co.uk/news/science/science-news/9359579/Worlds-hardest-sudoku-can-you-crack-it.html
        String puzzle = "800_000_000_003_600_000_070_090_200_050_007_000_000_045_700_000_100_030_001_000_068_008_500_010_090_000_400";
        String solution = "812753649943682175675491283154237896369845721287169534521974368438526917796318452";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_3() throws Exception {
        // https://www.telegraph.co.uk/news/science/science-news/9359579/Worlds-hardest-sudoku-can-you-crack-it.html
        String puzzle = "070_006_000_900_000_041_008_009_050_090_007_002_003_000_800_400_800_010_080_300_900_160_000_007_000_500_080";
        try {
            new Sudoku(puzzle).solve();
            fail("Exception expected.");
        } catch (SudokuException e) {
            assertEquals(e.getMessage(), "impossible");
        }
    }
}
