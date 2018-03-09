import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Sudoku {

    @Test
    public void test_initializeSudoku() throws Exception {
        //  Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");
        Sudoku sudoku = new Sudoku("000_870_000_000_000_080_920_000_004_050_030_006_000_000_000_004_601_003_030_052_040_600_009_500_009_006_020");

        sudoku.eachNumberUniqueInColumnRowSquare();
        sudoku.guess();
    }

    @Test
    public void test_copy() {
        Sudoku sudoku1 = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");
        Sudoku sudoku2 = new Sudoku(sudoku1);
        Sudoku sudoku3 = new Sudoku(sudoku2);

        Field field = new Field(1, 2, 3);
        sudoku3.setField(field, 7);

        assertEquals("7____48_______54____9___7__4______9_8_7_________61_____3__5___1_1_2___75___142___", sudoku1.toString());
        assertEquals("7____48_______54____9___7__4______9_8_7_________61_____3__5___1_1_2___75___142___", sudoku2.toString());
        assertEquals("7____48_______54____97__7__4______9_8_7_________61_____3__5___1_1_2___75___142___", sudoku3.toString());

    }

    @Test
    public void test_rows() {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("700_004_800", sudoku.row(1).toString());
        assertEquals("000_005_400", sudoku.row(2).toString());
        assertEquals("009_000_700", sudoku.row(3).toString());
        assertEquals("400_000_090", sudoku.row(4).toString());
        assertEquals("807_000_000", sudoku.row(5).toString());
        assertEquals("000_610_000", sudoku.row(6).toString());
        assertEquals("030_050_001", sudoku.row(7).toString());
        assertEquals("010_200_075", sudoku.row(8).toString());
        assertEquals("000_142_000", sudoku.row(9).toString());
    }

    @Test
    public void test_columns() {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("700_480_000", sudoku.column(1).toString());
        assertEquals("000_000_310", sudoku.column(2).toString());
        assertEquals("009_070_000", sudoku.column(3).toString());
        assertEquals("000_006_021", sudoku.column(4).toString());
        assertEquals("000_001_504", sudoku.column(5).toString());
        assertEquals("450_000_002", sudoku.column(6).toString());
        assertEquals("847_000_000", sudoku.column(7).toString());
        assertEquals("000_900_070", sudoku.column(8).toString());
        assertEquals("000_000_150", sudoku.column(9).toString());
    }

    @Test
    public void test_quadrant_1() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("700_000_009", sudoku.quadrant(1, 1).toString());
        assertEquals("700_000_009", sudoku.quadrant(2, 1).toString());
        assertEquals("700_000_009", sudoku.quadrant(3, 1).toString());
        assertEquals("700_000_009", sudoku.quadrant(1, 2).toString());
        assertEquals("700_000_009", sudoku.quadrant(2, 2).toString());
        assertEquals("700_000_009", sudoku.quadrant(3, 2).toString());
        assertEquals("700_000_009", sudoku.quadrant(1, 3).toString());
        assertEquals("700_000_009", sudoku.quadrant(2, 3).toString());
        assertEquals("700_000_009", sudoku.quadrant(3, 3).toString());
    }

    @Test
    public void test_quadrant_2() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("004_005_000", sudoku.quadrant(4, 1).toString());
        assertEquals("004_005_000", sudoku.quadrant(5, 1).toString());
        assertEquals("004_005_000", sudoku.quadrant(6, 1).toString());
        assertEquals("004_005_000", sudoku.quadrant(4, 2).toString());
        assertEquals("004_005_000", sudoku.quadrant(5, 2).toString());
        assertEquals("004_005_000", sudoku.quadrant(6, 2).toString());
        assertEquals("004_005_000", sudoku.quadrant(4, 3).toString());
        assertEquals("004_005_000", sudoku.quadrant(5, 3).toString());
        assertEquals("004_005_000", sudoku.quadrant(6, 3).toString());
    }

    @Test
    public void test_quadrant_3() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("800_400_700", sudoku.quadrant(7, 1).toString());
        assertEquals("800_400_700", sudoku.quadrant(8, 1).toString());
        assertEquals("800_400_700", sudoku.quadrant(9, 1).toString());
        assertEquals("800_400_700", sudoku.quadrant(7, 2).toString());
        assertEquals("800_400_700", sudoku.quadrant(8, 2).toString());
        assertEquals("800_400_700", sudoku.quadrant(9, 2).toString());
        assertEquals("800_400_700", sudoku.quadrant(7, 3).toString());
        assertEquals("800_400_700", sudoku.quadrant(8, 3).toString());
        assertEquals("800_400_700", sudoku.quadrant(9, 3).toString());
    }

    @Test
    public void test_quadrant_4() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("400_807_000", sudoku.quadrant(1, 4).toString());
        assertEquals("400_807_000", sudoku.quadrant(2, 4).toString());
        assertEquals("400_807_000", sudoku.quadrant(3, 4).toString());
        assertEquals("400_807_000", sudoku.quadrant(1, 5).toString());
        assertEquals("400_807_000", sudoku.quadrant(2, 5).toString());
        assertEquals("400_807_000", sudoku.quadrant(3, 5).toString());
        assertEquals("400_807_000", sudoku.quadrant(1, 6).toString());
        assertEquals("400_807_000", sudoku.quadrant(2, 6).toString());
        assertEquals("400_807_000", sudoku.quadrant(3, 6).toString());
    }

    @Test
    public void test_quadrant_5() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("000_000_610", sudoku.quadrant(4, 4).toString());
        assertEquals("000_000_610", sudoku.quadrant(5, 4).toString());
        assertEquals("000_000_610", sudoku.quadrant(6, 4).toString());
        assertEquals("000_000_610", sudoku.quadrant(4, 5).toString());
        assertEquals("000_000_610", sudoku.quadrant(5, 5).toString());
        assertEquals("000_000_610", sudoku.quadrant(6, 5).toString());
        assertEquals("000_000_610", sudoku.quadrant(4, 6).toString());
        assertEquals("000_000_610", sudoku.quadrant(5, 6).toString());
        assertEquals("000_000_610", sudoku.quadrant(6, 6).toString());
    }

    @Test
    public void test_quadrant_6() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("090_000_000", sudoku.quadrant(7, 4).toString());
        assertEquals("090_000_000", sudoku.quadrant(8, 4).toString());
        assertEquals("090_000_000", sudoku.quadrant(9, 4).toString());
        assertEquals("090_000_000", sudoku.quadrant(7, 5).toString());
        assertEquals("090_000_000", sudoku.quadrant(8, 5).toString());
        assertEquals("090_000_000", sudoku.quadrant(9, 5).toString());
        assertEquals("090_000_000", sudoku.quadrant(7, 6).toString());
        assertEquals("090_000_000", sudoku.quadrant(8, 6).toString());
        assertEquals("090_000_000", sudoku.quadrant(9, 6).toString());
    }

    @Test
    public void test_quadrant_7() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("030_010_000", sudoku.quadrant(1, 7).toString());
        assertEquals("030_010_000", sudoku.quadrant(2, 7).toString());
        assertEquals("030_010_000", sudoku.quadrant(3, 7).toString());
        assertEquals("030_010_000", sudoku.quadrant(1, 8).toString());
        assertEquals("030_010_000", sudoku.quadrant(2, 8).toString());
        assertEquals("030_010_000", sudoku.quadrant(3, 8).toString());
        assertEquals("030_010_000", sudoku.quadrant(1, 9).toString());
        assertEquals("030_010_000", sudoku.quadrant(2, 9).toString());
        assertEquals("030_010_000", sudoku.quadrant(3, 9).toString());
    }

    @Test
    public void test_quadrant_8() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("050_200_142", sudoku.quadrant(4, 7).toString());
        assertEquals("050_200_142", sudoku.quadrant(5, 7).toString());
        assertEquals("050_200_142", sudoku.quadrant(6, 7).toString());
        assertEquals("050_200_142", sudoku.quadrant(4, 8).toString());
        assertEquals("050_200_142", sudoku.quadrant(5, 8).toString());
        assertEquals("050_200_142", sudoku.quadrant(6, 8).toString());
        assertEquals("050_200_142", sudoku.quadrant(4, 9).toString());
        assertEquals("050_200_142", sudoku.quadrant(5, 9).toString());
        assertEquals("050_200_142", sudoku.quadrant(6, 9).toString());
    }

    @Test
    public void test_quadrant_9() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("001_075_000", sudoku.quadrant(7, 7).toString());
        assertEquals("001_075_000", sudoku.quadrant(8, 7).toString());
        assertEquals("001_075_000", sudoku.quadrant(9, 7).toString());
        assertEquals("001_075_000", sudoku.quadrant(7, 8).toString());
        assertEquals("001_075_000", sudoku.quadrant(8, 8).toString());
        assertEquals("001_075_000", sudoku.quadrant(9, 8).toString());
        assertEquals("001_075_000", sudoku.quadrant(7, 9).toString());
        assertEquals("001_075_000", sudoku.quadrant(8, 9).toString());
        assertEquals("001_075_000", sudoku.quadrant(9, 9).toString());
    }


    @Test
    public void test_hasOnlyOnePossiblePostionFor_already_contains_the_number() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertFalse(sudoku.row(1).hasOnlyOnePossiblePositionFor(7));
        assertFalse(sudoku.row(1).hasOnlyOnePossiblePositionFor(4));
        assertFalse(sudoku.row(1).hasOnlyOnePossiblePositionFor(8));
    }

    @Test
    public void test_hasOnlyOnePossiblePostionFor_because_of_qs() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_095_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertTrue(sudoku.row(1).hasOnlyOnePossiblePositionFor(9));
    }

    @Test
    public void test_hasOnlyOnePossiblePostionFor_because_of_rows() throws Exception {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_401_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertTrue(sudoku.row(1).hasOnlyOnePossiblePositionFor(1));
    }
}
