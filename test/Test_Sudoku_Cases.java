import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Test_Sudoku_Cases {

    @Test
    public void test_hardest_sudoku() throws Exception {

        // https://www.telegraph.co.uk/news/science/science-news/9359579/Worlds-hardest-sudoku-can-you-crack-it.html
        String puzzle = "800_000_000_003_600_000_070_090_200_050_007_000_000_045_700_000_100_030_001_000_068_008_500_010_090_000_400";
        String solution = "812753649943682175675491283154237896369845721287169534521974368438526917796318452";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_0() throws Exception {

        String puzzle_0 = "048_009_531_716_005_902_005_008_000_000_000_703_302_960_018_497_000_000_000_001_367_003_820_009_069_700_005";
        String solution = "248679531716345982935218674681452793352967418497183256824591367573826149169734825";

        assertEquals(solution, new Sudoku(puzzle_0).solve(), new Sudoku(puzzle_0).toURL());
    }

    @Test
    public void test_1() throws Exception {

        String puzzle = "000_870_000_000_000_080_920_000_004_050_030_006_000_000_000_004_601_003_030_052_040_600_009_500_009_006_020";
        String solution = "415873962763924185928165374157238496396547218284691753831752649672489531549316827";

        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_2() throws Exception {
        String puzzle = ".94...13..............76..2.8..1.....32.........2...6.....5.4.......8..7..63.4..8";
        String solution = "794582136268931745315476982689715324432869571157243869821657493943128657576394218";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_3() throws Exception {
        String puzzle = ".94...13..............76..2.8..1.....32.........2...6.....5.4.......8..7..63.4..8";
        String solution = "794582136268931745315476982689715324432869571157243869821657493943128657576394218";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_4() throws Exception {
        String puzzle = "............942.8.16.....29........89.6.....14..25......4.......2...8.9..5....7..";
        String solution = "249186573735942186168375429512697348976834251483251967694723815327518694851469732";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_5() throws Exception {
        String puzzle = ".....7....9...1.......45..6....2.....36...41.5.....8.9........4....18....815...32";
        String solution = "653287941794631258128945376819724563236859417547163829965372184372418695481596732";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_6() throws Exception {
        String puzzle = ".5247.....6............8.1.4.......97..95.....2..4..3....8...9......37.6....91...";
        String solution = "152479683368215974974638512416387259783952461529146837237864195891523746645791328";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_7() throws Exception {
        String puzzle = ".9.........1..6....6..8..7.3......1.....39.......5...217.4...28.....3....86....57";
        String solution = "894317265731526894562984173358642719247139586619758432173465928925873641486291357";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_8() throws Exception {
        String puzzle = ".....5....2...4.1..3..8..2......84..8..6......9..1.7.5..6......95...3.6...3.....1";
        String solution = "168295374529734618437186529312578496875649132694312785786951243951423867243867951";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_9() throws Exception {
        String puzzle = "5...68..........6..42.5.......8..9....1....4.9.3...62.7....1..9..42....3.8.......";
        String solution = "597468132318927564642153897456832971821796345973514628735641289164289753289375416";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_10() throws Exception {
        String puzzle = ".7..21..4....3....6.1.....2.......6...86..7.319.....4..1....2.842.9..............";
        String solution = "379521684284736519651498372732845961548619723196273845917364258425987136863152497";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_11() throws Exception {
        String puzzle = "........1..7.5.3.9..48...2...........3...57....942.........3.....1...4.7.6.278...";
        String solution = "526394871817652349394817526148736952632985714759421683975143268281569437463278195";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_12() throws Exception {
        String puzzle = ".....8..3.16.2.9.7.3...46...........9.5...2...2.13...9..3....2..7...5.........4..";
        String solution = "742698513816523947539714682381952764965847231427136859653479128174285396298361475";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_13() throws Exception {
        String puzzle = "..4.2..3....8.9.........7...5..37..8........5.49.6..1.5.........68........7.4.9.1";
        String solution = "184726539376859142925413786652137498713984625849265317591372864468591273237648951";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_14() throws Exception {
        String puzzle = ".....6..3..9.4...532......8....1......175.6.92......8.....6.......8...4.47....2..";
        String solution = "715986423689243715324175968963418572841752639257639184132564897596827341478391256";


        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_15() throws Exception {
        String puzzle = ".....8.2......693..98.7...1...........921....7......9624..9.......3..18.........3";
        String solution = "156938427427156938398472561534689712869217354712543896243891675675324189981765243";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_16() throws Exception {
        String puzzle = "..2.46.....4.8...5.7..3...9.....2...3.57.....7.....4....6....93....54.78.........";
        String solution = "582946731934187625671235849168492357345768912729513486456871293293654178817329564";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_17() throws Exception {
        String puzzle = "..3....4.4..2.........9..26....7.....1.9.2...26......85....7.......6.8.33......69";
        String solution = "623815947479236185851794326934678251718952634265143798596387412142569873387421569";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_18() throws Exception {
        String puzzle = "........3..5..2.14....8..6..........946.......3...42.6...7.........3.68..7.291...";
        String solution = "762149853385672914194583762527316498946827531831954276453768129219435687678291345";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());

    }

    @Test
    public void test_19() throws Exception {
        String puzzle = ".2............48...54.18.3.7....1..4....86.5.......6........1......2...923.4....5";
        String solution = "128397546397654812654218937786531294942786351513942678469875123875123469231469785";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_20() throws Exception {
        String puzzle = "..9.43..........3.41..7.............8..5...6..4...6..2.......1...4.98..67..6..52.";
        String solution = "569143287287965431413872695635729148872514963941386752326457819154298376798631524";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_21() throws Exception {
        String puzzle = ".........4.6.7..9..5..382.........3.9..........426.....7...3..2..16..8...85...7..";
        String solution = "893426175426571398157938246512789634968314527734265981679853412241697853385142769";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_22() throws Exception {
        String puzzle = "...6.4...........3.1...26....2......6...9..158.4.....6.....7...976.5.......2.31..";
        String solution = "289634751465719823713582649152376984637498215894125376321947568976851432548263197";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_23() throws Exception {
        String puzzle = "....4.....5......9..3.784....1......62..........5.38......2......64..7.34.51...2.";
        String solution = "172945386854361279963278451531682947628794135749513862317826594286459713495137628";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_24() throws Exception {
        String puzzle = "...3.56....68..3...4.............8.5.5....412...9.......3.9........8..6..196.45..";
        String solution = "781345629296871354345269187637412895958736412124958736563197248472583961819624573";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_25() throws Exception {
        String puzzle = ".2...7..5.........6...95..1.7...413.......2....1.5...67...1.8...8..7.......2...49";
        String solution = "123647985958321674647895321572964138469138257831752496794513862286479513315286749";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_26() throws Exception {
        String puzzle = "...5....3...82...13....179.17.............3..6..712.4..4..6.....9........6..5.2..";
        String solution = "416579823957823461382641795174395682529486317638712549243167958895234176761958234";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_27() throws Exception {
        String puzzle = "3......4...2..8....912...3...5.1..8..64.9.........5..618.7............65.7.9.....";
        String solution = "358179642642538971791264538935617284264893157817425396183756429429381765576942813";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_28() throws Exception {
        String puzzle = "....4....1..9..64..3....8....7.........1.859.......3...52..1....1.7.3...39..5...4";
        String solution = "879346152125987643634215879587639421243178596961524387752461938418793265396852714";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_29() throws Exception {
        String puzzle = "4....9.....541...3........7.......2..31.7...89.6..3.......9....1..6...8...75...46";
        String solution = "478359612265417893319826457784965321531274968926183574642798135153642789897531246";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_30() throws Exception {
        String puzzle = ".8.4.....13...............84....1...5.7..2..3...9..1......2.78.2....6.3..76..3..9";
        String solution = "982467315135298674764315298493751862517682943628934157341529786259876431876143529";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_31() throws Exception {
        String puzzle = ".5.........6..5.91..9...38.4.......8....38..2.73..........1....28.47.5..6......7.";
        String solution = "358291647746385291129647385412569738965738412873124956537916824281473569694852173";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_32() throws Exception {
        String puzzle = ".1..6.9....9..5....3.....76..1.3...272.....4...8........73....93.5..76.........2.";
        String solution = "512763984679485231834129576951834762723691845468572193287316459395247618146958327";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_33() throws Exception {
        String puzzle = "53..97..........7.....1..5......13....4..2...1.98..2.4........5.7....92..91.5....";
        String solution = "538697142412385679967214853726541398384962517159873264643129785875436921291758436";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_34() throws Exception {
        String puzzle = "..........7...62.81......54..3.5.......3....22..8....69......8.3...7......7.254.1";
        String solution = "829547163574136298136289754463752819798361542215894376952413687341678925687925431";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_35() throws Exception {
        String puzzle = "...6....445....2......893..97......3.63........4..27..6.9.5.............5....3.61";
        String solution = "398625174456731289721489356975148623263597418184362795619254837837916542542873961";

        System.out.println(new Sudoku(puzzle).toURL());

        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL()); // This is right
    }

    @Test
    public void test_36() throws Exception {
        String puzzle = ".3..1........427.3.2.9.6.4.5...2....349..............1.....9.....6....8...5..346.";
        String solution = "934715628651842793827936145518627934349158276762394851283469517496571382175283469";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_37() throws Exception {
        String puzzle = "....6.....5....97...2..5......2...8..74.......85.4.2.1..1..7...6....4...92.6..1..";
        String solution = "713469852456182973892375614169253487274891536385746291541927368638514729927638145";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_38() throws Exception {
        String puzzle = "...............731.541....8......5...219.4....4..6...7...58.........7.9..98.1...2";
        String solution = "137892456289645731654173928863721549721954683945368217372589164416237895598416372";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_39() throws Exception {
        String puzzle = "..8.........63...4..1...63..3...9...4......62......14....5..79.17.........54...83";
        String solution = "368914527752638914941257638236149875419785362587326149824563791173892456695471283";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_40() throws Exception {
        String puzzle = ".........9..1....2..4.28...65....7....1.....3..97.2........5.7..4.....61.35.1.9..";
        String solution = "823697415967154832514328697652831749471569283389742156196285374248973561735416928";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_41() throws Exception {
        String puzzle = ".....2....134.9..27.9....15.....5...1...8...6.6.97..8.5....6.....2.........2...3.";
        String solution = "456712893813459762729863415384625179197384256265971384538146927972538641641297538";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_42() throws Exception {
        String puzzle = ".....8..9......28..3..7.....48..........2....6.7..913......39...9..1.4..57.6....1";
        String solution = "752168349169345287834972615948731562315426798627589134481253976296817453573694821";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_43() throws Exception {
        String puzzle = "...71....5..............53.16..2.3......3...9.456......9.2...7.6.....2.3.....6.81";
        String solution = "932715864586342197417968532169827345728534619345691728891253476674189253253476981";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_44() throws Exception {
        String puzzle = "............8.5.492...6.3.1..9..........21.38...3.......5........6..48..13...96.2";
        String solution = "951243786673815249248967351389756124567421938412398567895672413726134895134589672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_45() throws Exception {
        String puzzle = ".....2.73.8.........57..2..9......1.8.......46..815.9.......46.4.....5.2....96...";
        String solution = "146582973287349156395761248973624815851937624624815397718253469469178532532496781";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_46() throws Exception {
        String puzzle = "..........7.48..9...4.2.37.1....5..2.....3..7..3...64..4.........631.........891.";
        String solution = "219537486375486291684129375167945832498263157523871649841792563956314728732658914";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_47() throws Exception {
        String puzzle = ".............67.....7.8..12..........3...65..5.1...893.7.........9..1.24..439...8";
        String solution = "416239785285167439397584612748953261932816547561742893173428956859671324624395178";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_48() throws Exception {
        String puzzle = ".......13....4......4698...........8.3....7...28.69.....1.3..6...92....76...8...1";
        String solution = "896572413752143689314698572967354128435821796128769354281437965549216837673985241";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_49() throws Exception {
        String puzzle = ".......1..2....93..65.3....94..5......78..2..6..........12....4...6.98........127";
        String solution = "739528416428176935165934782942751368517863249683492571351287694274619853896345127";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_50() throws Exception {
        String puzzle = "5.1.83..7...72...........1...8....2..1..5.9....3.....1...9...8..4...75..39.4.....";
        String solution = "521683497439721856687549213968174325714352968253896741172935684846217539395468172";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_51() throws Exception {
        String puzzle = ".5....8...1.....32..8.....6.9........4.8..6.5.....7.....2.7...33....1..4..562..1.";
        String solution = "254396871617458932938712456893265147741839625526147398162974583379581264485623719";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_52() throws Exception {
        String puzzle = "..5..1.8..4......9..7659.1........7...42......1....8.6....35..........9.97....1.8";
        String solution = "695341782341728569827659314536894271784216935219573846168935427452187693973462158";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_53() throws Exception {
        String puzzle = "..7....3..5...9..19.........2.......5...3..29.8..741.3...4.8.....2.....6....158..";
        String solution = "417562938256389471938147265321956784574831629689274153165428397842793516793615842";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_54() throws Exception {
        String puzzle = "....5...........4...36.1..8......7.1.2..1.8...7...9...4....3........659..59..72.6";
        String solution = "987354612216978345543621978698432751324715869175869423462593187731286594859147236";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_55() throws Exception {
        String puzzle = "9.58...76.........7...49.3.........9..1..82.....37.....7.......43...5.8...8.9...5";
        String solution = "945832176823617954716549832687254319351968247294371568572186493439725681168493725";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_56() throws Exception {
        String puzzle = "...1......98.2...63...4..5.5.......3.61.........7..86...7.8.3..........9..52..4.8";
        String solution = "752163984498527136316948752579816243861432597243759861927684315184375629635291478";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_57() throws Exception {
        String puzzle = "..3..........285..2......7......2..4.1.....2363...1.571....4.8..5....9...9.7.....";
        String solution = "563479218749128536281563479875632194914857623632941857126394785357286941498715362";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_58() throws Exception {
        String puzzle = ".7.....9....4...82..21.9......5..4......1...71.36......2....3....5...1..8.1.26...";
        String solution = "374285691619437582582169734267598413958314267143672859426951378795843126831726945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_59() throws Exception {
        String puzzle = ".6........4.7...8......613.1..4....5....2.8...5.....76...2..3..8...4..2.79...8...";
        String solution = "968314752341752689527896134183467295674925813259183476415279368836541927792638541";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_60() throws Exception {
        String puzzle = ".......5........21.39......4...51..7.17..49.....36.5......15...9.....16.64.......";
        String solution = "284136759756489321139572648463951287517824936892367514378615492925748163641293875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_61() throws Exception {
        String puzzle = "3....75.17.8..6......8....38....479..9...........23...962.....7.......6.....4.9..";
        String solution = "326497581758316249149852673835164792294785136617923854962538417481279365573641928";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_62() throws Exception {
        String puzzle = "17.....36....9..4.3.6....8.6....82.12....5.......1....8....7....5...........51.63";
        String solution = "174582936582396147396174582645738291219645378738219654863927415451863729927451863";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_63() throws Exception {
        String puzzle = ".........7...4.....9...612.4...1...7....2.5..5.1.98........1.6.....6.28....4.53..";
        String solution = "284159736716342958395876124462513897978624513531798642857231469143967285629485371";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_64() throws Exception {
        String puzzle = "74..6..3...2..5....18..2..9.8..2.6..9......7...4.8......37.....6...9.....2...4...";
        String solution = "749861532362945187518372469187529643956413278234687915493756821671298354825134796";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_65() throws Exception {
        String puzzle = "9...6........3.....3.8..4.6..5........9.8.3....4...297.2......4...3.....68.2...15";
        String solution = "958764123746132589132895476315927648279486351864513297521678934497351862683249715";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_66() throws Exception {
        String puzzle = ".5367...9.......5.....2..16.....37.29......6....5......2..1...51.6....9....9...4.";
        String solution = "453671829612839457798425316564193782931287564287546931829314675146758293375962148";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_67() throws Exception {
        String puzzle = ".....185...2..8.313..5..4..641......9....5..........8....9.6............5.9.4..72";
        String solution = "496231857752468931318579426641387295983625714275194683127956348834712569569843172";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_68() throws Exception {
        String puzzle = ".....5.3...79..1...3....7.5.51....978....1.56.....8..........28.74.2.....9.......";
        String solution = "142785639587963142936214785451632897829471356763598214615347928374829561298156473";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_69() throws Exception {
        String puzzle = "..1....8......45....5.7......273..........2..358.1....2.3.56...9.......1..6.9.7..";
        String solution = "741563982639284517825971346492735168167849235358612479273156894984327651516498723";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_70() throws Exception {
        String puzzle = ".4........12........82..537......2..3...8...4..53.7.......4..6.9......7.2..79...1";
        String solution = "543976128712835496698214537167459283329681754485327619871543962934162875256798341";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_71() throws Exception {
        String puzzle = "26..7..38....1..7......46.2.1...5....9.23.4.......72...........7......8...1..87..";
        String solution = "264579138583612974179384652312465897897231465645897213958726341726143589431958726";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_72() throws Exception {
        String puzzle = "..1.2.....8...5.9..6.4..1......8..3.....42.5..97................7.....4..32.176.5";
        String solution = "941826573283175496765493128524689731316742859897351264658234917179568342432917685";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_73() throws Exception {
        String puzzle = "..8.91.6....24....9...7..2...2...9....5....8.8..63.7.......7..1.56...4...1.......";
        String solution = "728391564563248197941576823132785946675914382894632715289457631356129478417863259";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_74() throws Exception {
        String puzzle = "...3..59...9.....3....6..7.4.8.1........9.......52.9.86.....7....58..3..1......64";
        String solution = "247381596569274183831965472498617235352498617716523948684132759975846321123759864";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_75() throws Exception {
        String puzzle = ".51..8....7.692.3......3.....7....92....7...1.6....45...........9..8.6..64.5.....";
        String solution = "351748926478692135926153784517864392234975861869321457782436519195287643643519278";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_76() throws Exception {
        String puzzle = "...3.....8..6...154...5.........4...2...6..8..7..9.34.....2...9..1..84..7.8....2.";
        String solution = "152387694837649215469251738983714562214563987576892341345126879621978453798435126";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_77() throws Exception {
        String puzzle = ".....3..1.4....83...5.4.....641...8..1...7......3....75.9....6.....3..5....87...3";
        String solution = "297583641641729835385641972764152389813497526952368417539214768178936254426875193";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_78() throws Exception {
        String puzzle = ".28..5...4..1..........3......4..85....2.....1...7...37...9..4.98.5....656...2...";
        String solution = "328945761459167382671823495296431857837259614145678923712396548983514276564782139";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_79() throws Exception {
        String puzzle = "......5..3.........9..18...1..9..26..6....4..98.1......7.3.........2.316.4.8....5";
        String solution = "718632549326594187495718632134975268567283491982146753671359824859427316243861975";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_80() throws Exception {
        String puzzle = "............1.962..6...7.59..1.......9.8.4..2......346..8.....19.6..3.........58.";
        String solution = "159268437473159628862347159341726895695834712287915346538472961916583274724691583";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_81() throws Exception {
        String puzzle = "........95...6..3..7...25..............7.4.6..32981...........8..5.2....76.39...2";
        String solution = "146573829528169437379842516457236981981754263632981745293415678815627394764398152";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_82() throws Exception {
        String puzzle = ".....6.57...5.....1...8.3..8...32.....6.1.59.........6...1.........2.97.5.17..8..";
        String solution = "482396157369571482157284369895632714236417598714958236978143625643825971521769843";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_83() throws Exception {
        String puzzle = "....16..7...7..93.2.7.....8839..........38..15........7......8..5.1........5.94..";
        String solution = "395816247168724935247395168839651724472938651516247893721463589954182376683579412";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_84() throws Exception {
        String puzzle = "4...187..8.......2.....4..............6.53..1..726.43...1.7...6.3...1.8....6.....";
        String solution = "462518793813796542579324168354187629296453871187269435941872356635941287728635914";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_85() throws Exception {
        String puzzle = ".....24..5.....9.8.2..65.7..8..3...1.74.......6......9.....4..5.......3..12..78..";
        String solution = "731982456546173928829465173985236741174598362263741589397824615458619237612357894";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_86() throws Exception {
        String puzzle = "8.63......13....9....6....27..........5.6......1.492...3..1.........2.47....368..";
        String solution = "896321754213475698574698132729183465345267981681549273937814526168952347452736819";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_87() throws Exception {
        String puzzle = "....91......2..87....6..1......5........6...3..79..2165......2.28..3.5....3..7...";
        String solution = "728391645136245879945678132612753498894162753357984216579816324281439567463527981";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_88() throws Exception {
        String puzzle = ".9.........8.2.3....6......5.....4...1...528......4.73....6.83..6.1...2.18.2.....";
        String solution = "291356748478921365356478192537892416614735289829614573942567831765183924183249657";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_89() throws Exception {
        String puzzle = "..5.......17.53..9.8.1...3...4..1.2...2....95...38.6.....7......2...43.......9...";
        String solution = "365928741417653289289147536674591823832476195591382674148735962926814357753269418";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_90() throws Exception {
        String puzzle = "....6..59.84.1.3.......7.....8.........3....15..4..9..4.........5.78.24..97.....3";
        String solution = "372864159984512367615937824238691475749325681561478932426153798153789246897246513";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_91() throws Exception {
        String puzzle = "......9.2..9....1.....65.....7.2........5..34.2.4...98.5...1....8...7..3.16.....5";
        String solution = "675183942839274516241965387497328651168759234523416798754631829982547163316892475";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_92() throws Exception {
        String puzzle = ".8......36.....9.7....5..6.....9.......4.36..159..2........8.9..2...1.4...35....8";
        String solution = "984167523615234987237859461346795812872413659159682734761348295528971346493526178";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_93() throws Exception {
        String puzzle = "1..9......8..7.4..4.5..2...........39...36.7.....1..9....24....2.45.1..8......7..";
        String solution = "137954286682173459495682137751829643928436571346715892863247915274591368519368724";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_94() throws Exception {
        String puzzle = "..7..6.........1.4.4.2.3..94.8.....69..81.........9..........3...1.35.8.2....85..";
        String solution = "597146823382597164146283759418752396963814275725369418854921637671435982239678541";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_95() throws Exception {
        String puzzle = "..43..8.78....2.3..3...6.....69.5..2.9..7..4................5.6.........389.5..7.";
        String solution = "254319867867542139931786425146935782593278641728164953472893516615427398389651274";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_96() throws Exception {
        String puzzle = "..42..7..2...6.......3..1....5..7..9.8.6....74.9..1.8..........61..52.4.........8";
        String solution = "834219765291765834756348192365487219182693457479521386528934671617852943943176528";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_97() throws Exception {
        String puzzle = "..1....5..36.5...9..79....6.......3.6..8.1.......6.1.5.........598.2.....2..73...";
        String solution = "981346257436257819257918346812795634645831972379462185763589421598124763124673598";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_98() throws Exception {
        String puzzle = ".....8.13......8....7.2..5..3...........965..5.8..7.21.5.3..4...........8...51..7";
        String solution = "495768213326514879187923654239185746714296538568437921651379482973842165842651397";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_99() throws Exception {
        String puzzle = "8....3.577.5..63....2..4......8.9.....9.4.2.1.63.............3...4....7.2...9....";
        String solution = "816923457745186329392574816127869543589347261463251798678412935954638172231795684";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_100() throws Exception {
        String puzzle = "7.......3..8.3.2.......7......9..4.79..46.5..36.8......3.5.......1....2.8....91..";
        String solution = "725198643198634275643257891582913467917462538364875912239541786451786329876329154";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }


    @Test
    public void test_101() throws Exception {
        String puzzle = ".....1...1.8.4.5...6..9.4.......9.....97....14..1..23...........574.6...8.....3.2";
        String solution = "534271986198643527762895413681329745329754861475168239913582674257436198846917352";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_102() throws Exception {
        String puzzle = ".9..4.2..........35.69...........15..73...4....24...76.2...1.......9.7....5.7..4.";
        String solution = "891345267247618593536927814489736152673152489152489376724861935368594721915273648";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_103() throws Exception {
        String puzzle = "7.89.......6..8.4....25..3.......1..6...1..2..7...5.6.....7....92...3...1...8.6..";
        String solution = "738941256256738941419256738582694173694317825371825469865479312927163584143582697";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_104() throws Exception {
        String puzzle = "..86.7....7...541.9................2.4.2...8...7..35........6.9....5.7...52.9...4";
        String solution = "418637295673925418925841367831564972546279183297183546784312659369458721152796834";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_105() throws Exception {
        String puzzle = "..........2..4...3..1.97.5......463.71.2.6.....2.........6.....2....53.7.3....9.8";
        String solution = "973562841625148793481397256859714632714236589362859174198673425246985317537421968";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_106() throws Exception {
        String puzzle = "...9...4..81.....5..4.52......6.93...7....8..2.......4........16.3...9.....1.6.28";
        String solution = "325918746781463295964752183158649372476325819239871564842597631613284957597136428";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_107() throws Exception {
        String puzzle = "7....6.5..6.....4....7...8..4.......1..3.......3..24......73.92..8.6....6.2..13..";
        String solution = "734986251869125743521734986247698135156347829983512467415873692378269514692451378";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_108() throws Exception {
        String puzzle = ".....2..5.6.5..8....91...3.752.........38.......7......38.....1.....4..342...86..";
        String solution = "314892765267543819589176234752461398146389572893725146938657421675214983421938657";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_109() throws Exception {
        String puzzle = ".7......5....2.9..53....7....924.....285.9...........1.4..1...7..1....437..3.....";
        String solution = "972136485814725936536498712369241578128579364457683291643912857291857643785364129";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_110() throws Exception {
        String puzzle = "...3...747....4....2....15.....2..9...36.....5...9..4.4......6..9.....1..7126....";
        String solution = "168352974759814623324976158647528391913647582582193746435781269296435817871269435";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_111() throws Exception {
        String puzzle = "..2.4....68..51...7......8.....3...5......9..2.59..7.1.....9.78.....6.9...63.....";
        String solution = "932648157684751329751293486479132865318567942265984731523419678147826593896375214";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_112() throws Exception {
        String puzzle = ".5.3.........8.49.8..9...6.97....2.........174.6....8...8..........3.1...94...67.";
        String solution = "759346821162785493843921765971853246285694317436172589518267934627439158394518672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_113() throws Exception {
        String puzzle = "1..28.59....5.6..17....9..2.7.4.8.1..3.....4...2..........9.....53...........4..9";
        String solution = "164283597329576481785149632576428913831957246492631875647395128953812764218764359";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_114() throws Exception {
        String puzzle = "..76....14...........8.4.92.9.....5.68..72.....2..9.3.......5.6..5.238...........";
        String solution = "927635481418297365356814792194368257683572149572149638239481576765923814841756923";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_115() throws Exception {
        String puzzle = "24......9..3..5.......67.3...5..4...9...8.27...1.....6......6.4.8......7...27.1..";
        String solution = "247138569693425781518967432725694813964381275831752946372819654189546327456273198";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_116() throws Exception {
        String puzzle = "..325.........85.....7....8.......693.2.4....768...1...........8.......45..821.3.";
        String solution = "183259476274638591659714328415387269392146785768592143937465812821973654546821937";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_117() throws Exception {
        String puzzle = "............8...37.98..12..........6.65...9..8..4.53....4.....2....8.....72.561..";
        String solution = "643572819251849637798631245137928456465713928829465371384197562516284793972356184";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_118() throws Exception {
        String puzzle = "..2....9.....1.3........1.7..4....75.8.5.9.6..7......8...1.4.......3.5..1.5.67...";
        String solution = "312785694957416382468392157634821975281579463579643218893154726726938541145267839";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_119() throws Exception {
        String puzzle = "....6..5.4.631...........8...5...46..1....52...3..2...9.........247.....1..25..9.";
        String solution = "792468351486315972351927684275189463819643527643572819967831245524796138138254796";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_120() throws Exception {
        String puzzle = "...64..5..4.......5....8.......813....3.5...81....2..57..........54...36.82..5...";
        String solution = "827643159346519287591278643459781362263954718178362495734896521915427836682135974";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_121() throws Exception {
        String puzzle = "......6...34.9....6....8..3...6........4...5.25....1....8....4..96.2....1...8759.";
        String solution = "815743629734296815629518473487651932961432758253879164378965241596124387142387596";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_122() throws Exception {
        String puzzle = "......29..4....6....7.58...68...7...1.2....6......4.8.............4.19...5.78..13";
        String solution = "568143297341972658927658341684217539132895764795364182413529876876431925259786413";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_123() throws Exception {
        String puzzle = "......9....9.14..664.37......2..1.3..9...5....1..6...72..4...7......68........6..";
        String solution = "571682943329514786648379215762841539493725168815963427256498371137256894984137652";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_124() throws Exception {
        String puzzle = ".6..7....5....36.14......9..94.2..7.8.......4..7.6.5...........3..1.4...756......";
        String solution = "268971345579243681413685297694528173825317964137469528941756832382194756756832419";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_125() throws Exception {
        String puzzle = "7..........9.3....4.8..1..7.......8....627..5....45..95.3..4.....2...6......7.9.8";
        String solution = "736482591159736824428591367245319786891627435367845219583964172972158643614273958";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_126() throws Exception {
        String puzzle = "....1...8.9....7...6...5.....6...3.2.2....4..51..8.....8.....7....6.2.3...3.9..61";
        String solution = "735416928491328756862975143976154382328769415514283697689531274157642839243897561";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_127() throws Exception {
        String puzzle = "6.57....11.......8.9......2..1.3......7.4..6..8....9.5.1.9.3........5....74.8....";
        String solution = "625798431143256798798314652461539287957842163382167945816923574239475816574681329";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_128() throws Exception {
        String puzzle = "............1.5....4...8..2..9..31......1....68.75...4..7.6..3..9....7...54...98.";
        String solution = "138627549962145873745398612529483167473916258681752394217869435896534721354271986";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_129() throws Exception {
        String puzzle = "..1..9..6.....23....96.3.24..........58.....96..7....1..........4..3.7..16....5.8";
        String solution = "231479856486512397579683124712394685358261479694758231827145963945836712163927548";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_130() throws Exception {
        String puzzle = ".7...1..5.....5.4....3.2..1..8.1.....35...6..94.8....3.2....8....9....6....72....";
        String solution = "473681925281975346596342781768513492135294678942867513627139854319458267854726139";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_131() throws Exception {
        String puzzle = "..48.7..31......6..9....8..8.6.....2....1..3..5.9....1.....654.6...5....4....1...";
        String solution = "564827913178539264293164857816375492942618735357942681731286549629453178485791326";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_132() throws Exception {
        String puzzle = "..3......261.........376.......2...4.....9..5.75.4..86..............8..9.34.9.17.";
        String solution = "743251698261984357598376421386527914412869735975143286659712843127438569834695172";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_133() throws Exception {
        String puzzle = ".4..6.17....52....1.......8..8.....5...8.32..627...9...1......6..4.52......7.....";
        String solution = "543968172876521349192437658938276415451893267627145983719384526384652791265719834";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_134() throws Exception {
        String puzzle = "...2..4.......82.5.51..........148.....9......29.......3.1...7...857....1...2.6.4";
        String solution = "983251467476398215251467389365714892714982536829635741532146978648579123197823654";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_135() throws Exception {
        String puzzle = "5.1...3.8....7..2.......51.65.........9..2..4.2..9......47....32.......1.1...6..9";
        String solution = "571269348348175926962843517653417892189532674427698135894751263236984751715326489";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_136() throws Exception {
        String puzzle = "2......8....4........9..746.6.2.5..4...3...7..4..76.2...3.1....6....8....1......2";
        String solution = "294167385786453291135982746867295134952341678341876529423619857679528413518734962";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_137() throws Exception {
        String puzzle = ".74.81.......56.9....4...3....9....1..7..53....6..........2.....3....217...89...6";
        String solution = "974381562318256794562479138253948671487615329196732845645127983839564217721893456";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_138() throws Exception {
        String puzzle = "..7.18..9..4..5..1......5..9217....88..5........4.9.....8.....76.9............28.";
        String solution = "567218349394675821182394576921736458846521793735489612258143967679852134413967285";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_139() throws Exception {
        String puzzle = ".....8...1......95.5....3..2.....64.6..81.....9.4...3..4.......9.6.......3.524..9";
        String solution = "329158476168347295457296381213975648674813952895462137542689713986731524731524869";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_140() throws Exception {
        String puzzle = "....4....3......62..12...3.......52...8674......8..64......18....9....1..6.7.9...";
        String solution = "692347185347158962851296734476913528528674391913825647235461879789532416164789253";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_141() throws Exception {
        String puzzle = ".435....7.......2.25.3.9.6...4..58.1..1..4...7............8..9...21.........3...5";
        String solution = "643521987179648523258379164924765831831294756765813249516487392392156478487932615";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_142() throws Exception {
        String puzzle = ".....1.3.....7...93.....8.19.......7..7...18..2.64......2.....5...2...9.153.6..7.";
        String solution = "589421736216873549374596821935182467647359182821647953492738615768215394153964278";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_143() throws Exception {
        String puzzle = "......9.1..4....7.1.....52.....9...3.73...2...9.75......81...6...19........5.7.32";
        String solution = "367425981524819376189376524615298743873641295492753618758132469231964857946587132";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_144() throws Exception {
        String puzzle = "3......5.92.......86..7..4.....48......19...3.8.6...9.......4.1.4.5..739.....1...";
        String solution = "317264958924815376865973142592348617476192583183657294658739421241586739739421865";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_145() throws Exception {
        String puzzle = "..2..7....1.....3...8..6..4..4....623...82..7...56.3.....4.5.........27.8.17.....";
        String solution = "492837651615249738738156924984371562356982147127564389273495816549618273861723495";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_146() throws Exception {
        String puzzle = "..5.....6.46.9.3..81......22....7..85...2.........6.54...9.....1..8..4.......21.5";
        String solution = "925318746746295381813674592264537918581429673379186254432951867157863429698742135";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_147() throws Exception {
        String puzzle = ".........3.5.4...2...26...8.1..........4..9.5.7.3.62.17........2...184..6..5...8.";
        String solution = "928173654365849712147265398412957836836421975579386241781694523253718469694532187";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_148() throws Exception {
        String puzzle = "....9.5..92.3......7.6....4.....8.5.....3...24.1...69...7..2...1....3..5..2...16.";
        String solution = "618294537924357816573681924236948751795136482481725693867512349149863275352479168";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_149() throws Exception {
        String puzzle = "............14..6...7.59.31........7.3.4..5..8.2.....9.169.4....4.2.7..6........8";
        String solution = "165378924389142765427659831694825317731496582852713649516984273948237156273561498";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_150() throws Exception {
        String puzzle = "...71.9....2....1....9...26.2....3...4569....9.6..1.....8..5....7.2.....2.....53.";
        String solution = "684712953392586714157934826821457369745693281936821475418375692573269148269148537";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_151() throws Exception {
        String puzzle = ".53..617...........6..98..22....1..4.4.8..3.9...........1....6...97..8...2....9.1";
        String solution = "953246178812357496764198532275931684146872359398465217481529763639714825527683941";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_152() throws Exception {
        String puzzle = "..4.8.....5....26491.........7......3......57....54.1.........12..5..6.3.9..438..";
        String solution = "764285139853179264912436785547318926381962457629754318436827591278591643195643872";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_153() throws Exception {
        String puzzle = ".....6.3.....1.8.27..3..95..1.6..3....52...94.389.....1.......5.8............54..";
        String solution = "894526731356719842721384956419657328675238194238941567143892675587463219962175483";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_154() throws Exception {
        String puzzle = "4...7.9.........5...5..9.2.....4.7.1..8.......2..875.3..3.......9.....7818.4...3.";
        String solution = "432875916916324857875169324359246781748531269621987543563718492294653178187492635";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_155() throws Exception {
        String puzzle = ".....17.......6.94.4.35..8.....8......19.7...93.2....5........9...5..47.8.4...5..";
        String solution = "698421753153876294742359186426185937581937642937264815215748369369512478874693521";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_156() throws Exception {
        String puzzle = ".53.2.1..1.....9.....47..583..7.8.....2.......4......9.6..9.71............75..46.";
        String solution = "853926174174835926629471358396758241582149637741263589268394715435617892917582463";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_157() throws Exception {
        String puzzle = "1........7.2...64....2.7.8...5..9...91......3.....21.6........4287.......6.9..82.";
        String solution = "158496732732581649649237581325169478916874253874352196591728364287643915463915827";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_158() throws Exception {
        String puzzle = "...3.5.....7.91..8......3..48......1....835...92...4........13...1.....4.4...9.25";
        String solution = "824375916357691248169248357483952671716483592592716483275864139931527864648139725";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_159() throws Exception {
        String puzzle = "..5.....78..96.....3....9....1.......5...3.28.7.....14.2.6...9....2.8.6...4..9..5";
        String solution = "965321847847965132132487956281546379459173628376892514528614793793258461614739285";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_160() throws Exception {
        String puzzle = "...........74....2..3.5...8.........9.6...5......6281.3....81...9.17.3.475...4...";
        String solution = "649823751587419632213756498138547926926381547475962813364298175892175364751634289";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_161() throws Exception {
        String puzzle = ".64.9..5........18.8.3.2..7425..9....1..3.............3.....7.28..2....6.5.7.....";
        String solution = "764891253532476918189352467425689371918537624673124895341965782897213546256748139";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_162() throws Exception {
        String puzzle = ".....4.7.....2.1..8...6.9.2.26..........3.8.7.5...1.....3.7..1.6..892..3.8.......";
        String solution = "932184675567329184814567932326758491149236857758941326493675218671892543285413769";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_163() throws Exception {
        String puzzle = "....8....1......9..2913...6.........5789...1...236.........4....1...593.4..6..2..";
        String solution = "654289371137456892829137546361578429578942613942361758283794165716825934495613287";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_164() throws Exception {
        String puzzle = "..6.9.........8.5274.....8.............9..5612.3..147............8.4.635....79...";
        String solution = "856297143319468752742315986561784329487923561293651478124536897978142635635879214";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_165() throws Exception {
        String puzzle = "........11...5..8..9.1..7.4.7..8........49....3....479..9.36.....1..8....2...4..6";
        String solution = "457893261162457983398162754974385612216749538835621479589236147641978325723514896";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_166() throws Exception {
        String puzzle = "92...1.4...1.4..2.5..6.9.....4.........314.9....2....3.3....5..4...5.8...7.8.....";
        String solution = "926781345781543629543629187314978256652314798897265413238496571469157832175832964";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_167() throws Exception {
        String puzzle = "........41....4....2..7.6...926..4......39.....7.5...29.3....2....9...4.51.7..8..";
        String solution = "735196284169824375824375619392687451451239768687451932943568127278913546516742893";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_168() throws Exception {
        String puzzle = ".7.6....8.4.35..16.6..19.5...7........6.....5.9..74.....2....9....8.1....84......";
        String solution = "571642938249358716368719254857126349426983175193574682712465893635891427984237561";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_169() throws Exception {
        String puzzle = ".........34.5..2...9.314................71.94..46..5..6.......2.17..8.6..3...78..";
        String solution = "865792431341586279792314658973425186526871394184639527658943712417258963239167845";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_170() throws Exception {
        String puzzle = "....526...1...7.....6...2.1.....3...1.4...5..7.289.....819....3..3..5.8..2.......";
        String solution = "398152674215467839476389251869543127134276598752891346581924763643715982927638415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_171() throws Exception {
        String puzzle = "...5.1.82.5...9.....7.8...6276.1..5...5......3.....7.........6..839.........248..";
        String solution = "694571382852369147137482596276813459915247638348695721421738965783956214569124873";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_172() throws Exception {
        String puzzle = ".......9..63..2.8....46.7...1.9...65.5......89.8......8.7....4...51......9.7.4...";
        String solution = "524817693763592481189463752412978365356241978978356214837625149645139827291784536";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_173() throws Exception {
        String puzzle = "7........14.9...2....5846......3...8.......4..93......8.....1..21..483....7..1..6";
        String solution = "758162934146973825329584617571436298682719543493825761864397152215648379937251486";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_174() throws Exception {
        String puzzle = "9....2..76...1..4.......532...4.....2...9.3...5...68......5....89.....7..7...861.";
        String solution = "938542167625317948741689532189435726267891354453276891316754289892163475574928613";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_175() throws Exception {
        String puzzle = "......1..72...6.4.13.......4....3..2.6..9......8....5.....2739....8.....87.1..4.6";
        String solution = "986742135725316849134958267497583612563291784218674953651427398342869571879135426";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_176() throws Exception {
        String puzzle = "96.14...8.45...9......2..3.....82....5...6...4..79.25.......4.3..4.....9.1.......";
        String solution = "962143578345678912178925634796582341251436897483791256527819463634257189819364725";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_177() throws Exception {
        String puzzle = "6...5.....8..........4...73......2....93..4.7.1.74..5.7...3...2.91.6.3...4.....8.";
        String solution = "637259814184673529925418673476985231859321467312746958768534192291867345543192786";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_178() throws Exception {
        String puzzle = "....7.6..156...........2...8194....3...1..45............7.5.....6.2.7.8.3...68.2.";
        String solution = "492571638156843279738692145819425763673189452524736891287354916965217384341968527";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_179() throws Exception {
        String puzzle = "..1..2.76.3.......287..14..........8.13...92.7..2.4....9...........85.......3.8.9";
        String solution = "951842376634759182287361495429513768513678924768294531895127643346985217172436859";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_180() throws Exception {
        String puzzle = "...........5.2...9.93.4.7.6.........5.1..8..4...2519....2.......3.....1..849.62..";
        String solution = "267389541415627839893145726978463152521798364346251987752814693639572418184936275";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_181() throws Exception {
        String puzzle = "96.............2..4.59...7........125....893..7..3...8...5.31.....19.....92.8....";
        String solution = "968327541731845296425916873384659712516278934279431658847563129653192487192784365";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_182() throws Exception {
        String puzzle = ".........9.48..6.....714..2.2..6...53.....2..6.81.7.........1...43....5...1.3..6.";
        String solution = "182396547974852631536714982427963815319548276658127394865479123243681759791235468";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_183() throws Exception {
        String puzzle = ".2..94...3......4.8.95........4.2681......4.3.......5...3.5...2...1..3.......61.5";
        String solution = "721894536356217948849563217597432681168975423234681759413759862675128394982346175";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_184() throws Exception {
        String puzzle = ".........4..87..15.3....82...9.3.....8.....6.2..15...3....6...7..7.85..93.....2..";
        String solution = "852613794496872315731549826619438572583927461274156983928364157147285639365791248";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_185() throws Exception {
        String puzzle = ".....4.899......6.....9....4..2......5..3.72.8.7....4...2.....879.3.......8.1.4.6";
        String solution = "375624189981573264246891357413267895659438721827159643162745938794386512538912476";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_186() throws Exception {
        String puzzle = ".......8.3...976.....8.39.....5............3...9.482.5.71.....2...4.....635....47";
        String solution = "197264583358197624264853971843526719526719438719348265471635892982471356635982147";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_187() throws Exception {
        String puzzle = "........73.......87....63..........4..6.27.8..8...5921.51.7.....6...2.3......8..5";
        String solution = "618239457329754168745186392532891674196427583487365921251973846864512739973648215";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_188() throws Exception {
        String puzzle = "8.......64.5..8...1......3.......2.5.518.9..........78.4....12...63...49...4.5...";
        String solution = "823917456465238791197564832978643215251879364634152978549786123786321549312495687";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_189() throws Exception {
        String puzzle = "..8......6.18.3...42..5..........82...62.879...4....1.........37....4....593.7...";
        String solution = "538412967691873452427956138975631824316248795284795316142589673763124589859367241";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_190() throws Exception {
        String puzzle = "..2..1....3...4..5.9...7.12.5.93...8...7.6...8.......6......16........5.9..15...3";
        String solution = "642591387731824695598367412156932748429786531873415926385279164217643859964158273";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_191() throws Exception {
        String puzzle = "32............86.9....54..2......3.8...4...2..85....945.1..6.......3....462.9....";
        String solution = "328961475754328619916754832149572368673489521285613794531246987897135246462897153";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_192() throws Exception {
        String puzzle = ".4..5...6...8.6..3..7.4.....2..3.....5...493...6..8...8....56....43...9....9....1";
        String solution = "342159786519876423687243159928731564751624938436598217893415672174362895265987341";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_193() throws Exception {
        String puzzle = ".3...4..77..23...6.4...5...1...2.......9.6......3..8.5..4...9.......92...95...7.3";
        String solution = "231694587758231496946785132173528649582946371469317825624173958317859264895462713";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_194() throws Exception {
        String puzzle = "....7.6..3..1..5492...8............1.6.7..48...58.4.......2.....213.....43....1..";
        String solution = "194573628387162549256489317843296751962715483715834296579621834621348975438957162";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_195() throws Exception {
        String puzzle = "..69.....1.7.5.3.........5......4..3.8...3.72..1..7...8.5.764...6....1....91.....";
        String solution = "256938741147652398398741256972864513684513972531297864815376429763429185429185637";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_196() throws Exception {
        String puzzle = "....7...41..58.....9......2.35.4......87...91.......3..5....1.8..63.....94...6..3";
        String solution = "582973614164582379397614852735149286628735491419268537253497168876321945941856723";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_197() throws Exception {
        String puzzle = "...6...4..5.19.....13.8...262......8.71......9....4.71.....8...8.....3...6.53....";
        String solution = "298673145456192783713485962624719538371856429985324671537948216849261357162537894";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_198() throws Exception {
        String puzzle = "...........1..2..335....8.6.....3..7...1.8.......4.539.98....2...53.....2..6.9.4.";
        String solution = "864735912971862453352914876426593187539178264187246539698457321745321698213689745";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_199() throws Exception {
        String puzzle = "..2.3...58.....9.4694..7...4.3.....1....8..........29......6......2..31.9....5.62";
        String solution = "712934685835612974694857123463729851279581436158463297327196548546278319981345762";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_200() throws Exception {
        String puzzle = ".....3.......2..4...5861..2..7....8.543..8...8..9..435......9..........1..63.5..4";
        String solution = "729453618618729543435861792297534186543618279861972435382146957954287361176395824";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_201() throws Exception {
        String puzzle = ".6....8.51..6.4.9.9.7..5.2.5...7.........92....8........1.8...6.5....982...7...4.";
        String solution = "462397815185624397937815624593278461614539278278461539341982756756143982829756143";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_202() throws Exception {
        String puzzle = ".5.....6...1..3...698..1....745...9......451.....92..3...139.4....4....8....6....";
        String solution = "253987164741653289698241357374516892982374516516892473827139645169425738435768921";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_203() throws Exception {
        String puzzle = "..9..427.4.......6...2.......7....6..1.8...3...2.4.1...5..1.8....8569....4...8..9";
        String solution = "169384275425971386783256941897132564614895732532647198956413827278569413341728659";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_204() throws Exception {
        String puzzle = ".48.....5.1...5.9.9.2...16......2..9...4..32......94.6....7......4.......61.5.8.7";
        String solution = "648291735317645298952738164476312589895467321123589476539874612784126953261953847";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_205() throws Exception {
        String puzzle = ".9.....4......6.9....37.2.1.......1.43......7.15.8...4.6.5.8......62.4....89..1..";
        String solution = "397251648521846793846379251782493516439165827615782934964518372153627489278934165";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_206() throws Exception {
        String puzzle = ".41..8.....59...6....614....1........27.49........7.13.7......29.......6...2.1.94";
        String solution = "641758329785923461293614875518362947327149658469587213174896532932475186856231794";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_207() throws Exception {
        String puzzle = "..31....8....3..16..2498..37......4...827....9..........93....2..6..1.8.31.......";
        String solution = "573162498894537216162498753721983645648275931935614827489356172256741389317829564";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_208() throws Exception {
        String puzzle = ".......6.9.57..1.47.....925.....2..7...5.8.......6.29.2...14.5....6.....1...3.6..";
        String solution = "413259768925786134768143925641392587392578416857461293276814359539627841184935672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_209() throws Exception {
        String puzzle = "4............4.8.1..8.5673......4..7..46..1.....9.2.....3.......19.28..5......283";
        String solution = "437891652562743891198256734921584367854637129376912548283475916619328475745169283";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }


    @Test
    public void test_210() throws Exception {
        String puzzle = "5.......21...6.5....6.73..8.5...9.2.....1...7....8...9.3.......28..3...5...4...31";
        String solution = "573891462198264573426573918857349126349612857612785349731956284284137695965428731";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_211() throws Exception {
        String puzzle = ".4...95.39.2..7............43.........6.7.3....894....8...94...5......86...7.6..4";
        String solution = "641829573982357461375461298439615827156278349728943615867594132594132786213786954";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_212() throws Exception {
        String puzzle = "..932..6........4.6...4.21...38....4........9.81.65....9...35.....1.....7....2.9.";
        String solution = "849321765312576948657948213273819654465237189981465372194783526526194837738652491";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_213() throws Exception {
        String puzzle = ".......85.81.4.....37..1..4....13......4......2..6.7.....6...4..9...7..1..3...652";
        String solution = "249376185581942376637581294965713428718429563324865719152638947496257831873194652";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_214() throws Exception {
        String puzzle = "...638...3....1........5.8..2...7....8.5..47..4.....2.....9..4..9.7...1...4.1.26.";
        String solution = "475638192368921754219475386526147938983562471147389625831296547692754813754813269";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_215() throws Exception {
        String puzzle = "...1....8...35.....5...9.........4..4....8.9..8.23....6.......77......3..34.76952";
        String solution = "973142568846357129251689374362791485417568293589234716625913847798425631134876952";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_216() throws Exception {
        String puzzle = "...2..4.5....6.3...6...8....1..5......48327.9.3.6....2.......2......35..7.8.....3";
        String solution = "389271465271465398465398271812759634654832719937614852543187926126943587798526143";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_217() throws Exception {
        String puzzle = "..........76..1...8.2..6.5..9..7.3...6......214..6.9......14......3...2...59.2.7.";
        String solution = "951438267476521893832796451298175346563849712147263985729614538684357129315982674";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_218() throws Exception {
        String puzzle = ".65....3.4.7....8...8..7..1.2...1.....68.....9....6........3...7...6.41..14..8..9";
        String solution = "165284937437619285298357641823491756576832194941576328659143872782965413314728569";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_219() throws Exception {
        String puzzle = "..........45..9.2...2..46.1...2...4.4...1.....9...5..7.2.....1.5..7..46...8.6..9.";
        String solution = "367128954145679823982354671871236549453917286296845137624593718539781462718462395";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_220() throws Exception {
        String puzzle = "....8...31......25...69..84..3..2....2.8.9....9..7......1.....9..7.3...63....8.4.";
        String solution = "974285163186347925532691784713452698425869371698173452841726539257934816369518247";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_221() throws Exception {
        String puzzle = ".21..6..4..5....2..6....3......314.....4....85............7.9..8.25.4....3...264.";
        String solution = "921386574345719826768245319289631457613457298574928163456173982892564731137892645";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_222() throws Exception {
        String puzzle = ".3.........2...6.16..5..2.8....1..7..1....8.3.....4..6..36....24..87....2..9....4";
        String solution = "835126947972483651641597238369218475514769823728354196193645782456872319287931564";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_223() throws Exception {
        String puzzle = "..7.6.....5.2..6...6....1.2..3.8...48....5.....1...2.3..2..3.41..........1.75.8..";
        String solution = "237168495159247638468539172623981754874325916591476283782693541945812367316754829";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_224() throws Exception {
        String puzzle = ".....3.6.5...18..9....7..8...9..4.......6...1..6....53.48....2.12...79.....2..7..";
        String solution = "481923567567418239932576184819354672354762891276189453748691325125837946693245718";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_225() throws Exception {
        String puzzle = "..4.56...3.58...9........6..4.91..86.....2....2.7.5.3........1..8.1....4.....4..2";
        String solution = "974356128365821497218497563547913286139682745826745931453278619782169354691534872";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_226() throws Exception {
        String puzzle = ".....7.....6..4..99...6..5.....9.......7..3.22..8.1..7......13.65..18...8.3...7..";
        String solution = "345987216126534879978162453764293581581746392239851647492675138657318924813429765";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_227() throws Exception {
        String puzzle = "..7......4.31...97.1.6.9..5.....2..........8....5..9.6.........9.641.3....8.67..4";
        String solution = "697354812453128697812679435761892543539746281284531976145283769976415328328967154";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_228() throws Exception {
        String puzzle = "..8.....7..63...8....1.5.6..839.....97..1.5.........2..67..2...8...9....4....68..";
        String solution = "158269347296347185734185269583924716972618534641573928367852491825491673419736852";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_229() throws Exception {
        String puzzle = "...........3..68.5.4..8.9...3..7......4.1..7..8.9..3....84....7.7.83.2......91...";
        String solution = "816359742793246815245187936531678429924513678687924351358462197179835264462791583";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_230() throws Exception {
        String puzzle = ".....3.4..7..9....438..5......5.2.1...27......4......8..9.3.82...3.4..6......7..3";
        String solution = "921873546675491382438625971396582417582714639147369258759136824213948765864257193";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_231() throws Exception {
        String puzzle = "..........3.6.......4.2891.............497...82...147..........6..239..13.....846";
        String solution = "287913564931654287564728913476582139153497628829361475715846392648239751392175846";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_232() throws Exception {
        String puzzle = ".8...5...3......47....2.5...2.5...36......2..43..9..7....4.3.1.6.8.7.4..5........";
        String solution = "981745362352961847764328591827514936195637284436892175279453618618279453543186729";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_233() throws Exception {
        String puzzle = "..........4.18..5...89................1..8.495..4.3.26..7......3....9...9..53678.";
        String solution = "195362478643187952728954361864295137231678549579413826457821693386749215912536784";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_234() throws Exception {
        String puzzle = ".6...53..5..4...8...19..........7....9...4.57.58...16...4..3.9.....5..7.9.......8";
        String solution = "869275341527431689341968725416587932293614857758392164174823596682159473935746218";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_235() throws Exception {
        String puzzle = ".............7..5.516.28.4..........6.3.....7.89.52..1..8....9.9..6..8..76..1....";
        String solution = "837564219294173658516928743175386924623491587489752361358247196941635872762819435";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_236() throws Exception {
        String puzzle = "......4...942...5.....5..7.47..1.....5.....3...1..95........2...267..1..7...8.94.";
        String solution = "567938412194267358283154679472315896859426731631879524348591267926743185715682943";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_237() throws Exception {
        String puzzle = ".......9....69..5.52.7.........3...9.8.2.53...4..8...63...46..5..1......2..3..4..";
        String solution = "836524197714693852529718634652431789987265341143987526398146275471852963265379418";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_238() throws Exception {
        String puzzle = "..3.2........8..758.13....696.8...5.....124..1...........6...3...693.8..........7";
        String solution = "653724918249186375871395246964873152387512469125469783792648531516937824438251697";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_239() throws Exception {
        String puzzle = "4..7.1...75...3..82..........51....3....6..5.38...5.47.....4..1....1.8.2.......3.";
        String solution = "498751326751623498263489715925147683147368259386295147872534961534916872619872534";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_240() throws Exception {
        String puzzle = "..........1.....47....563.2..........2..1..3.7..642..1.......1..73.25.8.5...3...4";
        String solution = "392784165615293847847156392951378426426519738738642951284967513173425689569831274";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_241() throws Exception {
        String puzzle = ".73......2....6.....4...3.9.......8.7.1.8.4...2....761....1..2...6.2.......938.4.";
        String solution = "873149256295376814614852379439761582761285493528493761387614925946527138152938647";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_242() throws Exception {
        String puzzle = ".6...3.2.3..9...4.4.....5.8.........2...3......6..23.1.7.46....69.........82.7..9";
        String solution = "861543927357928146429176538713694285285731694946852371172469853694385712538217469";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_243() throws Exception {
        String puzzle = ".6......23....2.9...1...576...........26..31..8.3.54....7.96..8.....7...1...5....";
        String solution = "964571832375862194821943576513724689742689315689315427437196258258437961196258743";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_244() throws Exception {
        String puzzle = "2......7.....4.....76..9.....1..5.9....6....59.....64.6......5..3..8...7.5.3.41.2";
        String solution = "293158476518746239476239518861425793347691825925873641682917354134582967759364182";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_245() throws Exception {
        String puzzle = ".......5...1..46..9...7...8.....7..971..45...4...8.......2.9..7.4..1..6..7....1.2";
        String solution = "367821954821594673954376218682137549713945826495682731136259487249718365578463192";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_246() throws Exception {
        String puzzle = ".....1.....2.8..7..6...4.38...8..1...45...7..7216..4.3.......1.....9...23....6...";
        String solution = "983761254452983671167524938639847125845312796721659483296435817574198362318276549";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_247() throws Exception {
        String puzzle = "..3......9.......4...6...31...8..........73..8.423.56..2...8.1.....5....6981..2..";
        String solution = "163489725952713684487625931539846172216597348874231569325968417741352896698174253";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_248() throws Exception {
        String puzzle = "7..3..2.9.8..1...3..2..65...28.......5...41.....1........58.........9..26.3..2.1.";
        String solution = "761345289589217463432896571128753694357964128946128357274581936815639742693472815";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_249() throws Exception {
        String puzzle = "6.24.......49..2...9.3......59.....1...589..6....1...83......8.....2..5....6..1.4";
        String solution = "632458917584971263197362845859246731713589426246713598375194682461827359928635174";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_250() throws Exception {
        String puzzle = "6.......3.9........52..6.4..2.7..........51.6.79.3....9.4..3.52...9...3...1.....8";
        String solution = "617489523498352617352176849126748395843295176579631284964813752285967431731524968";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_251() throws Exception {
        String puzzle = "..........28.7..1.7.46.......1....9..9.1.4.8.5.....3.....41.5..3....9......7.36.9";
        String solution = "163842957928375416754691832831567294692134785547928361289416573376259148415783629";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_252() throws Exception {
        String puzzle = "3.......71..9.8..2.49..........3...1....523.......4..6.....7...4.8...15.6....9.84";
        String solution = "386245917157968432249371865892736541764152398531894276915487623478623159623519784";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_253() throws Exception {
        String puzzle = "....18....1.63...........897.9..62....2.....58...5.3......93.4.6......3...14...5.";
        String solution = "475918623918632574263574189759346218132789465846251397527193846694825731381467952";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_254() throws Exception {
        String puzzle = ".....8.....367.......91.76.....4.89...8..3.5.....9..7..........31.5......452.9..1";
        String solution = "276358419193674285854912763537146892968723154421895376689431527312567948745289631";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_255() throws Exception {
        String puzzle = "6..........537..9.....1...7.....2.4.14..5.....83...9....6.9..........32.93.48...5";
        String solution = "671924583825376194394518267569832741147659832283147956756293418418765329932481675";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_256() throws Exception {
        String puzzle = ".......1...4...3..36.5....7.35.284.....31.......74.....2...7........15..9.7...8.2";
        String solution = "259473618874169325361582947735928461642315789198746253526837194483291576917654832";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_257() throws Exception {
        String puzzle = ".21..9.....7.1..6....8..31.......53..1..9584..7...8.......3......94..1...6..2....";
        String solution = "321659784487213965956874312894762531612395847573148629145936278239487156768521493";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_258() throws Exception {
        String puzzle = "....5..345..7..8.9.....9.....9..3.....3.....56..8......1...8...7...6.4..9.4.2.6.3";
        String solution = "298156734561734829437289156859413267143672985672895341316948572725361498984527613";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_259() throws Exception {
        String puzzle = "3....8.6...2..54.9.76...21..4...9.....7...9...1.82......93.2....6...........71...";
        String solution = "394218765182765439576943218643159827827436951915827643459382176761594382238671594";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_260() throws Exception {
        String puzzle = ".98.....7.7..8..2....3..5..2.........3..7.....65...9..........46.7..3..89...4625.";
        String solution = "598462317173985426426317589214639875839571642765824931352198764647253198981746253";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_261() throws Exception {
        String puzzle = "............863.2..912...8...........27.......14...8.7....9...3.....5.1...9324.65";
        String solution = "862951374475863129391247586938716452527489631614532897756198243243675918189324765";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_262() throws Exception {
        String puzzle = "..1.....37....2..5.3..942.8....4....2..6..9...183.........17....7......639....5..";
        String solution = "821756493749832165536194278963245781257681934418379652684517329175923846392468517";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_263() throws Exception {
        String puzzle = ".79....1..3...56.7.....9.............8.5....251...6.4..2.8.........714.....29..35";
        String solution = "679382514832145697145769283296438751483517962517926348924853176358671429761294835";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_264() throws Exception {
        String puzzle = ".864.....2...8.....4..7..9....5..6.......19..3.......5..3.4.71..6.....39..8..9.6.";
        String solution = "986415372237986451145273896812597643654321987379864125593642718461758239728139564";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_265() throws Exception {
        String puzzle = ".....6.....3....72521.9.........7..8.98......7.....426..46.37...6.8..5...1.......";
        String solution = "479236815683514972521798634246357198198462357735189426954623781362871549817945263";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_266() throws Exception {
        String puzzle = "3......6..6..3..7.7....5....3.5.......91....4..8....21...6.........9.41..5.81.63.";
        String solution = "394781562265439178781265943132548796679123854548976321913654287826397415457812639";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_267() throws Exception {
        String puzzle = ".5.923...7........92....1.5..........354...1.6.4..53.9.....8.........27.3.8.1....";
        String solution = "451923867786541923923867145897136452235489716614275389542798631169354278378612594";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_268() throws Exception {
        String puzzle = "..........6...1..31.3782............5.29..6..98.57............6.91..6.38..4.....9";
        String solution = "478369152269451873153782964317628495542913687986574321835197246791246538624835719";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_269() throws Exception {
        String puzzle = "2..1..63...4.......5..36.....784.....8.9....71......4......5.....8..97.3..5.8.1..";
        String solution = "279158634364792815851436279527843961483961527196527348912375486648219753735684192";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_270() throws Exception {
        String puzzle = "1.6.......3..4..1..87.2..5.....31.29.7....8.......43.1.........918......2...5...8";
        String solution = "126975483539648712487123956845731629371296845692584371753819264918462537264357198";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_271() throws Exception {
        String puzzle = "9.1.....8..4......3...64.......3.5.7.2.5....1....9.32...28..73......59..13.......";
        String solution = "951723648264958173378164259419632587623587491785491326592816734846375912137249865";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_272() throws Exception {
        String puzzle = "..........1...5..3957..8.2...1.....8.6.4.9.71....57............7...96....35.4...6";
        String solution = "386214759412975863957368124571623498263489571849157632698531247724896315135742986";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_273() throws Exception {
        String puzzle = ".....1....68.3...2...72.3...91............4...8.4.965.5.6.....3....7.8...4....76.";
        String solution = "324861579768935142915724386491657238657382491283419657576248913139576824842193765";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_274() throws Exception {
        String puzzle = ".......2...3..7........147...8......746.....3.5.4..2.9............1.4.5.1..2358.4";
        String solution = "487659321213847695695321478928513746746982513351476289564798132832164957179235864";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_275() throws Exception {
        String puzzle = "31....8..9.4.......7.9...3....69..7.16..7..2.......1.9...5...1.4.72..3.......3...";
        String solution = "312756894984132657675984231523691478169478523748325169836547912457219386291863745";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_276() throws Exception {
        String puzzle = "49...2.....3...1.....716......2..6....86...1.......39.9....32.....49.....5.1..47.";
        String solution = "491352867673984125285716943739241658528639714164875392947563281812497536356128479";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_277() throws Exception {
        String puzzle = "........469.....57..8...2...........2......8..4.3917...5.........3.2..457.2.653..";
        String solution = "321758964694213857578946213167582439239674581845391726456839172983127645712465398";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_278() throws Exception {
        String puzzle = "2..7....6..7..58......16..3...4.8...1..62....9...37....5.......3......2..9.3..1.8";
        String solution = "218743596637295814549816273723458961184629735965137482852961347371584629496372158";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_279() throws Exception {
        String puzzle = "..6.......289....5.....5..7........6..9.14...4....397...5.....3...8.9.5..1..7..29";
        String solution = "756182394328947615194365287537298146269714538481653972975421863642839751813576429";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_280() throws Exception {
        String puzzle = "...3....7..1....4842.........9.....6..86..2.3.1.9.2.......96....9.17..5....2...8.";
        String solution = "985364127671529348423781965239847516748615293516932874852496731394178652167253489";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_281() throws Exception {
        String puzzle = "..9....5.1..4....626....3.8.2....5..7....6...9..823.....6.1.2.......7.9......4.3.";
        String solution = "349678152185432976267591348628749513734156829951823764496315287813267495572984631";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_282() throws Exception {
        String puzzle = ".......7.6.21.....341...2..5....97...1.2.8..4.8.............1.....36.4.8.5...1.6.";
        String solution = "895432671672195843341786295534619782916278534287543916763854129129367458458921367";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_283() throws Exception {
        String puzzle = "....594..2...1..7...638...9..2.3.........8...6.5....2.3..49....5...2.38.........4";
        String solution = "813759462259614873476382159782536941941278635635941728368495217594127386127863594";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_284() throws Exception {
        String puzzle = "....73.2..39.............41...34...6.5.1..9..........25...974....4....7.8.2..6..5";
        String solution = "481573629239614857765928341928345716357162984146789532513297468694851273872436195";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_285() throws Exception {
        String puzzle = "............53.2.8..5..24....92...15..3.....4.863......3.748....78......6......4.";
        String solution = "827461953164539278395872461749286315213957684586314792931748526478625139652193847";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_286() throws Exception {
        String puzzle = "....9.....8.....5....2.59.62...........4.71.9.34.5.7........36...3.4....5.9....12";
        String solution = "352698471986174253471235986297381645865427139134956728728519364613842597549763812";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_287() throws Exception {
        String puzzle = "....2......31.4..7.4...76....48....96.......8....6.71....3...4.9...16....5..7.9..";
        String solution = "597623481263184597148597623714835269629741358385962714876359142932416875451278936";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_288() throws Exception {
        String puzzle = ".87...129..2.4.....3..............91..3.......2.75...4..4.17.3..5..........4.97.2";
        String solution = "487635129592148673136972845675384291843291567921756384264517938759823416318469752";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_289() throws Exception {
        String puzzle = "...4.7..17..95..8.2.....5.......18..5....4.9..2..6...5.........98...6.3.1..74....";
        String solution = "859437261716952384234618579693571842571284693428369715347895126985126437162743958";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_290() throws Exception {
        String puzzle = "8.....9..5.3........69..3...1...2..3....9.82..5...719...2.........751......3...86";
        String solution = "841263957593478612726915348419582763367194825258637194932846571684751239175329486";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_291() throws Exception {
        String puzzle = "..7......1........8365...74.1.....57.2....1.3.5...9...5...6.......1.4.......5.268";
        String solution = "297436581145798326836521974319642857624875193758319642583267419962184735471953268";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_292() throws Exception {
        String puzzle = "589..4....4....8...7......63..56...9...9.32......2......7...18.6.5...........96.2";
        String solution = "589614327146732895273895416312568749758943261964127538497256183625381974831479652";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_293() throws Exception {
        String puzzle = "1..3..8....5...2419.............9..2..6..2.844...6.3.....9.7..........6..74..6..5";
        String solution = "142375896735698241968124537813549672596732184427861359681957423259413768374286915";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_294() throws Exception {
        String puzzle = "...5....738...79.62...9..............629....1...34.2..5.1...7...78..........8.31.";
        String solution = "694538127385217946217496853143862579862975431759341268531629784478153692926784315";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_295() throws Exception {
        String puzzle = "..2..7.6.1..9......86..3.5....5.........3.7.6.3.6.9..4.65........8....93....1.4..";
        String solution = "342157869157968342986243157674582931529431786831679524765394218418725693293816475";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_296() throws Exception {
        String puzzle = ".3........68.19.3....47..5...........9.....26.....61....7..2...9..5...1..82.34..7";
        String solution = "734658291568219734219473658326891475891745326475326189657182943943567812182934567";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_297() throws Exception {
        String puzzle = "9..7.......1..8....85.......94.2.......1...5....94573..3.6..97.....31..6......8..";
        String solution = "963714285241568397785293641594327168327186459816945732138652974479831526652479813";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_298() throws Exception {
        String puzzle = "....74.81....3..46...8......5..19.....83..6..9..5.7.....2....9..6.......149...2..";
        String solution = "695274381287135946431896725354619872718342659926587134872461593563928417149753268";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_299() throws Exception {
        String puzzle = ".....9..4.....67...57...93.....2.....98.......4......5..4.9..1.7.21..5..1....4.78";
        String solution = "826379154913546782457281936675823491298415367341967825584792613762138549139654278";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_300() throws Exception {
        String puzzle = "..5.14....1..7......8..96..1...53..9.2.....7.9.6..1....69.2....8......9......7..8";
        String solution = "395614287614872953278539614187253469523496871946781532769328145832145796451967328";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_301() throws Exception {
        String puzzle = ".7.....2......1.5.6.2.4.9..4.6......8..4.21..3...5.2....3...68....73..........74.";
        String solution = "571693428984271356632548917426319875857462139319857264743925681168734592295186743";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_302() throws Exception {
        String puzzle = ".....5....46...7.51...36....5.2...4...13......3.4.8......9.4..2.8...........279.6";
        String solution = "793845261846192735125736894958271643471369528632458179567984312289613457314527986";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_303() throws Exception {
        String puzzle = "....8.3..6.2......5.1...8.......41.....896..44.......6..7.5.2....6....9.8.4.71...";
        String solution = "749185362682937415531462879968524137173896524425713986317659248256348791894271653";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_304() throws Exception {
        String puzzle = "..1.8..........7.4...352.6.1.....5...6..3..97.5.6....1.74.........2.........46.53";
        String solution = "691487235325169784847352169183974526462531897759628341574893612936215478218746953";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_305() throws Exception {
        String puzzle = ".9......25..4.2..6......518..69.........17..9....45.2.9...8...5..3.......1.3.9...";
        String solution = "697158342581432976342796518456923187238617459179845623964281735723564891815379264";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_306() throws Exception {
        String puzzle = "......917.54....3....8.....8.......3..2.3.69....41...2....7..2.1........467..9..8";
        String solution = "638245917254197836791863245816952473542738691379416582985671324123584769467329158";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_307() throws Exception {
        String puzzle = ".....4....3986........91.....6.8......4..25..25.....968..91.3...2....7.....3....8";
        String solution = "162734985439865127578291643316589274984672531257143896845917362623458719791326458";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_308() throws Exception {
        String puzzle = "9......8.....36...1.....2......487....16.2.483...7.....69.........2..67.78......4";
        String solution = "956721483824936517137854296692348751571692348348175962269417835415283679783569124";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_309() throws Exception {
        String puzzle = ".....3.9...8.....63...2..7.........2.1.8725.....5..64..5...7....2...98.3.4..8....";
        String solution = "574163298298754316361928475735496182416872539982531647853217964127649853649385721";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_310() throws Exception {
        String puzzle = ".........8....9..671..2.3.......1..5.5..3...8.6.74.2...36.5..1......3....7..1..3.";
        String solution = "625384971843179526719526384392861745457932168168745293936457812281693457574218639";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_311() throws Exception {
        String puzzle = ".........6.4..17.93...6.2......9...6..6.7...22......1..9...7..1...8......8.529.3.";
        String solution = "958742163624381759317965284135298476846173592279456318592637841763814925481529637";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_312() throws Exception {
        String puzzle = "...6.....93...5..1....18.6.1...6...2.....2.57.9........57.8.....1.2....34....3.8.";
        String solution = "781639425936425871542718369175864932864392157293571648357986214618247593429153786";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_313() throws Exception {
        String puzzle = ".1...4..5.3...7.89.859.............16....974.4.85......4..........27........35..8";
        String solution = "916824375234157689785963124329746851651389742478512963842691537593278416167435298";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_314() throws Exception {
        String puzzle = "..........7.12..3.9.....876..........58.13..2..39..7....4....2.2...3..8.6...97...";
        String solution = "345786219876129534912354876429578163758613492163942758534861927297435681681297345";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_315() throws Exception {
        String puzzle = "...3...76.8..9.....2....15..39.146....6....8...4.2........7...535.....6....45....";
        String solution = "195342876687591342423768159539814627276935481814627593948176235351289764762453918";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_316() throws Exception {
        String puzzle = "..84.9....7....85.........4..5..4.9.....5..131.......8......6......27.4.3.1.98.2.";
        String solution = "568479132479213856213865974635184297827956413194732568752341689986527341341698725";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_317() throws Exception {
        String puzzle = ".......1......1..8.92.5...3..........61..39....3.2.561..4..........17.8..8.4.6..7";
        String solution = "658374219437291658192658743279165834561843972843729561714582396326917485985436127";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_318() throws Exception {
        String puzzle = "8..6..95...4.........9.4..3.7.....8...8.....1..6..24......9.6.2.43..6...9....35..";
        String solution = "831627954794538126625914873479361285258749361316852497187495632543286719962173548";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_319() throws Exception {
        String puzzle = "..5.........7.1.5..19...26...2..9...1...4.9.......38.6.8..6.5....75...1....1....9";
        String solution = "845326791263791458719485263672859134138647925954213876381962547497538612526174389";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_320() throws Exception {
        String puzzle = ".........652.8.1...3.419...........6..1...2...457..3.1.....8....2........13..675.";
        String solution = "194625837652387194738419562287531946361894275945762381479158623526973418813246759";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_321() throws Exception {
        String puzzle = "..79.31.......6...5..72...9.......32.....75..4......1..465.....8..1....59.3....6.";
        String solution = "687953124291486753534721689718645932329817546465392817146539278872164395953278461";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_322() throws Exception {
        String puzzle = "..89.....365..8..1....1....8..741.6.....5.1.7.3........4.....9.9......23..2.....5";
        String solution = "218937654365428971794615238859741362426359187137286549543172896981564723672893415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_323() throws Exception {
        String puzzle = ".........342.15..98.9.43..6...........84.........87134.........59.7......1....27.";
        String solution = "165879423342615789879243516451362897738491652926587134287136945594728361613954278";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_324() throws Exception {
        String puzzle = "........35..83.1.28...7....4.2.96.....542.....96...3....4...8...2...1........5.6.";
        String solution = "271659483569834172843172659432796518185423796796518324954267831627381945318945267";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_325() throws Exception {
        String puzzle = ".....7......3.9126.....24...5.........6.1...5.37...9.4.....5.7..9..4..18..2...3..";
        String solution = "621457893475389126389162457258694731946713285137528964814935672793246518562871349";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_326() throws Exception {
        String puzzle = ".....3......2..6....6.7..85.......3......5.192..18.4.....5.....49.....5..27.14..8";
        String solution = "852463971179258643346971285918746532764325819235189467683597124491832756527614398";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_327() throws Exception {
        String puzzle = "4.6...........4....51.39...19...7..4.....27....3.45962.......2..4.......9..8..5..";
        String solution = "476518293329764185851239476192687354564392718783145962615473829248951637937826541";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_328() throws Exception {
        String puzzle = "..5....7...6..5...2...78.95........2..23.1....87.2...9.9...6..7..3....1.......8.3";
        String solution = "945213678876945321231678495319867542452391786687524139198436257563782914724159863";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_329() throws Exception {
        String puzzle = "........267.98.........157......8.....43.......62...39.........9...641..3..1.742.";
        String solution = "413756892675982341892431576739618254254379618186245739541823967927564183368197425";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_330() throws Exception {
        String puzzle = "....2.6....1.........65..9..9.7..13....594....8..3154.......48..45......2.6......";
        String solution = "358129674961478253472653891594786132123594768687231549719362485845917326236845917";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_331() throws Exception {
        String puzzle = "43............9..35.9...86.....2.3.....8.3...6...1...98..5.6.....1.4..9..7..31...";
        String solution = "438652971726189453519374862154927386297863514683415729842596137361748295975231648";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_332() throws Exception {
        String puzzle = ".1.2....4..6..1.3.7...4..8.........327.5..89.3.1......5.....7.2.6..1........3...8";
        String solution = "813256974946871235752349186685197423274563891391428567539684712468712359127935648";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_333() throws Exception {
        String puzzle = ".1..9...28........5...3...6..3.4.7....4.7.......5.2..8....27.6...81.9..3.......19";
        String solution = "317698452846215937529734186683941725254873691971562348195327864468159273732486519";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_334() throws Exception {
        String puzzle = "..6....394............3.45..8...9..6..12.3..4749..12...2.9.......8..5......1.....";
        String solution = "856412739413597628297836451382749516561283974749651283124978365978365142635124897";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_335() throws Exception {
        String puzzle = "..8...2.4.2.....7...6..7.98..2.......8.96.....15..34...............8.5363.9....8.";
        String solution = "798356214123498675546217398932541867487962153615873429861735942274189536359624781";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_336() throws Exception {
        String puzzle = ".........6...5..4....84.29...8.....219.........5..89.1....36.....72..1...1....825";
        String solution = "834692517629751348751843296468319752193527684275468931582136479947285163316974825";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_337() throws Exception {
        String puzzle = "...........8..479.9...76.1......1.4.5.9.4....4..5.7...........2.3....86.6...29..1";
        String solution = "753198624168254793924376518376981245589642137412537986891763452237415869645829371";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_338() throws Exception {
        String puzzle = "...6.........19.....9.83.1...8..6.7...6...4....32.78..........62......894...9..52";
        String solution = "314672598782519634659483217528146973176938425943257861891325746235764189467891352";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_339() throws Exception {
        String puzzle = "....3........9..85.1........4.1..7.2..1.2.8.63..6.4....29...1......7......34..27.";
        String solution = "485236917236791485917548623648159732591327846372684591729863154154972368863415279";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_340() throws Exception {
        String puzzle = "...2...8.684.......5....97...1.7.5...6...2......9....41........2.574..13...8....5";
        String solution = "917253486684197352352684971421378569569412738873965124138529647295746813746831295";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_341() throws Exception {
        String puzzle = ".2....5.......912...68.......7....4.....87....1.5.6.8..32...756....324..1........";
        String solution = "821374569743659128596821374287193645465287913319546287932418756658732491174965832";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_342() throws Exception {
        String puzzle = "3..98..2.4.6.....3.....4..........1......297..3259........651...6......4..5.7..3.";
        String solution = "351986427426751893978324561597648312684132975132597648743265189269813754815479236";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_343() throws Exception {
        String puzzle = "..6..........43...5....8127.5..1...38......7..7.3.5..9..........21..9.8.4..2..6..";
        String solution = "796152438218743956543698127652917843839426571174385269965874312321569784487231695";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_344() throws Exception {
        String puzzle = ".4..71........6...9..2..8....86.3.....4.......72.9...42.53..6.7........2....5.43.";
        String solution = "846971253523486179917235846198643725354127968672598314285314697431769582769852431";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_345() throws Exception {
        String puzzle = "9....645..5.......3..8....6..9.....8.......7.5.4.7..61..2.9........4....7.32.1..9";
        String solution = "918726453456139827327854196279615348631482975584973261162598734895347612743261589";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_346() throws Exception {
        String puzzle = ".....4.3.2..5.7..69.6....58.....84..5.1.........36...5....4.2....87......27...3..";
        String solution = "875694132213587946946231758362158479581479623794362815159843267438726591627915384";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_347() throws Exception {
        String puzzle = "51..3.6..3.......1.6.4...7....21.....3......8..29...5.....4....4.5..2...82....94.";
        String solution = "519837624347625891268491573754218369936754218182963457673549182495182736821376945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_348() throws Exception {
        String puzzle = "....5.....9....8....5.43..9....2.....89...6.3..46...5......1.....15.24....68...71";
        String solution = "173958246492176835865243719617325984589417623324689157948731562731562498256894371";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_349() throws Exception {
        String puzzle = "2.31..........2..9....85.4.65.3........2..9....97....6.........7.6..4.18318......";
        String solution = "243179865865432179971685243652391784487256931139748526524813697796524318318967452";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_350() throws Exception {
        String puzzle = "..........59..241..42..63.9........58..431....3..6..7..........4....9.8....71...3";
        String solution = "318594627659372418742186359964827135875431962231965874187243596423659781596718243";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_351() throws Exception {
        String puzzle = "....1.3..87.9.........2.7.8...8.4.6.5.6..2..4....6.2.34.2.............85......9.7";
        String solution = "624718359871953642953426718239874561516392874748165293492587136167239485385641927";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_352() throws Exception {
        String puzzle = "..3......2.......6..6.7.5.......9...16....7..9.7.8.6.3..2.....9.8...3...394..6..5";
        String solution = "513648927279351846846972531435769218168235794927184653652417389781593462394826175";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_353() throws Exception {
        String puzzle = ".3..7......7.....256.9..1.7.9..8............8.....5..1.4....5..3.1.9....9...2473.";
        String solution = "839271465417658392562943187194782653653419278728365941246837519371596824985124736";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_354() throws Exception {
        String puzzle = "...769...........9.7...4.........538...345...1......7.8.1..6..2..943..8..43......";
        String solution = "318769254524183769976524813492617538687345921135298476851976342769432185243851697";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_355() throws Exception {
        String puzzle = ".........9.4..1...78..94.........1.2.93...6...2.....84.46..9.38...31....2.8......";
        String solution = "315827469964531827782694513857463192493182675621975384146259738579318246238746951";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_356() throws Exception {
        String puzzle = "......6....3...1...1953...46.19..2...2......9..4..7.1.....738.2.4.....5.........3";
        String solution = "472819635563742198819536724631954287728361549954287316195473862347628951286195473";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_357() throws Exception {
        String puzzle = ".46..3.8.23.....16...1.....4783..5......8.2.......7......7..93...9.42....8.......";
        String solution = "146253789235879416897164352478326591963581247512497863624718935359642178781935624";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_358() throws Exception {
        String puzzle = "............2..4.54.7.9.6.1....4..3..3....1...413..96...3.....8...48.......5.67..";
        String solution = "612754893398261475457893621926148537735629184841375962563917248179482356284536719";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_359() throws Exception {
        String puzzle = "4...9.........7..923.8......1.....8385..6.2.....5...4...........759...2..2.473...";
        String solution = "467395812581247369239816475614729583853164297792538146948652731375981624126473958";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_360() throws Exception {
        String puzzle = "2..5...678.....5.9..3..........2.......78.....2..9.6.1.3.4.....7.1.....3.6..3.7.8";
        String solution = "294518367876243519153967824389621475615784932427395681938472156741856293562139748";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_361() throws Exception {
        String puzzle = "8....3..7.......295.1.2...4.........7.3.....1.1..3.2...857.....1.....648...6..5..";
        String solution = "892463157346175829571928364269814735753296481418537296685742913127359648934681572";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_362() throws Exception {
        String puzzle = ".....7...1.....48....84.............81..3...93...96..5....8..5..2.4...3.6.352...1";
        String solution = "498317526157962483236845197962158374815734269374296815741683952529471638683529741";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_363() throws Exception {
        String puzzle = ".7....3......53......8...6.3..1.....8.6.47.....2.9...7..35....4....84.2.25....1..";
        String solution = "178269345629453718435871962347125896896347251512698437983512674761984523254736189";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_364() throws Exception {
        String puzzle = "..81.9..2....4.9......62...7.2......3.5....78..1.......3........6.8.4..98...2..67";
        String solution = "478139652526748931913562784782395416395416278641287593239671845167854329854923167";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_365() throws Exception {
        String puzzle = "..3......12...8.....594.2....9.81....7.....28.......5...1.....575.1..4.9.3....6..";
        String solution = "493512867127368594685947231569281743374659128812734956241896375756123489938475612";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_366() throws Exception {
        String puzzle = "....64.929....1..47..2......8..4.......5.....527....41..1...73...9.........937...";
        String solution = "815764392932851674746293158683149527194572863527386941451628739379415286268937415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_367() throws Exception {
        String puzzle = "..........369.....9..5.87.3...26......3..74..8......9..62.4...8.8..7.2..4.......1";
        String solution = "258736149736914582941528763594263817613897425827451396362145978185679234479382651";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_368() throws Exception {
        String puzzle = "39.....5.6..8....34...9..7.....7.1...2....63..8....79..3...........1682...6..7...";
        String solution = "391762458672854913458193276563279184729481635184635792237948561945316827816527349";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_369() throws Exception {
        String puzzle = "..5..9.1..97.2.....1...6..45...........74...6.3...8.7...2.........8.32...6.4...31";
        String solution = "645389712897124653213576984576931428128745396934268175382617549451893267769452831";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_370() throws Exception {
        String puzzle = "........2.........84...15.61....5....3.7..2.4..4.....3..78.3...9.1..4.2.3..6...9.";
        String solution = "713956842256487931849231576172345689538769214694128753427893165961574328385612497";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_371() throws Exception {
        String puzzle = "........3..465..9.8...92.7...6..1.4.........72....89.......4.5..7.2.6..8.....5..6";
        String solution = "195847263724653891863192574986571342351429687247368915632784159579216438418935726";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_372() throws Exception {
        String puzzle = "....9....7.92......5.3...7.5...4..6...35...2...1.7.3...9....53........8.48....7.9";
        String solution = "834197652719256843256384971528943167973561428641872395197428536365719284482635719";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_373() throws Exception {
        String puzzle = "....4.....6...894...9..1......2......2..8..73..85....16...2...953......6....752..";
        String solution = "853942167761358942249761385375216894126489573498537621687123459532894716914675238";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_374() throws Exception {
        String puzzle = ".8...9.5.2..8.3...1......7......41....13674.24.6..............13..2..9...97......";
        String solution = "783619254245873619169542873872954136951367482436128795528796341314285967697431528";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_375() throws Exception {
        String puzzle = "..65.4.1.8....37.......2..8.85....64......2..7.34........2.........7..8316......2";
        String solution = "276584319854193726319762458985327164641958237723416895538249671492671583167835942";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_376() throws Exception {
        String puzzle = "..6....5.1.....692..32..........1...3.........613...84.....68....4875........43.9";
        String solution = "296718453178453692453269718829641537347582961561397284712936845934875126685124379";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_377() throws Exception {
        String puzzle = "..2.....1.....5.6....726.....19.4...3.......52.....43...6..9..2...6..7.89.7....1.";
        String solution = "672493581439185267815726943751934826394268175268517439146879352523641798987352614";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_378() throws Exception {
        String puzzle = "9.5......2.1.....3.7..5.....89....1.1...6.4.....3.56.......1......598...7.62...9.";
        String solution = "935126847261487953874953126689742315153869472427315689598671234342598761716234598";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_379() throws Exception {
        String puzzle = "9.........16.2.5..37...16.4...2.3....8..7....6........4......1....91..8..6.8..3.5";
        String solution = "954367821816429537372581694541293768283674159697158243428735916735916482169842375";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_380() throws Exception {
        String puzzle = "....6......54.1....7.28.....9....7....2..38.....5...63.1...64..9.......8..8.1.2.7";
        String solution = "431769582285431976679285341396148725152673894847592163713826459924357618568914237";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_381() throws Exception {
        String puzzle = ".4..12.5....3....6..8..7..9......1.3317......4....9.8..7..........8......9.62.8.5";
        String solution = "746912358921358746538467219689745123317286594452139687873591462265874931194623875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_382() throws Exception {
        String puzzle = "..5....8.......931.9..4......7.........5.4..895.....2..4..25....2...61...3.8.9..4";
        String solution = "675913482482657931391248675817362549263594718954781326749125863528436197136879254";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_383() throws Exception {
        String puzzle = "...........89.13...21.67..............7.1..242..3....9.1...9....5....2.77..6.8..3";
        String solution = "549283671678941352321567948185492736937816524264375189413729865856134297792658413";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_384() throws Exception {
        String puzzle = ".......1...6..39.4.4....72.....3.5..85....6..3...1............272.6...9..8..471..";
        String solution = "539472816276183954148569723492736581851924637367815249615398472724651398983247165";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_385() throws Exception {
        String puzzle = "........3.7...2...13...9..6.......7.61.32...5.93..4..8.6..5.........85.9...47....";
        String solution = "286145793579632184134789256425896371618327945793514628862951437347268519951473862";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_386() throws Exception {
        String puzzle = "..7.2....9.465.......4.3...3......917..9.6.3.........5..5...8...2..8...7..8..1.5.";
        String solution = "567128349934657182281493576346875291752916438819342765195764823423589617678231954";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_387() throws Exception {
        String puzzle = ".8.7.6...467..9..........4...4.97...7.1....84.9.....2......2....29.7.......35...6";
        String solution = "382746519467519832915283647254897361731625984896431725543962178629178453178354296";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_388() throws Exception {
        String puzzle = ".....2....2..8..4......1.5......6.1.7.3.4..6.1...7.9.38..7....94.......65...9.4..";
        String solution = "641352897325987641978461352259836714783149265164275983836714529497528136512693478";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_389() throws Exception {
        String puzzle = ".9..85.3...5.3.......7...9.5.1.9..6.......8....32.8....1..6...96..4.....7..8....1";
        String solution = "294185736875936124136742598581394267927651843463278915312567489658419372749823651";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_390() throws Exception {
        String puzzle = "..3...1......9..5...65...4.....6...7.48.5...6.1248....8............4....12.6.3..4";
        String solution = "953724168471896352286531749539162487748359216612487935894215673367948521125673894";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_391() throws Exception {
        String puzzle = "...6..5.17.3..5......8.9..6....2....5.2......97.3.6.......5.7..1......4...8.7..63";
        String solution = "894637521763215489215849376386524197542791638971386254639458712127963845458172963";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_392() throws Exception {
        String puzzle = "..........65.138..21....54.....86....57.....46.......3........9....3.7..9..87.3.2";
        String solution = "879645231465213897213798546392486175157329684684157923738562419521934768946871352";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_393() throws Exception {
        String puzzle = "......5.9.56.9..7..7.6...3.........27.94....33...2...88..........3..8...4..359...";
        String solution = "134872569256193874978645231681537942729481653345926718817264395593718426462359187";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_394() throws Exception {
        String puzzle = "........6....7.1..6.7...594.....9.2..8.7...69.4..5......5..83.71.........6.4.5...";
        String solution = "813594276459276183627381594371649825582713469946852731295168347134927658768435912";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_395() throws Exception {
        String puzzle = "..3..9.172......54....3........4...88.....1...1.9..765...7.........5..3.15...39..";
        String solution = "543269817296817354781534629675341298829675143314982765432796581967158432158423976";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_396() throws Exception {
        String puzzle = ".1...3.7...8....243...975....5..12....493.6......2....2.........8.6......7..52...";
        String solution = "516243879798516324342897561935761248824935617167428935251384796483679152679152483";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_397() throws Exception {
        String puzzle = "8.....1..5..67.3...67.....93..7......91..62.......4.......1...8...2....7..8.4.92.";
        String solution = "823495176549671382167382549354729861791856234286134795472913658935268417618547923";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_398() throws Exception {
        String puzzle = "51..3.4..9.7............89...4........6293.......74.182.....1......5...4.35..8...";
        String solution = "518932476927486351643715892754861923186293547392574618269347185871659234435128769";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_399() throws Exception {
        String puzzle = "..1.9........53...35.67.2.....4.5.....59....79...6...2.....23.1..9.4.....7.3.....";
        String solution = "761294835294853176358671249617425983425938617983167452546782391139546728872319564";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_401() throws Exception {
        String puzzle = "........3....74...2..3..47....81.9..4.2.......9...6.2...86.......694.3.5.1.....67";
        String solution = "147269853853174692269385471675812934482793516391456728538627149726941385914538267";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_402() throws Exception {
        String puzzle = "...........9.7.46.4.3..97.5.8.94....52.7.8....4...2..7...........5...342....6..9.";
        String solution = "752634819819275463463189725387946251526718934941352687198423576675891342234567198";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_403() throws Exception {
        String puzzle = ".6...5.1..8.73.9..3.7........9..3..8...........3.817...9..........62....7..3142.6";
        String solution = "962845317185732964347196582579263148814957623623481759296578431431629875758314296";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_404() throws Exception {
        String puzzle = ".....7.....326....4....5.3...4..27..2.......6.7.....13.2..8..9.1..9.......65.138.";
        String solution = "852397461913264578467815932684132759231759846579648213325486197148973625796521384";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_405() throws Exception {
        String puzzle = ".......5..6..4.....836..............15..7.96.9.....435...8.5..451.7...8...4.6...3";
        String solution = "491328657765941328283657149346592871158473962927186435632815794519734286874269513";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }


    @Test
    public void test_406() throws Exception {
        String puzzle = "..72.3.9.2.....7.....1.....4.5............369...78..41..23....556...9.3.....6....";
        String solution = "187253496253694718649178253415936872728415369396782541972341685564829137831567924";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_411() throws Exception {
        String puzzle = "....7..2......8.31..........91.8......6......5..93.78..1.....9...7..681..257....4";
        String solution = "168374925279568431453192678791685243386247159542931786614823597937456812825719364";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_412() throws Exception {
        String puzzle = "..4..59.2.......8....3......38.9...45..1....7..7..4......6.1.....5..7..37..48...6";
        String solution = "364815972971246385852379461138792654546138297297564138483651729615927843729483516";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_413() throws Exception {
        String puzzle = ".....9......2..7..875...........4..17......24.84.5...3....1.....1.....3.569.3.1.8";
        String solution = "132579486946283715875641392693824571751396824284157963327418659418965237569732148";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_414() throws Exception {
        String puzzle = "4.....8..9.7.........7.8.1.7.......1......9.5.1.56..2.....3.2...6...9.7.3..2...59";
        String solution = "431625897987314562625798413753942681246871935819563724598137246162459378374286159";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_415() throws Exception {
        String puzzle = ".......5...2148.....6..9.42.....6....5....6.7...98..1.........4.93......6...91.85";
        String solution = "489672351532148769716539842341726598958413627267985413125867934893254176674391285";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_416() throws Exception {
        String puzzle = ".9.......6...2....2.8.....6.4..57.9.....384..3...425.......3..2.14...9.8.......7.";
        String solution = "497361285631825749258794316142657893765938421389142567976483152514276938823519674";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_417() throws Exception {
        String puzzle = "..4..1...6.....95.....9.421..............58...49.....7..89......6.4..1.9.3.2.6..8";
        String solution = "294531786617824953385697421876349215123765894549182367458913672762458139931276548";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_418() throws Exception {
        String puzzle = "...1....35....9.....9...4...2..9..34.5......1..3..17..3.7.4..5..9..8......65...8.";
        String solution = "874165923532479816619823475721698534958734261463251798387946152195382647246517389";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_419() throws Exception {
        String puzzle = "6...1...........47.5..6..3.9..7.....735....6.....2..5.397.8...5.....94......52...";
        String solution = "674213598213598647859467231962735814735841962148926753397684125521379486486152379";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_420() throws Exception {
        String puzzle = ".....9.5........7..7.2.1..4........8.8..7....2...1...58.9.3......7.86.41..4....96";
        String solution = "148769253652843179973251684735692418481375962296418735869134527527986341314527896";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_421() throws Exception {
        String puzzle = ".........1....5...46.9..8.7.......46.8..32..5.45..93.1....8.....37..6......2..7..";
        String solution = "758643192192875463463921857379518246681432975245769381524387619837196524916254738";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_422() throws Exception {
        String puzzle = "....7.........1..8....2697..74.......36..5.4...8.1.3..........756....4....39.2.5.";
        String solution = "682379514397541268415826973274693185136285749958417326829154637561738492743962851";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_423() throws Exception {
        String puzzle = ".4......55.......9.....6.....54...8.6.7..3....2.8.1.9..5.3..8.13...4..6.....25...";
        String solution = "748932615561784329932516478195467283687293154423851796256379841379148562814625937";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_424() throws Exception {
        String puzzle = "..51..........92...3..6.....81...52.........667..3..4.9.4.716...176...........3..";
        String solution = "895123764746589231132467859481796523253814976679235148924371685317658492568942317";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_425() throws Exception {
        String puzzle = ".5....2...6.4.5.....2769.1...3.......8......3475...1..8.......7.2.8..4.....6.1.3.";
        String solution = "957183264168425379342769518613274985289516743475398126831942657526837491794651832";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_426() throws Exception {
        String puzzle = ".32.6.9..4.1.....55....3.64......4...83..4.....9.1..7....7....225..9....9.......6";
        String solution = "832465917461987325597123864725639481183274659649518273318746592256391748974852136";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_427() throws Exception {
        String puzzle = "58....2..3...6.....46...9.....5....4...94..6.9..7....8.9.45..3..6..9..8.4...3....";
        String solution = "581379246379264851246815973627581394815943762934726518192458637763192485458637129";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_428() throws Exception {
        String puzzle = ".7........3.1.5......2.6.57..6..4.1.....5.8..4..72..3...........819.7...7..4..1.5";
        String solution = "875349261632175948914286357356894712127653894498721536243518679581967423769432185";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_429() throws Exception {
        String puzzle = ".9....6...1...8.35.48..5.....5..........32..4.82..49...............5..911.6.7..58";
        String solution = "593741682217698435648325179465917823971832564382564917759183246834256791126479358";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_430() throws Exception {
        String puzzle = "......9....6.4.....49...87....2...61...9.8.52.5..71....148.....9......2.5....6.4.";
        String solution = "235687914786149235149532876893254761471968352652371489314825697967413528528796143";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_431() throws Exception {
        String puzzle = "........4.......37..973...18.........2..16.....6.4.523.....1....64..8...9.362..7.";
        String solution = "732165984651489237489732651847253196325916748196847523578391462264578319913624875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_432() throws Exception {
        String puzzle = ".......3.9..81.5.45..3.7.81...........2..3..5..158.4.7.9...........5...62.36.....";
        String solution = "186425739937816524524397681859174263742963815361582497695738142418259376273641958";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_433() throws Exception {
        String puzzle = "..17..856.6....9....35.8....7.....6..1983......69...4....6..7.......4.25.2.......";
        String solution = "241793856568241937793568214872415369419836572356927148184652793937184625625379481";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_434() throws Exception {
        String puzzle = ".8.....7..1.93....42...........6.5.4....1.....364..7185.....36....1..8...42....9.";
        String solution = "689521473715934286423786951178369524254817639936452718591248367367195842842673195";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_435() throws Exception {
        String puzzle = ".....17.......3..28...45.9...1....6...73....5.4..5...796........8...7..6.142....3";
        String solution = "439621758175983642826745391351872469297364815648159237962538174583417926714296583";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_436() throws Exception {
        String puzzle = "8.4..9.....5..1...3...4...5....182......5..17...6.2..9.962....1....8.6..15.......";
        String solution = "874569123965321748312847965549718236623954817781632459496273581237185694158496372";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_437() throws Exception {
        String puzzle = "..5....2.6.9.2..8.2.....1......38..........4.18...237.7...4..69.927..........34..";
        String solution = "375681924619524783248379156527438691963157842184962375731845269492716538856293417";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_438() throws Exception {
        String puzzle = ".....854...76....8..3..2....62..98........47..7.......94..5.2....8..765......1.8.";
        String solution = "621738549597614328483592761162479835359186472874325196946853217218947653735261984";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_439() throws Exception {
        String puzzle = "..4...53..61.........8....7.8...637......8..64.....91..75.1.....43....2....6.5..3";
        String solution = "894762531761539284532841697189456372327198456456273918275314869643987125918625743";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_440() throws Exception {
        String puzzle = "..7..2........39..36.7....2...8..4...9.3...5.4.....18984...5....1....693.2.......";
        String solution = "987152364251463978364798512572819436198346257436527189849635721715284693623971845";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_441() throws Exception {
        String puzzle = "...3..5.67.6...8......4...1..5..2.6.2....4.5....9.13...7..6......82...4..29..3...";
        String solution = "941328576736519824852746931195832467283674159467951382374165298518297643629483715";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_442() throws Exception {
        String puzzle = ".6.....9.9..8.13..4.37...6.........819...24....6..5.7.......5...1.6....3..215....";
        String solution = "861543297927861345453729861275416938198372456346985172689237514514698723732154689";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_443() throws Exception {
        String puzzle = "..6...2..8.73....4.5..4...3.....8.4......1.62.8...35.9..5..6....4.7.......35....8";
        String solution = "436189275817325694259647183591268347374951862682473519725896431148732956963514728";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_444() throws Exception {
        String puzzle = "..........6.3.5...3...279..........2.742...8......976...........897..65..27..64.1";
        String solution = "942168375761395248358427916895674132674213589213589764436951827189742653527836491";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_445() throws Exception {
        String puzzle = "..5......46..21......6..2....1.6.....9.3.5.4........5......2.37..3...42884..9...5";
        String solution = "125437896468921573739658214351264789297385641684179352516842937973516428842793165";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_446() throws Exception {
        String puzzle = "..8......46....9.....981..6...2...67..384...99..6.3....19.5..............3...25.4";
        String solution = "198426753462537981357981426584219367673845219921673845219754638745368192836192574";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_447() throws Exception {
        String puzzle = ".418......6....2..2.89.......2..6.3..5.......6.....9.27...4.61..9..2.3..8...37...";
        String solution = "341872596569314287278965143982456731157293864634781952723549618496128375815637429";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_448() throws Exception {
        String puzzle = ".....4..6...5..91..2136...4.48..2...............9.65..91.4..83..3......54.7......";
        String solution = "389714256764528913521369784648152397295837641173946528916475832832691475457283169";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_449() throws Exception {
        String puzzle = "..........1..7.9..9.5.8......6.9...2.52...8....3.521...3...1..6.....54935.8......";
        String solution = "387219645614573928925486731746198352152347869893652174439721586271865493568934217";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_450() throws Exception {
        String puzzle = "..7..4.5.9....7.6884.9.5..1........9.1.........21.3..7.38....7.....6....49....8..";
        String solution = "127684953953217468846935721764852319319476285582193647638549172271368594495721836";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_451() throws Exception {
        String puzzle = "..8.1..3.....78..2.5......6.2..817.3..1....6.64....2...3...5...8...3......2....91";
        String solution = "298516437416378952753492186925681743381724569647953218139265874874139625562847391";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_452() throws Exception {
        String puzzle = ".9...3.....5.....41.26.......81......3...81......697.5...73..4..1.....79.6..4...1";
        String solution = "694583217385217964172694853958172436736458192241369785529731648413826579867945321";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_453() throws Exception {
        String puzzle = ".4..82.3..5....1......37.6.8.2....1.5..316........8.....1.5....26.....433.4......";
        String solution = "649182537753694128128537469832945716597316284416728395981453672265871943374269851";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_454() throws Exception {
        String puzzle = "...........59.8...1..2.7..6...........3...492..973.8.5.....3...45......3.9.14.6.7";
        String solution = "927364158635918724184257936568492371713586492249731865871623549456879213392145687";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_455() throws Exception {
        String puzzle = "....19.2....5......942....69...4.8.7.2............63........6....7.942..5..683..9";
        String solution = "865419723273568194194237586951342867326871945748956312489725631637194258512683479";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_456() throws Exception {
        String puzzle = ".724..1....8..23........4....7..6......8.1..2..1..964.2...7.....9......1....53.69";
        String solution = "372485196148692357659317428927546813465831972831729645216978534593264781784153269";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_457() throws Exception {
        String puzzle = "2.....3..4...3....6..527.1..8..796..1.6..........5..2........8......87.1.2.7.1.5.";
        String solution = "275814396418936572693527814382179645156482937947653128761345289534298761829761453";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_458() throws Exception {
        String puzzle = ".934.6.....27.....1............9.2.7...3.2..47...1..63....5....61....9.....1.874.";
        String solution = "593426871462781359187539426341695287856372194729814563274953618618247935935168742";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_459() throws Exception {
        String puzzle = "....4.9.......3..55..98..7..........97...843.....3.7.66.3..2.4....4.....1.5...2.7";
        String solution = "718546923469723815532981674324697158976158432851234796693872541287415369145369287";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_460() throws Exception {
        String puzzle = ".....3.....5.67...1...54..6.........84....72..29.4..8......1..36.....9.893..2.1..";
        String solution = "467983512285167439193254876351872694846319725729546381578491263612735948934628157";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_461() throws Exception {
        String puzzle = "7..........4.2.5..92..4.3...49..........5..8..5.28.6.1.....2.......18.7...3...865";
        String solution = "731895426684123597925746318849631752162457983357289641478562139596318274213974865";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_462() throws Exception {
        String puzzle = ".5......8..9.....2....1.....769...2.8...35.46.3...6.......7.8.5.4.8..96...3.5....";
        String solution = "254397618719468352368512497476981523892735146135246789921674835547823961683159274";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_463() throws Exception {
        String puzzle = ".......189.5..7..31...6.97...8...5.....4.....4.76...8...1....9....35164....2.....";
        String solution = "726539418985147263143862975618973524259418736437625189561784392892351647374296851";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_464() throws Exception {
        String puzzle = "......94186..9.37.........8.9...8...5...4....4..735....4....7....2..3.84...1....2";
        String solution = "325867941861492375974351628293618457517249836486735219148526793652973184739184562";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_465() throws Exception {
        String puzzle = "......1.4.....3.....195..62...6...7.9.5...21..72...8...8946..5...7.89............";
        String solution = "598726134726143589431958762813692475945837216672514893289461357357289641164375928";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_466() throws Exception {
        String puzzle = "...........461...7.2.8..61..79..........239..4...86..........7.8..1...6...6.348.9";
        String solution = "165372498984615237327849615279451386658723941431986752593268174842197563716534829";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_467() throws Exception {
        String puzzle = "..............795495.6....7....4....1.5....3.2...3.419..7...8...6...41..51..9....";
        String solution = "728459361631287954954613287389146572145972638276835419497561823863724195512398746";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_468() throws Exception {
        String puzzle = "781....69.......322...6.8.......87.5..2.79.1....4...........9.7..46.3.....8..4...";
        String solution = "781342569659187432243965871416238795832579614597416283365821947974653128128794356";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_469() throws Exception {
        String puzzle = ".5...6...........5..8...9...1.......5.6.2...7.741.836.....63.8..372..5....2..9...";
        String solution = "451936728369872145728415936813697452596324817274158369945763281637281594182549673";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_470() throws Exception {
        String puzzle = ".43........8...7....6...241.9.....248.....5..6.5.82.9.....7........6.9..4.19...6.";
        String solution = "243517689918246753756839241197653824824791536635482197569378412382164975471925368";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_471() throws Exception {
        String puzzle = "...2.3.4..5.6...7...89...35...............569..61....7.....6....93...8...8.73..52";
        String solution = "917253648352648971468971235839567124174382569526194387245816793793425816681739452";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_472() throws Exception {
        String puzzle = ".6...8....3....9....91.67....8.....94....98...9..7...2.167.3....8..1.......48..2.";
        String solution = "765938241132547968849126735628351479457269813391874652216793584584612397973485126";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_473() throws Exception {
        String puzzle = ".........72..94..8..5....17....61.7.......1699...8......8..5..41..7....55...4.6..";
        String solution = "413578926726194358895623417254961873387452169961387542638215794149736285572849631";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_474() throws Exception {
        String puzzle = ".........3.51.9.4.1..2..........1.2..3..7....5..6.3..7..9...3.......25144..7.5..2";
        String solution = "924367185375189246186254739897541623632978451541623897259416378763892514418735962";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_475() throws Exception {
        String puzzle = "9...3..5.2..94.1....1..53.838.....2..94.7...........4..4.359..7...7.....1........";
        String solution = "968137452253948176471625398385496721694271583712583649846359217539712864127864935";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_476() throws Exception {
        String puzzle = "....8...1..93....6.....4..8.91........7.....2...576...9..6...45.4...7.8..83..26..";
        String solution = "264789351879315426135264978491823567657941832328576194912638745546197283783452619";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_477() throws Exception {
        String puzzle = ".........23..5..9....9.86.3.48.6........3.15......49...21.........19.7...85..6.1.";
        String solution = "879623541236451897514978623148569372692837154357214968921785436463192785785346219";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_478() throws Exception {
        String puzzle = "...4..3.59.......1.8...3..7..7.........3.8......72..83.7...2..8..9..57..12.97....";
        String solution = "762481395953267841481593627837614259294358176516729483375142968649835712128976534";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_479() throws Exception {
        String puzzle = ".4..5...........84.369...7.1...7.......5.......98.62..4......3......2.16.1.687..5";
        String solution = "241758369597263184836914572125379648684521793379846251462195837758432916913687425";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_480() throws Exception {
        String puzzle = "9......2.........3....34.153.26......6.4.......9.82.....82....6.7..9...113.86....";
        String solution = "943156728651728943827934615382675194765419832419382567598241376276593481134867259";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_481() throws Exception {
        String puzzle = "......6.4.62..38....1.2..5..1..8.......4...9..9....1.62..3.1....5....46...9..2.7.";
        String solution = "735198624462753819981624753614985237327416598598237146276341985153879462849562371";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_482() throws Exception {
        String puzzle = "...4....8....163..24..5...6....9......15......69....81....2....3.....165..6.8..43";
        String solution = "617439528895216374243857916438791652721568439569342781154623897382974165976185243";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_483() throws Exception {
        String puzzle = "...........5.384..71.2.......9...8.....183..64.3..2..7.3...5.2.2..34...8.....1...";
        String solution = "398417265625938471714256389169574832572183946483692157931865724257349618846721593";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_484() throws Exception {
        String puzzle = ".6..5.....98.23.171.....2........859.....57..6.2....4......13..5397........8.....";
        String solution = "263157498498623517175489236317264859984315762652978143826591374539742681741836925";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_485() throws Exception {
        String puzzle = "...........1.26..7..4.596...7..12......87..9...2..5.7.2..........7..1..66....45.3";
        String solution = "326487159951326847784159632873912465465873291192645378239568714547231986618794523";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_486() throws Exception {
        String puzzle = "....9.....981...745.1.2.6....7....9....43..5....51...7.....2...9......8.8.5....21";
        String solution = "276394518398165274541728639157286493689437152432519867713852946924671385865943721";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_487() throws Exception {
        String puzzle = ".....8...6.57........96..52..1.....956......83.4.7.....5..1..2......3.96..8..6..5";
        String solution = "492158637615732984873964152721685349569341278384279561956817423147523896238496715";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_488() throws Exception {
        String puzzle = ".2.....3...4736.9....92.8.......9..5.72......31..4...74.3.9..7.5...........48....";
        String solution = "129854736854736291736921854648379125972518463315642987483195672591267348267483519";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_489() throws Exception {
        String puzzle = ".72..3..9..1......4.....7.......8...628...1....5...26.....2..1.2..94.8....48.7.9.";
        String solution = "872613549951472386436589721143268975628795134795134268589326417267941853314857692";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_490() throws Exception {
        String puzzle = ".3621.4.7..8.....11......6.....42...........5.257...13..4.........129....9..3...8";
        String solution = "936215487748963521152478369813542976679381245425796813364857192587129634291634758";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_491() throws Exception {
        String puzzle = "57....64....2.7.....8.....5...8.....4.5..9.8.......9.1.....4..2..739...6...7285..";
        String solution = "572981643634257198918463725291876354465139287783542961359614872827395416146728539";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_492() throws Exception {
        String puzzle = "..4.1.8.........47.3.58..1..1..3...8...9...63......95..8......92.5.68..4.....5...";
        String solution = "624317895158629347937584612519436278872951463463872951786143529295768134341295786";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_493() throws Exception {
        String puzzle = "............1.3..895..62..3..4.5.8...9.8.1....2....4.9..2..8.3..3...4.....5...2.7";
        String solution = "713985624246173598958462713364259871597841362821637459472518936639724185185396247";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_494() throws Exception {
        String puzzle = "....5.......4.869.1.4.2..7......3..1..8....6.241.....7....7...9...2.....67..942..";
        String solution = "926357184357418692184629573569783421738142965241965837412876359895231746673594218";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_495() throws Exception {
        String puzzle = "..5......63712.....41....73...9.........4.3.28......1.5..2....1.2...1435.......8.";
        String solution = "985473126637128594241569873352917648179846352864352917593284761728691435416735289";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_496() throws Exception {
        String puzzle = "3..6......4.8.........425....4....38....1....59...8.7..7.......9.5..3.8.86.7...54";
        String solution = "351697842249851763687342519124576938738914625596238471472185396915463287863729154";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_497() throws Exception {
        String puzzle = "..5..2.3....1...7..26...9.......7.9.9.8...14545..........6.8..7.4.2.....8....53..";
        String solution = "195872634384169572726534981613457298978326145452981763239618457547293816861745329";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_498() throws Exception {
        String puzzle = "..6...1..4....5...1..6.9..........9.6.89..5...7...4.2...5...6.721...7..8..95....1";
        String solution = "396482175482715369157639482541826793628973514973154826835291647214367958769548231";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_499() throws Exception {
        String puzzle = ".2.......9.1....4.3...8.9.5.1...3..9...87......4.2..8..72.4.......39.12.5.....4..";
        String solution = "725934816981756342346182975817463259259871634634529781172648593468395127593217468";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_500() throws Exception {
        String puzzle = ".........315..8....24..196...7.....9.6..85..4.8....3.2....7.......21......69.3.2.";
        String solution = "698427135315698247724531968537142689269385714481769352142876593953214876876953421";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_501() throws Exception {
        String puzzle = "....4..2.6.....4.7.4..36.5128.........1.6.....73....82.....9.3..1..7..6...91.....";
        String solution = "158947326632518497947236851286753914491862573573491682724689135815374269369125748";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_502() throws Exception {
        String puzzle = ".8.4....69....1.5....6...2...4.7.....9.5..2....31.2..7.......98....174.5.3....1..";
        String solution = "587429316926731854341685729214978563798563241653142987172354698869217435435896172";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_503() throws Exception {
        String puzzle = "8.3.54..91..8...42...........87...2..7.4......3....5..9....7.86...3.1..4....49...";
        String solution = "863254719195873642724916835618795423579432168432168597941527386256381974387649251";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_504() throws Exception {
        String puzzle = "...1.....93.....8.4..8.5..1..4...9..7.....2.6.2..9........1.6..1.3....24.95..4..7";
        String solution = "857139462931462785462875391514628973789543216326791548248317659173956824695284137";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_505() throws Exception {
        String puzzle = "........4...5.73.8.5....26.176......2........5..4..716..4.5........6...9..139.5..";
        String solution = "387629154612547398459813267176985423243176985598432716924758631735261849861394572";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_506() throws Exception {
        String puzzle = "....1..7.61...75..9...3.4.6........41..9......937......6....3.5.....4...3.8.75.9.";
        String solution = "532416879614897523987532416875621934126943758493758261761289345259364187348175692";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_507() throws Exception {
        String puzzle = "..85.........7.5.8..2..6....6..17...1.9.4...6..7..5..3......842......1.94.6....7.";
        String solution = "978534621614279538352186497265317984139842756847695213591763842723458169486921375";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_508() throws Exception {
        String puzzle = "........8.76..8....9.....6...4..2..6..1....74.8...72..1.2..3...9...4..21..8..6.3.";
        String solution = "215764398476398152893521467754132986321689574689457213162973845937845621548216739";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_509() throws Exception {
        String puzzle = "9..6...52..1......8.6.52..47.2...........3......9.7.4...9...41....48....2...95..8";
        String solution = "947638152521749683836152974792864531468513297153927846389276415675481329214395768";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_510() throws Exception {
        String puzzle = ".8..2...7....18...6...4.5......8....5.6.....3..34....2..48..2.99...5..6....1..7.5";
        String solution = "185629437437518926629347581271983654546271893893465172754836219912754368368192745";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_511() throws Exception {
        String puzzle = "4....2..596.8........7.........4.3.1.45..32.......9.8.6.1....3..8....1.959...7...";
        String solution = "437962815962851473158734926279548361845613297316279584621495738784326159593187642";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_512() throws Exception {
        String puzzle = ".......8...7.1...3...7..62..82...3..7.3.8...9...4.7......6...1.96.........812.79.";
        String solution = "126349587857216943394758621582961374743582169619437852275693418961874235438125796";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_513() throws Exception {
        String puzzle = ".....69...1.8....3...2...6..2...139.4..3.9....6.4.7.........5...56....3.9387.....";
        String solution = "273516948615894723894273165527681394481329657369457281142938576756142839938765412";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_514() throws Exception {
        String puzzle = ".1.7...5463...5.28......36..4.........19....5.78........7.6........52.4...5.1..8.";
        String solution = "812736954634195728759284361943578216261943875578621493187469532396852147425317689";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_515() throws Exception {
        String puzzle = ".....4....5..1..76....7...43...6.8....97......8...9.23.35..........8..699.14...5.";
        String solution = "276854931458913276193276584314562897629738415587149623835691742742385169961427358";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_516() throws Exception {
        String puzzle = "......8.2......3..82.41.5..2.46.....16...3........4.5.............8.9.6.3.61..498";
        String solution = "691735842745928316823416579254681937167593284938274651489367125512849763376152498";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_517() throws Exception {
        String puzzle = "64..92.....9..4..7.2..8......16....5.5..7....4...2..9.76.....48....36.1..9.......";
        String solution = "647592183819364257325187469971643825258971634436825791763219548584736912192458376";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_518() throws Exception {
        String puzzle = ".....4.2.8....7.....4.3.1...7........8.7...9.43...52......9....34.81.....6.4.3.81";
        String solution = "157964823823157946694238175271349658586721394439685217718596432345812769962473581";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_519() throws Exception {
        String puzzle = ".....4...7..9..5.11.5.7.2.8..1....374.7.......58...6.93..5..........1.72.....2...";
        String solution = "829154763763928541145376298691285437437619825258743619312567984586491372974832156";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_520() throws Exception {
        String puzzle = "..54.........7..8...1..86.9...1...2...3....6...89...1.37...4..58...39.....47....8";
        String solution = "685491372239675481741328659967153824153842967428967513376284195812539746594716238";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_521() throws Exception {
        String puzzle = "9..61.......8....45.2..........8.7...73..2..6......1.2..1.9..3.3..27.4.5.5...3...";
        String solution = "934617528716825394582349671125986743473152986869734152641598237398271465257463819";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_522() throws Exception {
        String puzzle = "...1.6.7......261.....9.....5..4..3.3..5..12...2..7..8.7.9...6.83....2......1.5..";
        String solution = "285136479493872615716495382958241736367589124142367958574923861831654297629718543";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_523() throws Exception {
        String puzzle = ".5..7.6.....6...913....157.9..7...6...2..3...8.6......79..8...2....2...7....5.1..";
        String solution = "159478623287635491364291578931742865542863719876519234795186342618324957423957186";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_524() throws Exception {
        String puzzle = "7...15..3.........2.....185.5..........6...7.127...45..4.3.6.9........6..3.7.8..4";
        String solution = "764815923815239647293467185456172839389654271127983456541326798978541362632798514";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_525() throws Exception {
        String puzzle = ".4.............3....8..45.9..49....2..1...84..3.4.6....6.....78....2865...2.65...";
        String solution = "346592187529817364718634529684951732951273846237486915165349278493728651872165493";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_526() throws Exception {
        String puzzle = "..7..2....3.61.....694....8....7.5..5.1....9...6.....3.2.1.....3.5.9....9..2.4.5.";
        String solution = "457382169832619475169457238283976514541823796796541823624135987315798642978264351";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_527() throws Exception {
        String puzzle = "......1....9..3.8..8.9..34......67.8..1.75.....832..9.......2.....2....1.4..3.9.7";
        String solution = "634582179179643582582917346325496718491875623768321495813759264957264831246138957";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_528() throws Exception {
        String puzzle = ".....5....4...68.3..218......15689..45...3.........1..1..8......39.......7.3..4.1";
        String solution = "618735249547296813392184675721568934456913728983472156164857392239641587875329461";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_529() throws Exception {
        String puzzle = ".........4.18....7...3..541.......2..3.785...1....3.....4.......13.57..69.7.4..1.";
        String solution = "372514689451896237698372541785461923239785164146923758564139872813257496927648315";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_530() throws Exception {
        String puzzle = "...5......4..9.562..1.7..3.....4....1.........5.1.23.47........689..7.21....2...9";
        String solution = "892536147347891562561274938276943815134785296958162374725419683689357421413628759";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_531() throws Exception {
        String puzzle = "..2....8...4.1.96.....2.5.4....5..7.8....7....4..832.1.1......8.7.....16.....93..";
        String solution = "692345187534718962187926534326451879851297643749683251213564798975832416468179325";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_532() throws Exception {
        String puzzle = ".13...86.8....3...9.....13...4..86.2....4.......1.64.....6..3.7....97.....9..2.1.";
        String solution = "513729864846513729927864135174938652368245971295176483482651397651397248739482516";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_533() throws Exception {
        String puzzle = "..5..3...9...2.6.116..................159..7.64..32..........2..5.6..7..37..594..";
        String solution = "785163942934728651162945837593471268821596374647832195416387529259614783378259416";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_534() throws Exception {
        String puzzle = ".......7..36...8.9...9..5.6...4..6...48...7...2..7..1...354.9....4.13........74..";
        String solution = "489356172536721849712984536197435628348162795625879314273548961954613287861297453";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_535() throws Exception {
        String puzzle = "1.7...8.9....7...3...4....1.9...52.46..79........42....7...1....1.95...6.5....3..";
        String solution = "167523849984176523325489671798315264642798135531642798476831952213957486859264317";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_536() throws Exception {
        String puzzle = ".95...2..6.......9..49...6............217.9..1..86..4...1..2...3.....5...29.376..";
        String solution = "895716234613248759274953861986324175432175986157869342761582493348691527529437618";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_537() throws Exception {
        String puzzle = "......1.5.4..9...2..9327.....1..3...9...4..7..5.....2....8...1.8..9....3.9.67...8";
        String solution = "237486195648195732519327684781263549926548371354719826465832917872951463193674258";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_538() throws Exception {
        String puzzle = "......8...149.6.....9.3..1......2...3.........9..1.7.5....5...3.2..98..6.56..1.48";
        String solution = "635174892214986357879235614581762439367549281492813765948657123123498576756321948";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_539() throws Exception {
        String puzzle = ".....4....75.6..2.3..9..4....6......28..357...5......6..2........75.8..983.....54";
        String solution = "928754163475361928361982475196847532284635791753219846512493687647528319839176254";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_540() throws Exception {
        String puzzle = ".........6..8.9..51.9.264............63....54.4...598.............3...129.8.1.5.6";
        String solution = "325147869674839125189526437592483671863971254741265983217654398456398712938712546";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_541() throws Exception {
        String puzzle = "..6853..........3...8...1...314....229...........9.....4..1....1.3.2..98.6...837.";
        String solution = "916853247427169835358274169731486952295731684684592713849317526173625498562948371";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_542() throws Exception {
        String puzzle = ".9............87..148.............4..352.9...824....6....7....9...8....737.69.2.4";
        String solution = "796352418253418796148967523917586342635249871824173965482731659569824137371695284";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_543() throws Exception {
        String puzzle = "5........74.8..6......6.24......3...3.94....1...1...97...3...54..1..8..6.8.....32";
        String solution = "563214789742839615918765243156973428379482561824156397697321854231548976485697132";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_544() throws Exception {
        String puzzle = "..........8456........92..7.....3...1.24...8......85919.7..5...4..2...7...1.3.4..";
        String solution = "239874615784561932615392847578913264192456783346728591967145328453289176821637459";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_545() throws Exception {
        String puzzle = ".............1429.9732.......6.8..........5..79..26..16.........21.....753986....";
        String solution = "142693758865714293973258614256381479318479526794526381687142935421935867539867142";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_546() throws Exception {
        String puzzle = ".......7......982..3.17..........5..38...7...96..51..8......6....98.....873.6.9.1";
        String solution = "596428173147639825238175469712386594385947216964251738451793682629814357873562941";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_547() throws Exception {
        String puzzle = "3...9..56.4....23.5.8.....9.....8..2............37.6...1..4.7....4.67.....69..31.";
        String solution = "327491856149856237568732149693518472781624593452379681915243768834167925276985314";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_548() throws Exception {
        String puzzle = "..........3.8...16.7..214.8...........67....33.9.5.82......3..22....8...6....71.4";
        String solution = "861345279432879516975621438728934651516782943349156827184563792297418365653297184";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_549() throws Exception {
        String puzzle = "4326....1.............5..3.......8698.....4...6...5.1...4..2..3.....39...76..418.";
        String solution = "432678591695321748781459236543217869817936425269845317954182673128763954376594182";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_550() throws Exception {
        String puzzle = "....1....8..4......7...351.......9..6.71..43....7...85.6.235.7........5.93....6..";
        String solution = "293518746851476293476923518512384967687159432349762185164235879728691354935847621";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_551() throws Exception {
        String puzzle = "...32.5...9..5..21.....8....86..4........614.1...9..62.......9.5...6...8..1.4...6";
        String solution = "617329584398457621425618739286174953953286147174593862762831495549762318831945276";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_552() throws Exception {
        String puzzle = ".59.3.1........8.....8...32.2.......9.....58.36...7..4.9.78...5....5..1...2..37..";
        String solution = "859632147236174859741895632125948376974326581368517924493781265687259413512463798";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_553() throws Exception {
        String puzzle = ".9.......78.3.2.....2..64......9....8....47.9..123..........9..6..7..2.4.345....1";
        String solution = "496175382785342196312986457547891623823654719961237548178423965659718234234569871";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_554() throws Exception {
        String puzzle = "........9.24.59..375.....6...........7..3.89.....657428....2........6.1..43..8...";
        String solution = "318624579624759183759183264286947351475231896931865742867412935592376418143598627";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_555() throws Exception {
        String puzzle = ".....3.4.7.8.....9.34.1.5...59...2.8.....1...3.76......9...........3.85.86.....37";
        String solution = "915823746728465319634719582159347268286591473347682195593178624472936851861254937";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_556() throws Exception {
        String puzzle = ".....7..2..6.........168.57......3..6..78.....19..6.74.4...2..1.6..4.2....8....9.";
        String solution = "581497632796235148432168957875914326624783519319526874943852761167349285258671493";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_557() throws Exception {
        String puzzle = "...6..79...2...3........6.88.6..9.4..57...18......4...9....6..3.4..1....2.1.43...";
        String solution = "513628794682497351794531628836159247457362189129874536975286413348715962261943875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_558() throws Exception {
        String puzzle = "..7.............3642......8..4..3..27....14.9..29..87.......9..29.87......125....";
        String solution = "637518294518492736429367518954783162783621459162945873876134925295876341341259687";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_559() throws Exception {
        String puzzle = ".5..1......8...3.4....5.8...9.........7..9..3..17..9..9....2..1...5.426.6...974..";
        String solution = "354218697218976354769453812496321578527869143831745926945632781173584269682197435";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_560() throws Exception {
        String puzzle = "3...1.....75.....4..8.6.1.52....9....91...2.3..62...1..4........5...86..6...5..7.";
        String solution = "369415782175892364428367195234179856791586243586234917847621539953748621612953478";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_561() throws Exception {
        String puzzle = ".27....8...6....5...89.2..45..6......9...381....58.4...6..........4.9.3..3.2..7..";
        String solution = "927145683146837952358962174581694327694723815273581469769358241812479536435216798";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_562() throws Exception {
        String puzzle = "......4..1....7.92.87.6..5..............56..4.5..42.38.....4..1.49........15..9.7";
        String solution = "392815476165437892487269153214378569873956214956142738538794621749621385621583947";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_563() throws Exception {
        String puzzle = ".9..7....7...2..8....8.1...6....5.4.........3.3...4.16.8..59....14..8..9.6.1...7.";
        String solution = "198576432756423981423891657671935248842617593935284716287359164514768329369142875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_564() throws Exception {
        String puzzle = "48..2.9....2.9..45...5..1...1...34...938..6.....6...7..5..6.2.........81..9......";
        String solution = "485126937162397845937584126216973458793845612548612379351768294674239581829451763";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_565() throws Exception {
        String puzzle = ".2.......7..5.2.....8.7.4.59.2.1...8.3..6..79.4....3.....1......1...6..2....987..";
        String solution = "425681937793542186168973425972315648531864279846729351289137564317456892654298713";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_566() throws Exception {
        String puzzle = ".....45.3..23...7..3.15.....1.7....6......9......628..9.52......6..4.71.3..5.....";
        String solution = "187624593652389174439157682814795326526831947793462851975216438268943715341578269";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_567() throws Exception {
        String puzzle = ".6......4..14.368.....9......26....3.....781.34.9...7...37.......7....4..54.....1";
        String solution = "869172354721453689435896127172685493596347812348921576283714965617539248954268731";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_568() throws Exception {
        String puzzle = "........8..3..1.5..78..93....6......5....3..7...2.86412.7.15....1....7.....9....6";
        String solution = "952346178463781952178529364846197235521463897739258641297615483615834729384972516";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_569() throws Exception {
        String puzzle = "...........2..4.5..9.17.4.8.......7...1...9259.5..1....3..2..........7.41.468...9";
        String solution = "487536192612894357593172468348259671761348925925761843839427516256913784174685239";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_570() throws Exception {
        String puzzle = ".9......8...8.5.....7.9..3..3..2.......4......2..36.1..14..93..3...1.9....538...4";
        String solution = "291643758643875291857291436536127849179458623428936517714569382382714965965382174";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_571() throws Exception {
        String puzzle = "....8....14........67.9..1......4.85....321...7....6329..32...8.5..6...........23";
        String solution = "539481276148276359267593814623714985895632147471958632914325768352867491786149523";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_572() throws Exception {
        String puzzle = "....5...4.....9.......8.917..5...7.....872....214....8.....8..5..3..127.4..59....";
        String solution = "279156834148739526536284917685913742394872651721465398917328465853641279462597183";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_573() throws Exception {
        String puzzle = ".1.4....3..32..95....8.5......1...78......4.5..7...39.3.9..4.....6..3.8.25.......";
        String solution = "715496823483217956962835147634159278891372465527648391379584612146723589258961734";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_574() throws Exception {
        String puzzle = ".47.....8...2.159.1................6..4..67..8...7...52..9..1....17.8.6.....13.7.";
        String solution = "947635218683241597125897634712459386594386721836172945278964153351728469469513872";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_575() throws Exception {
        String puzzle = ".59..2..6.7....5.9.1..........16....1.....3.79...37..4..7.......23..6.985.....4..";
        String solution = "359872146278641539614359872732164985146985327985237614867493251423516798591728463";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_576() throws Exception {
        String puzzle = ".....56.2...4.7.8...4.......49..8....3.1..4....6..2....5.2....79..7..3.6...5.1.9.";
        String solution = "397815642562497183184623975249358761835176429716942538453269817921784356678531294";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_577() throws Exception {
        String puzzle = "....8..45.5....8...6.49..7.4.......75..73.9....39.......1....8.7..1..2.3..8.2....";
        String solution = "917283645354671829862495371429816537586734912173952468231549786745168293698327154";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_578() throws Exception {
        String puzzle = "...53......5...6.....19.5.3.....4.........1641..37.8....8....4..1......8..47..921";
        String solution = "691538472835247619427196583589614237273859164146372895758921346912463758364785921";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_579() throws Exception {
        String puzzle = ".3126...44...19........4..6.......5..6...8.2.....563...1.9......28.....1..3...29.";
        String solution = "831265974476819532259374816384192657567438129192756348615927483928543761743681295";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_580() throws Exception {
        String puzzle = "8..............35.2.3.7....4...9...31.76.5.8..3..2..76.......64.5.8.......43.9...";
        String solution = "875963241961482357243571698426798513197635482538124976319257864752846139684319725";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_581() throws Exception {
        String puzzle = "..5..94....18.6.7......35.......1..4...4..698.86.3....8......6..5......2.37.....5";
        String solution = "365729481241856379798143526579681234123475698486932157812594763954367812637218945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_582() throws Exception {
        String puzzle = "5......6.4.85.7....26........3.5...86.....52.1.....9.72...4...67....9.....573....";
        String solution = "597312864418567392326498175973251648684973521152684937239145786761829453845736219";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_583() throws Exception {
        String puzzle = ".5....9..6...91.....175.....2..4.3...1.....9.3.6.....4.3..682........4..1653.....";
        String solution = "752836941683491527941752638829145376514673892376289154437968215298517463165324789";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_584() throws Exception {
        String puzzle = "6.7...1..4..9..6.3.9..........5...2..3.....4..493.....1..4.5..93....2.6.....1..38";
        String solution = "687253194421978653593164782816549327235781946749326815168435279374892561952617438";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_585() throws Exception {
        String puzzle = ".13....4.6..3.......5...8.1..96.5....8.23..76.3...8..5...8.6....5....4......2...3";
        String solution = "813952647647381529925764831279615384584239176136478295391846752752193468468527913";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_586() throws Exception {
        String puzzle = "..2..8...4..7.61......2.9.8...........386........54.837.......91...9.46.2....3.5.";
        String solution = "352918674489736125617425938824371596573869241961254783745682319138597462296143857";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_587() throws Exception {
        String puzzle = "..........7.2.56.8..89...72.2.....6...9..6285..7..........42.....53....7.4...75..";
        String solution = "216738954974215638358964172821453769439176285567829341793542816685391427142687593";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_588() throws Exception {
        String puzzle = ".4.......3......675..9....1..679..3.1.23.........2.9.5.15....832..4.....4...3....";
        String solution = "641587329389214567527963841856791234192345678734826915915672483273458196468139752";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_589() throws Exception {
        String puzzle = "28....1..3..162......4......5...7...........3......98.6...78.317.3.....482.6.3...";
        String solution = "284735196379162458516489327158397642962854713437216985645978231793521864821643579";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_590() throws Exception {
        String puzzle = "2..4.56.1.....2.....3.7.5.8..72.9.1.85....9...9......4.2.1.............31..8....6";
        String solution = "278435691519682347463971528347269815851347962692518734726153489984726153135894276";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_591() throws Exception {
        String puzzle = "14...7.........2..7......9....3......9.4....2.3.95..1.....613...53.....1..2.3.974";
        String solution = "149627853365189247728543196481372569596418732237956418974261385853794621612835974";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_592() throws Exception {
        String puzzle = "..8..9..32..1....6.7..8.2...46..........32...3....6.4..32..75.........615.1....2.";
        String solution = "168279453259143876473685219946851732817432695325796148632917584794528361581364927";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_593() throws Exception {
        String puzzle = "...8........62...44.9..3.1........7..4.13.....61...9......6...8.95....473.8....59";
        String solution = "216849735753621894489753216832596471947138562561274983174965328695382147328417659";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_594() throws Exception {
        String puzzle = ".4.......3..2.5.....93.4..2.26....7....58....53..........1.876....73.9.8..5.6....";
        String solution = "142896537378215649659374182826941375917583426534627891293158764461732958785469213";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_595() throws Exception {
        String puzzle = "....6..1...2...45...3.....9.9.1.....2..8.6.....12.5.9.3.....6..62..7...44.....17.";
        String solution = "574962318962318457183754269896147523235896741741235896317429685628571934459683172";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_596() throws Exception {
        String puzzle = "..3....9..9.3.5.1....9....2..2..8..61.46..5.........84....9..7.61.....5..2.....61";
        String solution = "473261895298345617561987342952418736184673529736529184845196273619732458327854961";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_597() throws Exception {
        String puzzle = "..3..5.49..9....3165........1.9...7...6.4......7.86.53....6..9...........9..3.1.8";
        String solution = "873215649249678531651394287514923876386547912927186453432861795168759324795432168";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_598() throws Exception {
        String puzzle = "...4...7....5...2..9...8.....93.2.1.72..54..6..4....9....2...3..36.8...1......7.9";
        String solution = "513429678678531924492678153859362417721954386364817592147296835936785241285143769";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_599() throws Exception {
        String puzzle = ".418.5..9..9.7..58.3............26..3...6..25...5...97.....69.2.1..4......7......";
        String solution = "741835269269174358835629741574912683398467125126583497483756912912348576657291834";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_600() throws Exception {
        String puzzle = "....5.3...18...4.....1.6852.....5...8...7..1.7.6..3..9..2..8......94........2.5.8";
        String solution = "269854371518732496374196852921685734843279615756413289132568947685947123497321568";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_601() throws Exception {
        String puzzle = "............1876.....92.57....6.......2..9..5.9....8632.............4.9..6..93781";
        String solution = "876345219925187634341926578453618927682739145197452863239871456718564392564293781";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_602() throws Exception {
        String puzzle = "....1..2...9....67.54.32...4........3.25.178....78..3....2.........58...5.8.....6";
        String solution = "863917425129845367754632819487329651392561784615784932931276548276458193548193276";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_603() throws Exception {
        String puzzle = "...........5.63..9..84...........6....2..1..75..6..483.9..3.......7...9.63..59.24";
        String solution = "326978541145263879978415236783594612462381957519627483894132765251746398637859124";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_604() throws Exception {
        String puzzle = "...6......75.4..3.8....9.4..3...2.58..2....91..9................231.6.8...83.74..";
        String solution = "394675812275841936861239547137492658542768391689513274756984123423156789918327465";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_605() throws Exception {
        String puzzle = "9....361...........36..5...8.3.5.1...6...4.7.4...2........7........129.5.41...86.";
        String solution = "925783614784961253136245789893657142562194378417328596359876421678412935241539867";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_606() throws Exception {
        String puzzle = "..9......3.1...8..587.....2...1..4...4.7.36......52..77...1..6..5...........3.251";
        String solution = "429871536361245879587369142973186425245793618618452397732518964156924783894637251";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_607() throws Exception {
        String puzzle = ".....5....9..4.218..4.2..9.........79...61..4..6......2...8.3...7.6..8.91..59....";
        String solution = "821975436597346218634128795452839167983761524716254983269487351375612849148593672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_608() throws Exception {
        String puzzle = ".....29....4....51.....1..2.739.4...8...7......1..38.7.5.....9.42..3......6.58...";
        String solution = "165842973284397651739561482673984125842175369591623847357416298428739516916258734";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_609() throws Exception {
        String puzzle = "4..9.3..73..7.8.91........6.8..24......6.....64...5..3.5..8..1.1.7.............45";
        String solution = "418963527362758491579412836783124659295637184641895273954386712127549368836271945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_610() throws Exception {
        String puzzle = "..2..9.....65...1..3.216..9.8........239.86..4.1..........4..7.3..........5..32.8";
        String solution = "152789436976534812834216759589461327723958641461327985298645173317892564645173298";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_611() throws Exception {
        String puzzle = "........5....793.64.....9.7.........21.6.8...85.4..1.2..........9..37...7..51.8.4";
        String solution = "971364285528179346463285917349721658217658439856493172185942763694837521732516894";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_612() throws Exception {
        String puzzle = ".9......8..34..52..81.5.....1...5....2.9...47....7...2....6.7.5...58.3..7....9...";
        String solution = "594712638673498521281653479417825963825936147936174852349261785162587394758349216";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_613() throws Exception {
        String puzzle = ".....4....79....6..2..6.415..5.2....7.6.53..9..2.7...1.67.8...2......85..........";
        String solution = "651834927479512368328769415135928674746153289892476531967385142214697853583241796";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_614() throws Exception {
        String puzzle = ".63....5....8....1.5...6..9..6.9.1.7..91..4......72....75.....4...24...5......96.";
        String solution = "963714852247859631851326749526493187739185426184672593375968214698241375412537968";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_615() throws Exception {
        String puzzle = ".............98.2.....51.3......4..9.5.9.....2.87....5..14..3...64.7..52..5...8.4";
        String solution = "512347968743698521689251437137564289456982713298713645871425396364879152925136874";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_616() throws Exception {
        String puzzle = "9.632..1......625...5.7.....3......7..9.5.1....7863...5.3....6.....1.......5.7...";
        String solution = "986325714714986253325471698632149587849752136157863942573298461298614375461537829";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_617() throws Exception {
        String puzzle = ".........4.......3.51..462...........4.5...16.23716.94..........6..23..1..5..98..";
        String solution = "682371945497265183351984627516492378749538216823716594238157469964823751175649832";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_618() throws Exception {
        String puzzle = "3.....4...1.8.9...78...........74.......3..16.23.9.7....73....8........1.58.2..64";
        String solution = "365712489412859637789643152691574823574238916823196745247361598936485271158927364";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_619() throws Exception {
        String puzzle = ".....5..2.3.7....45..962.81......8.5.93.8......1....3........43......1.....3549..";
        String solution = "618435792932718654574962381467293815293581467851647239789126543345879126126354978";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_620() throws Exception {
        String puzzle = ".8...3.4..35.94...9..6.8..51.....2...2..8..54.7...6...................3.3.25..9.8";
        String solution = "286753149735194682941628375198475263623981754574236891857319426419862537362547918";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_621() throws Exception {
        String puzzle = "....1.3.......6.74.53....8.56.......7.4...138.1.......6...7..5..4..6..2..2..45...";
        String solution = "276814395189536274453729681562183947794652138318497562631278459845961723927345816";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_622() throws Exception {
        String puzzle = "...6.97....9.72.5....8...9.6..78.4.........7.1...23....2..........5...613.6..75..";
        String solution = "815649723469372158732851694693785412248196375157423986521964837974538261386217549";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_623() throws Exception {
        String puzzle = ".5...7.1....2.9....148...7...3.......2.5....8.4.378...5......9.....82..71..4....6";
        String solution = "359647812768219543214853679873921465921564738645378921582736194496182357137495286";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_624() throws Exception {
        String puzzle = ".............37.95...69.2.7.........2...59.7.3..26.54.....42.....8....3...9.7.42.";
        String solution = "796528314842137695135694287954783162261459873387261549673842951428915736519376428";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_625() throws Exception {
        String puzzle = "..9...........5628.....15..82..4.........3.......1.456.5.12..6...7..4..2.8..7.9..";
        String solution = "569287134371495628248631597826549371415763289793812456954128763637954812182376945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_626() throws Exception {
        String puzzle = "..3.2.1...6......2.2.61........31.4.........6.5.....3...89.....6.52....137...865.";
        String solution = "943827165561394872827615394286531947739482516154769238418956723695273481372148659";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_627() throws Exception {
        String puzzle = ".7.9..5........2.8...768..3.........5...9.12..21.8....3.........5..29...4..815.9.";
        String solution = "874932516639154278215768943943271685586493127721586439392647851158329764467815392";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_628() throws Exception {
        String puzzle = "51.....433...5...........8.7...........4...292.318..65.........49.2..3...71.9...6";
        String solution = "518972643364851972927643581789526134156437829243189765632715498495268317871394256";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_629() throws Exception {
        String puzzle = "..........8..3..9..7....8534.......6.5.1..4.....74..3.1..48...95.9..3..1...6.1...";
        String solution = "395827164681534792274916853427358916853169427916742538162485379549273681738691245";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_630() throws Exception {
        String puzzle = ".........4..67...5..2..3.......1..2...6..8..97..3..1...1...9..8247.....3.387...4.";
        String solution = "871594362493672815562183497384917526156248739729356184615439278247861953938725641";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_631() throws Exception {
        String puzzle = "8.1.....2......5...2...147..6.57.1..21.9.3...........53...9...8...2..36...2.4....";
        String solution = "851437692734629581629851473468572139215983746973164825346795218597218364182346957";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_632() throws Exception {
        String puzzle = "...7.....7.52...9..12..4......3...87...5..1...2.14...5.4..6.3.91....5...9.......1";
        String solution = "469753218735218694812694573591326487374589126628147935247861359186935742953472861";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_633() throws Exception {
        String puzzle = ".56.....4.4...1.6....8.....7...9..58.....8..3....5.2.9.........569....27.874....5";
        String solution = "156932874948571362372846591721394658695218743834657219413725986569183427287469135";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_634() throws Exception {
        String puzzle = "....7..3.8....5.7....83.92.7.....4..4..6......2...97..13..6.....4....5...87..32..";
        String solution = "592476138813925674674831925761382459459617382328549761135264897246798513987153246";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_635() throws Exception {
        String puzzle = "42.....161....3.....84....7..........9.51.....6....1....5.6.8.9......67.71...45.3";
        String solution = "423758916179623458658491237541879362392516784867342195235167849984235671716984523";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_636() throws Exception {
        String puzzle = "18.....4..3.4.6.....2.7........5.....73...2.5.283....6......4.......9.5....2.4973";
        String solution = "185923647739416528642578319916852734473691285528347196397185462264739851851264973";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_637() throws Exception {
        String puzzle = "......4...53.........7.1.8.....72.6....36...5.2....934.....4..758.2....19.2..7...";
        String solution = "278653419153948672469721583395472168814369725726815934631584297587296341942137856";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_638() throws Exception {
        String puzzle = ".7.......6..5.2......874.1..5.1.......72.3.5...9....24.2..6..7.3...1...8.1.....3.";
        String solution = "874631592631592847592874613253149786467283159189756324928365471345917268716428935";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_639() throws Exception {
        String puzzle = "54.9.86...7...........6.4...61....58........24.8.23.......8......56.2...8..1.5.6.";
        String solution = "542938617176254839389761425261479358753816942498523176624387591915642783837195264";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_640() throws Exception {
        String puzzle = "9.1..5.3....4.6.81.6......943....8....2.14......2......15...74...38...........39.";
        String solution = "981725634327496581564381279436579812872614953159238467215963748693847125748152396";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_641() throws Exception {
        String puzzle = "...........9...3.7.4813.6...8....4.6.24.7....1.7..3.8..1...8...........5.364.9...";
        String solution = "371695248659284317248137659983512476524876193167943582715328964492761835836459721";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_642() throws Exception {
        String puzzle = ".4...8...2.5....7..8..2......93....7..36...51..1.4.6.3...9...........92...273...6";
        String solution = "147598362295163478386427519569381247423679851871245693618952734734816925952734186";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_643() throws Exception {
        String puzzle = "........87.6..2.....3...1429...8..64....26.9.4..59....6....7.5..5....82......4...";
        String solution = "241935678786142539593678142935781264817426395462593781629817453154369827378254916";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_644() throws Exception {
        String puzzle = ".......58...7.....8...923............3.26...7.1.8392....9.7...5..1.53.2...4...9..";
        String solution = "296341758143785692875692341462517839938264517517839264329476185781953426654128973";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_645() throws Exception {
        String puzzle = ".............7...4...946578......4.6..75.....6841.......2.5.6....9..8..1.76....4.";
        String solution = "748315269965872134231946578523789416197564382684123957812457693459638721376291845";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_646() throws Exception {
        String puzzle = ".7....54.14...........15..8..4..7..3.....4.15..26.1.......9.3....7....2.6.957....";
        String solution = "978362541145789632263415798514927863796834215832651479481296357357148926629573184";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_647() throws Exception {
        String puzzle = ".4......88.6..5...7.......5...1..5..9.....61.46...72.35..98....2....6.....4....91";
        String solution = "145239768896475132732618945328164579957823614461597283573981426219346857684752391";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_648() throws Exception {
        String puzzle = "6.......797.25..1..48.9...2...76....21........8..45.......79...42....3.....5...8.";
        String solution = "652431897973258416148697532539762148214983765786145923861379254425816379397524681";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_649() throws Exception {
        String puzzle = ".2...8..4.6...9.2...1.73....92.1.8..7..8......8..6..1.8....52........4...34..1...";
        String solution = "327658194568149327941273586692517843715834962483962715876495231159326478234781659";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_650() throws Exception {
        String puzzle = "...71..8..5.....3.79...8.1.....5....36...78..4...2..5.........51..54...3..41.2...";
        String solution = "243715986851964732796238514912853467365497821478621359627389145189546273534172698";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_651() throws Exception {
        String puzzle = "....1...4....243687.......1...5.......3..897.....73.85.96..........9..1623.......";
        String solution = "368915724519724368724836591872569143653148972941273685196452837485397216237681459";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_652() throws Exception {
        String puzzle = ".56.....198.......3....7.6..........46..23.......9.35..9.8......153.2.7..3.74....";
        String solution = "256984731987631245341257869523178496469523187178496352794815623815362974632749518";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_653() throws Exception {
        String puzzle = "1........4...73..1......456....9.......4876...4...2..53.....5...61..9.4..9.5...8.";
        String solution = "126954378458673921739218456672395814915487632843162795384721569561839247297546183";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_654() throws Exception {
        String puzzle = "........1286..4...3...9.52.......8...483....79...8.26..6.1...7.......4.5..94.....";
        String solution = "597823641286514739314697528172946853648352197953781264465138972731269485829475316";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_655() throws Exception {
        String puzzle = "..........21.79..4.....3821.........6..45...3.3...85..........6...1..43..46..2.79";
        String solution = "468215397321879654795643821954321768682457913137968542513794286279186435846532179";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_656() throws Exception {
        String puzzle = ".....6.8.95....6...2.75.4......8........2.356.9.3.5...1....4....8..3.....326....8";
        String solution = "713946285954218637628753419365487192847129356291365874176894523489532761532671948";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_657() throws Exception {
        String puzzle = "...............85..735..........2.6...2.7..91..89.45.7........4.67.5.2..2...96.7.";
        String solution = "825619743916743852473528916759132468642875391138964527591287634367451289284396175";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_658() throws Exception {
        String puzzle = "..9........2.5693...3..95.6........4...8..67.3.....85..6.1.....4...2...8.8.7.3...";
        String solution = "659318247872456931143279586798562314524831679316947852965184723437625198281793465";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_659() throws Exception {
        String puzzle = ".98....7.......1...546....9..9847....6........4...6.13........5...5..7.2.8..7.34.";
        String solution = "198325674623794158754681239319847526265139487847256913972413865431568792586972341";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_660() throws Exception {
        String puzzle = ".....9..53.4.........1..93.26...............91.8..674.5....83....7.1..92....4.56.";
        String solution = "716439285394285176825167934269374851473851629158926743542698317687513492931742568";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_661() throws Exception {
        String puzzle = ".....3......7...4.7...1..3.....8179.9..42.1....7..6.....3...21...8...4..51...8..9";
        String solution = "841953627359762841762814935634581792985427163127396584493675218278139456516248379";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_662() throws Exception {
        String puzzle = "....4..8...62.....54......2.....8.6..15.6...4..2.7..5...4..7..3.2......1.3.15...7";
        String solution = "291745386386291475547386912473518269815962734962473158154827693728639541639154827";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_663() throws Exception {
        String puzzle = "..2.3.....1.......6.8.179.2.7.........67.42...23....4.......7..9.7....64...9.81..";
        String solution = "742539816519862473638417952475283691196754238823691547251346789987125364364978125";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_664() throws Exception {
        String puzzle = "...........78..356.8.6.3.29..........5...2......3..587..9....6...1...7.3.6..54..2";
        String solution = "396425178247819356185673429634587291758192634912346587479231865521968743863754912";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_665() throws Exception {
        String puzzle = ".......38..4.......6234.....9......6..7..5.4.2.3..6..5..68.47...85..32......7....";
        String solution = "951267438374518629862349157598421376617935842243786915126854793785193264439672581";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_666() throws Exception {
        String puzzle = ".6...3......51....4...8...3.3....95...8.6...7...75...1..1...3...5.8...1...2...574";
        String solution = "167293845893514762425687193736142958518369427249758631971425386354876219682931574";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_667() throws Exception {
        String puzzle = "....5......5..4.2..7.....31.1..........4.92.....23.6.4.........13..45.89.49..1..5";
        String solution = "921356478385174926476982531214567893863419257597238614658793142132645789749821365";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_668() throws Exception {
        String puzzle = "8.........47.....99.......1.....18...5..947.....6.731...41.6......7..4.3..5..3..6";
        String solution = "821369547547218639936475281762531894153894762498627315374156928619782453285943176";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_669() throws Exception {
        String puzzle = "...........35....8128..93...........6.1...9...94..5683........9..7.982..4..36....";
        String solution = "756843192943521768128679354875936421631284975294715683362157849517498236489362517";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_670() throws Exception {
        String puzzle = ".........9...12.8..6...8..4.........1....9.766..5..3.8....4...757.2.....3.6.7..59";
        String solution = "781493562954612783263758194438167925125389476697524318812945637579236841346871259";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_671() throws Exception {
        String puzzle = "...1.........5.96....3..147..65....2519..........7..1..3..26...9..814.5..8.......";
        String solution = "697148235143257968258369147376591482519482376824673519435726891962814753781935624";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_672() throws Exception {
        String puzzle = "......8.6.7.............532..9..8.....59..3...3..4..9....8.6.25.2.193.8.6..5.....";
        String solution = "952431876378652149461789532719368254245917368836245791193876425524193687687524913";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_673() throws Exception {
        String puzzle = ".....2....3..1.2.48.46.5.9...6........71..5.8...3.49....1..........5.....5..4.871";
        String solution = "719482365635917284824635197196528743347169528582374916471893652268751439953246871";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_674() throws Exception {
        String puzzle = ".1........3.....7.....9.2.6....2...7.67.1..42...6.59...8.....6.1.48.....6..2.3..4";
        String solution = "215736498936482175748591236891324657567918342423675981382147569154869723679253814";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_675() throws Exception {
        String puzzle = ".......8..7.....6..4..63.579......4.......1....158....4..37...515...6....9.8.16..";
        String solution = "613725489275498361849163257932617548584932176761584932426379815158246793397851624";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_676() throws Exception {
        String puzzle = "......9...1...35.2..9.2..17.61.........35..4...76....56..7.5.......3812......9...";
        String solution = "256174938714983562389526417561842379892357641437691285623715894975438126148269753";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_677() throws Exception {
        String puzzle = "8......3...7..2.5...5.4.28...2......96...1...4...7...3..65.......4.9......96.3.25";
        String solution = "821957634647832159395146287572369841963481572418275963136524798254798316789613425";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_678() throws Exception {
        String puzzle = ".87.2..16.5....7......9.....65.........6..9.4.9...2.83.......47..3..8..15...1..3.";
        String solution = "987524316452361798136897425365489172821673954794152683619235847273948561548716239";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_679() throws Exception {
        String puzzle = "..1.........3..19...529..64.....4......53.48.7.......9.3.4....6..8..6..5..7.1...8";
        String solution = "921648573846357192375291864593874621162539487784162359239485716418726935657913248";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_680() throws Exception {
        String puzzle = "5.3.8..9.8..74...6...32...198.1......7.45..28......3...47..........6....6..8.....";
        String solution = "523681794819745236764329851982137465371456928456298317247513689138964572695872143";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_681() throws Exception {
        String puzzle = "568.......7.8...9..2..7.1...........6...1.8.248.3.2.....7..4..3......7.93.19.....";
        String solution = "568193427174825396923476158712648935635719842489352671897264513246531789351987264";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_682() throws Exception {
        String puzzle = ".1......4.......6.3.5.1..7..8.9....3....85..69..1....5.56....2.4....1.....3..748.";
        String solution = "612798534879354162345612978584976213231485796967123845756849321498231657123567489";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_683() throws Exception {
        String puzzle = "4....1..9.8...2..7..78..............39...74.1..81...32.5...8.....6........2794.1.";
        String solution = "423571689689432157517869324261943875395287461748156932154628793976315248832794516";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_684() throws Exception {
        String puzzle = ".....8.9...41..3..5.2.6................381.5......5.787........68.9.74..9.5.16...";
        String solution = "316278594874159326592463781158792643467381952239645178721534869683927415945816237";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_685() throws Exception {
        String puzzle = "..7......3...1.4...865...23.....3..8.7..8..4......1.76....95.....1..6.5.....3.76.";
        String solution = "947328615325619487186547923514763298673982541298451376762895134431276859859134762";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_686() throws Exception {
        String puzzle = ".4..1..68......594.8..59.....7..3.8.3.4..6......1......5.8..7.3.........8...32..9";
        String solution = "945317268173628594286459137527943681314286975698175342459861723732594816861732459";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_687() throws Exception {
        String puzzle = ".....34...7..9....5..12..78........6.59....1....3.295..6........412...6...39.5...";
        String solution = "216873495378594621594126378132459786459687213687312954965741832741238569823965147";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_688() throws Exception {
        String puzzle = "....9...81......7.....672....67....14..3...2.27...6.....5..21.3.4...8....6..3...5";
        String solution = "627591348198243576534867219856724931419385627273916854985472163341658792762139485";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_689() throws Exception {
        String puzzle = ".8.........73..8141.3..6.2.........8.3.....51..4...2.3.9.73............27..8.16..";
        String solution = "285417396967325814143986527621573948839264751574198263496732185318659472752841639";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_690() throws Exception {
        String puzzle = "...6......1....8.76.8.1.......7..62.....5.4......349781...9...2..53.......75...3.";
        String solution = "254678391913425867678913254341789625789256413562134978136897542425361789897542136";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_691() throws Exception {
        String puzzle = ".23..4..............983..4....7...815...8.4...8...6......2...1.15......9.923..5.8";
        String solution = "823514796415967823769832145246753981537189462981426357378295614154678239692341578";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_692() throws Exception {
        String puzzle = ".....2....1....7..627.4.........9.........8.17...18695...1....6..2....495.3.24...";
        String solution = "395762418418593762627841953281659374956437821734218695849175236172386549563924187";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_693() throws Exception {
        String puzzle = ".........7.4..5.6..862....3........7....3.9.6.6..1..3......1......84...9893..6.15";
        String solution = "359168742724395861186274593432689157571432986968517234647951328215843679893726415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_694() throws Exception {
        String puzzle = "..........654.....7..5.6.1...9...1..54..7..9..87...5.3.......2.2...1.3..8.67..9..";
        String solution = "412897635365421879798536412629354187543178296187269543951683724274915368836742951";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_695() throws Exception {
        String puzzle = ".....9.........1..6.2.8.39.7...1.....46.7...11...56.3.......5..39.2..8...741.....";
        String solution = "413529678987634152652781394739812465546973281128456739261398547395247816874165923";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_696() throws Exception {
        String puzzle = ".7..6.2...4...5..3.5.18..4.....5.7.6..1.79..2.......1.3...1.8.78...3.........6...";
        String solution = "179463258648925173253187649482351796531679482967248315396514827815732964724896531";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_697() throws Exception {
        String puzzle = "...1......7...8.2.13...59...17.....4...7..6..362.....7.2..4.....9...18.....96...5";
        String solution = "249176358675398421138425976917632584854719632362584197521843769796251843483967215";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_698() throws Exception {
        String puzzle = "...........2..36.5.73.6.2...1..3..5....6.794....4..8..1....85...........8.4.92.7.";
        String solution = "681254397942783615573961284416839752358627941729415863167348529295176438834592176";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_699() throws Exception {
        String puzzle = ".8..57..........6..2.3..7.416..............8.7..9.461.69.5......3.....4...5.38..6";
        String solution = "386457291574192368921386754163875429249613587758924613697541832832769145415238976";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_700() throws Exception {
        String puzzle = "..............265.1..865.27.........9..658...86...3..9.....7....483....15....92..";
        String solution = "256734918487192653193865427372941865914658732865273149629517384748326591531489276";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_701() throws Exception {
        String puzzle = ".........4..5.1..998.7.6.1...........94..8.....3...185.....3......9..2..3.81549..";
        String solution = "751392846436581729982746513817235694594618372263479185679823451145967238328154967";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_702() throws Exception {
        String puzzle = "..8..93.1...8....7.9..15.......4...66.5....2.24..7..1......7......26...88.1...6..";
        String solution = "758429361412836957396715284183542796675198423249673815564987132937261548821354679";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_703() throws Exception {
        String puzzle = "6..1......137.2...2...4..8..76.3...5.....9...3...1...8..24.....9.1.7.3...4......9";
        String solution = "694183572813752496257946183176834925485629731329517648532491867961278354748365219";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_704() throws Exception {
        String puzzle = "9....8..4....1.26..36......5..94.6...7.2............52.98..1..6...8.471.....5....";
        String solution = "927568134854319267136427985582943671671285349349176852498731526265894713713652498";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_705() throws Exception {
        String puzzle = ".......1...8.....5......894.2..6....5..49...7....713...5...9...892..5...73..4..2.";
        String solution = "275984613948136275316257894127563948583492167469871352654329781892715436731648529";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_706() throws Exception {
        String puzzle = "........6.96..482..3...........86...172..9.....37........47....5...9...2.612..5.7";
        String solution = "814923756796154823235867914459386271172549638683712495328475169547691382961238547";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_707() throws Exception {
        String puzzle = "..36.....2.........9........5...3..99..4...5748..65.3...1....2.7..3....554...2..1";
        String solution = "813659274274138596695247813156723489932481657487965132361594728728316945549872361";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_708() throws Exception {
        String puzzle = "..9..7.6......98...2....4....3......96.1.4....8.2....5....4.9.2..19...462..3...7.";
        String solution = "349827561615439827728516439153678294962154783487293615836741952571982346294365178";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_709() throws Exception {
        String puzzle = ".........8.2.....3.153.9...3.........2..8.6.79765.....6.3...1.....8..2.4.4....5.6";
        String solution = "439268751862715943715349862381697425524183697976524318653472189197856234248931576";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_710() throws Exception {
        String puzzle = ".......6.....845....5...4..1...7.....27.....6.94.....254...9.1..79..52...3.4...7.";
        String solution = "412537869963184527785296431156872394827943156394651782548729613679315248231468975";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_711() throws Exception {
        String puzzle = "32..6..1....1.......1...8721.2..9..89...7....7.....3..........4..6..1....75..498.";
        String solution = "324867519587192463691543872162359748953478126748216395819725634436981257275634981";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_712() throws Exception {
        String puzzle = ".......2452....9....4...57..4.7...6..1..9..4......3..7...9.....36..2...8.8..1.7.5";
        String solution = "978165324526374981134289576843751269715692843692843157457938612361527498289416735";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_713() throws Exception {
        String puzzle = "..7......4.5.6.....1...9.357...........62..191.49..3.......74......1...2..8452...";
        String solution = "967583241435261987812749635796135824583624719124978356251397468349816572678452193";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_714() throws Exception {
        String puzzle = "8..5.....45...3..1....4......361..79.....25...8.7..61.61.4...9..3..2......9..6...";
        String solution = "892571346457263981361948725523614879176892534984735612618457293735129468249386157";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_715() throws Exception {
        String puzzle = "..7.......8.7...51...82...4.........73.5..6...124...891...35..8..89.......3.4.1..";
        String solution = "947351826286794351351826974895162743734589612612473589179235468468917235523648197";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_716() throws Exception {
        String puzzle = "............8.1...18.927.6........73263...1...5..9............28.7.5.63.34.7....9";
        String solution = "972635481536841927184927365498216573263574198751398246619483752827159634345762819";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_717() throws Exception {
        String puzzle = "2..9..1....6..45..7...52.46...6....383...1.65.......7...4.78...5.14......8.......";
        String solution = "245967138396184527718352946457629813839741265162835479624578391571493682983216754";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_718() throws Exception {
        String puzzle = "3.8.............921...673...4.9......9..31724..372..6.....1..486......3.........6";
        String solution = "368592471475183692129467385742956813596831724813724569937615248651248937284379156";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_719() throws Exception {
        String puzzle = "....5...7.49.3..8..5.4..2..8.........367....1..26...7..6...1.281..2...56........9";
        String solution = "321856947749132685658479213875914362436725891912683574567391428193248756284567139";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_720() throws Exception {
        String puzzle = "..12....8.8.51..4......3.5.........34.57....1..3...52.....7.....1...2.7.9.78..43.";
        String solution = "751264398389517246642983157196425783425738961873196524234679815518342679967851432";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_721() throws Exception {
        String puzzle = ".....8..64..9.2.....1.74.....2....3...4..7.25..7.5.4.9...1.....6....9.51.3...5..4";
        String solution = "293518746476932518851674293512496837964387125387251469745163982628749351139825674";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_722() throws Exception {
        String puzzle = "...3.....8...2.54.9517...8...2..6.5......2..91....7.2..1......6.3...8.....6...498";
        String solution = "247385961863921547951764382372196854685432179194857623518249736439678215726513498";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_723() throws Exception {
        String puzzle = "..7.2....3..514..7.5......2.........7...38.59695..1....21......4....5.8..7....4.3";
        String solution = "147829536362514897958367142283956714714238659695471328821643975436795281579182463";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_724() throws Exception {
        String puzzle = ".3............946...7135........1..6.8637..4......8.....5...7...29.1...5..45..39.";
        String solution = "932864571158729463647135928273941856586372149491658237865293714329417685714586392";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_725() throws Exception {
        String puzzle = ".......1....69..38......6.9.8..1.3....7..6.9...9..3864...3..........1.879...645..";
        String solution = "695438712271695438843127659486912375537846291129573864752389146364251987918764523";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_726() throws Exception {
        String puzzle = "..8.25.1..2......3.47..35...15..9...9..3.....38..1..4......4....5.79.8....26.....";
        String solution = "638925417529147683147863592215479368974386251386512749861234975453791826792658134";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_727() throws Exception {
        String puzzle = ".1.......9.....5.3.5.12.79.4....8.6...69..1.8.7.3...2....48...7..5.3.4.......5...";
        String solution = "617593842942867513358124796429718365536942178871356924293481657765239481184675239";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_728() throws Exception {
        String puzzle = "..2....1.4.8.1...6.7.....4....9..4.7746........9....8.5..3.2...8.4......6..4.957.";
        String solution = "962843715438517926175296348381925467746138259259674183517362894894751632623489571";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_729() throws Exception {
        String puzzle = "...4.81.2.8..9....45..32........7.....7..128..3...94..7.....6..59....87.......9.4";
        String solution = "379468152281795346456132798928647531647351289135829467713984625594216873862573914";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_730() throws Exception {
        String puzzle = "....2......2..5.93154.38....8.......4.9...6.2..5......5.....13..4...3.6.7....42.5";
        String solution = "938726541672145893154938726387562419419387652265491378526879134841253967793614285";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_731() throws Exception {
        String puzzle = ".............7.3.9.38..965..2.5...9..5...2..68..71..2..1..........1..73.7.465....";
        String solution = "975361248462875319138429657627538491351942876849716523513287964286194735794653182";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_732() throws Exception {
        String puzzle = "....3...8..16...5.6.89.51..1........32..7...6.7..68.........2.....4.69......1756.";
        String solution = "952731648741682359638945127186324795324579816579168432465893271217456983893217564";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_733() throws Exception {
        String puzzle = ".2..543...98.....7..4.9...66.9.2...8..38.....2..9.3..5....35......27.......4....2";
        String solution = "126754389398612547754398216679521438543867921281943675862135794415279863937486152";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_734() throws Exception {
        String puzzle = "............2.7..1.67..32.4........8..475..9..85.1.4....1..49..83...........8531.";
        String solution = "248561739593247861167893254916432578324758196785916423651324987832179645479685312";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_735() throws Exception {
        String puzzle = "......6..8..9.1..3..123..............39...5...57.19.46....62....2.5.836...8.....5";
        String solution = "943857612862941753571236984486725139139684527257319846395162478724598361618473295";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_736() throws Exception {
        String puzzle = "..1....25.........94.3..87...3.265...2...5..4....3..1.3.97..6..4...9........6..93";
        String solution = "781649325235817469946352871193426587628175934574938216359781642467293158812564793";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_737() throws Exception {
        String puzzle = ".......3..764......3..297.............196..4.8.3.17...5.7..1..3684.....5...8....2";
        String solution = "198756234276438951435129786962384517751962348843517629527641893684293175319875462";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_738() throws Exception {
        String puzzle = "...43.6...9.........7.1..93...3......5..219...216....58.....2.9..6....8...2.4..56";
        String solution = "185439627693257148247816593469385712358721964721694835814563279536972481972148356";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_739() throws Exception {
        String puzzle = "....39..2.17.8.......6.75....4......8......5...589.1....2....49.4..238..3.1..4...";
        String solution = "568439712917285463423617598134752986896341257275896134752168349649523871381974625";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_740() throws Exception {
        String puzzle = ".4......8.....6...2.784.6.37.81..26....7...3...9.3.....5..........3..1253...21...";
        String solution = "645213798813976452297845613738159264461782539529634871152497386974368125386521947";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_741() throws Exception {
        String puzzle = "..7..........8.56.5.8.67........3.8..7.92.....2.746..5..9....46.4...1.....26..1..";
        String solution = "967415823214389567538267491496153782375928614821746935159872346643591278782634159";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_742() throws Exception {
        String puzzle = ".6......8....4....83...79....2..1...9...3..7.6..5.2..1..6..3....8.2..1.3.5...94.6";
        String solution = "267915348195348267834627915572891634918436572643572891426153789789264153351789426";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_743() throws Exception {
        String puzzle = ".....5......72.1.3...8.1.....1..6...73..5.96.....1.52...8..2....5...4.3..7.58...4";
        String solution = "813645279465729183927831456581296347732458961694317528348162795156974832279583614";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_744() throws Exception {
        String puzzle = ".2.....1..3....7.21..9.7........42...4.3...5.38.7.9.6..6...1.2.8.......1..5..6..8";
        String solution = "927643815436518792158927436579164283641382957382759164764831529893275641215496378";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_745() throws Exception {
        String puzzle = "..4..1....2..76..4..7.9...2......2...1.36.........45.1.3.1.....1.29.3..7.....73.5";
        String solution = "594231876321876954687495132478519263915362748263784591736158429152943687849627315";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_746() throws Exception {
        String puzzle = "2.78..4..6.......7.4.....8..5...9.32......9...3.28......4..56.....4..57.3..6.1..9";
        String solution = "217836495683954217549712386458169732721543968936287154894375621162498573375621849";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_747() throws Exception {
        String puzzle = "5...4.......8..2....2..584...96..4......5.......12495...8.6....1..4.7.2..63..9...";
        String solution = "587246139634891275912735846859673412421958367376124958748362591195487623263519784";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_748() throws Exception {
        String puzzle = "........1..56..42....15..63.3.......4...72....968.......42....7..1.6...56794.....";
        String solution = "763924851185637429942158763237596184418372596596841372354289617821763945679415238";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_749() throws Exception {
        String puzzle = "..3..6..25...217..8.1.3..................592.6.5.8.34.....9......7..35...4.5.7..1";
        String solution = "473856192569421783821739456298374615734615928615982347356198274187243569942567831";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_750() throws Exception {
        String puzzle = "1.....98.6...8..1..25....6...64.2.....9...63...876..9.........3....541.....2.8..9";
        String solution = "137526984694387215825149367316492578479815632258763491942671853783954126561238749";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_751() throws Exception {
        String puzzle = ".........4.738........52.4.....745.....53.28..6..9..7...84..7.17.3.....6..6....9.";
        String solution = "652947318497381625831652947289174563174536289365298174928465731713829456546713892";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_752() throws Exception {
        String puzzle = "..1........397..85.9...8.23.....7...932....7...4.9.81...5.8....76....4.....4...6.";
        String solution = "851632947623974185497158623186547239932861574574293816245786391768319452319425768";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_753() throws Exception {
        String puzzle = ".78....9..1..7.5....59.31.....1.....29....3.1...4.2..97.9.....6....2..5..5...6..2";
        String solution = "378251694912674538645983127834197265297568341561432789729345816186729453453816972";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_754() throws Exception {
        String puzzle = ".........96...41.8543..............6.8...9.537.5.8.9....7..348..54..2.......48...";
        String solution = "178296534962354178543817629429735816681429753735681942297163485854972361316548297";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_755() throws Exception {
        String puzzle = "..9....4.2...3.17.8.......2........6..2.53..83.6.917.....14....6...853....1.....7";
        String solution = "719562843265438179843917652198274536472653918356891724937146285624785391581329467";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_756() throws Exception {
        String puzzle = "........1.2.16.3.7....386....9..3...1...492...627..4........1....48....5.7.....46";
        String solution = "693274581428165397715938624549623718187549263362781459856497132234816975971352846";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_757() throws Exception {
        String puzzle = "..3......9.....3..485..37..2....1....648.....3...27.8.....1..7....7.46..8....693.";
        String solution = "673942158912578346485163792298431567764895213351627489526319874139784625847256931";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_758() throws Exception {
        String puzzle = "25...1........8.6...3...4.1..48.6.9...9.4.8...1..29.4.9.53.7....6..5...7.........";
        String solution = "256491738471238569893765421534876192629143875718529643945387216162954387387612954";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_759() throws Exception {
        String puzzle = ".9.....8.3..5....128.4.....51..6......4.....99.23..7..1..87.2.....9.485......3...";
        String solution = "491736582376582941285491376517269438834157629962348715149875263623914857758623194";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_760() throws Exception {
        String puzzle = "..2.19.3.8......1...18....9.....1.76..4....81...67.2........5..9...2..484....89..";
        String solution = "562719834897453612341862759259381476674295381183674295718946523936527148425138967";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_761() throws Exception {
        String puzzle = ".584.3....4.....5......8........6..99..54.3..4.7.2.5...7.6....1.....2.4.5.1.8..9.";
        String solution = "258413967143967852796258134815376429962541378437829516374695281689132745521784693";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_762() throws Exception {
        String puzzle = ".....9.....7.86...6..3......4...7..8.......32..36.51...6.7...8.3.2...49..548....3";
        String solution = "435179826917286354628354971241937568596418732873625149169743285382561497754892613";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_763() throws Exception {
        String puzzle = "...........7.8...5......893.....1.5....3..9.64.6..5.87....7.....2...85..7.4.396.8";
        String solution = "385692741947183265162754893279861354518347926436925187891576432623418579754239618";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_764() throws Exception {
        String puzzle = "74...5...5.1.4.9.6.9.............1.....4.268...87...42..2.....3...62.7..98...3...";
        String solution = "746395821521847936893261457234586179179432685658719342462978513315624798987153264";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_765() throws Exception {
        String puzzle = "9....1.8..6..381...1.6......9...68.2..2.....3.3..7..6.75.........9.17.34....8....";
        String solution = "925741386467938125813625947194356872672894513538172469751463298289517634346289751";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_766() throws Exception {
        String puzzle = "..8....12....19..59..4..8.6.42.37....915....7..........8....7.....398.2.1.6......";
        String solution = "458763912627819345913425876842637159391582467765941283289156734574398621136274598";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_767() throws Exception {
        String puzzle = "....4...3...9...8...43...196....9..7..81.......37..15..4.......1.6..35..7.5...23.";
        String solution = "519847623237916485864352719651239847478165392923784156342578961196423578785691234";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_768() throws Exception {
        String puzzle = "..5.......34....1.816.35....7..8.......9.324.2......5........81.....1..33....6592";
        String solution = "925614378734298615816735924479582136158963247263147859642359781597821463381476592";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_769() throws Exception {
        String puzzle = "...........1..6..873......1....2...33..9.5.27.72.4.8...2........8.1..39..47.92...";
        String solution = "894251736251736948736489251419827563368915427572643819923568174685174392147392685";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_770() throws Exception {
        String puzzle = "........9...7.46..9.4..15.2..3...8..8.6....2....16.9......5.......8.9....3..76198";
        String solution = "361582479258794613974631582513927846896345721742168935189453267627819354435276198";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_771() throws Exception {
        String puzzle = "..1...2.73..7.541........3......7.........9.2.2.4.6381..9.......1...48.3...1.8.4.";
        String solution = "581643297392785416674219538138927654465831972927456381849372165716594823253168749";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_772() throws Exception {
        String puzzle = "26..1...8.1...3.2...4.2..5....9.4.7..3........98...2.1............4.6.17.4.1..3.5";
        String solution = "267519438915843726384627159152964873736281594498735261571398642823456917649172385";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_773() throws Exception {
        String puzzle = "..1.2...5945..1........9....74...2.1...5.....2...4..6..9....64...7.6.3...2.93..1.";
        String solution = "731826495945371826682459173874693251169582734253147968398715642517264389426938517";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_774() throws Exception {
        String puzzle = ".....9.........84.4.8..21.5..4.1..8..86...7.....6......3..76.1.76.53..9....82....";
        String solution = "175489623623157849498362175254713986986245731317698452832976514761534298549821367";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_775() throws Exception {
        String puzzle = "..............9.32.52.47..6...........9.2..6..6..78.25.....3....94.....8.2159..43";
        String solution = "638251479147869532952347816215634987789125364463978125576483291394712658821596743";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_776() throws Exception {
        String puzzle = "......2....3..514....9....6...2.1..4....93.2.5..4.8...654..2..9..9...37.3..8.....";
        String solution = "465187293793625148218934756937251684846793521521468937654372819189546372372819465";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_777() throws Exception {
        String puzzle = ".18.4....5.2..7..8......24.............1.938..36...5.....4.1....745.6.......9271.";
        String solution = "718243659542967138369815247951638472427159386836724591293471865174586923685392714";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_778() throws Exception {
        String puzzle = "..8.426......6.....4.8.75...6......1....5.27..7....8...876.9..5.932.....4.......9";
        String solution = "358942617729561384641837592865723941934158276172496853287619435593274168416385729";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_779() throws Exception {
        String puzzle = "61..........8.9.......5.......9..7....3....164..1...35.3..1...2.25..8..1.4.27.5.3";
        String solution = "619723458352849167874651329261935784593487216487162935936514872725398641148276593";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_780() throws Exception {
        String puzzle = "...6.....4...8...77......26..........7..46.3.8.1.7..54..8..51...5.....831....357.";
        String solution = "283617495496582317715934826349258761572146938861379254638795142957421683124863579";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_781() throws Exception {
        String puzzle = ".........3546.....69....5.4....4......6..17.3.4.85.1.9...........9.7...64.1.2.39.";
        String solution = "127435968354689271698712534912347685586291743743856129875963412239174856461528397";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_782() throws Exception {
        String puzzle = ".1...8..44.....8.6...3.4...1.67..3.93.2....5......2.......17...5.92.31.....4...6.";
        String solution = "215698734437521896968374512186745329392186457754932681623817945549263178871459263";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_783() throws Exception {
        String puzzle = "..1.....23....54...5.2...8....49..1....5....4.....17.8...8..265594..6.71.........";
        String solution = "761984532328715496459263187875492613613578924942631758137849265594326871286157349";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_784() throws Exception {
        String puzzle = "....82.6.827........1..4...3...9.71..1.5..63.9......8.2.3...45....2.3....8..7....";
        String solution = "594782163827136945631954278352698714418527639976341582263819457745263891189475326";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_785() throws Exception {
        String puzzle = "2.....6...57.....8.4....239...91.......5....6..3..7.1.47..68.9...9...8...6.1....7";
        String solution = "231849675957326148648751239786914523194532786523687914475268391319475862862193457";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_786() throws Exception {
        String puzzle = "..3.58...17.........2..7.9...9..........3594.3....91.2.2.....5.94.....638...16...";
        String solution = "693458217174923685582167394469271538217835946358649172726394851941582763835716429";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_787() throws Exception {
        String puzzle = ".284.1....4...698...5.89.....1..23...8....6......3..9.........1.....3.7..6.7.84.9";
        String solution = "928471563147356982635289714791562348483197625256834197879645231514923876362718459";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_788() throws Exception {
        String puzzle = ".3.8.7....68.1...951...28.........5.2......6..95..3.....1.79..2.....6..3.2...14..";
        String solution = "932867145768514239514932876643728951287195364195643728351479682479286513826351497";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_789() throws Exception {
        String puzzle = ".........1..4.8..7...67......9...7.3.5..9...8....43....96.31..4.45.8...9.7....38.";
        String solution = "587319462162458937934672851619825743453796128728143596896531274345287619271964385";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_790() throws Exception {
        String puzzle = "..........13..9.2.28..76..1...........7.9.53..6.783..2......1..........37516..8.9";
        String solution = "576321984413859627289476351394265718827194536165783492632948175948517263751632849";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_791() throws Exception {
        String puzzle = "....5.....5....746...6...85.2.1.6.5...74..1.8..8....2.9.......4.1.7..8..7..83....";
        String solution = "674258931852913746391647285429186357537492168168375429983521674215764893746839512";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_792() throws Exception {
        String puzzle = "...7.........6.5...873.1.4..93.1.7...6.....218..5..3.4.7.4..6.8.........9...5..7.";
        String solution = "246785913319264587587391246493812765765943821821576394172439658658127439934658172";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_793() throws Exception {
        String puzzle = "..59.1.8..7.6....46......3.24.....1..5...4....63.....2...8.7.43......9..3....98.6";
        String solution = "435921687978653124612748539249386715157294368863175492591867243786432951324519876";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_794() throws Exception {
        String puzzle = ".3...5...9.72.3..1...79..........5....3..61..6...518.72.536....3....8.....4....9.";
        String solution = "832615974947283651561794283418937562753826149629451837275369418396148725184572396";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_795() throws Exception {
        String puzzle = ".8.1...543...97.8..7.8....6.5.7.4.....3....4..2...........85.3....4.....61897....";
        String solution = "982136754364597182571842396856724913193658247427319568749285631235461879618973425";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_796() throws Exception {
        String puzzle = ".312....8..5..16..8....3.......3..91.....72847........1.....4....46..9.2..2....16";
        String solution = "431269578925781643867453129248536791653197284719842365186925437374618952592374816";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_797() throws Exception {
        String puzzle = "2..17......7.8...46..................46...397.3.4.7..1...3......617.8.29....2.1.6";
        String solution = "254176983197283654683594712712639845546812397839457261925361478361748529478925136";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_798() throws Exception {
        String puzzle = "..6.....227..39.6.9.5...3.7.6..........1.5.......92.513..9.8......4..8..1...27...";
        String solution = "436781592278539164915246387561374928892165743743892651354918276627453819189627435";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_799() throws Exception {
        String puzzle = ".134.25.....9..7.247.................61..8...8..2.5.16........15.68.4.2....65....";
        String solution = "913472568658931742472586139295163874361748295847295316784329651536814927129657483";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_800() throws Exception {
        String puzzle = "..7.......436.2..9....3.8.............5...69.216.4.35..........5..81.4.38.1...92.";
        String solution = "687195234143682579952734816798356142435271698216948357364529781529817463871463925";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_801() throws Exception {
        String puzzle = "2....8......5..3.9..6237......18.7.3.5..4....1.....4..6.7.1......13....6..5..6.8.";
        String solution = "213498657874561329596237148462185793759643812138972465627819534981354276345726981";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_802() throws Exception {
        String puzzle = "...29.7.........451....423.....1...65..97....8.143.....1....8...94...6.12......7.";
        String solution = "453291768962387145187654239379512486546978312821436597615749823794823651238165974";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_803() throws Exception {
        String puzzle = "..........9.174...4718....9............2.7....5..9.237..6..3.4...5.2....13.5..67.";
        String solution = "862359714593174826471862359327685491914237568658491237286713945745926183139548672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_804() throws Exception {
        String puzzle = "..76..........7.2...138.5......3.....8...41.5..52..74....4.....6.48..35..1...3..9";
        String solution = "427651983358947621961382574746135298289764135135298746593426817674819352812573469";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_805() throws Exception {
        String puzzle = "........5.25..87....1....4......3....7.9.4..8.82..691..1.........7.6.8.363.7...9.";
        String solution = "763249185425138769891657342149823657576914238382576914218395476957461823634782591";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_806() throws Exception {
        String puzzle = "...2....4...37...26.24..93..8...4......6.5.....179...51....64.....9..3.6..8.....9";
        String solution = "813269574495378612672451938586124793937685241241793865129836457754912386368547129";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_807() throws Exception {
        String puzzle = "...1.35...1..45...7..2.9.....1.....2.2.....59..752.6....67......89...2....3.8..4.";
        String solution = "948173526612845973735269481561497832824631759397528614456712398189354267273986145";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_808() throws Exception {
        String puzzle = "....53..2.39.....78.1..79..1..7.826...85.1......62....4........9731............8.";
        String solution = "746953812539812647821467935154738269268591374397624158482376591973185426615249783";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_809() throws Exception {
        String puzzle = "..1..3......1..832.8........1...52...759.6.8..6...8...7..3.4..9.......58.5..9.3..";
        String solution = "691283745547169832283547961814735296375926184962418573728354619139672458456891327";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_810() throws Exception {
        String puzzle = "...6.....2..1...6...982......8...71...6...4825.......31..9.4..7.7..61...9.4.5....";
        String solution = "751649238283175964649823571428396715396517482517482693162934857875261349934758126";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_811() throws Exception {
        String puzzle = ".3.....8.....1.2.....5.69...9..4..653....5.19....63..29....21.7.7........61.....8";
        String solution = "635429781489317256712586943897241365326875419154963872948652137573198624261734598";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_812() throws Exception {
        String puzzle = "...1....5.9...7....21.59...1.......7..37..56.4...65.132...3..........4.....5812..";
        String solution = "734128695596347128821659374165293847983714562472865913259436781318972456647581239";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_813() throws Exception {
        String puzzle = "1.67...........97...423.6.8..3..97.........4.7...2.1.98.5......2413.7....3.......";
        String solution = "186794532352681974974235618423519786519876243768423159895142367241367895637958421";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_814() throws Exception {
        String puzzle = "..7.....9..95..8..2.....3....1..27.3...75...15.3..4.8.1..........5.7.1.....38..92";
        String solution = "357248619619537824284619375491862753862753941573194286138925467925476138746381592";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_815() throws Exception {
        String puzzle = ".9.2.........14...4.....862.........961.42.3..2.8...9.34......5....317.....48...9";
        String solution = "597268413682314957413579862835196274961742538724853691349627185258931746176485329";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_816() throws Exception {
        String puzzle = "..........72.1...658....9..1..79..6......6..84.....7..259.3......38..5...4.9...73";
        String solution = "694378125372519846581624937138795462927146358465283719259437681713862594846951273";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_817() throws Exception {
        String puzzle = "...6..17...3...........2.83.49..1...8..7..4......943....5...2..6...57.4..8.26.7..";
        String solution = "958643172723185964416972583549831627831726459267594318375418296692357841184269735";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_818() throws Exception {
        String puzzle = "..4..2...1...6875.7..9....1..7..3.8.....1.3.....6895.2...........1...6..5..7.12..";
        String solution = "354172869129468753768935421297543186685217394413689572842356917971824635536791248";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_819() throws Exception {
        String puzzle = ".........3.254.....5.3.1.7.........44.9..6..5.23.5479........5.7..81.....8..6...9";
        String solution = "148697523372548961956321478567983214419276385823154796691432857735819642284765139";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_820() throws Exception {
        String puzzle = "5..4...7.6...9.52...3.254.........67....148..8..6.......52.....3....7...79.35....";
        String solution = "512486379684793521973125486451938267267514893839672154145269738326847915798351642";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_821() throws Exception {
        String puzzle = "..........47.56...9.84...61....7..9.4.9...1.......9.8.........7...2846..3.269...5";
        String solution = "623718459147956238958423761586172394439865172271349586864531927795284613312697845";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_822() throws Exception {
        String puzzle = "............53..416..412..59.....16..4.6....2..52........1.32.......5.89.7..8...6";
        String solution = "451879623289536741637412895928357164143698572765241938894163257316725489572984316";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_823() throws Exception {
        String puzzle = ".9..6......4.....6..3...942...2......86...2....7.816947....8.....951.....5.....73";
        String solution = "295864731174923856863175942941256387386749215527381694712438569639517428458692173";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_824() throws Exception {
        String puzzle = "....7.36.3.1.......42.....8..3..64....48....2.....31....5.8...72..76.......3..856";
        String solution = "589274361361958724742631598973126485154897632826543179635489217218765943497312856";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_825() throws Exception {
        String puzzle = "...1.29..1.3.97.....9....7..34.6.8.......45..5...21.3....4.....95...........153.7";
        String solution = "675142983183697245249358671734569812812734596596821734327486159951273468468915327";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_826() throws Exception {
        String puzzle = "8......9..752.9.8..4.5..1....3.8.6.....3...7.28...5........4....1..27.3..6.9...2.";
        String solution = "831476592675219384942538167193782645456391278287645913328164759519827436764953821";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_827() throws Exception {
        String puzzle = ".....2..84.1..6..7..21.79.3..7.......65.4...9..4...56......1.....8.....691..8..7.";
        String solution = "759432618431896257682157943397615824165248739824379561273961485548723196916584372";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_828() throws Exception {
        String puzzle = "..6.29...4....6..2.9....6..2....51.4.......8.85..1.263....92.4.51..........4..8..";
        String solution = "736129458485736912192548637263875194941263785857914263678392541514687329329451876";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_829() throws Exception {
        String puzzle = "..........1.72....7...14826...........6...9...419.6.3..5...1....2..9768....58...9";
        String solution = "234865197618729543795314826982153764376248951541976238859631472123497685467582319";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_830() throws Exception {
        String puzzle = "..51...2623...9...............9..8..59..83.....65..1.7.6......1..4.....8853..16..";
        String solution = "945178326238469715617352984472916853591783462386524197769835241124697538853241679";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_831() throws Exception {
        String puzzle = "68.4........71...9.13......8.....3.....8.4.9.462..9......9...37.2...71.8.......26";
        String solution = "689452713245713689713698542891275364537864291462139875158926437926347158374581926";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_832() throws Exception {
        String puzzle = "...9....7.2...7.613..81...2....78..9..73...2.1...4...........5...5.....3.1..52.78";
        String solution = "581926347924537861376814592452678139867391425139245786798163254245789613613452978";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_833() throws Exception {
        String puzzle = ".......6....13.9.79..2...31..2........45.17.3.1...6..4.46....2.....1....2..6.5..8";
        String solution = "431759862628134957957268431792843615864521793315976284146387529589412376273695148";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_834() throws Exception {
        String puzzle = "..............2891.8..3.5.7..........47..1.85..6427..3..........3...5.7.719...2.4";
        String solution = "572918436364752891981634527193586742247391685856427913425179368638245179719863254";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_835() throws Exception {
        String puzzle = ".1..5....362.1...5.7.2.64.......5.7...5.9.6..9........7....1..8...3749..6.1......";
        String solution = "814759263362418795579236481436125879125897634987643152743961528258374916691582347";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_836() throws Exception {
        String puzzle = ".....1.86.763..5.2.....93....7....6.9.....8...54...2.7..8.359...3.9........4.7...";
        String solution = "493521786176348592582769314327854169961273845854196237748635921635912478219487653";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_837() throws Exception {
        String puzzle = "3.7..9........3.6...64....1..31...94.25.4.8.3.6.3....2........6...2..9..58.....4.";
        String solution = "317569428248713569956428731873152694125946873469387152794835216631274985582691347";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_838() throws Exception {
        String puzzle = ".21....5.......7.8...4...2....6...35.6........83.2.6...59..2.86.3...1.....69.42..";
        String solution = "321786459945213768678495321192647835764538912583129647459372186237861594816954273";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_839() throws Exception {
        String puzzle = ".5.........4.8.639..1..34.52........6..45.8..41.8....6.......94...2.7....8...9..2";
        String solution = "853694217724185639961723485238976541697451823415832976372568194549217368186349752";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_840() throws Exception {
        String puzzle = ".9.....3..2.49.8....6....4.5.8.....4........3...62.5.89....72....528..6.2..9....5";
        String solution = "894765132127493856356812947518379624642158793739624518963547281475281369281936475";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_841() throws Exception {
        String puzzle = "....52.8......76544...9...395..7.......9..7...4.3....5......53619.........6.2..1.";
        String solution = "673452981219837654485691273951274368368915742742386195827149536194563827536728419";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_842() throws Exception {
        String puzzle = "....573.67.5..38.....2..7..1...........8.9...9...2..5...41.......2..618.....326.7";
        String solution = "248957316795613824361284795127345968453869271986721453674198532532476189819532647";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_843() throws Exception {
        String puzzle = "2..........6...53..4.86.2.7.7..........6....35.2.7......41........296.4.62..8.7.1";
        String solution = "217534896986712534345869217173948625498625173562371489834157962751296348629483751";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_844() throws Exception {
        String puzzle = ".....3...3.67...845...9.2..............6.2.13..51...29..4.......52.....6.91.645..";
        String solution = "189243657326715984547896231213479865978652413465138729634527198752981346891364572";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_845() throws Exception {
        String puzzle = ".......1...59.2.4..9..68.7...48....38.....45...3.4..6..6......73..69......2..71..";
        String solution = "648375912735912648291468375914856723876123459523749861169284537357691284482537196";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_846() throws Exception {
        String puzzle = "........36...........9.38.......93.....245.865.1..6.927.........8..74..9.168...4.";
        String solution = "128457963639128475475963821862719354397245186541386792754691238283574619916832547";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_847() throws Exception {
        String puzzle = ".......3....1..6....1642...4..7......934.1.2.......1....7...28415....3..8.4.37...";
        String solution = "269875431548193672371642859415728963693451728782369145937516284156284397824937516";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_848() throws Exception {
        String puzzle = "...7...9......65.....913.6...6..5....3..79....7.84..2...2...1...6...42.94.51.....";
        String solution = "624758391913426578758913462846235917231679845579841623392567184167384259485192736";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_849() throws Exception {
        String puzzle = ".....6.49..3.7.......5..1...17...6..3.2.5.....54.....87......8..65.2.4.7...4..5.6";
        String solution = "571286349923174865486593172817942653392658714654731928749365281165829437238417596";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_850() throws Exception {
        String puzzle = ".7.4.82..........34.3....5...7.6..3.6.....5.1.59....7...4.81.........76.39..5...8";
        String solution = "975438216261975483483216957147562839632897541859143672724681395518329764396754128";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_851() throws Exception {
        String puzzle = "..2......93...2..6.5.869.2.......9.5....8..4....347.....475..3..13......6..1....4";
        String solution = "462573891938412576751869423347621985126985347895347612284756139513294768679138254";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_852() throws Exception {
        String puzzle = "...........26.89...643...52.......652.17.5.3..7..3.........7.......86.9.7...1..28";
        String solution = "937152846152648973864379152349821765281765439576934281628597314413286597795413628";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_853() throws Exception {
        String puzzle = ".....1...9.8.5.6..2...8..4...98..4...2.74.983...........1.7..9........6.56..1.2.7";
        String solution = "653421879948357612217689345379862451126745983485193726831276594792534168564918237";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_854() throws Exception {
        String puzzle = "2.48........7.5....13.....9..7.......26....3.3...26.4...9..845.87.....16....6.2..";
        String solution = "254893167698715324713642589547381692926457831381926745169278453872534916435169278";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_855() throws Exception {
        String puzzle = "4....1....5.....1.1..9.2..8.6..1....9......56.275....9..8...9..5..7...8...28.4.6.";
        String solution = "483671592259348617176952438865419723941237856327586149638125974594763281712894365";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_856() throws Exception {
        String puzzle = ".2............1.7.1....268.......43.37..6.........419...2.18....37.5.8....62.7.5.";
        String solution = "725683941683491275149572683961825437374169528258734196592318764437956812816247359";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_857() throws Exception {
        String puzzle = "..2.........7.5...45.......5.8....9..461.......32.9..6.....1.638.4.3...7..547.8..";
        String solution = "762814935389725641451693728528367194946158372173249586297581463814936257635472819";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_858() throws Exception {
        String puzzle = "3..7....9.52.......7.9.24.......6148....1.....2..8.76.......3..8..5.....5.3.24.8.";
        String solution = "341768259952143876678952431735296148486317592129485763264879315897531624513624987";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_859() throws Exception {
        String puzzle = ".4.876.2.....9.5..9...4........6.24......98.....4.1.5.81.......47.....122..3..6..";
        String solution = "345876129687192534921543768198765243564239871732481956813627495476958312259314687";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_860() throws Exception {
        String puzzle = ".5......6..674.31.2...8..4..1.3...24...8...7......41....26......6...9.815....8...";
        String solution = "754132896896745312231986745618397524425861973973524168182673459367459281549218637";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_861() throws Exception {
        String puzzle = ".2...4...4.31...9.9....2.....9........2571..91..8..5.6....8..65......3....62.38..";
        String solution = "628794153473158692915632748859346217362571489147829536231487965784965321596213874";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_862() throws Exception {
        String puzzle = "........4..8.3..19342.16.....9.....6.8...4...65...2.8.1......5...5.21..8....4.3..";
        String solution = "971258634568437219342916875219873546783564192654192783126389457435721968897645321";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_863() throws Exception {
        String puzzle = ".3.9.....25.7.8.3.6.7...........3.8........7..7.2853....1.....5..3..4..6..5.197..";
        String solution = "438961257259748631617532498596473182382196574174285369961327845723854916845619723";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_864() throws Exception {
        String puzzle = ".........2.3.41.8..6...84....2....7....3759.8......1.4........55.86.....3248....6";
        String solution = "847596231253741689169238457982164573416375928735982164671423895598617342324859716";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_865() throws Exception {
        String puzzle = "..1........5.17....2.8...5.8..7...2...7..3.9.....9.6.7.42..983.......2...182.5...";
        String solution = "931652784485917362726834159894761523167523498253498617642179835579386241318245976";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_866() throws Exception {
        String puzzle = ".......9.....42..19.1...3....8.1......4..8...13.2...8.8..4..6...235...1....3..958";
        String solution = "782135496365942871941867325578613249294758163136294587859471632623589714417326958";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_867() throws Exception {
        String puzzle = "...9.....7.12.3..8.....87....9.2..1..1....47.42..8...3......6...63..1...542.3....";
        String solution = "685917324791243568234568791359724816816395472427186953178452639963871245542639187";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_868() throws Exception {
        String puzzle = ".7......31......29..8.5.7......9.4.....51....9.78.6....6.283............41.6.538.";
        String solution = "674928513153467829298351746531792468826514937947836251765283194382149675419675382";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_869() throws Exception {
        String puzzle = "....3..6.........569....7...49..1.....7.8...1...4..5.2.651..9..7...9.2.6.8.7....4";
        String solution = "458237169273916845691854723849521637527683491136479582365142978714398256982765314";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_870() throws Exception {
        String puzzle = "..........5..83..9...72.16...2..9.7...43.7..1..1.64..8.........4.8.31....15.....7";
        String solution = "327196845156483729849725163532819476684357291791264538263578914478931652915642387";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_871() throws Exception {
        String puzzle = ".8.1...9.1.6..5....74.23.1.6..7.....4..5...78........5...9.8....4.........5.17.89";
        String solution = "582176394136495827974823516651789243423561978798234165317948652849652731265317489";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_872() throws Exception {
        String puzzle = "....1..28.....4...2.39.5.7......83.7..9.6....3.....98...4..9..6.92..7.1.....4.2..";
        String solution = "957316428618724593243985671425198367879563142361472985184259736592637814736841259";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_873() throws Exception {
        String puzzle = "........9....18.6..3.75......4.......7214....3....247.........5..82...969.6.85.2.";
        String solution = "561324789247918563839756214184579632672143958395862471723691845458237196916485327";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_874() throws Exception {
        String puzzle = "........88..2..5...5.9....7..8.549..1......8..428....3..74.....43..1..656...2....";
        String solution = "796145328814237596253986147378654912165392784942871653527469831439718265681523479";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_875() throws Exception {
        String puzzle = "........76.......3.7.16......2..1...8.7.3.92..4...6.8...6....4.53.84...9..8..93..";
        String solution = "153498267684257193279163458962781534817534926345926781796315842531842679428679315";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_876() throws Exception {
        String puzzle = "983.......1..2........5.....2.9..3...9..1542.1...468........6.1..24....8.4.5....3";
        String solution = "983174562514623789267859134426987315798315426135246897859732641372461958641598273";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_877() throws Exception {
        String puzzle = "..........7..51.98..9..72.6..3...1...54....2..9.2..5.4...3..7.2..6.8....4.1.....5";
        String solution = "618924357372651498549837216263548179854179623197263584985316742726485931431792865";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_878() throws Exception {
        String puzzle = "...........859.72..2..3.8.97........23..8.5.7..5...1.4.....7..8.5.6.1...9..85....";
        String solution = "497218635368594721521736849719465283234189567685372194146927358853641972972853416";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_879() throws Exception {
        String puzzle = "....9..6....75.18.67.......5..3..2....3.14...4.2...3.......8..9......71.3..147..5";
        String solution = "831492567924756183675831492516379248783214956492685371147528639258963714369147825";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_880() throws Exception {
        String puzzle = "...39.8...95.....1..4..1.......7.38..5......9...98.1.66.8.......7....2...4.2..638";
        String solution = "167394852395728461284561973419672385856143729732985146628439517573816294941257638";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_881() throws Exception {
        String puzzle = ".......1..436..2..8...1.9...7..3...43817......54...8.....8........24.35.....6.4.1";
        String solution = "695482713143679285827315946276538194381794562954126837412853679769241358538967421";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_882() throws Exception {
        String puzzle = "..........7.4.5.8.....2.6.9.........8.37...2.42.9..517.........5..1.8.4.71..54.9.";
        String solution = "281679435679435182345821679197542368853716924426983517934267851562198743718354296";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_883() throws Exception {
        String puzzle = "5....8.3...8...4..31..5......6.4...9.....1..6...6..7...3.2.5...9...6.2.348..9...5";
        String solution = "529418637768923451314756892876542319293871546145639728631285974957164283482397165";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_884() throws Exception {
        String puzzle = ".7.........6..179....9.8.3...4......13..6....2...3..54.....4...8...169.3.1..9.4.2";
        String solution = "978653241356241798421978536564782319139465827287139654793824165842516973615397482";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_885() throws Exception {
        String puzzle = ".5.....977..8.2......9...3.3.7.9.1...4....6...65..1...6.3.........72...18...16.5.";
        String solution = "458163297739842516126975438387694125241537689965281743613459872594728361872316954";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_886() throws Exception {
        String puzzle = "...........5..781....5.8.73........1.9...3.4..7.219.5...1......8..39.5...59..4..2";
        String solution = "768132495235947816914568273583476921192853647476219358341625789827391564659784132";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_887() throws Exception {
        String puzzle = "..2....1..482..5...3...492.3....6..8.....3....948.57...2..3...7...7.8...8.....3..";
        String solution = "962357814148269573735184926357926148281473659694815732529631487413798265876542391";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_888() throws Exception {
        String puzzle = "..3............384.851....9.......678...9......14.......967..4.36..4.9..4....971.";
        String solution = "643982175192756384785134629934218567826597431571463298219675843367841952458329716";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_889() throws Exception {
        String puzzle = ".81....65..59..2..4...6.1....7.......36..7....4....52......9...6....2.51....784.2";
        String solution = "981724365365981274472563189217895643536247918849316527724159836698432751153678492";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_890() throws Exception {
        String puzzle = "..5.4..62....3..7937.21.........1....31..8..62......4...4.7........8.69.5..6...2.";
        String solution = "195847362842536179376219485689451237431728956257963841964372518723185694518694723";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_891() throws Exception {
        String puzzle = "..9.7..6..4..52.......46.92.6.5...87..3..9..4.8.4....5..5.....667............73..";
        String solution = "529178463346952871718346592964523187153789624287461935835294716671835249492617358";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_892() throws Exception {
        String puzzle = ".7.2...9...2...1.5...9..38.....9...4.58312....9..8..2..8....2.......69..1.3....4.";
        String solution = "871235496932468175564971382216597834458312769397684521689143257745826913123759648";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_893() throws Exception {
        String puzzle = ".6....49.....5..7.3..9.1.8......2.5....31....4.....36...2.8...68..1.52..1...7.8..";
        String solution = "561837492298654173374921685613742958985316724427598361732489516849165237156273849";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_894() throws Exception {
        String puzzle = "....82......5......1..9.6....24..5....926..4.4......61..3.......9.3...566.817...4";
        String solution = "937682415826541937514793682362417598189265743475938261243856179791324856658179324";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_895() throws Exception {
        String puzzle = "5...9...4..7......9.2..7........9...3..7.61..2.41....9.3...27....9.84.1.......348";
        String solution = "583291674647853921912467853861529437395746182274138569438612795759384216126975348";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_896() throws Exception {
        String puzzle = "..4......3.....5....94.5..3.3.........56..8...8.2541.76....97..2.....9.5...82..6.";
        String solution = "854732691327961548169485273732198456415673829986254137643519782278346915591827364";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_897() throws Exception {
        String puzzle = "..8..3.17..26....89.6....3.....5...32.....546.6...28......3.1....5.9....1....4..5";
        String solution = "458923617732641958916587432891456273273819546564372891647235189325198764189764325";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_898() throws Exception {
        String puzzle = "..4....7.........5.874...695....69...2.....169..3.12..8..5.......9.74.3.7.......8";
        String solution = "254619873691738425387425169513246987428957316976381254842563791169874532735192648";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_899() throws Exception {
        String puzzle = "....4..7..295.634..14........8.....91...........7.2.1......38.6.9.6...5.3..8..49.";
        String solution = "683249175729516348514378962278461539146935287935782614457193826891624753362857491";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_900() throws Exception {
        String puzzle = "..........84....531...3.82.........96.....3..83519...7..1..5....6.8.....9...6.412";
        String solution = "593248176284671953176539824417382569629457381835196247741925638362814795958763412";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_901() throws Exception {
        String puzzle = "3.1..7..4.....6...846..3.......7.5..6.41..8..73...4....8.9..71.1.3.8......2......";
        String solution = "321597684597846321846213975219378546654129837738654192485962713173485269962731458";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_902() throws Exception {
        String puzzle = ".8..3....3.92.....6528.......4...7.1.93.5...2........5....8.........2.4...7.14359";
        String solution = "481739526379265814652841973564328791793156482218497635145983267936572148827614359";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_903() throws Exception {
        String puzzle = "..38....48..5.......5..3.8.......8..65.7.2.4.78...19....694..1.........731...6...";
        String solution = "123867594867594231945123786431659872659782143782431965276945318594318627318276459";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_904() throws Exception {
        String puzzle = "....946....286...9.....3.48..9.....1..13.7....74...5..8.....42..9348........7....";
        String solution = "138794652742865319965123748359246871681357294274918536817639425593482167426571983";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_905() throws Exception {
        String puzzle = "1..82.6.......4...5.2.9..7....9....66..5..49...9....81........7.9..3.....3..12.48";
        String solution = "174825639963174852582396174851943726627581493349267581218459367496738215735612948";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_906() throws Exception {
        String puzzle = ".....8......3..148.4.....62..7.1...5..5.67..4.8...5...6.1....2...2......3.46..91.";
        String solution = "163428579729356148548791362237914685915867234486235791671549823892173456354682917";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_907() throws Exception {
        String puzzle = "......96...7.31.......89.21.5........728.3....63.24..5........831....5.....318...";
        String solution = "481572963297631854635489721854196237172853496963724185726945318318267549549318672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_908() throws Exception {
        String puzzle = ".2.....5.......6.3.6.1..7....7....89.9.5.....8...7.3.5...9.4.7..14......5.28.3.9.";
        String solution = "123768954785492613469135728257346189396581247841279365638924571914657832572813496";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_909() throws Exception {
        String puzzle = ".8...4...2....8..4..729.......3..5.2.9.5...6...2..68.3...1......63..5.7.7.....94.";
        String solution = "586734129219658734437291658674389512398512467152476893945127386863945271721863945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_910() throws Exception {
        String puzzle = ".5...7....1.....8.8.....654.4.2....52.1.6..485...4.3..............3.8.6.3..49...2";
        String solution = "654827931913654287872139654746283195231965748598741326469512873125378469387496512";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_911() throws Exception {
        String puzzle = "5....6..4..62...8.4.8.5.....8.3.....2.......9..4....1......24..659.8.7......675.8";
        String solution = "513896274976234185428751963781349652265178349394625817837512496659483721142967538";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_912() throws Exception {
        String puzzle = "26......3.5.1.9.62......5...4...6...6...8.3..87.3..2.............9.6.4.5...5.4.79";
        String solution = "267458913458139762931672584143296857692785341875341296524917638719863425386524179";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_913() throws Exception {
        String puzzle = "............8752..7.86.......5......8.4....2.637.5.4.......1...14.3.8..5..3.9..14";
        String solution = "462913758391875246758642193925184367814736529637259481579461832146328975283597614";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_914() throws Exception {
        String puzzle = ".......7......1..8.7..8...62..6.9.3.1....3.85..3...2..92..3..5.3.12..9....5..4...";
        String solution = "816945372432761598579382146258619437197423685643578219924836751381257964765194823";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_915() throws Exception {
        String puzzle = "4....5....324..89..7.28......6...2..34.9..........7..4........9213.4..8..9.6...3.";
        String solution = "468195327532476891179283456956814273347962518821537964685321749213749685794658132";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_916() throws Exception {
        String puzzle = "..4.37.....9.5..4.5....4..3........7....4.68.6.5.......6..82..99.2..5.3.3.....7.8";
        String solution = "824937561739651842516824973148563297273149685695278314467382159982715436351496728";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_917() throws Exception {
        String puzzle = "....7..3...7.3.21..........6........5..29....389...57..2.6..94..6..49..3.4...3..8";
        String solution = "291875634857436219436912857672358491514297386389164572723681945168549723945723168";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_918() throws Exception {
        String puzzle = "6..3....4..5......2...47......9....69...1...5.7.2..93......1.5.5..42.....176.52..";
        String solution = "681392574745168392293547861352984716968713425174256938429871653536429187817635249";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_919() throws Exception {
        String puzzle = "2.5.....4...46..2..8.....39.5...7...7.6321.....28...9...9..23...2.........1.7.4..";
        String solution = "215739864973468125684215739458697213796321548132854697549182376327546981861973452";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_920() throws Exception {
        String puzzle = ".....9......8..9.6.61....3......7.....4...37...9.415.2....2...73.....1.58..51.42.";
        String solution = "283169754475832916961754238528397641614285379739641582156423897342978165897516423";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_921() throws Exception {
        String puzzle = "348.....2....6..83.6....1...9..8....6831...7.2.1......9....43..........8....312.9";
        String solution = "348719652719265483562348197497683521683152974251497836926874315135926748874531269";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_922() throws Exception {
        String puzzle = "..5.6.....9.5.48...73..8..4............1.6.5.5.7..39.1..9......4.2....19.3....7.2";
        String solution = "845762193291534876673918524916275438384196257527843961769421385452387619138659742";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_923() throws Exception {
        String puzzle = ".........4...68.35......24...5..1..4....8....9.4..36.175.3.4..6..9.1.....617.....";
        String solution = "593142768427968135618537249235671984176489352984253671752394816349816527861725493";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_924() throws Exception {
        String puzzle = "..........7....8.6362.1..7...3....4..9.7.2.1..864...3...5.8.....1...4....4..21.85";
        String solution = "458976123971243856362815974723168549594732618186459237235687491817594362649321785";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_925() throws Exception {
        String puzzle = ".....6......93.1......7.962.6.4.......3....5.45...76...34....9.19..4.7.66......81";
        String solution = "927186543546932178381574962269458317713629854458317629834761295192845736675293481";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_926() throws Exception {
        String puzzle = ".............2964.29....5.3.......5..83.17..957.2.4..1.....1...7...423......6.7.5";
        String solution = "864375192357129648291486573129638457483517269576294831638751924715942386942863715";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_927() throws Exception {
        String puzzle = "....8.......5.42..54..7286..63.1...5.81...6.........4.....3..2..547.....8.2...5.6";
        String solution = "127683459638594217549172863263417985481359672795268341916835724354726198872941536";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_928() throws Exception {
        String puzzle = ".......1.2...1.3.7.1.8739.5.31....58......6..76...1....9.......38..6.1.4.....2.8.";
        String solution = "973524816258619347614873925431296758829457631765381492597148263382965174146732589";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_929() throws Exception {
        String puzzle = ".6...2.7.......5...3..71.92.92.65.87.1...4..97..9.....8.1........4.9..1........45";
        String solution = "169582374287349561435671892392165487518734629746928153821457936654293718973816245";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_930() throws Exception {
        String puzzle = ".....8..6..61.57.8............2.......798.23..2.3...71..1...5..7.3...86..52.7...9";
        String solution = "275438196436195728198762453319247685567981234824356971981623547743519862652874319";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_931() throws Exception {
        String puzzle = "......8...182..6..7.4..3.....1.58..6...7....1.7..2..8...5...36.3.65.4.2.....3.4..";
        String solution = "532167894918245637764983152421358976853796241679421583145872369396514728287639415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_932() throws Exception {
        String puzzle = "36..2.7.99..3..21...4....3.5.6.....8..92.8......5..4...5.......49...538.....7...2";
        String solution = "368124759975386214214759836536497128149238675827561493753842961492615387681973542";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_933() throws Exception {
        String puzzle = "..1..5.....5.7..2.437.19...1.8.............78.6....23.........6...8.74....6.41592";
        String solution = "291685347685473921437219865128734659543926178769158234314592786952867413876341592";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_934() throws Exception {
        String puzzle = ".9..3.2....4..713....4...7......5....4.7.638..6.1..7.28513.4.6...6.......3.......";
        String solution = "795831246624957138183462579317285694542796381968143752851324967476519823239678415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_935() throws Exception {
        String puzzle = "...98..1.7...3.6...9.1....2.....2......79.2.69.2...3.81........8.746.....5....763";
        String solution = "234986517715234689698157432586342971341798256972615348163579824827463195459821763";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_936() throws Exception {
        String puzzle = ".86..9...1.5.8.2....413.7............6...4.38...392..5....5...2.......6..1.92.8.4";
        String solution = "786249351135687249924135786359861427261574938847392615678453192492718563513926874";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_937() throws Exception {
        String puzzle = "..........2...3.4...57.8.36...........283.....74265.8...1.....558...21.4...3..87.";
        String solution = "368524791927613548415798236839147652652839417174265983791486325583972164246351879";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_938() throws Exception {
        String puzzle = ".....3.2....4....6.745.6..3.58....3.1..8..7...2.....4....7....15..64.2...81..56..";
        String solution = "865913427319472586274586913458267139193854762726139845642798351537641298981325674";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_939() throws Exception {
        String puzzle = "5...2.......374....74....9......8..1..273..4...825.3.6.6..1.........3.8.7.3...1.9";
        String solution = "516829734289374615374165892637498251152736948498251376865917423921643587743582169";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_940() throws Exception {
        String puzzle = "....83...58312.6..4.1..9........6....4....9..6.2...38.3...7.81...9.6....81......7";
        String solution = "967483125583127649421659738138296574745318962692745381354972816279861453816534297";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_941() throws Exception {
        String puzzle = "......3..2.483.....83..1..4.76...12......9.3.9.5..........75......6..4186..4.8.7.";
        String solution = "159246387264837951783951264376584129428169735915723846841375692537692418692418573";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_942() throws Exception {
        String puzzle = "......9..2.1.6.7....72...65.6...8.9...23...4...3..48.2.1...2.....6.3..5...974....";
        String solution = "635487921291563784847219365764128593182395647953674812318952476476831259529746138";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_943() throws Exception {
        String puzzle = "..3.4........7...6...128....21.8..3..7.....4.3....7..1.1.6.28.42...9..1...8...36.";
        String solution = "793546128182379456465128973621485739879213645354967281517632894236894517948751362";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_944() throws Exception {
        String puzzle = "..........1.9....88....3.2.2....9.1..9..61.72.6.72.4.3.74...5..9.......1...4.7..9";
        String solution = "349286157712954368856173924287349615493561872561728493174892536928635741635417289";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_945() throws Exception {
        String puzzle = "..7.13.4.2.4.9..17....4....92....7.4...93...5..1.....3....7.9.....3......3.4.56.1";
        String solution = "597213846284596317316847529923651784748932165651784293465178932172369458839425671";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_946() throws Exception {
        String puzzle = "48..9.3..3.7..2..6.......8..3...6..28..25.....65.37.........43.5...78....9.4....5";
        String solution = "482695317317842596956713284134986752879254163265137948728569431541378629693421875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_947() throws Exception {
        String puzzle = ".....8....6..31...2.7.9.....42.....1.....348..1.....76..9.......2...7.3..3862519.";
        String solution = "351278649964531728287496513842769351796153482513842976179384265625917834438625197";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_948() throws Exception {
        String puzzle = "...9.......2..4.56.31........5...1.9.1.25.36...4....2....7....21....26...26.93..5";
        String solution = "657928431892134756431675298275346189918257364364819527583761942149582673726493815";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_949() throws Exception {
        String puzzle = "7...6.....8..41.....29...41.......1.....39287.27...3....3....9..951.3..6.....5.7.";
        String solution = "741362958589741632362958741936827514154639287827514369273486195495173826618295473";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_950() throws Exception {
        String puzzle = ".....1....2......86912............141.25.6..38...2.5.6..5......73.........63194.5";
        String solution = "358471629427963158691285347569738214142596783873124596915647832734852961286319475";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_951() throws Exception {
        String puzzle = "9..5....83...4.92..68..3.5....96..1......7..4..743.6.27..3.9..........8..5.1.....";
        String solution = "941526378375841926268793451432965817689217534517438692726389145194652783853174269";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_952() throws Exception {
        String puzzle = "7....6..3....1........9.4..3...2579....16.....4..37.5..62...5371.8...6.........19";
        String solution = "714256983839714265625398471381425796257169348946837152462981537198573624573642819";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_953() throws Exception {
        String puzzle = "..............1..6.8.4657.......7.....9...2....3159.6..97.......467..9.2.21.43..7";
        String solution = "615372849734891526982465731468237195159684273273159468897526314346718952521943687";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_954() throws Exception {
        String puzzle = "...........5..28.3.6...9.54..........9356..1..2..91.47.......71.3....4...721.4..6";
        String solution = "389745162745612893261839754517428639493567218826391547654283971138976425972154386";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_955() throws Exception {
        String puzzle = ".18.4..6...3..6.91..4..3..2..658.....8..1..23.45..............6......13....3..289";
        String solution = "918245367523876491674193852136582974789614523245739618351928746892467135467351289";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_956() throws Exception {
        String puzzle = "............7...2313...94......43....4.8..19258.9.......8..2...4..1..2.6.1..7..38";
        String solution = "752364819894715623136289475921643587643857192587921364368592741479138256215476938";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_957() throws Exception {
        String puzzle = "....132.7.14..28.3.....5.......3....569.7.....235..1.8..6.....1......7.529...7...";
        String solution = "658413297914762853372985614187234569569871432423596178746358921831629745295147386";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_958() throws Exception {
        String puzzle = ".185....2...23...4.3...1.59.....9.1..45....96.93.1.2...84.....5..6..4..........7.";
        String solution = "418596732569237184732481659627349518145728396893615247284173965376954821951862473";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_959() throws Exception {
        String puzzle = "...........426....9.6.57..4.5...........8..29.8.9...56..1..8.9...85..34.7..6.3..1";
        String solution = "573841962814269573926357814459726138367185429182934756231478695698512347745693281";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_960() throws Exception {
        String puzzle = "2...6.....7.9...5.8.9..57.6.......39..3..8..2.4....5......7.....9.286.1.1.65.3...";
        String solution = "251867943674932851839415726568724139913658472742391568325179684497286315186543297";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_961() throws Exception {
        String puzzle = ".........1.6.5.3...37.186.4.....9....5123.7...69.8...........8..1......328...316.";
        String solution = "428376519196452378537918624342769851851234796769185432973641285615827943284593167";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_962() throws Exception {
        String puzzle = "..12..7....36...187.....2......5..2.42.1.8.....5..21.......4..5649..18...3.9.....";
        String solution = "851239746293647518764815293918753624426198357375462189187324965649571832532986471";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_963() throws Exception {
        String puzzle = "5...7.....63....9.7..3.25.4.76.2...1..16....8.5.1....9.4.....2....9.3.....7.1..8.";
        String solution = "514879632263451897789362514976528341431697258852134769145786923628943175397215486";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_964() throws Exception {
        String puzzle = "8...1.4.5.......6..63...7..7............72.39...8.....68.3..9.4.1...438..479....6";
        String solution = "879613425524798163163425798791536842458172639236849571682357914915264387347981256";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_965() throws Exception {
        String puzzle = "..4.......6.523..835.1....7....5.2..4..2.876...1..6....3...........95.....78..359";
        String solution = "184967523769523418352184697876459231493218765521736984935671842248395176617842359";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_966() throws Exception {
        String puzzle = ".6.......3.7.....818..62.4...3..8..2...4.518....72.4...1.5.....7.8..1...2....67..";
        String solution = "465879231327154698189362547543618972672495183891723456916537824758241369234986715";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_967() throws Exception {
        String puzzle = "4..........93.1...385.64..7.4.............3686..7..2...6.57....8..4.9..6.941.....";
        String solution = "416897523729351684385264917942683751571942368638715249163578492857429136294136875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_968() throws Exception {
        String puzzle = "....7..98...6...5...6...1.4.2......13.49.6.2...1.27.8.........915.3.....94...58..";
        String solution = "415273698879641253236859174627538941384916725591427386762184539158392467943765812";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_969() throws Exception {
        String puzzle = "..1..2..9.74......9327..4.68.....6.3....6.9.43....9.5.....23.4.7..5........1..3..";
        String solution = "581642739674931825932758416849215673215367984367489251196823547723594168458176392";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_970() throws Exception {
        String puzzle = "...17.43...3..9..1...2....5.........7...23..4.36.547..8.53.......25.......4.9.6.8";
        String solution = "689175432523469871147238965458917326791623584236854719865341297972586143314792658";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_971() throws Exception {
        String puzzle = "..67...244....59.7.7..1.6.53....68...41...........2....2...149.........6....497.2";
        String solution = "156798324438625917279314685392456871541987263867132549723561498984273156615849732";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_972() throws Exception {
        String puzzle = "........42.7.6.19.6...93........1.....2.8.7.91..9.685.8.6...4.7.......8.7...5..2.";
        String solution = "319872564287564193645193278598721346462385719173946852856219437921437685734658921";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_973() throws Exception {
        String puzzle = "....7.5..2....4.63..6..2.8..9..85...5..26...7.21.4......5..9..4......63.....3.97.";
        String solution = "918673542257894163436152789794385216583261497621947358365719824179428635842536971";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_974() throws Exception {
        String puzzle = ".8..1.........72.83...4.16....7..3..4.93..85.6........9.3..2.84...93.5...5..7....";
        String solution = "286513479514697238397248165825769341479321856631485927963152784748936512152874693";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_975() throws Exception {
        String puzzle = "....2.9.7...4...8...6..3.5...........9..6..4....2.9518....14.7..81.72..4.6..3..9.";
        String solution = "854126937732495186916783452148357629295861743673249518329614875581972364467538291";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_976() throws Exception {
        String puzzle = "1.8...5...279.....9..7.18..8.43.9.....2.4.1.3....2...9.....43.....2..95.4....8...";
        String solution = "138462597527983641946751832874319265692845173315627489269574318781236954453198726";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_977() throws Exception {
        String puzzle = "...56........7.31..8..31..6.........96..8...7..5....321......4..3..17.65..63.41..";
        String solution = "319562784652478319487931526823745691961283457745196832178659243234817965596324178";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_978() throws Exception {
        String puzzle = "...8....1....27.96..75..83..4.3.....3...5...7.956.8.....19.2..8..4...3.......6.1.";
        String solution = "659843271483127596127569834748391652316254987295678143571932468864715329932486715";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_979() throws Exception {
        String puzzle = "..9.8.......1.....68...7.19.2...4..71...3..4.46.79.....7..6...3.....2.9..963...2.";
        String solution = "519683274734129865682457319928514637157236948463798152275961483341872596896345721";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_980() throws Exception {
        String puzzle = "......71......9.2..6.571..95.....8...738......4.3..2.7154.2.9....7...1......45...";
        String solution = "489263715715489326362571489596712843273894561841356297154627938627938154938145672";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_981() throws Exception {
        String puzzle = ".1.2.8.......5.6.7...671.2.3..5....1..1....4..6...2.5......7....27....9.6.519...2";
        String solution = "716248935248359617953671824392584761571936248864712359139427586427865193685193472";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_982() throws Exception {
        String puzzle = ".8.........2654.1.4.5...........8.41..8....2.17....86......9....5.34..892....16.4";
        String solution = "781293456932654718465817392326978541548136927179425863814769235657342189293581674";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_983() throws Exception {
        String puzzle = ".81.94...25...........7....72..1..3...5....9..9638...7.....84..51......9..81...25";
        String solution = "381694752257831964649572813724916538835427196196385247963258471512743689478169325";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_984() throws Exception {
        String puzzle = "..3.....612.7.8..45.4..1.7...89..5...4.3.67..3.......2...8..4....1..58......1..9.";
        String solution = "783549126126738954594621378618972543245386719379154682952867431431295867867413295";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_985() throws Exception {
        String puzzle = ".1..8....69...4..2.....65....6.3924..4..1..5.839....6..6254....4.....1.........2.";
        String solution = "514287693693154872728396514156739248247618359839425761362541987485972136971863425";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_986() throws Exception {
        String puzzle = "6.7.8...1......7...9....3.5.2..1.8....5.....78....64...1.93...49....5.....28.15.9";
        String solution = "657483291283159746194672385729514863465328917831796452518937624976245138342861579";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_987() throws Exception {
        String puzzle = "......6..96........84.5.1....3..9..42...178..85..4..2.5.6.28....2.7.....4....5.7.";
        String solution = "132874695965132487784956132613289754249517863857643921576428319328791546491365278";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_988() throws Exception {
        String puzzle = ".9...5..68..1..9............84......52..16...6.39.8..5....3.5..3...5.8..75...214.";
        String solution = "492875316875163924136294758984527631527316489613948275268431597341759862759682143";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_989() throws Exception {
        String puzzle = ".....7.....3.56.2.97..1.64.........2..7.2.93..2....16...........615..49...964..7.";
        String solution = "546297318183456729972318645394761582617825934825934167438179256761582493259643871";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_990() throws Exception {
        String puzzle = "4.....5.1..5.64.....9..........5.1....1..97.5.5.1..924..45.3..7.....76.22...9....";
        String solution = "436972581815364279729815346942756138381249765657138924164523897593487612278691453";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_991() throws Exception {
        String puzzle = "...9....4....7.8..28....1.367........3....2.1.21.9..6..9.5.....8..234..7...71..8.";
        String solution = "713928654564371829289465173675142398938657241421893765197586432856234917342719586";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_992() throws Exception {
        String puzzle = ".....4.....5..76..1.85..27......6...3......825.9.481...5.....1.8.1.9.72.6...7....";
        String solution = "763924851925187634148563279284316597316759482579248163457632918831495726692871345";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_993() throws Exception {
        String puzzle = ".97..16..6.4.7..3.53......4.1..6..72.....3.....87..3.1....2.....4..96.8..7....9..";
        String solution = "297341658684275139531689724319468572725913846468752391956827413143596287872134965";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_994() throws Exception {
        String puzzle = ".....8..6.5.3...1...71.6..2......9.4913....2..65.3...7.3..8......15..8..5......43";
        String solution = "129478356654392718387156492872615934913847625465239187236984571741523869598761243";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_995() throws Exception {
        String puzzle = ".......7..68...2...579.2..38...1.......8...1...4.....2.7.2.4....83.9.5..5..13.79.";
        String solution = "249683175368571249157942863892417356635829417714365982971254638483796521526138794";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_996() throws Exception {
        String puzzle = "..........5..3.9....41...522.68....35.8.6..1..31.2.6..........5.....23.8...5.1.24";
        String solution = "179258436852634971364179852296817543548963217731425689427386195915742368683591724";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_997() throws Exception {
        String puzzle = ".4...23..8...1......96.5.2...........74..3.6.9.1427.........1...9....23...523..74";
        String solution = "746892315852314697139675428583961742274583961961427583328746159497158236615239874";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_998() throws Exception {
        String puzzle = "....8..6.8....7..394.25........2....6..3.1....2867.3...........31.....964.9..8.21";
        String solution = "731489562852167943946253187193825674674391258528674319287916435315742896469538721";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_999() throws Exception {
        String puzzle = ".6.....5.9.2....613....64.24...6.....3..52.9.5..4.3....89....4......72.....82..1.";
        String solution = "164278953972534861358196472427961538836752194591483726289615347615347289743829615";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1000() throws Exception {
        String puzzle = "..........54.9..67..1.2..48...6.....73......458.....3..6.9.7....4.86..79..8.4...3";
        String solution = "627584391854391267391726548419673825736258914582419736165937482243865179978142653";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1001() throws Exception {
        String puzzle = ".73.9.......48..7.8.4...2.39..3..8......5....3169..........51.7.6.7.....5...19..8";
        String solution = "673192485251483976894576213945327861782651394316948752429865137168734529537219648";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1002() throws Exception {
        String puzzle = ".5..6..2..4....7.......2.81.6..4.8.......6.4...4.98.3..86...3........27..97.836..";
        String solution = "158967423342815769679432581963741852815326947724598136286174395431659278597283614";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1003() throws Exception {
        String puzzle = ".54...8..98..3.6..6.19.8.4..1..........89.7..5..62...8....5..6..9.....7347..6....";
        String solution = "354216897987534612621978345718345926263891754549627138832759461196482573475163289";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1004() throws Exception {
        String puzzle = ".9...4.25.36...91.........43........2..67.4.8..45....294.15.......7....9178.9....";
        String solution = "791364825436825917582917364367248591259671438814539672943152786625783149178496253";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1005() throws Exception {
        String puzzle = "..3........8..71..56..9...2..53.46......7....32.6..57..3...2..7..2......67.813.5.";
        String solution = "913246785248537196567198342795324618186975423324681579831452967452769831679813254";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1006() throws Exception {
        String puzzle = ".5.......21..5.9.3..92.846...........923..58.....856....5..4..9.2.....4..4...97.6";
        String solution = "456973821218456973379218465587692134692341587134785692765834219921567348843129756";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1007() throws Exception {
        String puzzle = "..46.91...6..5..271..4.2..63......92.....3.4.475.....389...62..............9.73..";
        String solution = "724639185963851427158472936386145792219763548475298613897316254631524879542987361";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1008() throws Exception {
        String puzzle = ".8..6......2...18..7...3........12...43....1..51.76438.2........38...72...67.9.5.";
        String solution = "589164372362597184174283596897431265643852917251976438725318649938645721416729853";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1009() throws Exception {
        String puzzle = "......5....43.1.6.69.8.42.3....3.45.9....87.2...2.9..6.........2..983....89.7....";
        String solution = "138762594524391867697854213812637459946518732753249186361425978275983641489176325";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1010() throws Exception {
        String puzzle = ".........76..45...9.5.3.746.1.....5..86..1.73..9..2.....8....6..9..8.5.7....2..38";
        String solution = "841769325763245891925138746214873659586491273379652184438517962692384517157926438";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1011() throws Exception {
        String puzzle = ".....89..6.3.49.1....5..6....4.....923......1.5...2.6...7......3.2.51...5.896.2.3";
        String solution = "425618937673249815891537642184376529236495781759182364947823156362751498518964273";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1012() throws Exception {
        String puzzle = "3.76....2.....18.4.9....57......3.4995346...8.2......5..2......58..36.....95.....";
        String solution = "347685192265791834198324576816253749953467218724819365672148953581936427439572681";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1013() throws Exception {
        String puzzle = ".....5.....7.6.43.4.6..82.5..2........8.749..6.18.......35......6...1.2.1..327.9.";
        String solution = "329745618857162439416938275742619853538274961691853742273596184965481327184327596";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1014() throws Exception {
        String puzzle = ".1...7......59.23..5.8.......6......2..9..3..59.7.2.8.1.4.7...3...2..64..29.4...5";
        String solution = "318427569467591238952836714876354192241968357593712486184675923735289641629143875";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1015() throws Exception {
        String puzzle = ".........54..9...3....1.764.....3...6.4...2.129.....3......4.16.1..693.77.6....45";
        String solution = "163487592547692183982315764871243659634958271295176438359724816418569327726831945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1016() throws Exception {
        String puzzle = "......76......8..54..26.....1..5...47...8.53.3....61.......1....87.....364..35871";
        String solution = "831549762276318495459267318918753624764182539325496187593871246187624953642935871";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1017() throws Exception {
        String puzzle = "........4.....5.79.9..2.531....79....6.5.8....7....35......1....15.928.72..8.7.15";
        String solution = "527913684341685279698724531853279146164538792972146358786451923415392867239867415";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_1018() throws Exception {
        String puzzle = "25...7..1.....4.5..1..2.367...6.........81.3..8..4.7.662.1...7...94....88....6..3";
        String solution = "258367941367914852914825367432679185796581234185243796623158479579432618841796523";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

}
