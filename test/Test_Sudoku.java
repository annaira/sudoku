import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Sudoku {


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

        assertEquals("700_004_800", sudoku.row(0).toString());
        assertEquals("000_005_400", sudoku.row(1).toString());
        assertEquals("009_000_700", sudoku.row(2).toString());
        assertEquals("400_000_090", sudoku.row(3).toString());
        assertEquals("807_000_000", sudoku.row(4).toString());
        assertEquals("000_610_000", sudoku.row(5).toString());
        assertEquals("030_050_001", sudoku.row(6).toString());
        assertEquals("010_200_075", sudoku.row(7).toString());
        assertEquals("000_142_000", sudoku.row(8).toString());
    }

    @Test
    public void test_columns() {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("700_480_000", sudoku.column(0).toString());
        assertEquals("000_000_310", sudoku.column(1).toString());
        assertEquals("009_070_000", sudoku.column(2).toString());
        assertEquals("000_006_021", sudoku.column(3).toString());
        assertEquals("000_001_504", sudoku.column(4).toString());
        assertEquals("450_000_002", sudoku.column(5).toString());
        assertEquals("847_000_000", sudoku.column(6).toString());
        assertEquals("000_900_070", sudoku.column(7).toString());
        assertEquals("000_000_150", sudoku.column(8).toString());
    }

    @Test
    public void test_squares() {
        Sudoku sudoku = new Sudoku("700_004_800_000_005_400_009_000_700_400_000_090_807_000_000_000_610_000_030_050_001_010_200_075_000_142_000");

        assertEquals("700_000_009", sudoku.square(0).toString());
        assertEquals("004_005_000", sudoku.square(1).toString());
        assertEquals("800_400_700", sudoku.square(2).toString());
        assertEquals("400_807_000", sudoku.square(3).toString());
        assertEquals("000_000_610", sudoku.square(4).toString());
        assertEquals("090_000_000", sudoku.square(5).toString());
        assertEquals("030_010_000", sudoku.square(6).toString());
        assertEquals("050_200_142", sudoku.square(7).toString());
        assertEquals("001_075_000", sudoku.square(8).toString());
    }


    @Test
    public void test_squares_by_field() {
        Sudoku sudoku = new Sudoku("111_222_333_111_222_333_111_222_333_444_555_666_444_555_666_444_555_666_777_888_999_777_888_999_777_888_999");

        assertEquals("111_111_111", sudoku.square(sudoku.s[0][0]).toString());
        assertEquals("111_111_111", sudoku.square(sudoku.s[0][1]).toString());
        assertEquals("111_111_111", sudoku.square(sudoku.s[0][2]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[0][3]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[0][4]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[0][5]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[0][6]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[0][7]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[0][8]).toString());

        assertEquals("111_111_111", sudoku.square(sudoku.s[1][0]).toString());
        assertEquals("111_111_111", sudoku.square(sudoku.s[1][1]).toString());
        assertEquals("111_111_111", sudoku.square(sudoku.s[1][2]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[1][3]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[1][4]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[1][5]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[1][6]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[1][7]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[1][8]).toString());

        assertEquals("111_111_111", sudoku.square(sudoku.s[2][0]).toString());
        assertEquals("111_111_111", sudoku.square(sudoku.s[2][1]).toString());
        assertEquals("111_111_111", sudoku.square(sudoku.s[2][2]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[2][3]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[2][4]).toString());
        assertEquals("222_222_222", sudoku.square(sudoku.s[2][5]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[2][6]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[2][7]).toString());
        assertEquals("333_333_333", sudoku.square(sudoku.s[2][8]).toString());

        assertEquals("444_444_444", sudoku.square(sudoku.s[3][0]).toString());
        assertEquals("444_444_444", sudoku.square(sudoku.s[3][1]).toString());
        assertEquals("444_444_444", sudoku.square(sudoku.s[3][2]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[3][3]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[3][4]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[3][5]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[3][6]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[3][7]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[3][8]).toString());

        assertEquals("444_444_444", sudoku.square(sudoku.s[4][0]).toString());
        assertEquals("444_444_444", sudoku.square(sudoku.s[4][1]).toString());
        assertEquals("444_444_444", sudoku.square(sudoku.s[4][2]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[4][3]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[4][4]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[4][5]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[4][6]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[4][7]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[4][8]).toString());

        assertEquals("444_444_444", sudoku.square(sudoku.s[5][0]).toString());
        assertEquals("444_444_444", sudoku.square(sudoku.s[5][1]).toString());
        assertEquals("444_444_444", sudoku.square(sudoku.s[5][2]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[5][3]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[5][4]).toString());
        assertEquals("555_555_555", sudoku.square(sudoku.s[5][5]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[5][6]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[5][7]).toString());
        assertEquals("666_666_666", sudoku.square(sudoku.s[5][8]).toString());

        assertEquals("777_777_777", sudoku.square(sudoku.s[6][0]).toString());
        assertEquals("777_777_777", sudoku.square(sudoku.s[6][1]).toString());
        assertEquals("777_777_777", sudoku.square(sudoku.s[6][2]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[6][3]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[6][4]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[6][5]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[6][6]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[6][7]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[6][8]).toString());

        assertEquals("777_777_777", sudoku.square(sudoku.s[7][0]).toString());
        assertEquals("777_777_777", sudoku.square(sudoku.s[7][1]).toString());
        assertEquals("777_777_777", sudoku.square(sudoku.s[7][2]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[7][3]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[7][4]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[7][5]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[7][6]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[7][7]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[7][8]).toString());

        assertEquals("777_777_777", sudoku.square(sudoku.s[8][0]).toString());
        assertEquals("777_777_777", sudoku.square(sudoku.s[8][1]).toString());
        assertEquals("777_777_777", sudoku.square(sudoku.s[8][2]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[8][3]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[8][4]).toString());
        assertEquals("888_888_888", sudoku.square(sudoku.s[8][5]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[8][6]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[8][7]).toString());
        assertEquals("999_999_999", sudoku.square(sudoku.s[8][8]).toString());
    }
}
