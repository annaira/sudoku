import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Test_Sudoku_Cases {

    @Test
    public void test_1() throws Exception {

        String puzzle = "000_870_000_000_000_080_920_000_004_050_030_006_000_000_000_004_601_003_030_052_040_600_009_500_009_006_020";
        String solution = "415873962763924185928165374157238496396547218284691753831752649672489531549316827";

       // System.out.println(new Sudoku(puzzle).toURL());

        assertEquals( solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_2() throws Exception {
        String puzzle = ".94...13..............76..2.8..1.....32.........2...6.....5.4.......8..7..63.4..8";
        String solution = "794582136268931745315476982689715324432869571157243869821657493943128657576394218";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_3() throws Exception {
        String puzzle = ".94...13..............76..2.8..1.....32.........2...6.....5.4.......8..7..63.4..8";
        String solution = "794582136268931745315476982689715324432869571157243869821657493943128657576394218";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_4() throws Exception {
        String puzzle = "............942.8.16.....29........89.6.....14..25......4.......2...8.9..5....7..";
        String solution = "249186573735942186168375429512697348976834251483251967694723815327518694851469732";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_5() throws Exception {
        String puzzle = ".....7....9...1.......45..6....2.....36...41.5.....8.9........4....18....815...32";
        String solution = "____87__1_9___1__81___45__68___24__32368594175____3829_____2184____18__5_815_6_32";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_6() throws Exception {
        String puzzle = ".5247.....6............8.1.4.......97..95.....2..4..3....8...9......37.6....91...";
        String solution = "152479683368215974974638512416387259783952461529146837237864195891523746645791328";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_7() throws Exception {
        String puzzle = ".9.........1..6....6..8..7.3......1.....39.......5...217.4...28.....3....86....57";
        String solution = "894317265731526894562984173358642719247139586619758432173465928925873641486291357";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_8() throws Exception {
        String puzzle = ".....5....2...4.1..3..8..2......84..8..6......9..1.7.5..6......95...3.6...3.....1";
        String solution = "168295374529734618437186529312578496875649132694312785786951243951423867243867951";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_9() throws Exception {
        String puzzle = "5...68..........6..42.5.......8..9....1....4.9.3...62.7....1..9..42....3.8.......";
        String solution = "597468132318927564642153897456832971821796345973514628735641289164289753289375416";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_10() throws Exception {
        String puzzle = ".7..21..4....3....6.1.....2.......6...86..7.319.....4..1....2.842.9..............";
        String solution = "379521684284736519651498372732845961548619723196273845917364258425987136863152497";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_11() throws Exception {
        String puzzle = "........1..7.5.3.9..48...2...........3...57....942.........3.....1...4.7.6.278...";
        String solution = "526394871817652349394817526148736952632985714759421683975143268281569437463278195";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_12() throws Exception {
        String puzzle =   ".....8..3.16.2.9.7.3...46...........9.5...2...2.13...9..3....2..7...5.........4..";
        String solution = "444678513816523957739994652381952764965847231427136859553479128174265396292391475";
        //String solution = "742698513816523947539714682381952764965847231427136859653479128174285396298361475";
        assertEquals(solution, new Sudoku(puzzle).solve());
        //fail("Not solved"); // TODO Not eindeutig
    }

    @Test
    public void test_13() throws Exception {
        String puzzle = "..4.2..3....8.9.........7...5..37..8........5.49.6..1.5.........68........7.4.9.1";
        String solution = "184726539376859142925413786652137498713984625849265317591372864468591273237648951";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_14() throws Exception {
        String puzzle = ".....6..3..9.4...532......8....1......175.6.92......8.....6.......8...4.47....2..";
        String solution = "715986423689243715324175968963418572841752639257639184132564897596827341478391256";



        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_15() throws Exception {
        String puzzle = ".....8.2......693..98.7...1...........921....7......9624..9.......3..18.........3";
        String solution = "156938427427156938398472561534689712869217354712543896243891675675324189981765243";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_16() throws Exception {
        String puzzle = "..2.46.....4.8...5.7..3...9.....2...3.57.....7.....4....6....93....54.78.........";
        String solution = "582946731934187625671235849168492357345768912729513486456871293293654178817329564";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_17() throws Exception {
        String puzzle = "..3....4.4..2.........9..26....7.....1.9.2...26......85....7.......6.8.33......69";
        String solution = "623815947479236185851794326934678251718952634265143798596387412142569873387421569";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_18() throws Exception {
        String puzzle   = "........3..5..2.14....8..6..........946.......3...42.6...7.........3.68..7.291...";
        String solution = "891546823365672914794183562182659748946827351537914296453768199219435687678291435";
        assertEquals(solution, new Sudoku(puzzle).solve());

    }

    @Test
    public void test_19() throws Exception {
        String puzzle = ".2............48...54.18.3.7....1..4....86.5.......6........1......2...923.4....5";
        String solution = "128397546397654812654218937786531294942786351513942678469875123875123469231469785";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_20() throws Exception {
        String puzzle = "..9.43..........3.41..7.............8..5...6..4...6..2.......1...4.98..67..6..52.";
        String solution = "569143287287965431413872695635729148872514963941386752326457819154298376798631524";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_21() throws Exception {
        String puzzle = ".........4.6.7..9..5..382.........3.9..........426.....7...3..2..16..8...85...7..";
        String solution = "893426175426571398157938246512789634968314527734265981679853412241697853385142769";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_22() throws Exception {
        String puzzle = "...6.4...........3.1...26....2......6...9..158.4.....6.....7...976.5.......2.31..";
        String solution = "289634751465719823713582649152376984637498215894125376321947568976851432548263197";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_23() throws Exception {
        String puzzle = "....4.....5......9..3.784....1......62..........5.38......2......64..7.34.51...2.";
        String solution = "172945386854361279963278451531682947628794135749513862317826594286459713495137628";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_24() throws Exception {
        String puzzle = "...3.56....68..3...4.............8.5.5....412...9.......3.9........8..6..196.45..";
        String solution = "_8_3_56___968__3__34_______6374__8959587__412_2_958736_63_9_____7__8__6__196_45__";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_25() throws Exception {
        String puzzle = ".2...7..5.........6...95..1.7...413.......2....1.5...67...1.8...8..7.......2...49";
        String solution = "123647985958321674647895321572964138469138257831752496794513862286479513315286749";
        assertEquals(solution, new Sudoku(puzzle).solve()); // TODO NOT Eindutig 128367985855321977647895421579624138468739257231758976794513862982476513315288749
    }

    @Test
    public void test_26() throws Exception {
        String puzzle = "...5....3...82...13....179.17.............3..6..712.4..4..6.....9........6..5.2..";
        String solution = "416579823759823461382641795174435682929486317635712949547367188291374576863957274";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_27() throws Exception {
        String puzzle = "3......4...2..8....912...3...5.1..8..64.9.........5..618.7............65.7.9.....";
        fail("WTF happened heere");
        try {
            new Sudoku(puzzle).solve();
            fail("Exception expected");
        } catch (SudokuException e) {
            assertTrue(e.getMessage().contains("Not eindeutig"));
        }
    }

    @Test
    public void test_28() throws Exception {
        String puzzle = "....4....1..9..64..3....8....7.........1.859.......3...52..1....1.7.3...39..5...4";
        String solution = "879346152125987643634215879587639421243178596961524387752461938418793265396852714";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_29() throws Exception {
        String puzzle = "4....9.....541...3........7.......2..31.7...89.6..3.......9....1..6...8...75...46";
        String solution = "478359612265417893319286457748866325531974668986123574664798532153642789827531246";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_30() throws Exception {
        String puzzle = ".8.4.....13...............84....1...5.7..2..3...9..1......2.78.2....6.3..76..3..9";
        String solution = "785469321139289674624317958492831567517642893368975142953124786241796535876553219";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_31() throws Exception {
        String puzzle = ".5.........6..5.91..9...38.4.......8....38..2.73..........1....28.47.5..6......7.";
        String solution = "358291647746385291129647385412569738965738412873124956537916824281473569694852173";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_32() throws Exception {
        String puzzle = ".1..6.9....9..5....3.....76..1.3...272.....4...8........73....93.5..76.........2.";
        String solution = "512763984679485231834129576951834762723691845468572193287316459395247618146958327";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_33() throws Exception {
        String puzzle = "53..97..........7.....1..5......13....4..2...1.98..2.4........5.7....92..91.5....";
        String solution = "538697142412385679967214853726541398384962517159873264643129785875436921291758436";
        assertEquals(solution, new Sudoku(puzzle).solve()); // TODO 536697142616285479748318859722541398384962517159873264463129785875636921291754436
    }

    @Test
    public void test_34() throws Exception {
        String puzzle = "..........7...62.81......54..3.5.......3....22..8....69......8.3...7......7.254.1";
        String solution = "829547163574136298136289754463752819798361542215894376952413687341678925687925431";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_35() throws Exception {
        String puzzle = "...6....445....2......893..97......3.63........4..27..6.9.5.............5....3.61";
        String solution = "398625174456731289721489356975148623263597418184362795619254837837916542542873961";

        System.out.println(new Sudoku(puzzle).toURL());

        assertEquals(solution, new Sudoku(puzzle).solve()); // This is right
    }

    @Test
    public void test_36() throws Exception {
        String puzzle = ".3..1........427.3.2.9.6.4.5...2....349..............1.....9.....6....8...5..346.";
        String solution = "934715628651842793827936145518627934349158276762394851283469517496571382175283469";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_37() throws Exception {
        String puzzle = "....6.....5....97...2..5......2...8..74.......85.4.2.1..1..7...6....4...92.6..1..";
        String solution = "713469852456182973892375614169253487274891536385746291541927368638514729927638145";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_38() throws Exception {
        String puzzle = "...............731.541....8......5...219.4....4..6...7...58.........7.9..98.1...2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_39() throws Exception {
        String puzzle = "..8.........63...4..1...63..3...9...4......62......14....5..79.17.........54...83";
        String solution = "368914527752638914941257638236149875419785362587326149824563791173892456695471283";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_40() throws Exception {
        String puzzle = ".........9..1....2..4.28...65....7....1.....3..97.2........5.7..4.....61.35.1.9..";
        String solution = "823697415967154832514328697652831749471569283389742156196285374248973561735416928";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_41() throws Exception {
        String puzzle = ".....2....134.9..27.9....15.....5...1...8...6.6.97..8.5....6.....2.........2...3.";
        String solution = "456712893813459762729863415384625179197384256265971384538146927972538641641297538";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_42() throws Exception {
        String puzzle = ".....8..9......28..3..7.....48..........2....6.7..913......39...9..1.4..57.6....1";
        String solution = "yyy";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_43() throws Exception {
        String puzzle = "...71....5..............53.16..2.3......3...9.456......9.2...7.6.....2.3.....6.81";
        String solution = "932715864586342197417968532169827345728534619345691728891253476674189253253476981";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_44() throws Exception {
        String puzzle = "............8.5.492...6.3.1..9..........21.38...3.......5........6..48..13...96.2";
        String solution = "146582973287349156395761248973624815851937624624815397718253469469178532532496781";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_45() throws Exception {
        String puzzle = ".....2.73.8.........57..2..9......1.8.......46..815.9.......46.4.....5.2....96...";
        String solution = "146582973287349156395761248973624815851937624624815397718253469469178532532496781";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_46() throws Exception {
        String puzzle = "..........7.48..9...4.2.37.1....5..2.....3..7..3...64..4.........631.........891.";
        String solution = "219537486375486291684129375167945832498263157523871649841792563956314728732658914";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_47() throws Exception {
        String puzzle = ".............67.....7.8..12..........3...65..5.1...893.7.........9..1.24..439...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_48() throws Exception {
        String puzzle = ".......13....4......4698...........8.3....7...28.69.....1.3..6...92....76...8...1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_49() throws Exception {
        String puzzle = ".......1..2....93..65.3....94..5......78..2..6..........12....4...6.98........127";
        String solution = "739528416428176935165934782942751368517863249683492571351287694274619853896345127";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_50() throws Exception {
        String puzzle = "5.1.83..7...72...........1...8....2..1..5.9....3.....1...9...8..4...75..39.4.....";
        String solution = "521683497439721856687549213968174325714352968253896741172935684846217539395468172";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_51() throws Exception {
        String puzzle = ".5....8...1.....32..8.....6.9........4.8..6.5.....7.....2.7...33....1..4..562..1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_52() throws Exception {
        String puzzle = "..5..1.8..4......9..7659.1........7...42......1....8.6....35..........9.97....1.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_53() throws Exception {
        String puzzle = "..7....3..5...9..19.........2.......5...3..29.8..741.3...4.8.....2.....6....158..";
        String solution = "417562938256389471938147265321956784574831629689274153165428397842793516793615842";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_54() throws Exception {
        String puzzle = "....5...........4...36.1..8......7.1.2..1.8...7...9...4....3........659..59..72.6";
        String solution = "987354612216978345543621978698432751324715869175869423462593187731286594859147236";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_55() throws Exception {
        String puzzle = "9.58...76.........7...49.3.........9..1..82.....37.....7.......43...5.8...8.9...5";
        String solution = "945832176823617954716549832687254319351968247294371568572186493439725681168493725";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_56() throws Exception {
        String puzzle = "...1......98.2...63...4..5.5.......3.61.........7..86...7.8.3..........9..52..4.8";
        String solution = "752163984498527136316948752579816243861432597243759861927684315184375629635291478";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_57() throws Exception {
        String puzzle = "..3..........285..2......7......2..4.1.....2363...1.571....4.8..5....9...9.7.....";
        String solution = "843579216771428536265563476578632194914857623632941857126394785357286941496715362";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_58() throws Exception {
        String puzzle = ".7.....9....4...82..21.9......5..4......1...71.36......2....3....5...1..8.1.26...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_59() throws Exception {
        String puzzle = ".6........4.7...8......613.1..4....5....2.8...5.....76...2..3..8...4..2.79...8...";
        String solution = "968314752341752689527896134183467295674925813259183476415279368836541927792638541";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_60() throws Exception {
        String puzzle = ".......5........21.39......4...51..7.17..49.....36.5......15...9.....16.64.......";
        String solution = "284136759756489321139572648463951287517824936892367514378615492925748163641293875";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_61() throws Exception {
        String puzzle = "3....75.17.8..6......8....38....479..9...........23...962.....7.......6.....4.9..";
        String solution = "174582936588396147396174582649738291218765398989219698863447415753666827949451763";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_62() throws Exception {
        String puzzle = "17.....36....9..4.3.6....8.6....82.12....5.......1....8....7....5...........51.63";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_63() throws Exception {
        String puzzle = ".........7...4.....9...612.4...1...7....2.5..5.1.98........1.6.....6.28....4.53..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_64() throws Exception {
        String puzzle = "74..6..3...2..5....18..2..9.8..2.6..9......7...4.8......37.....6...9.....2...4...";
        String solution = "749861532362945187518332469187529644956413278274689153493756821675298354825334796";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_65() throws Exception {
        String puzzle = "9...6........3.....3.8..4.6..5........9.8.3....4...297.2......4...3.....68.2...15";
        String solution = "958764123746132589132895476315927648279486351864513297521678934497351862683249715";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_66() throws Exception {
        String puzzle = ".5367...9.......5.....2..16.....37.29......6....5......2..1...51.6....9....9...4.";
        String solution = "453671829612839457798425316564193782931287564287546931829314675146758293375962148";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_67() throws Exception {
        String puzzle = ".....185...2..8.313..5..4..641......9....5..........8....9.6............5.9.4..72";
        String solution = "496231857752468931318579426641387295983625714275194683127956348834712569569843172";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_68() throws Exception {
        String puzzle = ".....5.3...79..1...3....7.5.51....978....1.56.....8..........28.74.2.....9.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_69() throws Exception {
        String puzzle = "..1....8......45....5.7......273..........2..358.1....2.3.56...9.......1..6.9.7..";
        String solution = "741563982639284517825971346492735168167849235358612479273156894984327651516498723";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_70() throws Exception {
        String puzzle = ".4........12........82..537......2..3...8...4..53.7.......4..6.9......7.2..79...1";
        String solution = "543976128712835496698214537167459283329681754485327619871543962934162875256798341";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_71() throws Exception {
        String puzzle = "26..7..38....1..7......46.2.1...5....9.23.4.......72...........7......8...1..87..";
        String solution = "264579138583612974179384652312465897897231465645897213958726341726143589431958726";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_72() throws Exception {
        String puzzle = "..1.2.....8...5.9..6.4..1......8..3.....42.5..97................7.....4..32.176.5";
        String solution = "941826573283175496765493128524689731316742859897351264658234917179568342432917685";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_73() throws Exception {
        String puzzle = "..8.91.6....24....9...7..2...2...9....5....8.8..63.7.......7..1.56...4...1.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_74() throws Exception {
        String puzzle = "...3..59...9.....3....6..7.4.8.1........9.......52.9.86.....7....58..3..1......64";
        String solution = "247381596569274183831965472498617235352498617716523948684132759975846321123759864";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_75() throws Exception {
        String puzzle = ".51..8....7.692.3......3.....7....92....7...1.6....45...........9..8.6..64.5.....";
        String solution = "351748926478692135926153784517864392234975861869321457782436519195287643643519278";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_76() throws Exception {
        String puzzle = "...3.....8..6...154...5.........4...2...6..8..7..9.34.....2...9..1..84..7.8....2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_77() throws Exception {
        String puzzle = ".....3..1.4....83...5.4.....641...8..1...7......3....75.9....6.....3..5....87...3";
        String solution = "297583641641729835385641972764152389813497526952368417539214768178936254426875193";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_78() throws Exception {
        String puzzle = ".28..5...4..1..........3......4..85....2.....1...7...37...9..4.98.5....656...2...";
        String solution = "328945761459167382671823495296431857837259614145678923712396548983514276564782139";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_79() throws Exception {
        String puzzle = "......5..3.........9..18...1..9..26..6....4..98.1......7.3.........2.316.4.8....5";
        String solution = "718632549326594187495718632134975268567283491982146753671359824859427316243861975";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_80() throws Exception {
        String puzzle = "............1.962..6...7.59..1.......9.8.4..2......346..8.....19.6..3.........58.";
        String solution = "159268437473159628862347159341726895695834712287915346538472961916583274724691583";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_81() throws Exception {
        String puzzle = "........95...6..3..7...25..............7.4.6..32981...........8..5.2....76.39...2";
        String solution = "146573829528169437379842516457236981981754263632981745293415678815627394764398152";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_82() throws Exception {
        String puzzle = ".....6.57...5.....1...8.3..8...32.....6.1.59.........6...1.........2.97.5.17..8..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_83() throws Exception {
        String puzzle = "....16..7...7..93.2.7.....8839..........38..15........7......8..5.1........5.94..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_84() throws Exception {
        String puzzle = "4...187..8.......2.....4..............6.53..1..726.43...1.7...6.3...1.8....6.....";
        String solution = "452318759875396542163324668324187229226453271517269435241875396632941587998635114";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_85() throws Exception {
        String puzzle = ".....24..5.....9.8.2..65.7..8..3...1.74.......6......9.....4..5.......3..12..78..";
        String solution = "731982456546173928829465173985236741174598362263741589397824615458619237612357894";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_86() throws Exception {
        String puzzle = "8.63......13....9....6....27..........5.6......1.492...3..1.........2.47....368..";
        String solution = "896321754213475698574698132729183465345267981681549273937814526168952347452736819";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_87() throws Exception {
        String puzzle = "....91......2..87....6..1......5........6...3..79..2165......2.28..3.5....3..7...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_88() throws Exception {
        String puzzle = ".9.........8.2.3....6......5.....4...1...528......4.73....6.83..6.1...2.18.2.....";
        String solution = "291356748478921365356478192537892416614735289829614573942567831765183924183249657";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_89() throws Exception {
        String puzzle = "..5.......17.53..9.8.1...3...4..1.2...2....95...38.6.....7......2...43.......9...";
        String solution = "365928741417653289289147536674591823832476195591382674148735962926814357753269418";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_90() throws Exception {
        String puzzle = "....6..59.84.1.3.......7.....8.........3....15..4..9..4.........5.78.24..97.....3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_91() throws Exception {
        String puzzle = "......9.2..9....1.....65.....7.2........5..34.2.4...98.5...1....8...7..3.16.....5";
        String solution = "675183942839274516241965387497328651168759234523416798754631829982547163316892475";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_92() throws Exception {
        String puzzle = ".8......36.....9.7....5..6.....9.......4.36..159..2........8.9..2...1.4...35....8";
        String solution = "984267513615334987337859462346795821872413659159682774761348295528971346493526178";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_93() throws Exception {
        String puzzle = "1..9......8..7.4..4.5..2...........39...36.7.....1..9....24....2.45.1..8......7..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_94() throws Exception {
        String puzzle = "..7..6.........1.4.4.2.3..94.8.....69..81.........9..........3...1.35.8.2....85..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_95() throws Exception {
        String puzzle = "..43..8.78....2.3..3...6.....69.5..2.9..7..4................5.6.........389.5..7.";
        String solution = "254319867867542139931786425146935782593278641728164953472893516615427398389651274";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_96() throws Exception {
        String puzzle = "..42..7..2...6.......3..1....5..7..9.8.6....74.9..1.8..........61..52.4.........8";
        String solution = "834219765291765834756348192365487219182693457479521386528934671617852943943176528";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_97() throws Exception {
        String puzzle = "..1....5..36.5...9..79....6.......3.6..8.1.......6.1.5.........598.2.....2..73...";
        String solution = "981346257436257819257918346812795634645831972379462185763589421598124763124673598";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_98() throws Exception {
        String puzzle = ".....8.13......8....7.2..5..3...........965..5.8..7.21.5.3..4...........8...51..7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_99() throws Exception {
        String puzzle = "8....3.577.5..63....2..4......8.9.....9.4.2.1.63.............3...4....7.2...9....";
        String solution = "816923457745186329392574816127869543589347261463251798678412935954638172231795684";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_100() throws Exception {
        String puzzle = "7.......3..8.3.2.......7......9..4.79..46.5..36.8......3.5.......1....2.8....91..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_101() throws Exception {
        String puzzle = ".....1...1.8.4.5...6..9.4.......9.....97....14..1..23...........574.6...8.....3.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_102() throws Exception {
        String puzzle = ".9..4.2..........35.69...........15..73...4....24...76.2...1.......9.7....5.7..4.";
        String solution = "891345267247618593536927814489736152673152489152489376724861935368594721915273648";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_103() throws Exception {
        String puzzle = "7.89.......6..8.4....25..3.......1..6...1..2..7...5.6.....7....92...3...1...8.6..";
        String solution = "738941256256738941419256738582694173694317825371825469865479312927163584143582697";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_104() throws Exception {
        String puzzle = "..86.7....7...541.9................2.4.2...8...7..35........6.9....5.7...52.9...4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_105() throws Exception {
        String puzzle = "..........2..4...3..1.97.5......463.71.2.6.....2.........6.....2....53.7.3....9.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_106() throws Exception {
        String puzzle = "...9...4..81.....5..4.52......6.93...7....8..2.......4........16.3...9.....1.6.28";
        String solution = "325918746781463295964752183158649372476325819239871564842597631613284957597136428";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_107() throws Exception {
        String puzzle = "7....6.5..6.....4....7...8..4.......1..3.......3..24......73.92..8.6....6.2..13..";
        String solution = "734986251869125743521734986247698135156347829983512467415873692378269514692451378";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_108() throws Exception {
        String puzzle = ".....2..5.6.5..8....91...3.752.........38.......7......38.....1.....4..342...86..";
        String solution = "314892765267543819589176234752461398146389572893725146938657421675214983421938657";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_109() throws Exception {
        String puzzle = ".7......5....2.9..53....7....924.....285.9...........1.4..1...7..1....437..3.....";
        String solution = "972136485814725936536498712369241578128579364457683291643912857291857643785364129";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_110() throws Exception {
        String puzzle = "...3...747....4....2....15.....2..9...36.....5...9..4.4......6..9.....1..7126....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_111() throws Exception {
        String puzzle = "..2.4....68..51...7......8.....3...5......9..2.59..7.1.....9.78.....6.9...63.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_112() throws Exception {
        String puzzle = ".5.3.........8.49.8..9...6.97....2.........174.6....8...8..........3.1...94...67.";
        String solution = "759346821162785493843921765971853246285694317436172589518267934627439158394518672";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_113() throws Exception {
        String puzzle = "1..28.59....5.6..17....9..2.7.4.8.1..3.....4...2..........9.....53...........4..9";
        String solution = "164283597329576481785149632576428913831957246492631875647395128953812764218764359";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_114() throws Exception {
        String puzzle = "..76....14...........8.4.92.9.....5.68..72.....2..9.3.......5.6..5.238...........";
        String solution = "927635481418297365356814792194368257683572149572149638239481576765923814841756923";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_115() throws Exception {
        String puzzle = "24......9..3..5.......67.3...5..4...9...8.27...1.....6......6.4.8......7...27.1..";
        String solution = "183259476274638591659714328415387269392146785768592143937465812821973654546821937";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_116() throws Exception {
        String puzzle = "..325.........85.....7....8.......693.2.4....768...1...........8.......45..821.3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_117() throws Exception {
        String puzzle = "............8...37.98..12..........6.65...9..8..4.53....4.....2....8.....72.561..";
        String solution = "643572819251849637798631245137928456465713928829465371384197562516284793972356184";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_118() throws Exception {
        String puzzle = "..2....9.....1.3........1.7..4....75.8.5.9.6..7......8...1.4.......3.5..1.5.67...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_119() throws Exception {
        String puzzle = "....6..5.4.631...........8...5...46..1....52...3..2...9.........247.....1..25..9.";
        String solution = "792468351486315972351927684275189463819643527643572819967831245524796138138254796";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_120() throws Exception {
        String puzzle = "...64..5..4.......5....8.......813....3.5...81....2..57..........54...36.82..5...";
        String solution = "827643159346519287591278643459781362263954718178362495734896521915427836682135974";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_121() throws Exception {
        String puzzle = "......6...34.9....6....8..3...6........4...5.25....1....8....4..96.2....1...8759.";
        String solution = "815743629734296815629518473487651932961432758253879164378965241596124387142387596";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_122() throws Exception {
        String puzzle = "......29..4....6....7.58...68...7...1.2....6......4.8.............4.19...5.78..13";
        String solution = "568143297341972658927658341684217539132895764795364182413529876876431925259786413";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_123() throws Exception {
        String puzzle = "......9....9.14..664.37......2..1.3..9...5....1..6...72..4...7......68........6..";
        String solution = "571682943329514786648379215762841539493725168815963427256498371137256894984137652";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_124() throws Exception {
        String puzzle = ".6..7....5....36.14......9..94.2..7.8.......4..7.6.5...........3..1.4...756......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_125() throws Exception {
        String puzzle = "7..........9.3....4.8..1..7.......8....627..5....45..95.3..4.....2...6......7.9.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_126() throws Exception {
        String puzzle = "....1...8.9....7...6...5.....6...3.2.2....4..51..8.....8.....7....6.2.3...3.9..61";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_127() throws Exception {
        String puzzle = "6.57....11.......8.9......2..1.3......7.4..6..8....9.5.1.9.3........5....74.8....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_128() throws Exception {
        String puzzle = "............1.5....4...8..2..9..31......1....68.75...4..7.6..3..9....7...54...98.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_129() throws Exception {
        String puzzle = "..1..9..6.....23....96.3.24..........58.....96..7....1..........4..3.7..16....5.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_130() throws Exception {
        String puzzle = ".7...1..5.....5.4....3.2..1..8.1.....35...6..94.8....3.2....8....9....6....72....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_131() throws Exception {
        String puzzle = "..48.7..31......6..9....8..8.6.....2....1..3..5.9....1.....654.6...5....4....1...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_132() throws Exception {
        String puzzle = "..3......261.........376.......2...4.....9..5.75.4..86..............8..9.34.9.17.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_133() throws Exception {
        String puzzle = ".4..6.17....52....1.......8..8.....5...8.32..627...9...1......6..4.52......7.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_134() throws Exception {
        String puzzle = "...2..4.......82.5.51..........148.....9......29.......3.1...7...857....1...2.6.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_135() throws Exception {
        String puzzle = "5.1...3.8....7..2.......51.65.........9..2..4.2..9......47....32.......1.1...6..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_136() throws Exception {
        String puzzle = "2......8....4........9..746.6.2.5..4...3...7..4..76.2...3.1....6....8....1......2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_137() throws Exception {
        String puzzle = ".74.81.......56.9....4...3....9....1..7..53....6..........2.....3....217...89...6";
        String solution = "974381562318256794562479138253948671487615329196732845645127983839564217721893456";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_138() throws Exception {
        String puzzle = "..7.18..9..4..5..1......5..9217....88..5........4.9.....8.....76.9............28.";
        String solution = "567218349394675821182394576921736458846521793735489612258143967679852134413967285";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_139() throws Exception {
        String puzzle = ".....8...1......95.5....3..2.....64.6..81.....9.4...3..4.......9.6.......3.524..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_140() throws Exception {
        String puzzle = "....4....3......62..12...3.......52...8674......8..64......18....9....1..6.7.9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_141() throws Exception {
        String puzzle = ".435....7.......2.25.3.9.6...4..58.1..1..4...7............8..9...21.........3...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_142() throws Exception {
        String puzzle = ".....1.3.....7...93.....8.19.......7..7...18..2.64......2.....5...2...9.153.6..7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_143() throws Exception {
        String puzzle = "......9.1..4....7.1.....52.....9...3.73...2...9.75......81...6...19........5.7.32";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_144() throws Exception {
        String puzzle = "3......5.92.......86..7..4.....48......19...3.8.6...9.......4.1.4.5..739.....1...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_145() throws Exception {
        String puzzle = "..2..7....1.....3...8..6..4..4....623...82..7...56.3.....4.5.........27.8.17.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_146() throws Exception {
        String puzzle = "..5.....6.46.9.3..81......22....7..85...2.........6.54...9.....1..8..4.......21.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_147() throws Exception {
        String puzzle = ".........3.5.4...2...26...8.1..........4..9.5.7.3.62.17........2...184..6..5...8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_148() throws Exception {
        String puzzle = "....9.5..92.3......7.6....4.....8.5.....3...24.1...69...7..2...1....3..5..2...16.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_149() throws Exception {
        String puzzle = "............14..6...7.59.31........7.3.4..5..8.2.....9.169.4....4.2.7..6........8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_150() throws Exception {
        String puzzle = "...71.9....2....1....9...26.2....3...4569....9.6..1.....8..5....7.2.....2.....53.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_151() throws Exception {
        String puzzle = ".53..617...........6..98..22....1..4.4.8..3.9...........1....6...97..8...2....9.1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_152() throws Exception {
        String puzzle = "..4.8.....5....26491.........7......3......57....54.1.........12..5..6.3.9..438..";
        String solution = "764285139853179264912436785547318926381962457629754318436827591278591643195643872";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_153() throws Exception {
        String puzzle = ".....6.3.....1.8.27..3..95..1.6..3....52...94.389.....1.......5.8............54..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_154() throws Exception {
        String puzzle = "4...7.9.........5...5..9.2.....4.7.1..8.......2..875.3..3.......9.....7818.4...3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_155() throws Exception {
        String puzzle = ".....17.......6.94.4.35..8.....8......19.7...93.2....5........9...5..47.8.4...5..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_156() throws Exception {
        String puzzle = ".53.2.1..1.....9.....47..583..7.8.....2.......4......9.6..9.71............75..46.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_157() throws Exception {
        String puzzle = "1........7.2...64....2.7.8...5..9...91......3.....21.6........4287.......6.9..82.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_158() throws Exception {
        String puzzle = "...3.5.....7.91..8......3..48......1....835...92...4........13...1.....4.4...9.25";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_159() throws Exception {
        String puzzle = "..5.....78..96.....3....9....1.......5...3.28.7.....14.2.6...9....2.8.6...4..9..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_160() throws Exception {
        String puzzle = "...........74....2..3.5...8.........9.6...5......6281.3....81...9.17.3.475...4...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_161() throws Exception {
        String puzzle = ".64.9..5........18.8.3.2..7425..9....1..3.............3.....7.28..2....6.5.7.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_162() throws Exception {
        String puzzle = ".....4.7.....2.1..8...6.9.2.26..........3.8.7.5...1.....3.7..1.6..892..3.8.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_163() throws Exception {
        String puzzle = "....8....1......9..2913...6.........5789...1...236.........4....1...593.4..6..2..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_164() throws Exception {
        String puzzle = "..6.9.........8.5274.....8.............9..5612.3..147............8.4.635....79...";
        String solution = "856297143319468752742315986561784329487923561293651478124536897978142635635879214";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_165() throws Exception {
        String puzzle = "........11...5..8..9.1..7.4.7..8........49....3....479..9.36.....1..8....2...4..6";
        String solution = "457893261162457983398162754974385612216749538835621479589236147641978325723514896";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_166() throws Exception {
        String puzzle = "92...1.4...1.4..2.5..6.9.....4.........314.9....2....3.3....5..4...5.8...7.8.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_167() throws Exception {
        String puzzle = "........41....4....2..7.6...926..4......39.....7.5...29.3....2....9...4.51.7..8..";
        String solution = "735196284169824375824375619392687451451239768687451932943568127278913546516742893";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_168() throws Exception {
        String puzzle = ".7.6....8.4.35..16.6..19.5...7........6.....5.9..74.....2....9....8.1....84......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_169() throws Exception {
        String puzzle = ".........34.5..2...9.314................71.94..46..5..6.......2.17..8.6..3...78..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_170() throws Exception {
        String puzzle = "....526...1...7.....6...2.1.....3...1.4...5..7.289.....819....3..3..5.8..2.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_171() throws Exception {
        String puzzle = "...5.1.82.5...9.....7.8...6276.1..5...5......3.....7.........6..839.........248..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_172() throws Exception {
        String puzzle = ".......9..63..2.8....46.7...1.9...65.5......89.8......8.7....4...51......9.7.4...";
        String solution = "524817693763592481189463752412978365356241978978356214837625149645139827291784536";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_173() throws Exception {
        String puzzle = "7........14.9...2....5846......3...8.......4..93......8.....1..21..483....7..1..6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_174() throws Exception {
        String puzzle = "9....2..76...1..4.......532...4.....2...9.3...5...68......5....89.....7..7...861.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_175() throws Exception {
        String puzzle = "......1..72...6.4.13.......4....3..2.6..9......8....5.....2739....8.....87.1..4.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_176() throws Exception {
        String puzzle = "96.14...8.45...9......2..3.....82....5...6...4..79.25.......4.3..4.....9.1.......";
        String solution = "962143578345678912178925634796582341251436897483791256527819463634257189819364725";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_177() throws Exception {
        String puzzle = "6...5.....8..........4...73......2....93..4.7.1.74..5.7...3...2.91.6.3...4.....8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_178() throws Exception {
        String puzzle = "....7.6..156...........2...8194....3...1..45............7.5.....6.2.7.8.3...68.2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_179() throws Exception {
        String puzzle = "..1..2.76.3.......287..14..........8.13...92.7..2.4....9...........85.......3.8.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_180() throws Exception {
        String puzzle = "...........5.2...9.93.4.7.6.........5.1..8..4...2519....2.......3.....1..849.62..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_181() throws Exception {
        String puzzle = "96.............2..4.59...7........125....893..7..3...8...5.31.....19.....92.8....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_182() throws Exception {
        String puzzle = ".........9.48..6.....714..2.2..6...53.....2..6.81.7.........1...43....5...1.3..6.";
        String solution = "182396547974852631536714982427963815319548276658127394865479123243681759791235468";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_183() throws Exception {
        String puzzle = ".2..94...3......4.8.95........4.2681......4.3.......5...3.5...2...1..3.......61.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_184() throws Exception {
        String puzzle = ".........4..87..15.3....82...9.3.....8.....6.2..15...3....6...7..7.85..93.....2..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_185() throws Exception {
        String puzzle = ".....4.899......6.....9....4..2......5..3.72.8.7....4...2.....879.3.......8.1.4.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_186() throws Exception {
        String puzzle = ".......8.3...976.....8.39.....5............3...9.482.5.71.....2...4.....635....47";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_187() throws Exception {
        String puzzle = "........73.......87....63..........4..6.27.8..8...5921.51.7.....6...2.3......8..5";
        String solution = "618239457329754168745186392532891674196427583487365921251973846864512739973648215";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_188() throws Exception {
        String puzzle = "8.......64.5..8...1......3.......2.5.518.9..........78.4....12...63...49...4.5...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_189() throws Exception {
        String puzzle = "..8......6.18.3...42..5..........82...62.879...4....1.........37....4....593.7...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_190() throws Exception {
        String puzzle = "..2..1....3...4..5.9...7.12.5.93...8...7.6...8.......6......16........5.9..15...3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_191() throws Exception {
        String puzzle = "32............86.9....54..2......3.8...4...2..85....945.1..6.......3....462.9....";
        String solution = "328961475754328619916754832149572368673489521285613794531246987897135246462897153";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_192() throws Exception {
        String puzzle = ".4..5...6...8.6..3..7.4.....2..3.....5...493...6..8...8....56....43...9....9....1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_193() throws Exception {
        String puzzle = ".3...4..77..23...6.4...5...1...2.......9.6......3..8.5..4...9.......92...95...7.3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_194() throws Exception {
        String puzzle = "....7.6..3..1..5492...8............1.6.7..48...58.4.......2.....213.....43....1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_195() throws Exception {
        String puzzle = "..69.....1.7.5.3.........5......4..3.8...3.72..1..7...8.5.764...6....1....91.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_196() throws Exception {
        String puzzle = "....7...41..58.....9......2.35.4......87...91.......3..5....1.8..63.....94...6..3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_197() throws Exception {
        String puzzle = "...6...4..5.19.....13.8...262......8.71......9....4.71.....8...8.....3...6.53....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_198() throws Exception {
        String puzzle = "...........1..2..335....8.6.....3..7...1.8.......4.539.98....2...53.....2..6.9.4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_199() throws Exception {
        String puzzle = "..2.3...58.....9.4694..7...4.3.....1....8..........29......6......2..31.9....5.62";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_200() throws Exception {
        String puzzle = ".....3.......2..4...5861..2..7....8.543..8...8..9..435......9..........1..63.5..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_201() throws Exception {
        String puzzle = ".6....8.51..6.4.9.9.7..5.2.5...7.........92....8........1.8...6.5....982...7...4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_202() throws Exception {
        String puzzle = ".5.....6...1..3...698..1....745...9......451.....92..3...139.4....4....8....6....";
        String solution = "253987164741653289698241357374516892982374516516892473827139645169425738435768921";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_203() throws Exception {
        String puzzle = "..9..427.4.......6...2.......7....6..1.8...3...2.4.1...5..1.8....8569....4...8..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_204() throws Exception {
        String puzzle = ".48.....5.1...5.9.9.2...16......2..9...4..32......94.6....7......4.......61.5.8.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_205() throws Exception {
        String puzzle = ".9.....4......6.9....37.2.1.......1.43......7.15.8...4.6.5.8......62.4....89..1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_206() throws Exception {
        String puzzle = ".41..8.....59...6....614....1........27.49........7.13.7......29.......6...2.1.94";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_207() throws Exception {
        String puzzle = "..31....8....3..16..2498..37......4...827....9..........93....2..6..1.8.31.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_208() throws Exception {
        String puzzle = ".......6.9.57..1.47.....925.....2..7...5.8.......6.29.2...14.5....6.....1...3.6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_209() throws Exception {
        String puzzle = "4............4.8.1..8.5673......4..7..46..1.....9.2.....3.......19.28..5......283";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }


    @Test
    public void test_210() throws Exception {
        String puzzle = "5.......21...6.5....6.73..8.5...9.2.....1...7....8...9.3.......28..3...5...4...31";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_211() throws Exception {
        String puzzle = ".4...95.39.2..7............43.........6.7.3....894....8...94...5......86...7.6..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_212() throws Exception {
        String puzzle = "..932..6........4.6...4.21...38....4........9.81.65....9...35.....1.....7....2.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_213() throws Exception {
        String puzzle = ".......85.81.4.....37..1..4....13......4......2..6.7.....6...4..9...7..1..3...652";
        String solution = "249376185581942376637581294965713428718429563324865719152638947496257831873194652";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_214() throws Exception {
        String puzzle = "...638...3....1........5.8..2...7....8.5..47..4.....2.....9..4..9.7...1...4.1.26.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_215() throws Exception {
        String puzzle = "...1....8...35.....5...9.........4..4....8.9..8.23....6.......77......3..34.76952";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_216() throws Exception {
        String puzzle = "...2..4.5....6.3...6...8....1..5......48327.9.3.6....2.......2......35..7.8.....3";
        String solution = "389271465271465398465398271812759634654832719937614852543187926126943587798526143";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_217() throws Exception {
        String puzzle = "..........76..1...8.2..6.5..9..7.3...6......214..6.9......14......3...2...59.2.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_218() throws Exception {
        String puzzle = ".65....3.4.7....8...8..7..1.2...1.....68.....9....6........3...7...6.41..14..8..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_219() throws Exception {
        String puzzle = "..........45..9.2...2..46.1...2...4.4...1.....9...5..7.2.....1.5..7..46...8.6..9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_220() throws Exception {
        String puzzle = "....8...31......25...69..84..3..2....2.8.9....9..7......1.....9..7.3...63....8.4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_221() throws Exception {
        String puzzle = ".21..6..4..5....2..6....3......314.....4....85............7.9..8.25.4....3...264.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_222() throws Exception {
        String puzzle = ".3.........2...6.16..5..2.8....1..7..1....8.3.....4..6..36....24..87....2..9....4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_223() throws Exception {
        String puzzle = "..7.6.....5.2..6...6....1.2..3.8...48....5.....1...2.3..2..3.41..........1.75.8..";
        String solution = "237168495159247638468539172623981754874325916591476283782693541945812367316754829";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_224() throws Exception {
        String puzzle = ".....3.6.5...18..9....7..8...9..4.......6...1..6....53.48....2.12...79.....2..7..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_225() throws Exception {
        String puzzle = "..4.56...3.58...9........6..4.91..86.....2....2.7.5.3........1..8.1....4.....4..2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_226() throws Exception {
        String puzzle = ".....7.....6..4..99...6..5.....9.......7..3.22..8.1..7......13.65..18...8.3...7..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_227() throws Exception {
        String puzzle = "..7......4.31...97.1.6.9..5.....2..........8....5..9.6.........9.641.3....8.67..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_228() throws Exception {
        String puzzle = "..8.....7..63...8....1.5.6..839.....97..1.5.........2..67..2...8...9....4....68..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_229() throws Exception {
        String puzzle = "...........3..68.5.4..8.9...3..7......4.1..7..8.9..3....84....7.7.83.2......91...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_230() throws Exception {
        String puzzle = ".....3.4..7..9....438..5......5.2.1...27......4......8..9.3.82...3.4..6......7..3";
        String solution = "921873546675491382438625971396582417582714639147369258759136824213948765864257193";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_231() throws Exception {
        String puzzle = "..........3.6.......4.2891.............497...82...147..........6..239..13.....846";
        String solution = "287913564931654287564728913476582139153497628829361475715846392648239751392175846";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_232() throws Exception {
        String puzzle = ".8...5...3......47....2.5...2.5...36......2..43..9..7....4.3.1.6.8.7.4..5........";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_233() throws Exception {
        String puzzle = "..........4.18..5...89................1..8.495..4.3.26..7......3....9...9..53678.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_234() throws Exception {
        String puzzle = ".6...53..5..4...8...19..........7....9...4.57.58...16...4..3.9.....5..7.9.......8";
        String solution = "869275341527431689341968725416587932293614857758392164174823596682159473935746218";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_235() throws Exception {
        String puzzle = ".............7..5.516.28.4..........6.3.....7.89.52..1..8....9.9..6..8..76..1....";
        String solution = "837564219294173658516928743175386924623491587489752361358247196941635872762819435";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_236() throws Exception {
        String puzzle = "......4...942...5.....5..7.47..1.....5.....3...1..95........2...267..1..7...8.94.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_237() throws Exception {
        String puzzle = ".......9....69..5.52.7.........3...9.8.2.53...4..8...63...46..5..1......2..3..4..";
        String solution = "836524197714693852529718634652431789987265341143987526398146275471852963265379418";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_238() throws Exception {
        String puzzle = "..3.2........8..758.13....696.8...5.....124..1...........6...3...693.8..........7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_239() throws Exception {
        String puzzle = "4..7.1...75...3..82..........51....3....6..5.38...5.47.....4..1....1.8.2.......3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_240() throws Exception {
        String puzzle = "..........1.....47....563.2..........2..1..3.7..642..1.......1..73.25.8.5...3...4";
        String solution = "392784165615293847847156392951378426426519738738642951284967513173425689569831274";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_241() throws Exception {
        String puzzle = ".73......2....6.....4...3.9.......8.7.1.8.4...2....761....1..2...6.2.......938.4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_242() throws Exception {
        String puzzle = ".6...3.2.3..9...4.4.....5.8.........2...3......6..23.1.7.46....69.........82.7..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_243() throws Exception {
        String puzzle = ".6......23....2.9...1...576...........26..31..8.3.54....7.96..8.....7...1...5....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_244() throws Exception {
        String puzzle = "2......7.....4.....76..9.....1..5.9....6....59.....64.6......5..3..8...7.5.3.41.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_245() throws Exception {
        String puzzle = ".......5...1..46..9...7...8.....7..971..45...4...8.......2.9..7.4..1..6..7....1.2";
        String solution = "367821954821594673954376218682137549713945826495682731136259487249718365578463192";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_246() throws Exception {
        String puzzle = ".....1.....2.8..7..6...4.38...8..1...45...7..7216..4.3.......1.....9...23....6...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_247() throws Exception {
        String puzzle = "..3......9.......4...6...31...8..........73..8.423.56..2...8.1.....5....6981..2..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_248() throws Exception {
        String puzzle = "7..3..2.9.8..1...3..2..65...28.......5...41.....1........58.........9..26.3..2.1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_249() throws Exception {
        String puzzle = "6.24.......49..2...9.3......59.....1...589..6....1...83......8.....2..5....6..1.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_250() throws Exception {
        String puzzle = "6.......3.9........52..6.4..2.7..........51.6.79.3....9.4..3.52...9...3...1.....8";
        String solution = "617489523498352617352176849126748395843295176579631284964813752285967431731524968";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_251() throws Exception {
        String puzzle = "..........28.7..1.7.46.......1....9..9.1.4.8.5.....3.....41.5..3....9......7.36.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_252() throws Exception {
        String puzzle = "3.......71..9.8..2.49..........3...1....523.......4..6.....7...4.8...15.6....9.84";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_253() throws Exception {
        String puzzle = "....18....1.63...........897.9..62....2.....58...5.3......93.4.6......3...14...5.";
        String solution = "475918623918632574263574189759346218132789465846251397527193846694825731381467952";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_254() throws Exception {
        String puzzle = ".....8.....367.......91.76.....4.89...8..3.5.....9..7..........31.5......452.9..1";
        String solution = "276358419193674285854912763537146892968723154421895376689431527312567948745289631";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_255() throws Exception {
        String puzzle = "6..........537..9.....1...7.....2.4.14..5.....83...9....6.9..........32.93.48...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_256() throws Exception {
        String puzzle = ".......1...4...3..36.5....7.35.284.....31.......74.....2...7........15..9.7...8.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_257() throws Exception {
        String puzzle = ".21..9.....7.1..6....8..31.......53..1..9584..7...8.......3......94..1...6..2....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_258() throws Exception {
        String puzzle = "....5..345..7..8.9.....9.....9..3.....3.....56..8......1...8...7...6.4..9.4.2.6.3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_259() throws Exception {
        String puzzle = "3....8.6...2..54.9.76...21..4...9.....7...9...1.82......93.2....6...........71...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_260() throws Exception {
        String puzzle = ".98.....7.7..8..2....3..5..2.........3..7.....65...9..........46.7..3..89...4625.";
        String solution = "598462317173985426426317589214639875839571642765824931352198764647253198981746253";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_261() throws Exception {
        String puzzle = "............863.2..912...8...........27.......14...8.7....9...3.....5.1...9324.65";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_262() throws Exception {
        String puzzle = "..1.....37....2..5.3..942.8....4....2..6..9...183.........17....7......639....5..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_263() throws Exception {
        String puzzle = ".79....1..3...56.7.....9.............8.5....251...6.4..2.8.........714.....29..35";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_264() throws Exception {
        String puzzle = ".864.....2...8.....4..7..9....5..6.......19..3.......5..3.4.71..6.....39..8..9.6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_265() throws Exception {
        String puzzle = ".....6.....3....72521.9.........7..8.98......7.....426..46.37...6.8..5...1.......";
        String solution = "479236815683514972521798634246357198198462357735189426954623781362871549817945263";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_266() throws Exception {
        String puzzle = "3......6..6..3..7.7....5....3.5.......91....4..8....21...6.........9.41..5.81.63.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_267() throws Exception {
        String puzzle = ".5.923...7........92....1.5..........354...1.6.4..53.9.....8.........27.3.8.1....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_268() throws Exception {
        String puzzle = "..........6...1..31.3782............5.29..6..98.57............6.91..6.38..4.....9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_269() throws Exception {
        String puzzle = "2..1..63...4.......5..36.....784.....8.9....71......4......5.....8..97.3..5.8.1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_270() throws Exception {
        String puzzle = "1.6.......3..4..1..87.2..5.....31.29.7....8.......43.1.........918......2...5...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_271() throws Exception {
        String puzzle = "9.1.....8..4......3...64.......3.5.7.2.5....1....9.32...28..73......59..13.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_272() throws Exception {
        String puzzle = "..........1...5..3957..8.2...1.....8.6.4.9.71....57............7...96....35.4...6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_273() throws Exception {
        String puzzle = ".....1....68.3...2...72.3...91............4...8.4.965.5.6.....3....7.8...4....76.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_274() throws Exception {
        String puzzle = ".......2...3..7........147...8......746.....3.5.4..2.9............1.4.5.1..2358.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_275() throws Exception {
        String puzzle = "31....8..9.4.......7.9...3....69..7.16..7..2.......1.9...5...1.4.72..3.......3...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_276() throws Exception {
        String puzzle = "49...2.....3...1.....716......2..6....86...1.......39.9....32.....49.....5.1..47.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_277() throws Exception {
        String puzzle = "........469.....57..8...2...........2......8..4.3917...5.........3.2..457.2.653..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_278() throws Exception {
        String puzzle = "2..7....6..7..58......16..3...4.8...1..62....9...37....5.......3......2..9.3..1.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_279() throws Exception {
        String puzzle = "..6.......289....5.....5..7........6..9.14...4....397...5.....3...8.9.5..1..7..29";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_280() throws Exception {
        String puzzle = "...3....7..1....4842.........9.....6..86..2.3.1.9.2.......96....9.17..5....2...8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_281() throws Exception {
        String puzzle = "..9....5.1..4....626....3.8.2....5..7....6...9..823.....6.1.2.......7.9......4.3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_282() throws Exception {
        String puzzle = ".......7.6.21.....341...2..5....97...1.2.8..4.8.............1.....36.4.8.5...1.6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_283() throws Exception {
        String puzzle = "....594..2...1..7...638...9..2.3.........8...6.5....2.3..49....5...2.38.........4";
        String solution = "813759462259614873476382159782536941941278635635941728368495217594127386127863594";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_284() throws Exception {
        String puzzle = "....73.2..39.............41...34...6.5.1..9..........25...974....4....7.8.2..6..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_285() throws Exception {
        String puzzle = "............53.2.8..5..24....92...15..3.....4.863......3.748....78......6......4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_286() throws Exception {
        String puzzle = "....9.....8.....5....2.59.62...........4.71.9.34.5.7........36...3.4....5.9....12";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_287() throws Exception {
        String puzzle = "....2......31.4..7.4...76....48....96.......8....6.71....3...4.9...16....5..7.9..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_288() throws Exception {
        String puzzle = ".87...129..2.4.....3..............91..3.......2.75...4..4.17.3..5..........4.97.2";
        String solution = "487635129592148673136972845675384291843291567921756384264517938759823416318469752";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_289() throws Exception {
        String puzzle = "...4.7..17..95..8.2.....5.......18..5....4.9..2..6...5.........98...6.3.1..74....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_290() throws Exception {
        String puzzle = "8.....9..5.3........69..3...1...2..3....9.82..5...719...2.........751......3...86";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_291() throws Exception {
        String puzzle = "..7......1........8365...74.1.....57.2....1.3.5...9...5...6.......1.4.......5.268";
        String solution = "297436581145798326836521974319642857624875193758319642583267419962184735471953268";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_292() throws Exception {
        String puzzle = "589..4....4....8...7......63..56...9...9.32......2......7...18.6.5...........96.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_293() throws Exception {
        String puzzle = "1..3..8....5...2419.............9..2..6..2.844...6.3.....9.7..........6..74..6..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_294() throws Exception {
        String puzzle = "...5....738...79.62...9..............629....1...34.2..5.1...7...78..........8.31.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_295() throws Exception {
        String puzzle = "..2..7.6.1..9......86..3.5....5.........3.7.6.3.6.9..4.65........8....93....1.4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_296() throws Exception {
        String puzzle = ".3........68.19.3....47..5...........9.....26.....61....7..2...9..5...1..82.34..7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_297() throws Exception {
        String puzzle = "9..7.......1..8....85.......94.2.......1...5....94573..3.6..97.....31..6......8..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_298() throws Exception {
        String puzzle = "....74.81....3..46...8......5..19.....83..6..9..5.7.....2....9..6.......149...2..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_299() throws Exception {
        String puzzle = ".....9..4.....67...57...93.....2.....98.......4......5..4.9..1.7.21..5..1....4.78";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_300() throws Exception {
        String puzzle = "..5.14....1..7......8..96..1...53..9.2.....7.9.6..1....69.2....8......9......7..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_301() throws Exception {
        String puzzle = ".7.....2......1.5.6.2.4.9..4.6......8..4.21..3...5.2....3...68....73..........74.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_302() throws Exception {
        String puzzle = ".....5....46...7.51...36....5.2...4...13......3.4.8......9.4..2.8...........279.6";
        String solution = "793845261846192735125736894958271643471369528632458179567984312289613457314527986";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_303() throws Exception {
        String puzzle = "....8.3..6.2......5.1...8.......41.....896..44.......6..7.5.2....6....9.8.4.71...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_304() throws Exception {
        String puzzle = "..1.8..........7.4...352.6.1.....5...6..3..97.5.6....1.74.........2.........46.53";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_305() throws Exception {
        String puzzle = ".9......25..4.2..6......518..69.........17..9....45.2.9...8...5..3.......1.3.9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_306() throws Exception {
        String puzzle = "......917.54....3....8.....8.......3..2.3.69....41...2....7..2.1........467..9..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_307() throws Exception {
        String puzzle = ".....4....3986........91.....6.8......4..25..25.....968..91.3...2....7.....3....8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_308() throws Exception {
        String puzzle = "9......8.....36...1.....2......487....16.2.483...7.....69.........2..67.78......4";
        String solution = "956721483824936517137854296692348751571692348348175962269417835415283679783569124";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_309() throws Exception {
        String puzzle = ".....3.9...8.....63...2..7.........2.1.8725.....5..64..5...7....2...98.3.4..8....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_310() throws Exception {
        String puzzle = ".........8....9..671..2.3.......1..5.5..3...8.6.74.2...36.5..1......3....7..1..3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_311() throws Exception {
        String puzzle = ".........6.4..17.93...6.2......9...6..6.7...22......1..9...7..1...8......8.529.3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_312() throws Exception {
        String puzzle = "...6.....93...5..1....18.6.1...6...2.....2.57.9........57.8.....1.2....34....3.8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_313() throws Exception {
        String puzzle = ".1...4..5.3...7.89.859.............16....974.4.85......4..........27........35..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_314() throws Exception {
        String puzzle = "..........7.12..3.9.....876..........58.13..2..39..7....4....2.2...3..8.6...97...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_315() throws Exception {
        String puzzle = "...3...76.8..9.....2....15..39.146....6....8...4.2........7...535.....6....45....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_316() throws Exception {
        String puzzle = "..84.9....7....85.........4..5..4.9.....5..131.......8......6......27.4.3.1.98.2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_317() throws Exception {
        String puzzle = ".......1......1..8.92.5...3..........61..39....3.2.561..4..........17.8..8.4.6..7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_318() throws Exception {
        String puzzle = "8..6..95...4.........9.4..3.7.....8...8.....1..6..24......9.6.2.43..6...9....35..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_319() throws Exception {
        String puzzle = "..5.........7.1.5..19...26...2..9...1...4.9.......38.6.8..6.5....75...1....1....9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_320() throws Exception {
        String puzzle = ".........652.8.1...3.419...........6..1...2...457..3.1.....8....2........13..675.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_321() throws Exception {
        String puzzle = "..79.31.......6...5..72...9.......32.....75..4......1..465.....8..1....59.3....6.";
        String solution = "687953124291486753534721689718645932329817546465392817146539278872164395953278461";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_322() throws Exception {
        String puzzle = "..89.....365..8..1....1....8..741.6.....5.1.7.3........4.....9.9......23..2.....5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_323() throws Exception {
        String puzzle = ".........342.15..98.9.43..6...........84.........87134.........59.7......1....27.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_324() throws Exception {
        String puzzle = "........35..83.1.28...7....4.2.96.....542.....96...3....4...8...2...1........5.6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_325() throws Exception {
        String puzzle = ".....7......3.9126.....24...5.........6.1...5.37...9.4.....5.7..9..4..18..2...3..";
        String solution = "621457893475389126389162457258694731946713285137528964814935672793246518562871349";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_326() throws Exception {
        String puzzle = ".....3......2..6....6.7..85.......3......5.192..18.4.....5.....49.....5..27.14..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_327() throws Exception {
        String puzzle = "4.6...........4....51.39...19...7..4.....27....3.45962.......2..4.......9..8..5..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_328() throws Exception {
        String puzzle = "..5....7...6..5...2...78.95........2..23.1....87.2...9.9...6..7..3....1.......8.3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_329() throws Exception {
        String puzzle = "........267.98.........157......8.....43.......62...39.........9...641..3..1.742.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_330() throws Exception {
        String puzzle = "....2.6....1.........65..9..9.7..13....594....8..3154.......48..45......2.6......";
        String solution = "358129674961478253472653891594786132123594768687231549719362485845917326236845917";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_331() throws Exception {
        String puzzle = "43............9..35.9...86.....2.3.....8.3...6...1...98..5.6.....1.4..9..7..31...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_332() throws Exception {
        String puzzle = ".1.2....4..6..1.3.7...4..8.........327.5..89.3.1......5.....7.2.6..1........3...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_333() throws Exception {
        String puzzle = ".1..9...28........5...3...6..3.4.7....4.7.......5.2..8....27.6...81.9..3.......19";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_334() throws Exception {
        String puzzle = "..6....394............3.45..8...9..6..12.3..4749..12...2.9.......8..5......1.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_335() throws Exception {
        String puzzle = "..8...2.4.2.....7...6..7.98..2.......8.96.....15..34...............8.5363.9....8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_336() throws Exception {
        String puzzle = ".........6...5..4....84.29...8.....219.........5..89.1....36.....72..1...1....825";
        String solution = "834692517629751348751843296468319752193527684275468931582136479947285163316974825";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_337() throws Exception {
        String puzzle = "...........8..479.9...76.1......1.4.5.9.4....4..5.7...........2.3....86.6...29..1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_338() throws Exception {
        String puzzle = "...6.........19.....9.83.1...8..6.7...6...4....32.78..........62......894...9..52";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_339() throws Exception {
        String puzzle = "....3........9..85.1........4.1..7.2..1.2.8.63..6.4....29...1......7......34..27.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_340() throws Exception {
        String puzzle = "...2...8.684.......5....97...1.7.5...6...2......9....41........2.574..13...8....5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_341() throws Exception {
        String puzzle = ".2....5.......912...68.......7....4.....87....1.5.6.8..32...756....324..1........";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_342() throws Exception {
        String puzzle = "3..98..2.4.6.....3.....4..........1......297..3259........651...6......4..5.7..3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_343() throws Exception {
        String puzzle = "..6..........43...5....8127.5..1...38......7..7.3.5..9..........21..9.8.4..2..6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_344() throws Exception {
        String puzzle = ".4..71........6...9..2..8....86.3.....4.......72.9...42.53..6.7........2....5.43.";
        String solution = "846971253523486179917235846198643725354127968672598314285314697431769582769852431";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_345() throws Exception {
        String puzzle = "9....645..5.......3..8....6..9.....8.......7.5.4.7..61..2.9........4....7.32.1..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_346() throws Exception {
        String puzzle = ".....4.3.2..5.7..69.6....58.....84..5.1.........36...5....4.2....87......27...3..";
        String solution = "875694132213587946946231758362158479581479623794362815159843267438726591627915384";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_347() throws Exception {
        String puzzle = "51..3.6..3.......1.6.4...7....21.....3......8..29...5.....4....4.5..2...82....94.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_348() throws Exception {
        String puzzle = "....5.....9....8....5.43..9....2.....89...6.3..46...5......1.....15.24....68...71";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_349() throws Exception {
        String puzzle = "2.31..........2..9....85.4.65.3........2..9....97....6.........7.6..4.18318......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_350() throws Exception {
        String puzzle = "..........59..241..42..63.9........58..431....3..6..7..........4....9.8....71...3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_351() throws Exception {
        String puzzle = "....1.3..87.9.........2.7.8...8.4.6.5.6..2..4....6.2.34.2.............85......9.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_352() throws Exception {
        String puzzle = "..3......2.......6..6.7.5.......9...16....7..9.7.8.6.3..2.....9.8...3...394..6..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_353() throws Exception {
        String puzzle = ".3..7......7.....256.9..1.7.9..8............8.....5..1.4....5..3.1.9....9...2473.";
        String solution = "839271465417658392562943187194782653653419278728365941246837519371596824985124736";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_354() throws Exception {
        String puzzle = "...769...........9.7...4.........538...345...1......7.8.1..6..2..943..8..43......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_355() throws Exception {
        String puzzle = ".........9.4..1...78..94.........1.2.93...6...2.....84.46..9.38...31....2.8......";
        String solution = "315827469964531827782694513857463192493182675621975384146259738579318246238746951";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_356() throws Exception {
        String puzzle = "......6....3...1...1953...46.19..2...2......9..4..7.1.....738.2.4.....5.........3";
        String solution = "472819635563742198819536724631954287728361549954287316195473862347628951286195473";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_357() throws Exception {
        String puzzle = ".46..3.8.23.....16...1.....4783..5......8.2.......7......7..93...9.42....8.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_358() throws Exception {
        String puzzle = "............2..4.54.7.9.6.1....4..3..3....1...413..96...3.....8...48.......5.67..";
        String solution = "612754893398261475457893621926148537735629184841375962563917248179482356284536719";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_359() throws Exception {
        String puzzle = "4...9.........7..923.8......1.....8385..6.2.....5...4...........759...2..2.473...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_360() throws Exception {
        String puzzle = "2..5...678.....5.9..3..........2.......78.....2..9.6.1.3.4.....7.1.....3.6..3.7.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_361() throws Exception {
        String puzzle = "8....3..7.......295.1.2...4.........7.3.....1.1..3.2...857.....1.....648...6..5..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_362() throws Exception {
        String puzzle = ".....7...1.....48....84.............81..3...93...96..5....8..5..2.4...3.6.352...1";
        String solution = "498317526157962483236845197962158374815734269374296815741683952529471638683529741";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_363() throws Exception {
        String puzzle = ".7....3......53......8...6.3..1.....8.6.47.....2.9...7..35....4....84.2.25....1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_364() throws Exception {
        String puzzle = "..81.9..2....4.9......62...7.2......3.5....78..1.......3........6.8.4..98...2..67";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_365() throws Exception {
        String puzzle = "..3......12...8.....594.2....9.81....7.....28.......5...1.....575.1..4.9.3....6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_366() throws Exception {
        String puzzle = "....64.929....1..47..2......8..4.......5.....527....41..1...73...9.........937...";
        String solution = "815764392932851674746293158683149527194572863527386941451628739379415286268937415";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_367() throws Exception {
        String puzzle = "..........369.....9..5.87.3...26......3..74..8......9..62.4...8.8..7.2..4.......1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_368() throws Exception {
        String puzzle = "39.....5.6..8....34...9..7.....7.1...2....63..8....79..3...........1682...6..7...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_369() throws Exception {
        String puzzle = "..5..9.1..97.2.....1...6..45...........74...6.3...8.7...2.........8.32...6.4...31";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_370() throws Exception {
        String puzzle = "........2.........84...15.61....5....3.7..2.4..4.....3..78.3...9.1..4.2.3..6...9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_371() throws Exception {
        String puzzle = "........3..465..9.8...92.7...6..1.4.........72....89.......4.5..7.2.6..8.....5..6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_372() throws Exception {
        String puzzle = "....9....7.92......5.3...7.5...4..6...35...2...1.7.3...9....53........8.48....7.9";
        String solution = "834197652719256843256384971528943167973561428641872395197428536365719284482635719";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_373() throws Exception {
        String puzzle = "....4.....6...894...9..1......2......2..8..73..85....16...2...953......6....752..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_374() throws Exception {
        String puzzle = ".8...9.5.2..8.3...1......7......41....13674.24.6..............13..2..9...97......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_375() throws Exception {
        String puzzle = "..65.4.1.8....37.......2..8.85....64......2..7.34........2.........7..8316......2";
        String solution = "276584319854193726319762458985327164641958237723416895538249671492671583167835942";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_376() throws Exception {
        String puzzle = "..6....5.1.....692..32..........1...3.........613...84.....68....4875........43.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_377() throws Exception {
        String puzzle = "..2.....1.....5.6....726.....19.4...3.......52.....43...6..9..2...6..7.89.7....1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_378() throws Exception {
        String puzzle = "9.5......2.1.....3.7..5.....89....1.1...6.4.....3.56.......1......598...7.62...9.";
        String solution = "935126847261487953874953126689742315153869472427315689598671234342598761716234598";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_379() throws Exception {
        String puzzle = "9.........16.2.5..37...16.4...2.3....8..7....6........4......1....91..8..6.8..3.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_380() throws Exception {
        String puzzle = "....6......54.1....7.28.....9....7....2..38.....5...63.1...64..9.......8..8.1.2.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_381() throws Exception {
        String puzzle = ".4..12.5....3....6..8..7..9......1.3317......4....9.8..7..........8......9.62.8.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_382() throws Exception {
        String puzzle = "..5....8.......931.9..4......7.........5.4..895.....2..4..25....2...61...3.8.9..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_383() throws Exception {
        String puzzle = "...........89.13...21.67..............7.1..242..3....9.1...9....5....2.77..6.8..3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_384() throws Exception {
        String puzzle = ".......1...6..39.4.4....72.....3.5..85....6..3...1............272.6...9..8..471..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_385() throws Exception {
        String puzzle = "........3.7...2...13...9..6.......7.61.32...5.93..4..8.6..5.........85.9...47....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_386() throws Exception {
        String puzzle = "..7.2....9.465.......4.3...3......917..9.6.3.........5..5...8...2..8...7..8..1.5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_387() throws Exception {
        String puzzle = ".8.7.6...467..9..........4...4.97...7.1....84.9.....2......2....29.7.......35...6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_388() throws Exception {
        String puzzle = ".....2....2..8..4......1.5......6.1.7.3.4..6.1...7.9.38..7....94.......65...9.4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_389() throws Exception {
        String puzzle = ".9..85.3...5.3.......7...9.5.1.9..6.......8....32.8....1..6...96..4.....7..8....1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_390() throws Exception {
        String puzzle = "..3...1......9..5...65...4.....6...7.48.5...6.1248....8............4....12.6.3..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_391() throws Exception {
        String puzzle = "...6..5.17.3..5......8.9..6....2....5.2......97.3.6.......5.7..1......4...8.7..63";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_392() throws Exception {
        String puzzle = "..........65.138..21....54.....86....57.....46.......3........9....3.7..9..87.3.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_393() throws Exception {
        String puzzle = "......5.9.56.9..7..7.6...3.........27.94....33...2...88..........3..8...4..359...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_394() throws Exception {
        String puzzle = "........6....7.1..6.7...594.....9.2..8.7...69.4..5......5..83.71.........6.4.5...";
        String solution = "813594276459276183627381594371649825582713469946852731295168347134927658768435912";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_395() throws Exception {
        String puzzle = "..3..9.172......54....3........4...88.....1...1.9..765...7.........5..3.15...39..";
        String solution = "543269817296817354781534629675341298829675143314982765432796581967158432158423976";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_396() throws Exception {
        String puzzle = ".1...3.7...8....243...975....5..12....493.6......2....2.........8.6......7..52...";
        String solution = "516243879798516324342897561935761248824935617167428935251384796483679152679152483";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_397() throws Exception {
        String puzzle = "8.....1..5..67.3...67.....93..7......91..62.......4.......1...8...2....7..8.4.92.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_398() throws Exception {
        String puzzle = "51..3.4..9.7............89...4........6293.......74.182.....1......5...4.35..8...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_399() throws Exception {
        String puzzle = "..1.9........53...35.67.2.....4.5.....59....79...6...2.....23.1..9.4.....7.3.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_401() throws Exception {
        String puzzle = "........3....74...2..3..47....81.9..4.2.......9...6.2...86.......694.3.5.1.....67";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_402() throws Exception {
        String puzzle = "...........9.7.46.4.3..97.5.8.94....52.7.8....4...2..7...........5...342....6..9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_403() throws Exception {
        String puzzle = ".6...5.1..8.73.9..3.7........9..3..8...........3.817...9..........62....7..3142.6";
        String solution = "962845317185732964347196582579263148814957623623481759296578431431629875758314296";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_404() throws Exception {
        String puzzle = ".....7.....326....4....5.3...4..27..2.......6.7.....13.2..8..9.1..9.......65.138.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_405() throws Exception {
        String puzzle = ".......5..6..4.....836..............15..7.96.9.....435...8.5..451.7...8...4.6...3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }


    @Test
    public void test_406() throws Exception {
        String puzzle = "..72.3.9.2.....7.....1.....4.5............369...78..41..23....556...9.3.....6....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_411() throws Exception {
        String puzzle = "....7..2......8.31..........91.8......6......5..93.78..1.....9...7..681..257....4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_412() throws Exception {
        String puzzle = "..4..59.2.......8....3......38.9...45..1....7..7..4......6.1.....5..7..37..48...6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_413() throws Exception {
        String puzzle = ".....9......2..7..875...........4..17......24.84.5...3....1.....1.....3.569.3.1.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_414() throws Exception {
        String puzzle = "4.....8..9.7.........7.8.1.7.......1......9.5.1.56..2.....3.2...6...9.7.3..2...59";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_415() throws Exception {
        String puzzle = ".......5...2148.....6..9.42.....6....5....6.7...98..1.........4.93......6...91.85";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_416() throws Exception {
        String puzzle = ".9.......6...2....2.8.....6.4..57.9.....384..3...425.......3..2.14...9.8.......7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_417() throws Exception {
        String puzzle = "..4..1...6.....95.....9.421..............58...49.....7..89......6.4..1.9.3.2.6..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_418() throws Exception {
        String puzzle = "...1....35....9.....9...4...2..9..34.5......1..3..17..3.7.4..5..9..8......65...8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_419() throws Exception {
        String puzzle = "6...1...........47.5..6..3.9..7.....735....6.....2..5.397.8...5.....94......52...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_420() throws Exception {
        String puzzle = ".....9.5........7..7.2.1..4........8.8..7....2...1...58.9.3......7.86.41..4....96";
        String solution = "148769253652843179973251684735692418481375962296418735869134527527986341314527896";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_421() throws Exception {
        String puzzle = ".........1....5...46.9..8.7.......46.8..32..5.45..93.1....8.....37..6......2..7..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_422() throws Exception {
        String puzzle = "....7.........1..8....2697..74.......36..5.4...8.1.3..........756....4....39.2.5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_423() throws Exception {
        String puzzle = ".4......55.......9.....6.....54...8.6.7..3....2.8.1.9..5.3..8.13...4..6.....25...";
        String solution = "748932615561784329932516478195467283687293154423851796256379841379148562814625937";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_424() throws Exception {
        String puzzle = "..51..........92...3..6.....81...52.........667..3..4.9.4.716...176...........3..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_425() throws Exception {
        String puzzle = ".5....2...6.4.5.....2769.1...3.......8......3475...1..8.......7.2.8..4.....6.1.3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_426() throws Exception {
        String puzzle = ".32.6.9..4.1.....55....3.64......4...83..4.....9.1..7....7....225..9....9.......6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_427() throws Exception {
        String puzzle = "58....2..3...6.....46...9.....5....4...94..6.9..7....8.9.45..3..6..9..8.4...3....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_428() throws Exception {
        String puzzle = ".7........3.1.5......2.6.57..6..4.1.....5.8..4..72..3...........819.7...7..4..1.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_429() throws Exception {
        String puzzle = ".9....6...1...8.35.48..5.....5..........32..4.82..49...............5..911.6.7..58";
        String solution = "593741682217698435648325179465917823971832564382564917759183246834256791126479358";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_430() throws Exception {
        String puzzle = "......9....6.4.....49...87....2...61...9.8.52.5..71....148.....9......2.5....6.4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_431() throws Exception {
        String puzzle = "........4.......37..973...18.........2..16.....6.4.523.....1....64..8...9.362..7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_432() throws Exception {
        String puzzle = ".......3.9..81.5.45..3.7.81...........2..3..5..158.4.7.9...........5...62.36.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_433() throws Exception {
        String puzzle = "..17..856.6....9....35.8....7.....6..1983......69...4....6..7.......4.25.2.......";
        String solution = "241793856568241937793568214872415369419836572356927148184652793937184625625379481";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_434() throws Exception {
        String puzzle = ".8.....7..1.93....42...........6.5.4....1.....364..7185.....36....1..8...42....9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_435() throws Exception {
        String puzzle = ".....17.......3..28...45.9...1....6...73....5.4..5...796........8...7..6.142....3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_436() throws Exception {
        String puzzle = "8.4..9.....5..1...3...4...5....182......5..17...6.2..9.962....1....8.6..15.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_437() throws Exception {
        String puzzle = "..5....2.6.9.2..8.2.....1......38..........4.18...237.7...4..69.927..........34..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_438() throws Exception {
        String puzzle = ".....854...76....8..3..2....62..98........47..7.......94..5.2....8..765......1.8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_439() throws Exception {
        String puzzle = "..4...53..61.........8....7.8...637......8..64.....91..75.1.....43....2....6.5..3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_440() throws Exception {
        String puzzle = "..7..2........39..36.7....2...8..4...9.3...5.4.....18984...5....1....693.2.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_441() throws Exception {
        String puzzle = "...3..5.67.6...8......4...1..5..2.6.2....4.5....9.13...7..6......82...4..29..3...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_442() throws Exception {
        String puzzle = ".6.....9.9..8.13..4.37...6.........819...24....6..5.7.......5...1.6....3..215....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_443() throws Exception {
        String puzzle = "..6...2..8.73....4.5..4...3.....8.4......1.62.8...35.9..5..6....4.7.......35....8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_444() throws Exception {
        String puzzle = "..........6.3.5...3...279..........2.742...8......976...........897..65..27..64.1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_445() throws Exception {
        String puzzle = "..5......46..21......6..2....1.6.....9.3.5.4........5......2.37..3...42884..9...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_446() throws Exception {
        String puzzle = "..8......46....9.....981..6...2...67..384...99..6.3....19.5..............3...25.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_447() throws Exception {
        String puzzle = ".418......6....2..2.89.......2..6.3..5.......6.....9.27...4.61..9..2.3..8...37...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_448() throws Exception {
        String puzzle = ".....4..6...5..91..2136...4.48..2...............9.65..91.4..83..3......54.7......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_449() throws Exception {
        String puzzle = "..........1..7.9..9.5.8......6.9...2.52...8....3.521...3...1..6.....54935.8......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_450() throws Exception {
        String puzzle = "..7..4.5.9....7.6884.9.5..1........9.1.........21.3..7.38....7.....6....49....8..";
        String solution = "127684953953217468846935721764852319319476285582193647638549172271368594495721836";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_451() throws Exception {
        String puzzle = "..8.1..3.....78..2.5......6.2..817.3..1....6.64....2...3...5...8...3......2....91";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_452() throws Exception {
        String puzzle = ".9...3.....5.....41.26.......81......3...81......697.5...73..4..1.....79.6..4...1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_453() throws Exception {
        String puzzle = ".4..82.3..5....1......37.6.8.2....1.5..316........8.....1.5....26.....433.4......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_454() throws Exception {
        String puzzle = "...........59.8...1..2.7..6...........3...492..973.8.5.....3...45......3.9.14.6.7";
        String solution = "927364158635918724184257936568492371713586492249731865871623549456879213392145687";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_455() throws Exception {
        String puzzle = "....19.2....5......942....69...4.8.7.2............63........6....7.942..5..683..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_456() throws Exception {
        String puzzle = ".724..1....8..23........4....7..6......8.1..2..1..964.2...7.....9......1....53.69";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_457() throws Exception {
        String puzzle = "2.....3..4...3....6..527.1..8..796..1.6..........5..2........8......87.1.2.7.1.5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_458() throws Exception {
        String puzzle = ".934.6.....27.....1............9.2.7...3.2..47...1..63....5....61....9.....1.874.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_459() throws Exception {
        String puzzle = "....4.9.......3..55..98..7..........97...843.....3.7.66.3..2.4....4.....1.5...2.7";
        String solution = "718546923469723815532981674324697158976158432851234796693872541287415369145369287";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_460() throws Exception {
        String puzzle = ".....3.....5.67...1...54..6.........84....72..29.4..8......1..36.....9.893..2.1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_461() throws Exception {
        String puzzle = "7..........4.2.5..92..4.3...49..........5..8..5.28.6.1.....2.......18.7...3...865";
        String solution = "731895426684123597925746318849631752162457983357289641478562139596318274213974865";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_462() throws Exception {
        String puzzle = ".5......8..9.....2....1.....769...2.8...35.46.3...6.......7.8.5.4.8..96...3.5....";
        String solution = "254397618719468352368512497476981523892735146135246789921674835547823961683159274";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_463() throws Exception {
        String puzzle = ".......189.5..7..31...6.97...8...5.....4.....4.76...8...1....9....35164....2.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_464() throws Exception {
        String puzzle = "......94186..9.37.........8.9...8...5...4....4..735....4....7....2..3.84...1....2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_465() throws Exception {
        String puzzle = "......1.4.....3.....195..62...6...7.9.5...21..72...8...8946..5...7.89............";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_466() throws Exception {
        String puzzle = "...........461...7.2.8..61..79..........239..4...86..........7.8..1...6...6.348.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_467() throws Exception {
        String puzzle = "..............795495.6....7....4....1.5....3.2...3.419..7...8...6...41..51..9....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_468() throws Exception {
        String puzzle = "781....69.......322...6.8.......87.5..2.79.1....4...........9.7..46.3.....8..4...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_469() throws Exception {
        String puzzle = ".5...6...........5..8...9...1.......5.6.2...7.741.836.....63.8..372..5....2..9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_470() throws Exception {
        String puzzle = ".43........8...7....6...241.9.....248.....5..6.5.82.9.....7........6.9..4.19...6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_471() throws Exception {
        String puzzle = "...2.3.4..5.6...7...89...35...............569..61....7.....6....93...8...8.73..52";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_472() throws Exception {
        String puzzle = ".6...8....3....9....91.67....8.....94....98...9..7...2.167.3....8..1.......48..2.";
        String solution = "765938241132547968849126735628351479457269813391874652216793584584612397973485126";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_473() throws Exception {
        String puzzle = ".........72..94..8..5....17....61.7.......1699...8......8..5..41..7....55...4.6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_474() throws Exception {
        String puzzle = ".........3.51.9.4.1..2..........1.2..3..7....5..6.3..7..9...3.......25144..7.5..2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_475() throws Exception {
        String puzzle = "9...3..5.2..94.1....1..53.838.....2..94.7...........4..4.359..7...7.....1........";
        String solution = "968137452253948176471625398385496721694271583712583649846359217539712864127864935";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_476() throws Exception {
        String puzzle = "....8...1..93....6.....4..8.91........7.....2...576...9..6...45.4...7.8..83..26..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_477() throws Exception {
        String puzzle = ".........23..5..9....9.86.3.48.6........3.15......49...21.........19.7...85..6.1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_478() throws Exception {
        String puzzle = "...4..3.59.......1.8...3..7..7.........3.8......72..83.7...2..8..9..57..12.97....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_479() throws Exception {
        String puzzle = ".4..5...........84.369...7.1...7.......5.......98.62..4......3......2.16.1.687..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_480() throws Exception {
        String puzzle = "9......2.........3....34.153.26......6.4.......9.82.....82....6.7..9...113.86....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_481() throws Exception {
        String puzzle = "......6.4.62..38....1.2..5..1..8.......4...9..9....1.62..3.1....5....46...9..2.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_482() throws Exception {
        String puzzle = "...4....8....163..24..5...6....9......15......69....81....2....3.....165..6.8..43";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_483() throws Exception {
        String puzzle = "...........5.384..71.2.......9...8.....183..64.3..2..7.3...5.2.2..34...8.....1...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_484() throws Exception {
        String puzzle = ".6..5.....98.23.171.....2........859.....57..6.2....4......13..5397........8.....";
        String solution = "263157498498623517175489236317264859984315762652978143826591374539742681741836925";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_485() throws Exception {
        String puzzle = "...........1.26..7..4.596...7..12......87..9...2..5.7.2..........7..1..66....45.3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_486() throws Exception {
        String puzzle = "....9.....981...745.1.2.6....7....9....43..5....51...7.....2...9......8.8.5....21";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_487() throws Exception {
        String puzzle = ".....8...6.57........96..52..1.....956......83.4.7.....5..1..2......3.96..8..6..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_488() throws Exception {
        String puzzle = ".2.....3...4736.9....92.8.......9..5.72......31..4...74.3.9..7.5...........48....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_489() throws Exception {
        String puzzle = ".72..3..9..1......4.....7.......8...628...1....5...26.....2..1.2..94.8....48.7.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_490() throws Exception {
        String puzzle = ".3621.4.7..8.....11......6.....42...........5.257...13..4.........129....9..3...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_491() throws Exception {
        String puzzle = "57....64....2.7.....8.....5...8.....4.5..9.8.......9.1.....4..2..739...6...7285..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_492() throws Exception {
        String puzzle = "..4.1.8.........47.3.58..1..1..3...8...9...63......95..8......92.5.68..4.....5...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_493() throws Exception {
        String puzzle = "............1.3..895..62..3..4.5.8...9.8.1....2....4.9..2..8.3..3...4.....5...2.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_494() throws Exception {
        String puzzle = "....5.......4.869.1.4.2..7......3..1..8....6.241.....7....7...9...2.....67..942..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_495() throws Exception {
        String puzzle = "..5......63712.....41....73...9.........4.3.28......1.5..2....1.2...1435.......8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_496() throws Exception {
        String puzzle = "3..6......4.8.........425....4....38....1....59...8.7..7.......9.5..3.8.86.7...54";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_497() throws Exception {
        String puzzle = "..5..2.3....1...7..26...9.......7.9.9.8...14545..........6.8..7.4.2.....8....53..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_498() throws Exception {
        String puzzle = "..6...1..4....5...1..6.9..........9.6.89..5...7...4.2...5...6.721...7..8..95....1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_499() throws Exception {
        String puzzle = ".2.......9.1....4.3...8.9.5.1...3..9...87......4.2..8..72.4.......39.12.5.....4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_500() throws Exception {
        String puzzle = ".........315..8....24..196...7.....9.6..85..4.8....3.2....7.......21......69.3.2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_501() throws Exception {
        String puzzle = "....4..2.6.....4.7.4..36.5128.........1.6.....73....82.....9.3..1..7..6...91.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_502() throws Exception {
        String puzzle = ".8.4....69....1.5....6...2...4.7.....9.5..2....31.2..7.......98....174.5.3....1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_503() throws Exception {
        String puzzle = "8.3.54..91..8...42...........87...2..7.4......3....5..9....7.86...3.1..4....49...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_504() throws Exception {
        String puzzle = "...1.....93.....8.4..8.5..1..4...9..7.....2.6.2..9........1.6..1.3....24.95..4..7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_505() throws Exception {
        String puzzle = "........4...5.73.8.5....26.176......2........5..4..716..4.5........6...9..139.5..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_506() throws Exception {
        String puzzle = "....1..7.61...75..9...3.4.6........41..9......937......6....3.5.....4...3.8.75.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_507() throws Exception {
        String puzzle = "..85.........7.5.8..2..6....6..17...1.9.4...6..7..5..3......842......1.94.6....7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_508() throws Exception {
        String puzzle = "........8.76..8....9.....6...4..2..6..1....74.8...72..1.2..3...9...4..21..8..6.3.";
        String solution = "215764398476398152893521467754132986321689574689457213162973845937845621548216739";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_509() throws Exception {
        String puzzle = "9..6...52..1......8.6.52..47.2...........3......9.7.4...9...41....48....2...95..8";
        String solution = "947638152521749683836152974792864531468513297153927846389276415675481329214395768";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_510() throws Exception {
        String puzzle = ".8..2...7....18...6...4.5......8....5.6.....3..34....2..48..2.99...5..6....1..7.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_511() throws Exception {
        String puzzle = "4....2..596.8........7.........4.3.1.45..32.......9.8.6.1....3..8....1.959...7...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_512() throws Exception {
        String puzzle = ".......8...7.1...3...7..62..82...3..7.3.8...9...4.7......6...1.96.........812.79.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_513() throws Exception {
        String puzzle = ".....69...1.8....3...2...6..2...139.4..3.9....6.4.7.........5...56....3.9387.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_514() throws Exception {
        String puzzle = ".1.7...5463...5.28......36..4.........19....5.78........7.6........52.4...5.1..8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_515() throws Exception {
        String puzzle = ".....4....5..1..76....7...43...6.8....97......8...9.23.35..........8..699.14...5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_516() throws Exception {
        String puzzle = "......8.2......3..82.41.5..2.46.....16...3........4.5.............8.9.6.3.61..498";
        String solution = "691735842745928316823416579254681937167593284938274651489367125512849763376152498";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_517() throws Exception {
        String puzzle = "64..92.....9..4..7.2..8......16....5.5..7....4...2..9.76.....48....36.1..9.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_518() throws Exception {
        String puzzle = ".....4.2.8....7.....4.3.1...7........8.7...9.43...52......9....34.81.....6.4.3.81";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_519() throws Exception {
        String puzzle = ".....4...7..9..5.11.5.7.2.8..1....374.7.......58...6.93..5..........1.72.....2...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_520() throws Exception {
        String puzzle = "..54.........7..8...1..86.9...1...2...3....6...89...1.37...4..58...39.....47....8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_521() throws Exception {
        String puzzle = "9..61.......8....45.2..........8.7...73..2..6......1.2..1.9..3.3..27.4.5.5...3...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_522() throws Exception {
        String puzzle = "...1.6.7......261.....9.....5..4..3.3..5..12...2..7..8.7.9...6.83....2......1.5..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_523() throws Exception {
        String puzzle = ".5..7.6.....6...913....157.9..7...6...2..3...8.6......79..8...2....2...7....5.1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_524() throws Exception {
        String puzzle = "7...15..3.........2.....185.5..........6...7.127...45..4.3.6.9........6..3.7.8..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_525() throws Exception {
        String puzzle = ".4.............3....8..45.9..49....2..1...84..3.4.6....6.....78....2865...2.65...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_526() throws Exception {
        String puzzle = "..7..2....3.61.....694....8....7.5..5.1....9...6.....3.2.1.....3.5.9....9..2.4.5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_527() throws Exception {
        String puzzle = "......1....9..3.8..8.9..34......67.8..1.75.....832..9.......2.....2....1.4..3.9.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_528() throws Exception {
        String puzzle = ".....5....4...68.3..218......15689..45...3.........1..1..8......39.......7.3..4.1";
        String solution = "618735249547296813392184675721568934456913728983472156164857392239641587875329461";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_529() throws Exception {
        String puzzle = ".........4.18....7...3..541.......2..3.785...1....3.....4.......13.57..69.7.4..1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_530() throws Exception {
        String puzzle = "...5......4..9.562..1.7..3.....4....1.........5.1.23.47........689..7.21....2...9";
        String solution = "892536147347891562561274938276943815134785296958162374725419683689357421413628759";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_531() throws Exception {
        String puzzle = "..2....8...4.1.96.....2.5.4....5..7.8....7....4..832.1.1......8.7.....16.....93..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_532() throws Exception {
        String puzzle = ".13...86.8....3...9.....13...4..86.2....4.......1.64.....6..3.7....97.....9..2.1.";
        String solution = "513729864846513729927864135174938652368245971295176483482651397651397248739482516";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_533() throws Exception {
        String puzzle = "..5..3...9...2.6.116..................159..7.64..32..........2..5.6..7..37..594..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_534() throws Exception {
        String puzzle = ".......7..36...8.9...9..5.6...4..6...48...7...2..7..1...354.9....4.13........74..";
        String solution = "489356172536721849712984536197435628348162795625879314273548961954613287861297453";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_535() throws Exception {
        String puzzle = "1.7...8.9....7...3...4....1.9...52.46..79........42....7...1....1.95...6.5....3..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_536() throws Exception {
        String puzzle = ".95...2..6.......9..49...6............217.9..1..86..4...1..2...3.....5...29.376..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_537() throws Exception {
        String puzzle = "......1.5.4..9...2..9327.....1..3...9...4..7..5.....2....8...1.8..9....3.9.67...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_538() throws Exception {
        String puzzle = "......8...149.6.....9.3..1......2...3.........9..1.7.5....5...3.2..98..6.56..1.48";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_539() throws Exception {
        String puzzle = ".....4....75.6..2.3..9..4....6......28..357...5......6..2........75.8..983.....54";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_540() throws Exception {
        String puzzle = ".........6..8.9..51.9.264............63....54.4...598.............3...129.8.1.5.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_541() throws Exception {
        String puzzle = "..6853..........3...8...1...314....229...........9.....4..1....1.3.2..98.6...837.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_542() throws Exception {
        String puzzle = ".9............87..148.............4..352.9...824....6....7....9...8....737.69.2.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_543() throws Exception {
        String puzzle = "5........74.8..6......6.24......3...3.94....1...1...97...3...54..1..8..6.8.....32";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_544() throws Exception {
        String puzzle = "..........8456........92..7.....3...1.24...8......85919.7..5...4..2...7...1.3.4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_545() throws Exception {
        String puzzle = ".............1429.9732.......6.8..........5..79..26..16.........21.....753986....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_546() throws Exception {
        String puzzle = ".......7......982..3.17..........5..38...7...96..51..8......6....98.....873.6.9.1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_547() throws Exception {
        String puzzle = "3...9..56.4....23.5.8.....9.....8..2............37.6...1..4.7....4.67.....69..31.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_548() throws Exception {
        String puzzle = "..........3.8...16.7..214.8...........67....33.9.5.82......3..22....8...6....71.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_549() throws Exception {
        String puzzle = "4326....1.............5..3.......8698.....4...6...5.1...4..2..3.....39...76..418.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_550() throws Exception {
        String puzzle = "....1....8..4......7...351.......9..6.71..43....7...85.6.235.7........5.93....6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_551() throws Exception {
        String puzzle = "...32.5...9..5..21.....8....86..4........614.1...9..62.......9.5...6...8..1.4...6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_552() throws Exception {
        String puzzle = ".59.3.1........8.....8...32.2.......9.....58.36...7..4.9.78...5....5..1...2..37..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_553() throws Exception {
        String puzzle = ".9.......78.3.2.....2..64......9....8....47.9..123..........9..6..7..2.4.345....1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_554() throws Exception {
        String puzzle = "........9.24.59..375.....6...........7..3.89.....657428....2........6.1..43..8...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_555() throws Exception {
        String puzzle = ".....3.4.7.8.....9.34.1.5...59...2.8.....1...3.76......9...........3.85.86.....37";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_556() throws Exception {
        String puzzle = ".....7..2..6.........168.57......3..6..78.....19..6.74.4...2..1.6..4.2....8....9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_557() throws Exception {
        String puzzle = "...6..79...2...3........6.88.6..9.4..57...18......4...9....6..3.4..1....2.1.43...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_558() throws Exception {
        String puzzle = "..7.............3642......8..4..3..27....14.9..29..87.......9..29.87......125....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_559() throws Exception {
        String puzzle = ".5..1......8...3.4....5.8...9.........7..9..3..17..9..9....2..1...5.426.6...974..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_560() throws Exception {
        String puzzle = "3...1.....75.....4..8.6.1.52....9....91...2.3..62...1..4........5...86..6...5..7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_561() throws Exception {
        String puzzle = ".27....8...6....5...89.2..45..6......9...381....58.4...6..........4.9.3..3.2..7..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_562() throws Exception {
        String puzzle = "......4..1....7.92.87.6..5..............56..4.5..42.38.....4..1.49........15..9.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_563() throws Exception {
        String puzzle = ".9..7....7...2..8....8.1...6....5.4.........3.3...4.16.8..59....14..8..9.6.1...7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_564() throws Exception {
        String puzzle = "48..2.9....2.9..45...5..1...1...34...938..6.....6...7..5..6.2.........81..9......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_565() throws Exception {
        String puzzle = ".2.......7..5.2.....8.7.4.59.2.1...8.3..6..79.4....3.....1......1...6..2....987..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_566() throws Exception {
        String puzzle = ".....45.3..23...7..3.15.....1.7....6......9......628..9.52......6..4.71.3..5.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_567() throws Exception {
        String puzzle = ".6......4..14.368.....9......26....3.....781.34.9...7...37.......7....4..54.....1";
        String solution = "869172354721453689435896127172685493596347812348921576283714965617539248954268731";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_568() throws Exception {
        String puzzle = "........8..3..1.5..78..93....6......5....3..7...2.86412.7.15....1....7.....9....6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_569() throws Exception {
        String puzzle = "...........2..4.5..9.17.4.8.......7...1...9259.5..1....3..2..........7.41.468...9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_570() throws Exception {
        String puzzle = ".9......8...8.5.....7.9..3..3..2.......4......2..36.1..14..93..3...1.9....538...4";
        String solution = "952346178463781952178529364846197235521463897739258641297615483615834729384972516";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_571() throws Exception {
        String puzzle = "....8....14........67.9..1......4.85....321...7....6329..32...8.5..6...........23";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_572() throws Exception {
        String puzzle = "....5...4.....9.......8.917..5...7.....872....214....8.....8..5..3..127.4..59....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_573() throws Exception {
        String puzzle = ".1.4....3..32..95....8.5......1...78......4.5..7...39.3.9..4.....6..3.8.25.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_574() throws Exception {
        String puzzle = ".47.....8...2.159.1................6..4..67..8...7...52..9..1....17.8.6.....13.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_575() throws Exception {
        String puzzle = ".59..2..6.7....5.9.1..........16....1.....3.79...37..4..7.......23..6.985.....4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_576() throws Exception {
        String puzzle = ".....56.2...4.7.8...4.......49..8....3.1..4....6..2....5.2....79..7..3.6...5.1.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_577() throws Exception {
        String puzzle = "....8..45.5....8...6.49..7.4.......75..73.9....39.......1....8.7..1..2.3..8.2....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_578() throws Exception {
        String puzzle = "...53......5...6.....19.5.3.....4.........1641..37.8....8....4..1......8..47..921";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_579() throws Exception {
        String puzzle = ".3126...44...19........4..6.......5..6...8.2.....563...1.9......28.....1..3...29.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_580() throws Exception {
        String puzzle = "8..............35.2.3.7....4...9...31.76.5.8..3..2..76.......64.5.8.......43.9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_581() throws Exception {
        String puzzle = "..5..94....18.6.7......35.......1..4...4..698.86.3....8......6..5......2.37.....5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_582() throws Exception {
        String puzzle = "5......6.4.85.7....26........3.5...86.....52.1.....9.72...4...67....9.....573....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_583() throws Exception {
        String puzzle = ".5....9..6...91.....175.....2..4.3...1.....9.3.6.....4.3..682........4..1653.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_584() throws Exception {
        String puzzle = "6.7...1..4..9..6.3.9..........5...2..3.....4..493.....1..4.5..93....2.6.....1..38";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_585() throws Exception {
        String puzzle = ".13....4.6..3.......5...8.1..96.5....8.23..76.3...8..5...8.6....5....4......2...3";
        String solution = "687253194421978653593164782816549327235781946749326815168435279374892561952617438";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_586() throws Exception {
        String puzzle = "..2..8...4..7.61......2.9.8...........386........54.837.......91...9.46.2....3.5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_587() throws Exception {
        String puzzle = "..........7.2.56.8..89...72.2.....6...9..6285..7..........42.....53....7.4...75..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_588() throws Exception {
        String puzzle = ".4.......3......675..9....1..679..3.1.23.........2.9.5.15....832..4.....4...3....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_589() throws Exception {
        String puzzle = "28....1..3..162......4......5...7...........3......98.6...78.317.3.....482.6.3...";
        String solution = "284735196379162458516489327158397642962854713437216985645978231793521864821643579";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_590() throws Exception {
        String puzzle = "2..4.56.1.....2.....3.7.5.8..72.9.1.85....9...9......4.2.1.............31..8....6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_591() throws Exception {
        String puzzle = "14...7.........2..7......9....3......9.4....2.3.95..1.....613...53.....1..2.3.974";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_592() throws Exception {
        String puzzle = "..8..9..32..1....6.7..8.2...46..........32...3....6.4..32..75.........615.1....2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_593() throws Exception {
        String puzzle = "...8........62...44.9..3.1........7..4.13.....61...9......6...8.95....473.8....59";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_594() throws Exception {
        String puzzle = ".4.......3..2.5.....93.4..2.26....7....58....53..........1.876....73.9.8..5.6....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_595() throws Exception {
        String puzzle = "....6..1...2...45...3.....9.9.1.....2..8.6.....12.5.9.3.....6..62..7...44.....17.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_596() throws Exception {
        String puzzle = "..3....9..9.3.5.1....9....2..2..8..61.46..5.........84....9..7.61.....5..2.....61";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_597() throws Exception {
        String puzzle = "..3..5.49..9....3165........1.9...7...6.4......7.86.53....6..9...........9..3.1.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_598() throws Exception {
        String puzzle = "...4...7....5...2..9...8.....93.2.1.72..54..6..4....9....2...3..36.8...1......7.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_599() throws Exception {
        String puzzle = ".418.5..9..9.7..58.3............26..3...6..25...5...97.....69.2.1..4......7......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_600() throws Exception {
        String puzzle = "....5.3...18...4.....1.6852.....5...8...7..1.7.6..3..9..2..8......94........2.5.8";
        String solution = "269854371518732496374196852921685734843279615756413289132568947685947123497321568";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_601() throws Exception {
        String puzzle = "............1876.....92.57....6.......2..9..5.9....8632.............4.9..6..93781";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_602() throws Exception {
        String puzzle = "....1..2...9....67.54.32...4........3.25.178....78..3....2.........58...5.8.....6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_603() throws Exception {
        String puzzle = "...........5.63..9..84...........6....2..1..75..6..483.9..3.......7...9.63..59.24";
        String solution = "346528175125263879978495566783945612462381957519677483897232566854716391637859824";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_604() throws Exception {
        String puzzle = "...6......75.4..3.8....9.4..3...2.58..2....91..9................231.6.8...83.74..";
        String solution = "394675812275841936861239547137492658542768391689513274756984123423156789918327465";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_605() throws Exception {
        String puzzle = "9....361...........36..5...8.3.5.1...6...4.7.4...2........7........129.5.41...86.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_606() throws Exception {
        String puzzle = "..9......3.1...8..587.....2...1..4...4.7.36......52..77...1..6..5...........3.251";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_607() throws Exception {
        String puzzle = ".....5....9..4.218..4.2..9.........79...61..4..6......2...8.3...7.6..8.91..59....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_608() throws Exception {
        String puzzle = ".....29....4....51.....1..2.739.4...8...7......1..38.7.5.....9.42..3......6.58...";
        String solution = "165842973284397651739561482673984125842175369591623847357416298428739516916258734";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_609() throws Exception {
        String puzzle = "4..9.3..73..7.8.91........6.8..24......6.....64...5..3.5..8..1.1.7.............45";
        String solution = "416953887325758591779512336583124669292637854649895223954386712137449968828271945";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_610() throws Exception {
        String puzzle = "..2..9.....65...1..3.216..9.8........239.86..4.1..........4..7.3..........5..32.8";
        String solution = "__2__9_____65___12_34216__9_8________239_86414_1______2___4__7_3_________45__32_8";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_611() throws Exception {
        String puzzle = "........5....793.64.....9.7.........21.6.8...85.4..1.2..........9..37...7..51.8.4";
        String solution = "971344225525279346466365987949721558213658479856493162682944753694837521732516894";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_612() throws Exception {
        String puzzle = ".9......8..34..52..81.5.....1...5....2.9...47....7...2....6.7.5...58.3..7....9...";
        String solution = "_9______8673498521_81_5_____17__5____2_9___47____7__52____6_7_5___5873__75___92__";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_613() throws Exception {
        String puzzle = ".....4....79....6..2..6.415..5.2....7.6.53..9..2.7...1.67.8...2......85..........";
        String solution = "651834927479_1_368_2__6_415__5_2____7_6_532_9__2_7_5_1_67_8_1_2______85__________";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_614() throws Exception {
        String puzzle = ".63....5....8....1.5...6..9..6.9.1.7..91..4......72....75.....4...24...5......96.";
        String solution = "_63____5____8__6_1_5___6__95_6_9_1_77_91__4______7259__75_____46__24___5___5_796_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_615() throws Exception {
        String puzzle = ".............98.2.....51.3......4..9.5.9.....2.87....5..14..3...64.7..52..5...8.4";
        String solution = "539247966747698526622651936117524789456986713298713645881425397364879152775136874";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_616() throws Exception {
        String puzzle = "9.632..1......625...5.7.....3......7..9.5.1....7863...5.3....6.....1.......5.7...";
        String solution = "9_632571_71___6253325_7_6__63____587__975_136157863___573____61_9_61_375_61537___";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_617() throws Exception {
        String puzzle = ".........4.......3.51..462...........4.5...16.23716.94..........6..23..1..5..98..";
        String solution = "6_______54_______3351__462_516__2____4_538216823716594__________6__23_51__5__98__";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_618() throws Exception {
        String puzzle = "3.....4...1.8.9...78...........74.......3..16.23.9.7....73....8........1.58.2..64";
        String solution = "365712489412859637789263152591574223574238916623196745247311598936485271158927364";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_619() throws Exception {
        String puzzle = ".....5..2.3.7....45..962.81......8.5.93.8......1....3........43......1.....3549..";
        String solution = "189435772232718664577962381477293825693587427851247239925171543344676166716354928";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_620() throws Exception {
        String puzzle = ".8...3.4..35.94...9..6.8..51.....2...2..8..54.7...6...................3.3.25..9.8";
        String solution = "_86_53_49_35_946__9__6_83_51____52__62__8__5457___68__________________3_3_254_9_8";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_621() throws Exception {
        String puzzle = "....1.3.......6.74.53....8.56.......7.4...138.1.......6...7..5..4..6..2..2..45...";
        String solution = "276814395189536274453729681562183947794652138318497562631278459845961723927345816";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_622() throws Exception {
        String puzzle = "...6.97....9.72.5....8...9.6..78.4.........7.1...23....2..........5...613.6..75..";
        String solution = "___6_97____9372_5____8___9_6__78_4_________7_1___23_8__2_____37___53_2613_62_754_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_623() throws Exception {
        String puzzle = ".5...7.1....2.9....148...7...3.......2.5....8.4.378...5......9.....82..71..4....6";
        String solution = "_5_647_1____219____148___7___3_2_____215____8_45378___5__7___9_4___82__71__4____6";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_624() throws Exception {
        String puzzle = ".............37.95...69.2.7.........2...59.7.3..26.54.....42.....8....3...9.7.42.";
        String solution = "____2_3_4_42_37_95___6942_7__4783__22__459_733_726154_____42_5_428_1_73___9_7_42_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_625() throws Exception {
        String puzzle = "..9...........5628.....15..82..4.........3.......1.456.5.12..6...7..4..2.8..7.9..";
        String solution = "5_9________1__56282_8__15__82__4____4____328___3_1_456_5412__6___7__4__2182376945";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_626() throws Exception {
        String puzzle = "..3.2.1...6......2.2.61........31.4.........6.5.....3...89.....6.52....137...865.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_627() throws Exception {
        String puzzle = ".7.9..5........2.8...768..3.........5...9.12..21.8....3.........5..29...4..815.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_628() throws Exception {
        String puzzle = "51.....433...5...........8.7...........4...292.318..65.........49.2..3...71.9...6";
        String solution = "518972643364851972927643581789526134156437829243189765632715498495268317871394256";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_629() throws Exception {
        String puzzle = "..........8..3..9..7....8534.......6.5.1..4.....74..3.1..48...95.9..3..1...6.1...";
        String solution = "395822767681536292274966853428359716853168427922746535167485329549273681828691347";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_630() throws Exception {
        String puzzle = ".........4..67...5..2..3.......1..2...6..8..97..3..1...1...9..8247.....3.387...4.";
        String solution = "871594362493672815562183497384917526156248739729356184615439278247861953938725641";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_631() throws Exception {
        String puzzle = "8.1.....2......5...2...147..6.57.1..21.9.3...........53...9...8...2..36...2.4....";
        String solution = "841755632733767581526851479963572133215983746933116735357695218559255364682348957";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_632() throws Exception {
        String puzzle = "...7.....7.52...9..12..4......3...87...5..1...2.14...5.4..6.3.91....5...9.......1";
        String solution = "469753218735218694812694573591326487374589126628147935247861359186935742953472861";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_633() throws Exception {
        String puzzle = ".56.....4.4...1.6....8.....7...9..58.....8..3....5.2.9.........569....27.874....5";
        String solution = "156929884348571362972846591723694158495218773811357279434725986569183427287469915";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_634() throws Exception {
        String puzzle = "....7..3.8....5.7....83.92.7.....4..4..6......2...97..13..6.....4....5...87..32..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_635() throws Exception {
        String puzzle = "42.....161....3.....84....7..........9.51.....6....1....5.6.8.9......67.71...45.3";
        String solution = "423758916179623455658491237841376255897512384867949198235167849984235671716984523";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_636() throws Exception {
        String puzzle = "18.....4..3.4.6.....2.7........5.....73...2.5.283....6......4.......9.5....2.4973";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_637() throws Exception {
        String puzzle = "......4...53.........7.1.8.....72.6....36...5.2....934.....4..758.2....19.2..7...";
        String solution = "278653419153948672469721583395472168814369725726815934631584297587296341942137856";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_638() throws Exception {
        String puzzle = ".7.......6..5.2......874.1..5.1.......72.3.5...9....24.2..6..7.3...1...8.1.....3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_639() throws Exception {
        String puzzle = "54.9.86...7...........6.4...61....58........24.8.23.......8......56.2...8..1.5.6.";
        String solution = "542938617176354283983367435261749358357816942498523176637489521735672894839195769";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_640() throws Exception {
        String puzzle = "9.1..5.3....4.6.81.6......943....8....2.14......2......15...74...38...........39.";
        String solution = "921785437377496581864133579436579812582314957159288654815923746693847125744651398";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_641() throws Exception {
        String puzzle = "...........9...3.7.4813.6...8....4.6.24.7....1.7..3.8..1...8...........5.364.9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_642() throws Exception {
        String puzzle = ".4...8...2.5....7..8..2......93....7..36...51..1.4.6.3...9...........92...273...6";
        String solution = "946598112295466178387527569629381447773699851851245693168952734774816925552734886";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_643() throws Exception {
        String puzzle = "........87.6..2.....3...1429...8..64....26.9.4..59....6....7.5..5....82......4...";
        String solution = "241935678786142939593678142932781364377426393467593783632817459154369827377854316";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_644() throws Exception {
        String puzzle = ".......58...7.....8...923............3.26...7.1.8392....9.7...5..1.53.2...4...9..";
        String solution = "297341758163785692845692371266517839938264517515839266329476165781953726554126973";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_645() throws Exception {
        String puzzle = ".............7...4...946578......4.6..75.....6841.......2.5.6....9..8..1.76....4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_646() throws Exception {
        String puzzle = ".7....54.14...........15..8..4..7..3.....4.15..26.1.......9.3....7....2.6.957....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_647() throws Exception {
        String puzzle = ".4......88.6..5...7.......5...1..5..9.....61.46...72.35..98....2....6.....4....91";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_648() throws Exception {
        String puzzle = "6.......797.25..1..48.9...2...76....21........8..45.......79...42....3.....5...8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_649() throws Exception {
        String puzzle = ".2...8..4.6...9.2...1.73....92.1.8..7..8......8..6..1.8....52........4...34..1...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_650() throws Exception {
        String puzzle = "...71..8..5.....3.79...8.1.....5....36...78..4...2..5.........51..54...3..41.2...";
        String solution = "243715986851964732796238514912853467365497821478621359627389145189546273534172698";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_651() throws Exception {
        String puzzle = "....1...4....243687.......1...5.......3..897.....73.85.96..........9..1623.......";
        String solution = "362815754515724368744835221872569143653148972949273685596482537585397516237686449";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_652() throws Exception {
        String puzzle = ".56.....198.......3....7.6..........46..23.......9.35..9.8......153.2.7..3.74....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_653() throws Exception {
        String puzzle = "1........4...73..1......456....9.......4876...4...2..53.....5...61..9.4..9.5...8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_654() throws Exception {
        String puzzle = "........1286..4...3...9.52.......8...483....79...8.26..6.1...7.......4.5..94.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_655() throws Exception {
        String puzzle = "..........21.79..4.....3821.........6..45...3.3...85..........6...1..43..46..2.79";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_656() throws Exception {
        String puzzle = ".....6.8.95....6...2.75.4......8........2.356.9.3.5...1....4....8..3.....326....8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_657() throws Exception {
        String puzzle = "...............85..735..........2.6...2.7..91..89.45.7........4.67.5.2..2...96.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_658() throws Exception {
        String puzzle = "..9........2.5693...3..95.6........4...8..67.3.....85..6.1.....4...2...8.8.7.3...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_659() throws Exception {
        String puzzle = ".98....7.......1...546....9..9847....6........4...6.13........5...5..7.2.8..7.34.";
        String solution = "198325674623794158754681239319847526265139487847256913972413865431568792586972341";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_660() throws Exception {
        String puzzle = ".....9..53.4.........1..93.26...............91.8..674.5....83....7.1..92....4.56.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_661() throws Exception {
        String puzzle = ".....3......7...4.7...1..3.....8179.9..42.1....7..6.....3...21...8...4..51...8..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_662() throws Exception {
        String puzzle = "....4..8...62.....54......2.....8.6..15.6...4..2.7..5...4..7..3.2......1.3.15...7";
        String solution = "291745386386291475547386912473518269815962734962473158154827693728639541639154827";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_663() throws Exception {
        String puzzle = "..2.3.....1.......6.8.179.2.7.........67.42...23....4.......7..9.7....64...9.81..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_664() throws Exception {
        String puzzle = "...........78..356.8.6.3.29..........5...2......3..587..9....6...1...7.3.6..54..2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_665() throws Exception {
        String puzzle = ".......38..4.......6234.....9......6..7..5.4.2.3..6..5..68.47...85..32......7....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_666() throws Exception {
        String puzzle = ".6...3......51....4...8...3.3....95...8.6...7...75...1..1...3...5.8...1...2...574";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_667() throws Exception {
        String puzzle = "....5......5..4.2..7.....31.1..........4.92.....23.6.4.........13..45.89.49..1..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_668() throws Exception {
        String puzzle = "8.........47.....99.......1.....18...5..947.....6.731...41.6......7..4.3..5..3..6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_669() throws Exception {
        String puzzle = "...........35....8128..93...........6.1...9...94..5683........9..7.982..4..36....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_670() throws Exception {
        String puzzle = ".........9...12.8..6...8..4.........1....9.766..5..3.8....4...757.2.....3.6.7..59";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_671() throws Exception {
        String puzzle = "...1.........5.96....3..147..65....2519..........7..1..3..26...9..814.5..8.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_672() throws Exception {
        String puzzle = "......8.6.7.............532..9..8.....59..3...3..4..9....8.6.25.2.193.8.6..5.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_673() throws Exception {
        String puzzle = ".....2....3..1.2.48.46.5.9...6........71..5.8...3.49....1..........5.....5..4.871";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_674() throws Exception {
        String puzzle = ".1........3.....7.....9.2.6....2...7.67.1..42...6.59...8.....6.1.48.....6..2.3..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_675() throws Exception {
        String puzzle = ".......8..7.....6..4..63.579......4.......1....158....4..37...515...6....9.8.16..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_676() throws Exception {
        String puzzle = "......9...1...35.2..9.2..17.61.........35..4...76....56..7.5.......3812......9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_677() throws Exception {
        String puzzle = "8......3...7..2.5...5.4.28...2......96...1...4...7...3..65.......4.9......96.3.25";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_678() throws Exception {
        String puzzle = ".87.2..16.5....7......9.....65.........6..9.4.9...2.83.......47..3..8..15...1..3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_679() throws Exception {
        String puzzle = "..1.........3..19...529..64.....4......53.48.7.......9.3.4....6..8..6..5..7.1...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_680() throws Exception {
        String puzzle = "5.3.8..9.8..74...6...32...198.1......7.45..28......3...47..........6....6..8.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_681() throws Exception {
        String puzzle = "568.......7.8...9..2..7.1...........6...1.8.248.3.2.....7..4..3......7.93.19.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_682() throws Exception {
        String puzzle = ".1......4.......6.3.5.1..7..8.9....3....85..69..1....5.56....2.4....1.....3..748.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_683() throws Exception {
        String puzzle = "4....1..9.8...2..7..78..............39...74.1..81...32.5...8.....6........2794.1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_684() throws Exception {
        String puzzle = ".....8.9...41..3..5.2.6................381.5......5.787........68.9.74..9.5.16...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_685() throws Exception {
        String puzzle = "..7......3...1.4...865...23.....3..8.7..8..4......1.76....95.....1..6.5.....3.76.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_686() throws Exception {
        String puzzle = ".4..1..68......594.8..59.....7..3.8.3.4..6......1......5.8..7.3.........8...32..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_687() throws Exception {
        String puzzle = ".....34...7..9....5..12..78........6.59....1....3.295..6........412...6...39.5...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_688() throws Exception {
        String puzzle = "....9...81......7.....672....67....14..3...2.27...6.....5..21.3.4...8....6..3...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_689() throws Exception {
        String puzzle = ".8.........73..8141.3..6.2.........8.3.....51..4...2.3.9.73............27..8.16..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_690() throws Exception {
        String puzzle = "...6......1....8.76.8.1.......7..62.....5.4......349781...9...2..53.......75...3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_691() throws Exception {
        String puzzle = ".23..4..............983..4....7...815...8.4...8...6......2...1.15......9.923..5.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_692() throws Exception {
        String puzzle = ".....2....1....7..627.4.........9.........8.17...18695...1....6..2....495.3.24...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_693() throws Exception {
        String puzzle = ".........7.4..5.6..862....3........7....3.9.6.6..1..3......1......84...9893..6.15";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_694() throws Exception {
        String puzzle = "..........654.....7..5.6.1...9...1..54..7..9..87...5.3.......2.2...1.3..8.67..9..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_695() throws Exception {
        String puzzle = ".....9.........1..6.2.8.39.7...1.....46.7...11...56.3.......5..39.2..8...741.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_696() throws Exception {
        String puzzle = ".7..6.2...4...5..3.5.18..4.....5.7.6..1.79..2.......1.3...1.8.78...3.........6...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_697() throws Exception {
        String puzzle = "...1......7...8.2.13...59...17.....4...7..6..362.....7.2..4.....9...18.....96...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_698() throws Exception {
        String puzzle = "...........2..36.5.73.6.2...1..3..5....6.794....4..8..1....85...........8.4.92.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_699() throws Exception {
        String puzzle = ".8..57..........6..2.3..7.416..............8.7..9.461.69.5......3.....4...5.38..6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_700() throws Exception {
        String puzzle = "..............265.1..865.27.........9..658...86...3..9.....7....483....15....92..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_701() throws Exception {
        String puzzle = ".........4..5.1..998.7.6.1...........94..8.....3...185.....3......9..2..3.81549..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_702() throws Exception {
        String puzzle = "..8..93.1...8....7.9..15.......4...66.5....2.24..7..1......7......26...88.1...6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_703() throws Exception {
        String puzzle = "6..1......137.2...2...4..8..76.3...5.....9...3...1...8..24.....9.1.7.3...4......9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_704() throws Exception {
        String puzzle = "9....8..4....1.26..36......5..94.6...7.2............52.98..1..6...8.471.....5....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_705() throws Exception {
        String puzzle = ".......1...8.....5......894.2..6....5..49...7....713...5...9...892..5...73..4..2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_706() throws Exception {
        String puzzle = "........6.96..482..3...........86...172..9.....37........47....5...9...2.612..5.7";
        String solution = "814923756796154823235867914459386271172549638683712495328475169547691382961238547";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_707() throws Exception {
        String puzzle = "..36.....2.........9........5...3..99..4...5748..65.3...1....2.7..3....554...2..1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_708() throws Exception {
        String puzzle = "..9..7.6......98...2....4....3......96.1.4....8.2....5....4.9.2..19...462..3...7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_709() throws Exception {
        String puzzle = ".........8.2.....3.153.9...3.........2..8.6.79765.....6.3...1.....8..2.4.4....5.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_710() throws Exception {
        String puzzle = ".......6.....845....5...4..1...7.....27.....6.94.....254...9.1..79..52...3.4...7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_711() throws Exception {
        String puzzle = "32..6..1....1.......1...8721.2..9..89...7....7.....3..........4..6..1....75..498.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_712() throws Exception {
        String puzzle = ".......2452....9....4...57..4.7...6..1..9..4......3..7...9.....36..2...8.8..1.7.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_713() throws Exception {
        String puzzle = "..7......4.5.6.....1...9.357...........62..191.49..3.......74......1...2..8452...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_714() throws Exception {
        String puzzle = "8..5.....45...3..1....4......361..79.....25...8.7..61.61.4...9..3..2......9..6...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_715() throws Exception {
        String puzzle = "..7.......8.7...51...82...4.........73.5..6...124...891...35..8..89.......3.4.1..";
        String solution = "947351826286794351351826974895162743734589612612473589179235468468917235523648197";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_716() throws Exception {
        String puzzle = "............8.1...18.927.6........73263...1...5..9............28.7.5.63.34.7....9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_717() throws Exception {
        String puzzle = "2..9..1....6..45..7...52.46...6....383...1.65.......7...4.78...5.14......8.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_718() throws Exception {
        String puzzle = "3.8.............921...673...4.9......9..31724..372..6.....1..486......3.........6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_719() throws Exception {
        String puzzle = "....5...7.49.3..8..5.4..2..8.........367....1..26...7..6...1.281..2...56........9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_720() throws Exception {
        String puzzle = "..12....8.8.51..4......3.5.........34.57....1..3...52.....7.....1...2.7.9.78..43.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_721() throws Exception {
        String puzzle = ".....8..64..9.2.....1.74.....2....3...4..7.25..7.5.4.9...1.....6....9.51.3...5..4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_722() throws Exception {
        String puzzle = "...3.....8...2.54.9517...8...2..6.5......2..91....7.2..1......6.3...8.....6...498";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_723() throws Exception {
        String puzzle = "..7.2....3..514..7.5......2.........7...38.59695..1....21......4....5.8..7....4.3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_724() throws Exception {
        String puzzle = ".3............946...7135........1..6.8637..4......8.....5...7...29.1...5..45..39.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_725() throws Exception {
        String puzzle = ".......1....69..38......6.9.8..1.3....7..6.9...9..3864...3..........1.879...645..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_726() throws Exception {
        String puzzle = "..8.25.1..2......3.47..35...15..9...9..3.....38..1..4......4....5.79.8....26.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_727() throws Exception {
        String puzzle = ".1.......9.....5.3.5.12.79.4....8.6...69..1.8.7.3...2....48...7..5.3.4.......5...";
        String solution = "617593842942867513358124796429718365536942178871356924293481657765239481184675239";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_728() throws Exception {
        String puzzle = "..2....1.4.8.1...6.7.....4....9..4.7746........9....8.5..3.2...8.4......6..4.957.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_729() throws Exception {
        String puzzle = "...4.81.2.8..9....45..32........7.....7..128..3...94..7.....6..59....87.......9.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_730() throws Exception {
        String puzzle = "....2......2..5.93154.38....8.......4.9...6.2..5......5.....13..4...3.6.7....42.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_731() throws Exception {
        String puzzle = ".............7.3.9.38..965..2.5...9..5...2..68..71..2..1..........1..73.7.465....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_732() throws Exception {
        String puzzle = "....3...8..16...5.6.89.51..1........32..7...6.7..68.........2.....4.69......1756.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_733() throws Exception {
        String puzzle = ".2..543...98.....7..4.9...66.9.2...8..38.....2..9.3..5....35......27.......4....2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_734() throws Exception {
        String puzzle = "............2.7..1.67..32.4........8..475..9..85.1.4....1..49..83...........8531.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_735() throws Exception {
        String puzzle = "......6..8..9.1..3..123..............39...5...57.19.46....62....2.5.836...8.....5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_736() throws Exception {
        String puzzle = "..1....25.........94.3..87...3.265...2...5..4....3..1.3.97..6..4...9........6..93";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_737() throws Exception {
        String puzzle = ".......3..764......3..297.............196..4.8.3.17...5.7..1..3684.....5...8....2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_738() throws Exception {
        String puzzle = "...43.6...9.........7.1..93...3......5..219...216....58.....2.9..6....8...2.4..56";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_739() throws Exception {
        String puzzle = "....39..2.17.8.......6.75....4......8......5...589.1....2....49.4..238..3.1..4...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_740() throws Exception {
        String puzzle = ".4......8.....6...2.784.6.37.81..26....7...3...9.3.....5..........3..1253...21...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_741() throws Exception {
        String puzzle = "..7..........8.56.5.8.67........3.8..7.92.....2.746..5..9....46.4...1.....26..1..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_742() throws Exception {
        String puzzle = ".6......8....4....83...79....2..1...9...3..7.6..5.2..1..6..3....8.2..1.3.5...94.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_743() throws Exception {
        String puzzle = ".....5......72.1.3...8.1.....1..6...73..5.96.....1.52...8..2....5...4.3..7.58...4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_744() throws Exception {
        String puzzle = ".2.....1..3....7.21..9.7........42...4.3...5.38.7.9.6..6...1.2.8.......1..5..6..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_745() throws Exception {
        String puzzle = "..4..1....2..76..4..7.9...2......2...1.36.........45.1.3.1.....1.29.3..7.....73.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_746() throws Exception {
        String puzzle = "2.78..4..6.......7.4.....8..5...9.32......9...3.28......4..56.....4..57.3..6.1..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_747() throws Exception {
        String puzzle = "5...4.......8..2....2..584...96..4......5.......12495...8.6....1..4.7.2..63..9...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_748() throws Exception {
        String puzzle = "........1..56..42....15..63.3.......4...72....968.......42....7..1.6...56794.....";
        String solution = "_63_24__1__56__42__4_15__63_3___6___4_8_72__6_968_______42__6_7_21_6__456794_5___";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_749() throws Exception {
        String puzzle = "..3..6..25...217..8.1.3..................592.6.5.8.34.....9......7..35...4.5.7..1";
        String solution = "__3_56__25___217__82173__________________592_6_5_8_347_5__98_____7__35___4_567__1";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_750() throws Exception {
        String puzzle = "1.....98.6...8..1..25....6...64.2.....9...63...876..9.........3....541.....2.8..9";
        String solution = "137526984694387215825149367316492578479815632258763491942671853783954126561238749";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_751() throws Exception {
        String puzzle = ".........4.738........52.4.....745.....53.28..6..9..7...84..7.17.3.....6..6....9.";
        String solution = "____4____4_738_6______52_4____17456__7_53628__6_29817___846_7_17_3_____6__6____9_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_752() throws Exception {
        String puzzle = "..1........397..85.9...8.23.....7...932....7...4.9.81...5.8....76....4.....4...6.";
        String solution = "851________397__85_97__8_23186__7___9328__57_574_9_81___5786___76____45____4___6_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_753() throws Exception {
        String puzzle = ".78....9..1..7.5....59.31.....1.....29....3.1...4.2..97.9.....6....2..5..5...6..2";
        String solution = "3782__6949126745____5983127___1__2_529____3_15_14_2__9729_____6____2__5__5___6__2";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_754() throws Exception {
        String puzzle = ".........96...41.8543..............6.8...9.537.5.8.9....7..348..54..2.......48...";
        String solution = "178______962__41_85438___________8_6_8___9_537_5_8_9____7__348_854__2_______48___";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_755() throws Exception {
        String puzzle = "..9....4.2...3.17.8.......2........6..2.53..83.6.917.....14....6...853....1.....7";
        String solution = "__9___8432___3_17_8_______2_______36__26539183_6_917_4___14____6___853_1__13__4_7";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_756() throws Exception {
        String puzzle = "........1.2.16.3.7....386....9..3...1...492...627..4........1....48....5.7.....46";
        String solution = "________1_2_16_3_7____386_4__9__3__81___492_336278_4_9______1_2__48____5_7_____46";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_757() throws Exception {
        String puzzle = "..3......9.....3..485..37..2....1....648.....3...27.8.....1..7....7.46..8....693.";
        String solution = "__3______9_____3__485__37__2_8__1____648_____3___27_8_____1__7____7_46__8__25693_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_758() throws Exception {
        String puzzle = "25...1........8.6...3...4.1..48.6.9...9.4.8...1..29.4.9.53.7....6..5...7.........";
        String solution = "25_4_1________8_6___3__54_1__48_6_9___9_438___1__29_4_9_53_7____6__5___7_________";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_759() throws Exception {
        String puzzle = ".9.....8.3..5....128.4.....51..6......4.....99.23..7..1..87.2.....9.485......3...";
        String solution = "_9_____8_3__5____128_4_____51__69_____4_____996234_71_1__87_2___2_91485______3___";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_760() throws Exception {
        String puzzle = "..2.19.3.8......1...18....9.....1.76..4....81...67.2........5..9...2..484....89..";
        String solution = "__2_198348__4___12_418_2_59___381476__4295381___674295___94_5__9___2_1484__1_89__";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_761() throws Exception {
        String puzzle = ".584.3....4.....5......8........6..99..54.3..4.7.2.5...7.6....1.....2.4.5.1.8..9.";
        String solution = "_584_39___4_____5_____58__4__5__64_99__54_3__4_7_2_5___74695__1_____2_455_1_84_9_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_762() throws Exception {
        String puzzle = ".....9.....7.86...6..3......4...7..8.......32..36.51...6.7...8.3.2...49..548....3";
        String solution = "435179826917286354628354971241937568596418732873625149169743285382561497754892613";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_763() throws Exception {
        String puzzle = "...........7.8...5......893.....1.5....3..9.64.6..5.87....7.....2...85..7.4.396.8";
        String solution = "______7____7_8___5___7__893_7_861_5____3479_64_6__5_87____7__3__2__1857_7_4_396_8";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_764() throws Exception {
        String puzzle = "74...5...5.1.4.9.6.9.............1.....4.268...87...42..2.....3...62.7..98...3...";
        String solution = "74___5___521_4_9_689____4__2_4___1____94_268___87___42__2_____3__562_7__987__3264";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_765() throws Exception {
        String puzzle = "9....1.8..6..381...1.6......9...68.2..2.....3.3..7..6.75.........9.17.34....8....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_766() throws Exception {
        String puzzle = "..8....12....19..59..4..8.6.42.37....915....7..........8....7.....398.2.1.6......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_767() throws Exception {
        String puzzle = "....4...3...9...8...43...196....9..7..81.......37..15..4.......1.6..35..7.5...23.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_768() throws Exception {
        String puzzle = "..5.......34....1.816.35....7..8.......9.324.2......5........81.....1..33....6592";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_769() throws Exception {
        String puzzle = "...........1..6..873......1....2...33..9.5.27.72.4.8...2........8.1..39..47.92...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_770() throws Exception {
        String puzzle = "........9...7.46..9.4..15.2..3...8..8.6....2....16.9......5.......8.9....3..76198";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_771() throws Exception {
        String puzzle = "..1...2.73..7.541........3......7.........9.2.2.4.6381..9.......1...48.3...1.8.4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_772() throws Exception {
        String puzzle = "26..1...8.1...3.2...4.2..5....9.4.7..3........98...2.1............4.6.17.4.1..3.5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_773() throws Exception {
        String puzzle = "..1.2...5945..1........9....74...2.1...5.....2...4..6..9....64...7.6.3...2.93..1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_774() throws Exception {
        String puzzle = ".....9.........84.4.8..21.5..4.1..8..86...7.....6......3..76.1.76.53..9....82....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_775() throws Exception {
        String puzzle = "..............9.32.52.47..6...........9.2..6..6..78.25.....3....94.....8.2159..43";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_776() throws Exception {
        String puzzle = "......2....3..514....9....6...2.1..4....93.2.5..4.8...654..2..9..9...37.3..8.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_777() throws Exception {
        String puzzle = ".18.4....5.2..7..8......24.............1.938..36...5.....4.1....745.6.......9271.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_778() throws Exception {
        String puzzle = "..8.426......6.....4.8.75...6......1....5.27..7....8...876.9..5.932.....4.......9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_779() throws Exception {
        String puzzle = "61..........8.9.......5.......9..7....3....164..1...35.3..1...2.25..8..1.4.27.5.3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_780() throws Exception {
        String puzzle = "...6.....4...8...77......26..........7..46.3.8.1.7..54..8..51...5.....831....357.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_781() throws Exception {
        String puzzle = ".........3546.....69....5.4....4......6..17.3.4.85.1.9...........9.7...64.1.2.39.";
        String solution = "127435968354689271698712534912347685586291743743856129875963412239174856461528397";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_782() throws Exception {
        String puzzle = ".1...8..44.....8.6...3.4...1.67..3.93.2....5......2.......17...5.92.31.....4...6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_783() throws Exception {
        String puzzle = "..1.....23....54...5.2...8....49..1....5....4.....17.8...8..265594..6.71.........";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_784() throws Exception {
        String puzzle = "....82.6.827........1..4...3...9.71..1.5..63.9......8.2.3...45....2.3....8..7....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_785() throws Exception {
        String puzzle = "2.....6...57.....8.4....239...91.......5....6..3..7.1.47..68.9...9...8...6.1....7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_786() throws Exception {
        String puzzle = "..3.58...17.........2..7.9...9..........3594.3....91.2.2.....5.94.....638...16...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_787() throws Exception {
        String puzzle = ".284.1....4...698...5.89.....1..23...8....6......3..9.........1.....3.7..6.7.84.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_788() throws Exception {
        String puzzle = ".3.8.7....68.1...951...28.........5.2......6..95..3.....1.79..2.....6..3.2...14..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_789() throws Exception {
        String puzzle = ".........1..4.8..7...67......9...7.3.5..9...8....43....96.31..4.45.8...9.7....38.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_790() throws Exception {
        String puzzle = "..........13..9.2.28..76..1...........7.9.53..6.783..2......1..........37516..8.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_791() throws Exception {
        String puzzle = "....5.....5....746...6...85.2.1.6.5...74..1.8..8....2.9.......4.1.7..8..7..83....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_792() throws Exception {
        String puzzle = "...7.........6.5...873.1.4..93.1.7...6.....218..5..3.4.7.4..6.8.........9...5..7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_793() throws Exception {
        String puzzle = "..59.1.8..7.6....46......3.24.....1..5...4....63.....2...8.7.43......9..3....98.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_794() throws Exception {
        String puzzle = ".3...5...9.72.3..1...79..........5....3..61..6...518.72.536....3....8.....4....9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_795() throws Exception {
        String puzzle = ".8.1...543...97.8..7.8....6.5.7.4.....3....4..2...........85.3....4.....61897....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_796() throws Exception {
        String puzzle = ".312....8..5..16..8....3.......3..91.....72847........1.....4....46..9.2..2....16";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_797() throws Exception {
        String puzzle = "2..17......7.8...46..................46...397.3.4.7..1...3......617.8.29....2.1.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_798() throws Exception {
        String puzzle = "..6.....227..39.6.9.5...3.7.6..........1.5.......92.513..9.8......4..8..1...27...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_799() throws Exception {
        String puzzle = ".134.25.....9..7.247.................61..8...8..2.5.16........15.68.4.2....65....";
        String solution = "913472568658931742472586139295163874361748295847295316784329651536814927129657483";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_800() throws Exception {
        String puzzle = "..7.......436.2..9....3.8.............5...69.216.4.35..........5..81.4.38.1...92.";
        String solution = "687195234143682579952734816798356142435271698216948357364529781529817463871463925";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_801() throws Exception {
        String puzzle = "2....8......5..3.9..6237......18.7.3.5..4....1.....4..6.7.1......13....6..5..6.8.";
        String solution = "687195234143682579952734816798356142435271698216948357364529781529817463871463925";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_802() throws Exception {
        String puzzle = "...29.7.........451....423.....1...65..97....8.143.....1....8...94...6.12......7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_803() throws Exception {
        String puzzle = "..........9.174...4718....9............2.7....5..9.237..6..3.4...5.2....13.5..67.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_804() throws Exception {
        String puzzle = "..76..........7.2...138.5......3.....8...41.5..52..74....4.....6.48..35..1...3..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_805() throws Exception {
        String puzzle = "........5.25..87....1....4......3....7.9.4..8.82..691..1.........7.6.8.363.7...9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_806() throws Exception {
        String puzzle = "...2....4...37...26.24..93..8...4......6.5.....179...51....64.....9..3.6..8.....9";
        String solution = "813269574495378612672451938586124793937685241241793865129836457754912386368547129";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_807() throws Exception {
        String puzzle = "...1.35...1..45...7..2.9.....1.....2.2.....59..752.6....67......89...2....3.8..4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_808() throws Exception {
        String puzzle = "....53..2.39.....78.1..79..1..7.826...85.1......62....4........9731............8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_809() throws Exception {
        String puzzle = "..1..3......1..832.8........1...52...759.6.8..6...8...7..3.4..9.......58.5..9.3..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_810() throws Exception {
        String puzzle = "...6.....2..1...6...982......8...71...6...4825.......31..9.4..7.7..61...9.4.5....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_811() throws Exception {
        String puzzle = ".3.....8.....1.2.....5.69...9..4..653....5.19....63..29....21.7.7........61.....8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_812() throws Exception {
        String puzzle = "...1....5.9...7....21.59...1.......7..37..56.4...65.132...3..........4.....5812..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_813() throws Exception {
        String puzzle = "1.67...........97...423.6.8..3..97.........4.7...2.1.98.5......2413.7....3.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_814() throws Exception {
        String puzzle = "..7.....9..95..8..2.....3....1..27.3...75...15.3..4.8.1..........5.7.1.....38..92";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_815() throws Exception {
        String puzzle = ".9.2.........14...4.....862.........961.42.3..2.8...9.34......5....317.....48...9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_816() throws Exception {
        String puzzle = "..........72.1...658....9..1..79..6......6..84.....7..259.3......38..5...4.9...73";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_817() throws Exception {
        String puzzle = "...6..17...3...........2.83.49..1...8..7..4......943....5...2..6...57.4..8.26.7..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_818() throws Exception {
        String puzzle = "..4..2...1...6875.7..9....1..7..3.8.....1.3.....6895.2...........1...6..5..7.12..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_819() throws Exception {
        String puzzle = ".........3.254.....5.3.1.7.........44.9..6..5.23.5479........5.7..81.....8..6...9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_820() throws Exception {
        String puzzle = "5..4...7.6...9.52...3.254.........67....148..8..6.......52.....3....7...79.35....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_821() throws Exception {
        String puzzle = "..........47.56...9.84...61....7..9.4.9...1.......9.8.........7...2846..3.269...5";
        String solution = "623718459147956238958423761586172394439865172271349586864531927795284613312697845";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_822() throws Exception {
        String puzzle = "............53..416..412..59.....16..4.6....2..52........1.32.......5.89.7..8...6";
        String solution = "451879623289536741637412895928357164143698572765241938894163257316725489572984316";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_823() throws Exception {
        String puzzle = ".9..6......4.....6..3...942...2......86...2....7.816947....8.....951.....5.....73";
        String solution = "295864731174923856863175942941256387386749215527381694712438569639517428458692173";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_824() throws Exception {
        String puzzle = "....7.36.3.1.......42.....8..3..64....48....2.....31....5.8...72..76.......3..856";
        String solution = "589274361361958724742631598973126485154897632826543179635489217218765943497312856";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_825() throws Exception {
        String puzzle = "...1.29..1.3.97.....9....7..34.6.8.......45..5...21.3....4.....95...........153.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_826() throws Exception {
        String puzzle = "8......9..752.9.8..4.5..1....3.8.6.....3...7.28...5........4....1..27.3..6.9...2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_827() throws Exception {
        String puzzle = ".....2..84.1..6..7..21.79.3..7.......65.4...9..4...56......1.....8.....691..8..7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_828() throws Exception {
        String puzzle = "..6.29...4....6..2.9....6..2....51.4.......8.85..1.263....92.4.51..........4..8..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_829() throws Exception {
        String puzzle = "..........1.72....7...14826...........6...9...419.6.3..5...1....2..9768....58...9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_830() throws Exception {
        String puzzle = "..51...2623...9...............9..8..59..83.....65..1.7.6......1..4.....8853..16..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_831() throws Exception {
        String puzzle = "68.4........71...9.13......8.....3.....8.4.9.462..9......9...37.2...71.8.......26";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_832() throws Exception {
        String puzzle = "...9....7.2...7.613..81...2....78..9..73...2.1...4...........5...5.....3.1..52.78";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_833() throws Exception {
        String puzzle = ".......6....13.9.79..2...31..2........45.17.3.1...6..4.46....2.....1....2..6.5..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_834() throws Exception {
        String puzzle = "..............2891.8..3.5.7..........47..1.85..6427..3..........3...5.7.719...2.4";
        String solution = "572918436364752891981634527193586742247391685856427913425179368638245179719863254";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_835() throws Exception {
        String puzzle = ".1..5....362.1...5.7.2.64.......5.7...5.9.6..9........7....1..8...3749..6.1......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_836() throws Exception {
        String puzzle = ".....1.86.763..5.2.....93....7....6.9.....8...54...2.7..8.359...3.9........4.7...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_837() throws Exception {
        String puzzle = "3.7..9........3.6...64....1..31...94.25.4.8.3.6.3....2........6...2..9..58.....4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_838() throws Exception {
        String puzzle = ".21....5.......7.8...4...2....6...35.6........83.2.6...59..2.86.3...1.....69.42..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_839() throws Exception {
        String puzzle = ".5.........4.8.639..1..34.52........6..45.8..41.8....6.......94...2.7....8...9..2";
        String solution = "853694217724185639961723485238976541697451823415832976372568194549217368186349752";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_840() throws Exception {
        String puzzle = ".9.....3..2.49.8....6....4.5.8.....4........3...62.5.89....72....528..6.2..9....5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_841() throws Exception {
        String puzzle = "....52.8......76544...9...395..7.......9..7...4.3....5......53619.........6.2..1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_842() throws Exception {
        String puzzle = "....573.67.5..38.....2..7..1...........8.9...9...2..5...41.......2..618.....326.7";
        String solution = "248957316795613824361284795127345968453869271986721453674198532532476189819532647";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_843() throws Exception {
        String puzzle = "2..........6...53..4.86.2.7.7..........6....35.2.7......41........296.4.62..8.7.1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_844() throws Exception {
        String puzzle = ".....3...3.67...845...9.2..............6.2.13..51...29..4.......52.....6.91.645..";
        String solution = "189243657326715984547896231213479865978652413465138729634527198752981346891364572";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_845() throws Exception {
        String puzzle = ".......1...59.2.4..9..68.7...48....38.....45...3.4..6..6......73..69......2..71..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_846() throws Exception {
        String puzzle = "........36...........9.38.......93.....245.865.1..6.927.........8..74..9.168...4.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_847() throws Exception {
        String puzzle = ".......3....1..6....1642...4..7......934.1.2.......1....7...28415....3..8.4.37...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_848() throws Exception {
        String puzzle = "...7...9......65.....913.6...6..5....3..79....7.84..2...2...1...6...42.94.51.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_849() throws Exception {
        String puzzle = ".....6.49..3.7.......5..1...17...6..3.2.5.....54.....87......8..65.2.4.7...4..5.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_850() throws Exception {
        String puzzle = ".7.4.82..........34.3....5...7.6..3.6.....5.1.59....7...4.81.........76.39..5...8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_851() throws Exception {
        String puzzle = "..2......93...2..6.5.869.2.......9.5....8..4....347.....475..3..13......6..1....4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_852() throws Exception {
        String puzzle = "...........26.89...643...52.......652.17.5.3..7..3.........7.......86.9.7...1..28";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_853() throws Exception {
        String puzzle = ".....1...9.8.5.6..2...8..4...98..4...2.74.983...........1.7..9........6.56..1.2.7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_854() throws Exception {
        String puzzle = "2.48........7.5....13.....9..7.......26....3.3...26.4...9..845.87.....16....6.2..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_855() throws Exception {
        String puzzle = "4....1....5.....1.1..9.2..8.6..1....9......56.275....9..8...9..5..7...8...28.4.6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_856() throws Exception {
        String puzzle = ".2............1.7.1....268.......43.37..6.........419...2.18....37.5.8....62.7.5.";
        String solution = "725683941683491275149572683961825437374169528258734196592318764437956812816247359";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_857() throws Exception {
        String puzzle = "..2.........7.5...45.......5.8....9..461.......32.9..6.....1.638.4.3...7..547.8..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_858() throws Exception {
        String puzzle = "3..7....9.52.......7.9.24.......6148....1.....2..8.76.......3..8..5.....5.3.24.8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_859() throws Exception {
        String puzzle = ".4.876.2.....9.5..9...4........6.24......98.....4.1.5.81.......47.....122..3..6..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_860() throws Exception {
        String puzzle = ".5......6..674.31.2...8..4..1.3...24...8...7......41....26......6...9.815....8...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_861() throws Exception {
        String puzzle = ".2...4...4.31...9.9....2.....9........2571..91..8..5.6....8..65......3....62.38..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_862() throws Exception {
        String puzzle = "........4..8.3..19342.16.....9.....6.8...4...65...2.8.1......5...5.21..8....4.3..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_863() throws Exception {
        String puzzle = ".3.9.....25.7.8.3.6.7...........3.8........7..7.2853....1.....5..3..4..6..5.197..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_864() throws Exception {
        String puzzle = ".........2.3.41.8..6...84....2....7....3759.8......1.4........55.86.....3248....6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_865() throws Exception {
        String puzzle = "..1........5.17....2.8...5.8..7...2...7..3.9.....9.6.7.42..983.......2...182.5...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_866() throws Exception {
        String puzzle = ".......9.....42..19.1...3....8.1......4..8...13.2...8.8..4..6...235...1....3..958";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_867() throws Exception {
        String puzzle = "...9.....7.12.3..8.....87....9.2..1..1....47.42..8...3......6...63..1...542.3....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_868() throws Exception {
        String puzzle = ".7......31......29..8.5.7......9.4.....51....9.78.6....6.283............41.6.538.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_869() throws Exception {
        String puzzle = "....3..6.........569....7...49..1.....7.8...1...4..5.2.651..9..7...9.2.6.8.7....4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_870() throws Exception {
        String puzzle = "..........5..83..9...72.16...2..9.7...43.7..1..1.64..8.........4.8.31....15.....7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_871() throws Exception {
        String puzzle = ".8.1...9.1.6..5....74.23.1.6..7.....4..5...78........5...9.8....4.........5.17.89";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_872() throws Exception {
        String puzzle = "....1..28.....4...2.39.5.7......83.7..9.6....3.....98...4..9..6.92..7.1.....4.2..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_873() throws Exception {
        String puzzle = "........9....18.6..3.75......4.......7214....3....247.........5..82...969.6.85.2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_874() throws Exception {
        String puzzle = "........88..2..5...5.9....7..8.549..1......8..428....3..74.....43..1..656...2....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_875() throws Exception {
        String puzzle = "........76.......3.7.16......2..1...8.7.3.92..4...6.8...6....4.53.84...9..8..93..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_876() throws Exception {
        String puzzle = "983.......1..2........5.....2.9..3...9..1542.1...468........6.1..24....8.4.5....3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_877() throws Exception {
        String puzzle = "..........7..51.98..9..72.6..3...1...54....2..9.2..5.4...3..7.2..6.8....4.1.....5";
        String solution = "618924357372651498549837216263548179854179623197263584985316742726485931431792865";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_878() throws Exception {
        String puzzle = "...........859.72..2..3.8.97........23..8.5.7..5...1.4.....7..8.5.6.1...9..85....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_879() throws Exception {
        String puzzle = "....9..6....75.18.67.......5..3..2....3.14...4.2...3.......8..9......71.3..147..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_880() throws Exception {
        String puzzle = "...39.8...95.....1..4..1.......7.38..5......9...98.1.66.8.......7....2...4.2..638";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_881() throws Exception {
        String puzzle = ".......1..436..2..8...1.9...7..3...43817......54...8.....8........24.35.....6.4.1";
        String solution = "695482713143679285827315946276538194381794562954126837412853679769241358538967421";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_882() throws Exception {
        String puzzle = "..........7.4.5.8.....2.6.9.........8.37...2.42.9..517.........5..1.8.4.71..54.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_883() throws Exception {
        String puzzle = "5....8.3...8...4..31..5......6.4...9.....1..6...6..7...3.2.5...9...6.2.348..9...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_884() throws Exception {
        String puzzle = ".7.........6..179....9.8.3...4......13..6....2...3..54.....4...8...169.3.1..9.4.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_885() throws Exception {
        String puzzle = ".5.....977..8.2......9...3.3.7.9.1...4....6...65..1...6.3.........72...18...16.5.";
        String solution = "458163297739842516126975438387694125241537689965281743613459872594728361872316954";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_886() throws Exception {
        String puzzle = "...........5..781....5.8.73........1.9...3.4..7.219.5...1......8..39.5...59..4..2";
        String solution = "768132495235947816914568273583476921192853647476219358341625789827391564659784132";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_887() throws Exception {
        String puzzle = "..2....1..482..5...3...492.3....6..8.....3....948.57...2..3...7...7.8...8.....3..";
        String solution = "962357814148269573735184926357926148281473659694815732529631487413798265876542391";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_888() throws Exception {
        String puzzle = "..3............384.851....9.......678...9......14.......967..4.36..4.9..4....971.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_889() throws Exception {
        String puzzle = ".81....65..59..2..4...6.1....7.......36..7....4....52......9...6....2.51....784.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_890() throws Exception {
        String puzzle = "..5.4..62....3..7937.21.........1....31..8..62......4...4.7........8.69.5..6...2.";
        String solution = "195847362842536179376219485689451237431728956257963841964372518723185694518694723";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_891() throws Exception {
        String puzzle = "..9.7..6..4..52.......46.92.6.5...87..3..9..4.8.4....5..5.....667............73..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_892() throws Exception {
        String puzzle = ".7.2...9...2...1.5...9..38.....9...4.58312....9..8..2..8....2.......69..1.3....4.";
        String solution = "871235496932468175564971382216597834458312769397684521689143257745826913123759648";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_893() throws Exception {
        String puzzle = ".6....49.....5..7.3..9.1.8......2.5....31....4.....36...2.8...68..1.52..1...7.8..";
        String solution = "561837492298654173374921685613742958985316724427598361732489516849165237156273849";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_894() throws Exception {
        String puzzle = "....82......5......1..9.6....24..5....926..4.4......61..3.......9.3...566.817...4";
        String solution = "937682415826541937514793682362417598189265743475938261243856179791324856658179324";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_895() throws Exception {
        String puzzle = "5...9...4..7......9.2..7........9...3..7.61..2.41....9.3...27....9.84.1.......348";
        String solution = "583291674647853921912467853861529437395746182274138569438612795759384216126975348";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_896() throws Exception {
        String puzzle = "..4......3.....5....94.5..3.3.........56..8...8.2541.76....97..2.....9.5...82..6.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_897() throws Exception {
        String puzzle = "..8..3.17..26....89.6....3.....5...32.....546.6...28......3.1....5.9....1....4..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_898() throws Exception {
        String puzzle = "..4....7.........5.874...695....69...2.....169..3.12..8..5.......9.74.3.7.......8";
        String solution = "254619873691738425387425169513246987428957316976381254842563791169874532735192648";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_899() throws Exception {
        String puzzle = "....4..7..295.634..14........8.....91...........7.2.1......38.6.9.6...5.3..8..49.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_900() throws Exception {
        String puzzle = "..........84....531...3.82.........96.....3..83519...7..1..5....6.8.....9...6.412";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_901() throws Exception {
        String puzzle = "3.1..7..4.....6...846..3.......7.5..6.41..8..73...4....8.9..71.1.3.8......2......";
        String solution = "321597684597846321846213975219378546654129837738654192485962713173485269962731458";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_902() throws Exception {
        String puzzle = ".8..3....3.92.....6528.......4...7.1.93.5...2........5....8.........2.4...7.14359";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_903() throws Exception {
        String puzzle = "..38....48..5.......5..3.8.......8..65.7.2.4.78...19....694..1.........731...6...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_904() throws Exception {
        String puzzle = "....946....286...9.....3.48..9.....1..13.7....74...5..8.....42..9348........7....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_905() throws Exception {
        String puzzle = "1..82.6.......4...5.2.9..7....9....66..5..49...9....81........7.9..3.....3..12.48";
        String solution = "174825639963174852582396174318947256627581493449266381816459327291738515735612948";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_906() throws Exception {
        String puzzle = ".....8......3..148.4.....62..7.1...5..5.67..4.8...5...6.1....2...2......3.46..91.";
        String solution = "163428579729356148548791362237914685915867234486235791671549823892173456354682917";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_907() throws Exception {
        String puzzle = "......96...7.31.......89.21.5........728.3....63.24..5........831....5.....318...";
        String solution = "281577963697231854435489721854196237172853499963724185749675318318942576529318492";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_908() throws Exception {
        String puzzle = ".2.....5.......6.3.6.1..7....7....89.9.5.....8...7.3.5...9.4.7..14......5.28.3.9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_909() throws Exception {
        String puzzle = ".8...4...2....8..4..729.......3..5.2.9.5...6...2..68.3...1......63..5.7.7.....94.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_910() throws Exception {
        String puzzle = ".5...7....1.....8.8.....654.4.2....52.1.6..485...4.3..............3.8.6.3..49...2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_911() throws Exception {
        String puzzle = "5....6..4..62...8.4.8.5.....8.3.....2.......9..4....1......24..659.8.7......675.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_912() throws Exception {
        String puzzle = "26......3.5.1.9.62......5...4...6...6...8.3..87.3..2.............9.6.4.5...5.4.79";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_913() throws Exception {
        String puzzle = "............8752..7.86.......5......8.4....2.637.5.4.......1...14.3.8..5..3.9..14";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_914() throws Exception {
        String puzzle = ".......7......1..8.7..8...62..6.9.3.1....3.85..3...2..92..3..5.3.12..9....5..4...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_915() throws Exception {
        String puzzle = "4....5....324..89..7.28......6...2..34.9..........7..4........9213.4..8..9.6...3.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_916() throws Exception {
        String puzzle = "..4.37.....9.5..4.5....4..3........7....4.68.6.5.......6..82..99.2..5.3.3.....7.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_917() throws Exception {
        String puzzle = "....7..3...7.3.21..........6........5..29....389...57..2.6..94..6..49..3.4...3..8";
        String solution = "196574834457836214236516757672355494574298386389461572823657941868749723941123668";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_918() throws Exception {
        String puzzle = "6..3....4..5......2...47......9....69...1...5.7.2..93......1.5.5..42.....176.52..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_919() throws Exception {
        String puzzle = "2.5.....4...46..2..8.....39.5...7...7.6321.....28...9...9..23...2.........1.7.4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_920() throws Exception {
        String puzzle = ".....9......8..9.6.61....3......7.....4...37...9.415.2....2...73.....1.58..51.42.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_921() throws Exception {
        String puzzle = "348.....2....6..83.6....1...9..8....6831...7.2.1......9....43..........8....312.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_922() throws Exception {
        String puzzle = "..5.6.....9.5.48...73..8..4............1.6.5.5.7..39.1..9......4.2....19.3....7.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_923() throws Exception {
        String puzzle = ".........4...68.35......24...5..1..4....8....9.4..36.175.3.4..6..9.1.....617.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_924() throws Exception {
        String puzzle = "..........7....8.6362.1..7...3....4..9.7.2.1..864...3...5.8.....1...4....4..21.85";
        String solution = "458976123971243856362815974723168549594732618186459237235687491817594362649321785";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_925() throws Exception {
        String puzzle = ".....6......93.1......7.962.6.4.......3....5.45...76...34....9.19..4.7.66......81";
        String solution = "458976123971243856362815974723168549594732618186459237235687491817594362649321785";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_926() throws Exception {
        String puzzle = ".............2964.29....5.3.......5..83.17..957.2.4..1.....1...7...423......6.7.5";
        String solution = "864375192357129648291486573129638457483517269576294831638751924715942386942863715";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_927() throws Exception {
        String puzzle = "....8.......5.42..54..7286..63.1...5.81...6.........4.....3..2..547.....8.2...5.6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_928() throws Exception {
        String puzzle = ".......1.2...1.3.7.1.8739.5.31....58......6..76...1....9.......38..6.1.4.....2.8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_929() throws Exception {
        String puzzle = ".6...2.7.......5...3..71.92.92.65.87.1...4..97..9.....8.1........4.9..1........45";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_930() throws Exception {
        String puzzle = ".....8..6..61.57.8............2.......798.23..2.3...71..1...5..7.3...86..52.7...9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_931() throws Exception {
        String puzzle = "......8...182..6..7.4..3.....1.58..6...7....1.7..2..8...5...36.3.65.4.2.....3.4..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_932() throws Exception {
        String puzzle = "36..2.7.99..3..21...4....3.5.6.....8..92.8......5..4...5.......49...538.....7...2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_933() throws Exception {
        String puzzle = "..1..5.....5.7..2.437.19...1.8.............78.6....23.........6...8.74....6.41592";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_934() throws Exception {
        String puzzle = ".9..3.2....4..713....4...7......5....4.7.638..6.1..7.28513.4.6...6.......3.......";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_935() throws Exception {
        String puzzle = "...98..1.7...3.6...9.1....2.....2......79.2.69.2...3.81........8.746.....5....763";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_936() throws Exception {
        String puzzle = ".86..9...1.5.8.2....413.7............6...4.38...392..5....5...2.......6..1.92.8.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_937() throws Exception {
        String puzzle = "..........2...3.4...57.8.36...........283.....74265.8...1.....558...21.4...3..87.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_938() throws Exception {
        String puzzle = ".....3.2....4....6.745.6..3.58....3.1..8..7...2.....4....7....15..64.2...81..56..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_939() throws Exception {
        String puzzle = "5...2.......374....74....9......8..1..273..4...825.3.6.6..1.........3.8.7.3...1.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_940() throws Exception {
        String puzzle = "....83...58312.6..4.1..9........6....4....9..6.2...38.3...7.81...9.6....81......7";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_941() throws Exception {
        String puzzle = "......3..2.483.....83..1..4.76...12......9.3.9.5..........75......6..4186..4.8.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_942() throws Exception {
        String puzzle = "......9..2.1.6.7....72...65.6...8.9...23...4...3..48.2.1...2.....6.3..5...974....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_943() throws Exception {
        String puzzle = "..3.4........7...6...128....21.8..3..7.....4.3....7..1.1.6.28.42...9..1...8...36.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_944() throws Exception {
        String puzzle = "..........1.9....88....3.2.2....9.1..9..61.72.6.72.4.3.74...5..9.......1...4.7..9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_945() throws Exception {
        String puzzle = "..7.13.4.2.4.9..17....4....92....7.4...93...5..1.....3....7.9.....3......3.4.56.1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_946() throws Exception {
        String puzzle = "48..9.3..3.7..2..6.......8..3...6..28..25.....65.37.........43.5...78....9.4....5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_947() throws Exception {
        String puzzle = ".....8....6..31...2.7.9.....42.....1.....348..1.....76..9.......2...7.3..3862519.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_948() throws Exception {
        String puzzle = "...9.......2..4.56.31........5...1.9.1.25.36...4....2....7....21....26...26.93..5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_949() throws Exception {
        String puzzle = "7...6.....8..41.....29...41.......1.....39287.27...3....3....9..951.3..6.....5.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_950() throws Exception {
        String puzzle = ".....1....2......86912............141.25.6..38...2.5.6..5......73.........63194.5";
        String solution = "358471629427963158691285347569738214142596783873124596915647832734852961286319475";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_951() throws Exception {
        String puzzle = "9..5....83...4.92..68..3.5....96..1......7..4..743.6.27..3.9..........8..5.1.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_952() throws Exception {
        String puzzle = "7....6..3....1........9.4..3...2579....16.....4..37.5..62...5371.8...6.........19";
        String solution = "615372849734891526982465731468237195159684273273159468897526314346718952521943687";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_953() throws Exception {
        String puzzle = "..............1..6.8.4657.......7.....9...2....3159.6..97.......467..9.2.21.43..7";
        String solution = "615372849734891526982465731468237195159684273273159468897526314346718952521943687";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_954() throws Exception {
        String puzzle = "...........5..28.3.6...9.54..........9356..1..2..91.47.......71.3....4...721.4..6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_955() throws Exception {
        String puzzle = ".18.4..6...3..6.91..4..3..2..658.....8..1..23.45..............6......13....3..289";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_956() throws Exception {
        String puzzle = "............7...2313...94......43....4.8..19258.9.......8..2...4..1..2.6.1..7..38";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_957() throws Exception {
        String puzzle = "....132.7.14..28.3.....5.......3....569.7.....235..1.8..6.....1......7.529...7...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_958() throws Exception {
        String puzzle = ".185....2...23...4.3...1.59.....9.1..45....96.93.1.2...84.....5..6..4..........7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_959() throws Exception {
        String puzzle = "...........426....9.6.57..4.5...........8..29.8.9...56..1..8.9...85..34.7..6.3..1";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_960() throws Exception {
        String puzzle = "2...6.....7.9...5.8.9..57.6.......39..3..8..2.4....5......7.....9.286.1.1.65.3...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_961() throws Exception {
        String puzzle = ".........1.6.5.3...37.186.4.....9....5123.7...69.8...........8..1......328...316.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_962() throws Exception {
        String puzzle = "..12..7....36...187.....2......5..2.42.1.8.....5..21.......4..5649..18...3.9.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_963() throws Exception {
        String puzzle = "5...7.....63....9.7..3.25.4.76.2...1..16....8.5.1....9.4.....2....9.3.....7.1..8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_964() throws Exception {
        String puzzle = "8...1.4.5.......6..63...7..7............72.39...8.....68.3..9.4.1...438..479....6";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_965() throws Exception {
        String puzzle = "..4.......6.523..835.1....7....5.2..4..2.876...1..6....3...........95.....78..359";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_966() throws Exception {
        String puzzle = ".6.......3.7.....818..62.4...3..8..2...4.518....72.4...1.5.....7.8..1...2....67..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_967() throws Exception {
        String puzzle = "4..........93.1...385.64..7.4.............3686..7..2...6.57....8..4.9..6.941.....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_968() throws Exception {
        String puzzle = "....7..98...6...5...6...1.4.2......13.49.6.2...1.27.8.........915.3.....94...58..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_969() throws Exception {
        String puzzle = "..1..2..9.74......9327..4.68.....6.3....6.9.43....9.5.....23.4.7..5........1..3..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_970() throws Exception {
        String puzzle = "...17.43...3..9..1...2....5.........7...23..4.36.547..8.53.......25.......4.9.6.8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_971() throws Exception {
        String puzzle = "..67...244....59.7.7..1.6.53....68...41...........2....2...149.........6....497.2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_972() throws Exception {
        String puzzle = "........42.7.6.19.6...93........1.....2.8.7.91..9.685.8.6...4.7.......8.7...5..2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_973() throws Exception {
        String puzzle = "....7.5..2....4.63..6..2.8..9..85...5..26...7.21.4......5..9..4......63.....3.97.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_974() throws Exception {
        String puzzle = ".8..1.........72.83...4.16....7..3..4.93..85.6........9.3..2.84...93.5...5..7....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_975() throws Exception {
        String puzzle = "....2.9.7...4...8...6..3.5...........9..6..4....2.9518....14.7..81.72..4.6..3..9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_976() throws Exception {
        String puzzle = "1.8...5...279.....9..7.18..8.43.9.....2.4.1.3....2...9.....43.....2..95.4....8...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_977() throws Exception {
        String puzzle = "...56........7.31..8..31..6.........96..8...7..5....321......4..3..17.65..63.41..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_978() throws Exception {
        String puzzle = "...8....1....27.96..75..83..4.3.....3...5...7.956.8.....19.2..8..4...3.......6.1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_979() throws Exception {
        String puzzle = "..9.8.......1.....68...7.19.2...4..71...3..4.46.79.....7..6...3.....2.9..963...2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_980() throws Exception {
        String puzzle = "......71......9.2..6.571..95.....8...738......4.3..2.7154.2.9....7...1......45...";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_981() throws Exception {
        String puzzle = ".1.2.8.......5.6.7...671.2.3..5....1..1....4..6...2.5......7....27....9.6.519...2";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_982() throws Exception {
        String puzzle = ".8.........2654.1.4.5...........8.41..8....2.17....86......9....5.34..892....16.4";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_983() throws Exception {
        String puzzle = ".81.94...25...........7....72..1..3...5....9..9638...7.....84..51......9..81...25";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_984() throws Exception {
        String puzzle = "..3.....612.7.8..45.4..1.7...89..5...4.3.67..3.......2...8..4....1..58......1..9.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_985() throws Exception {
        String puzzle = ".1..8....69...4..2.....65....6.3924..4..1..5.839....6..6254....4.....1.........2.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_986() throws Exception {
        String puzzle = "6.7.8...1......7...9....3.5.2..1.8....5.....78....64...1.93...49....5.....28.15.9";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_987() throws Exception {
        String puzzle = "......6..96........84.5.1....3..9..42...178..85..4..2.5.6.28....2.7.....4....5.7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_988() throws Exception {
        String puzzle = ".9...5..68..1..9............84......52..16...6.39.8..5....3.5..3...5.8..75...214.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_989() throws Exception {
        String puzzle = ".....7.....3.56.2.97..1.64.........2..7.2.93..2....16...........615..49...964..7.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_990() throws Exception {
        String puzzle = "4.....5.1..5.64.....9..........5.1....1..97.5.5.1..924..45.3..7.....76.22...9....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_991() throws Exception {
        String puzzle = "...9....4....7.8..28....1.367........3....2.1.21.9..6..9.5.....8..234..7...71..8.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_992() throws Exception {
        String puzzle = ".....4.....5..76..1.85..27......6...3......825.9.481...5.....1.8.1.9.72.6...7....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_993() throws Exception {
        String puzzle = ".97..16..6.4.7..3.53......4.1..6..72.....3.....87..3.1....2.....4..96.8..7....9..";
        String solution = "_97__16__6_4_7_13_53168_7_4_1__6__727____3_____87__3_1____27____4__96287_7____9__";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_994() throws Exception {
        String puzzle = ".....8..6.5.3...1...71.6..2......9.4913....2..65.3...7.3..8......15..8..5......43";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_995() throws Exception {
        String puzzle = ".......7..68...2...579.2..38...1.......8...1...4.....2.7.2.4....83.9.5..5..13.79.";
        String solution = "2______7__68___2___579_2__38__41_______82__1___4_____2_7_254____83_9_52_5__13879_";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_996() throws Exception {
        String puzzle = "..........5..3.9....41...522.68....35.8.6..1..31.2.6..........5.....23.8...5.1.24";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_997() throws Exception {
        String puzzle = ".4...23..8...1......96.5.2...........74..3.6.9.1427.........1...9....23...523..74";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_998() throws Exception {
        String puzzle = "....8..6.8....7..394.25........2....6..3.1....2867.3...........31.....964.9..8.21";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_999() throws Exception {
        String puzzle = ".6.....5.9.2....613....64.24...6.....3..52.9.5..4.3....89....4......72.....82..1.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1000() throws Exception {
        String puzzle = "..........54.9..67..1.2..48...6.....73......458.....3..6.9.7....4.86..79..8.4...3";
        String solution = "627584391854391267391726548419673825736258914582419736165937482243865179978142653";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1001() throws Exception {
        String puzzle = ".73.9.......48..7.8.4...2.39..3..8......5....3169..........51.7.6.7.....5...19..8";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1002() throws Exception {
        String puzzle = ".5..6..2..4....7.......2.81.6..4.8.......6.4...4.98.3..86...3........27..97.836..";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1003() throws Exception {
        String puzzle = ".54...8..98..3.6..6.19.8.4..1..........89.7..5..62...8....5..6..9.....7347..6....";
        String solution = "354216897987534612621978345718345926263891754549627138832759461196482573475163289";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1004() throws Exception {
        String puzzle = ".9...4.25.36...91.........43........2..67.4.8..45....294.15.......7....9178.9....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1005() throws Exception {
        String puzzle = "..3........8..71..56..9...2..53.46......7....32.6..57..3...2..7..2......67.813.5.";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1006() throws Exception {
        String puzzle = ".5.......21..5.9.3..92.846...........923..58.....856....5..4..9.2.....4..4...97.6";
        String solution = "456973821218456973379218465587692134692341587134785692765834219921567348843129756";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1007() throws Exception {
        String puzzle = "..46.91...6..5..271..4.2..63......92.....3.4.475.....389...62..............9.73..";
        String solution = "724639185963851427158472936386145792219763548475298613897316254631524879542987361";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1008() throws Exception {
        String puzzle = ".8..6......2...18..7...3........12...43....1..51.76438.2........38...72...67.9.5.";
        String solution = "589164372362597184174283596897431265643852917251976438725318649938645721416729853";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1009() throws Exception {
        String puzzle = "......5....43.1.6.69.8.42.3....3.45.9....87.2...2.9..6.........2..983....89.7....";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1010() throws Exception {
        String puzzle = ".........76..45...9.5.3.746.1.....5..86..1.73..9..2.....8....6..9..8.5.7....2..38";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1011() throws Exception {
        String puzzle = ".....89..6.3.49.1....5..6....4.....923......1.5...2.6...7......3.2.51...5.896.2.3";
        String solution = "425618937673249815891537642184376529236495781759182364947823156362751498518964273";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1012() throws Exception {
        String puzzle = "3.76....2.....18.4.9....57......3.4995346...8.2......5..2......58..36.....95.....";
        String solution = "347685192265791834198324576816253749953467218724819365672148953581936427439572681";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1013() throws Exception {
        String puzzle = ".....5.....7.6.43.4.6..82.5..2........8.749..6.18.......35......6...1.2.1..327.9.";
        String solution = "329745618857162439416938275742619853538274961691853742273596184965481327184327596";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1014() throws Exception {
        String puzzle = ".1...7......59.23..5.8.......6......2..9..3..59.7.2.8.1.4.7...3...2..64..29.4...5";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

    @Test
    public void test_1015() throws Exception {
        String puzzle = ".........54..9...3....1.764.....3...6.4...2.129.....3......4.16.1..693.77.6....45";
        String solution = "163487592547692183982315764871243659634958271295176438359724816418569327726831945";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1016() throws Exception {
        String puzzle = "......76......8..54..26.....1..5...47...8.53.3....61.......1....87.....364..35871";
        String solution = "831549762276318495459267318918753624764182539325496187593871246187624953642935871";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1017() throws Exception {
        String puzzle = "........4.....5.79.9..2.531....79....6.5.8....7....35......1....15.928.72..8.7.15";
        String solution = "527913684341685279698724531853279146164538792972146358786451923415392867239867415";
        assertEquals(solution, new Sudoku(puzzle).solve());
    }

    @Test
    public void test_1018() throws Exception {
        String puzzle = "25...7..1.....4.5..1..2.367...6.........81.3..8..4.7.662.1...7...94....88....6..3";
        String solution = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(solution, new Sudoku(puzzle).solve());
        fail("Not solved");
    }

}
