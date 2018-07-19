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
                    "926571483351486279874923516582367194149258367763149825238794651617835942495612738\n" +
                    "926571483351486279874923516582367194149258367763194825238749651617835942495612738");
        }
    }



    @Test
    public void test_2() throws Exception {
        String puzzle = "070_006_000_900_000_041_008_009_050_090_007_002_003_000_800_400_800_010_080_300_900_160_000_007_000_500_080";
        try {
            new Sudoku(puzzle).solve();
            fail("Exception expected.");
        } catch (SudokuException e) {
            assertEquals(e.getMessage(), "impossible");
        }
    }
}
