import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Test_Sudoku_Cases_Top_95 {

    @Test
    public void test_1() throws Exception {
        String puzzle = "4.....8.5.3..........7......2.....6.....8.4......1.......6.3.7.5..2.....1.4......";
        String solution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_2() throws Exception {
        String puzzle = "52...6.........7.13...........4..8..6......5...........418.........3..2...87.....";
        String solution = "527316489896542731314987562172453896689271354453698217941825673765134928238769145";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_3() throws Exception {
        String puzzle = "6.....8.3.4.7.................5.4.7.3..2.....1.6.......2.....5.....8.6......1....";
        String solution = "617459823248736915539128467982564371374291586156873294823647159791385642465912738";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_4() throws Exception {
        String puzzle = "48.3............71.2.......7.5....6....2..8.............1.76...3.....4......5....";
        String solution = "487312695593684271126597384735849162914265837268731549851476923379128456642953718";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_5() throws Exception {
        String puzzle = "....14....3....2...7..........9...3.6.1.............8.2.....1.4....5.6.....7.8...";
        String solution = "962314857134587269578296413847962531651873942329145786285639174793451628416728395";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_6() throws Exception {
        String puzzle = "......52..8.4......3...9...5.1...6..2..7........3.....6...1..........7.4.......3.";
        String solution = "416837529982465371735129468571298643293746185864351297647913852359682714128574936";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_7() throws Exception {
        String puzzle = "6.2.5.........3.4..........43...8....1....2........7..5..27...........81...6.....";
        String solution = "682154379951763842374892165437528916816937254295416738568271493729345681143689527";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_8() throws Exception {
        String puzzle = ".524.........7.1..............8.2...3.....6...9.5.....1.6.3...........897........";
        String solution = "652481937834679152971325864467812593315794628298563471186937245523146789749258316";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_9() throws Exception {
        String puzzle = "6.2.5.........4.3..........43...8....1....2........7..5..27...........81...6.....";
        String solution = "682153479951764832374892165437528916816947253295316748568271394729435681143689527";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_10() throws Exception {
        String puzzle = ".923.........8.1...........1.7.4...........658.........6.5.2...4.....7.....9.....";
        String solution = "792351648543786129681429537157648293924137865836295471368572914419863752275914386";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_11() throws Exception {
        String puzzle = "6..3.2....5.....1..........7.26............543.........8.15........4.2........7..";
        String solution = "614382579953764812827591436742635198168279354395418627286157943579843261431926785";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_12() throws Exception {
        String puzzle = ".6.5.1.9.1...9..539....7....4.8...7.......5.8.817.5.3.....5.2............76..8...";
        String solution = "863521794127496853954387621645839172739142568281765439498653217512974386376218945";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_13() throws Exception {
        String puzzle = "..5...987.4..5...1..7......2...48....9.1.....6..2.....3..6..2.......9.7.......5..";
        String solution = "135426987846957321927381465213748659598163742674295813351674298482539176769812534";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_14() throws Exception {
        String puzzle = "3.6.7...........518.........1.4.5...7.....6.....2......2.....4.....8.3.....5.....";
        String solution = "356871294972643851841952736213465987794318625685297413128736549569184372437529168";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_15() throws Exception {
        String puzzle = "1.....3.8.7.4..............2.3.1...........958.........5.6...7.....8.2...4.......";
        String solution = "129576348376428519584391627293815764417263895865749132958632471731984256642157983";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_16() throws Exception {
        String puzzle = "6..3.2....4.....1..........7.26............543.........8.15........4.2........7..";
        String solution = "615382479943765812827491536752634198168279354394518627286157943579843261431926785";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_17() throws Exception {
        String puzzle = "....3..9....2....1.5.9..............1.2.8.4.6.8.5...2..75......4.1..6..3.....4.6.";
        String solution = "718435692963278541254961378547612839192387456386549127675893214421756983839124765";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_18() throws Exception {
        String puzzle = "45.....3....8.1....9...........5..9.2..7.....8.........1..4..........7.2...6..8..";
        String solution = "458276931623891475197534286371452698269783154845169327712948563986315742534627819";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_19() throws Exception {
        String puzzle = ".237....68...6.59.9.....7......4.97.3.7.96..2.........5..47.........2....8.......";
        String solution = "123759486874261593965384721216543978357896142498127365532478619641932857789615234";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_20() throws Exception {
        String puzzle = "..84...3....3.....9....157479...8........7..514.....2...9.6...2.5....4......9..56";
        String solution = "518476239427359618963821574795248361832617945146935827379564182651782493284193756";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_21() throws Exception {
        String puzzle = ".98.1....2......6.............3.2.5..84.........6.........4.8.93..5...........1..";
        String solution = "498716523257839461136425987971382654684157392523694718765241839319578246842963175";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_22() throws Exception {
        String puzzle = "..247..58..............1.4.....2...9528.9.4....9...1.........3.3....75..685..2...";
        String solution = "132479658847563291956281347413725869528196473769348125271854936394617582685932714";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_23() throws Exception {
        String puzzle = "4.....8.5.3..........7......2.....6.....5.4......1.......6.3.7.5..2.....1.9......";
        String solution = "417369825638125947952748316825437169791856432346912758284693571573281694169574283";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_24() throws Exception {
        String puzzle = ".2.3......63.....58.......15....9.3....7........1....8.879..26......6.7...6..7..4";
        String solution = "925371486163498725874562391542689137618753942739124658487915263351246879296837514";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_25() throws Exception {
        String puzzle = "1.....7.9.4...72..8.........7..1..6.3.......5.6..4..2.........8..53...7.7.2....46";
        String solution = "123456789649837251857291634274518963398672415561943827416725398985364172732189546";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_26() throws Exception {
        String puzzle = "4.....3.....8.2......7........1...8734.......6........5...6........1.4...82......";
        String solution = "475691328961832745823754196259143687347586219618927534534269871796318452182475963";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_27() throws Exception {
        String puzzle = ".......71.2.8........4.3...7...6..5....2..3..9........6...7.....8....4......5....";
        String solution = "349526871521897643876413529718369254465281397932745186654178932187932465293654718";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_28() throws Exception {
        String puzzle = "6..3.2....4.....8..........7.26............543.........8.15........8.2........7..";
        String solution = "618342579943765182527891436752634891861279354394518627286157943179483265435926718";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_29() throws Exception {
        String puzzle = ".47.8...1............6..7..6....357......5....1..6....28..4.....9.1...4.....2.69.";
        String solution = "947582361863471952152639784624813579738295416519764823285946137396157248471328695";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_30() throws Exception {
        String puzzle = "......8.17..2........5.6......7...5..1....3...8.......5......2..4..8....6...3....";
        String solution = "254379861761248593893516742326791458915824376487653219538167924142985637679432185";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_31() throws Exception {
        String puzzle = "38.6.......9.......2..3.51......5....3..1..6....4......17.5..8.......9.......7.32";
        String solution = "385621497179584326426739518762395841534812769891476253917253684243168975658947132";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_32() throws Exception {
        String puzzle = "...5...........5.697.....2...48.2...25.1...3..8..3.........4.7..13.5..9..2...31..";
        String solution = "836521947142379586975648321364892715259167438781435269598214673413756892627983154";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_33() throws Exception {
        String puzzle = ".2.......3.5.62..9.68...3...5..........64.8.2..47..9....3.....1.....6...17.43....";
        String solution = "427593186315862479968174325659328714731649852284751963593287641842916537176435298";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_34() throws Exception {
        String puzzle = ".8..4....3......1........2...5...4.69..1..8..2...........3.9....6....5.....2.....";
        String solution = "781942365324576918659831724815723496936154872247698153578369241162487539493215687";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_35() throws Exception {
        String puzzle = "..8.9.1...6.5...2......6....3.1.7.5.........9..4...3...5....2...7...3.8.2..7....4";
        String solution = "748392165369514728125876943932147856687235419514689372853461297476923581291758634";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_36() throws Exception {
        String puzzle = "4.....5.8.3..........7......2.....6.....5.8......1.......6.3.7.5..2.....1.8......";
        String solution = "417369528839125746652748319925837461741956832386412957294683175573291684168574293";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_37() throws Exception {
        String puzzle = "1.....3.8.6.4..............2.3.1...........958.........5.6...7.....8.2...4.......";
        String solution = "124597368369428517587361924293815746416273895875946132958632471631784259742159683";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_38() throws Exception {
        String puzzle = "1....6.8..64..........4...7....9.6...7.4..5..5...7.1...5....32.3....8...4........";
        String solution = "137926485964587231825341967241895673673412598589673142758164329396258714412739856";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_39() throws Exception {
        String puzzle = "249.6...3.3....2..8.......5.....6......2......1..4.82..9.5..7....4.....1.7...3...";
        String solution = "249865173531974268867132495423786519986251347715349826692518734354627981178493652";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_40() throws Exception {
        String puzzle = "...8....9.873...4.6..7.......85..97...........43..75.......3....3...145.4....2..1";
        String solution = "351846729287319645694725183168534972725198364943267518516483297832971456479652831";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_41() throws Exception {
        String puzzle = "...5.1....9....8...6.......4.1..........7..9........3.8.....1.5...2..4.....36....";
        String solution = "748591326195623847263487519421936758356874291987152634832749165679215483514368972";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_42() throws Exception {
        String puzzle = "......8.16..2........7.5......6...2..1....3...8.......2......7..3..8....5...4....";
        String solution = "723469851651238794894715632375691428912874365486523917248356179137982546569147283";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_43() throws Exception {
        String puzzle = ".476...5.8.3.....2.....9......8.5..6...1.....6.24......78...51...6....4..9...4..7";
        String solution = "947628351863751492125349678734895126589162734612473985478236519256917843391584267";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_44() throws Exception {
        String puzzle = ".....7.95.....1...86..2.....2..73..85......6...3..49..3.5...41724................";
        String solution = "132467895957381246864529731429673158578912364613854972385296417241735689796148523";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_45() throws Exception {
        String puzzle = ".4.5.....8...9..3..76.2.....146..........9..7.....36....1..4.5..6......3..71..2..";
        String solution = "143587962852496731976321584214675398635819427789243615321764859468952173597138246";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_46() throws Exception {
        String puzzle = ".834.........7..5...........4.1.8..........27...3.....2.6.5....5.....8........1..";
        String solution = "783465219421973658965281734347128596198546327652397481216854973534719862879632145";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_47() throws Exception {
        String puzzle = "..9.....3.....9...7.....5.6..65..4.....3......28......3..75.6..6...........12.3.8";
        String solution = "219675843865439721743281596936512487157348962428967135382754619671893254594126378";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_48() throws Exception {
        String puzzle = ".26.39......6....19.....7.......4..9.5....2....85.....3..2..9..4....762.........4";
        String solution = "126739845847625391935481762213864579654973218798512436361248957489157623572396184";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_49() throws Exception {
        String puzzle = "2.3.8....8..7...........1...6.5.7...4......3....1............82.5....6...1.......";
        String solution = "273681495891754263546392178169537824485269731327148956734916582958423617612875349";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_50() throws Exception {
        String puzzle = "6..3.2....1.....5..........7.26............843.........8.15........8.2........7..";
        String solution = "654312879913876452827495136742638591165729384398541627286157943471983265539264718";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_51() throws Exception {
        String puzzle = "1.....9...64..1.7..7..4.......3.....3.89..5....7....2.....6.7.9.....4.1....129.3.";
        String solution = "152738946864291375973645281216357498348912567597486123421863759639574812785129634";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_52() throws Exception {
        String puzzle = ".........9......84.623...5....6...453...1...6...9...7....1.....4.5..2....3.8....9";
        String solution = "174589362953261784862347951219673845387415296546928173628194537495732618731856429";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_53() throws Exception {
        String puzzle = ".2....5938..5..46.94..6...8..2.3.....6..8.73.7..2.........4.38..7....6..........5";
        String solution = "126478593837592461945361278412937856569184732783256914251649387374815629698723145";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_54() throws Exception {
        String puzzle = "9.4..5...25.6..1..31......8.7...9...4..26......147....7.......2...3..8.6.4.....9.";
        String solution = "964815237258637149317924658872159364495263781631478925783596412529341876146782593";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_55() throws Exception {
        String puzzle = "...52.....9...3..4......7...1.....4..8..453..6...1...87.2........8....32.4..8..1.";
        String solution = "476529183895173624321864795517398246289645371634712958752431869168957432943286517";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_56() throws Exception {
        String puzzle = "53..2.9...24.3..5...9..........1.827...7.........981.............64....91.2.5.43.";
        String solution = "538127946624839751719645382965314827381762594247598163493281675856473219172956438";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_57() throws Exception {
        String puzzle = "1....786...7..8.1.8..2....9........24...1......9..5...6.8..........5.9.......93.4";
        String solution = "124597863937648215856231749513786492482913657769425138698374521341852976275169384";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_58() throws Exception {
        String puzzle = "....5...11......7..6.....8......4.....9.1.3.....596.2..8..62..7..7......3.5.7.2..";
        String solution = "872459631154683972963721485216834759549217368738596124481362597627945813395178246";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_59() throws Exception {
        String puzzle = ".47.2....8....1....3....9.2.....5...6..81..5.....4.....7....3.4...9...1.4..27.8..";
        String solution = "947326581852491673136587942284735169693812457715649238579168324328954716461273895";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_60() throws Exception {
        String puzzle = "......94.....9...53....5.7..8.4..1..463...........7.8.8..7.....7......28.5.26....";
        String solution = "215876943678394215349125876587432169463981752192657384826743591734519628951268437";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_61() throws Exception {
        String puzzle = ".2......6....41.....78....1......7....37.....6..412....1..74..5..8.5..7......39..";
        String solution = "124397856835641297967825341241538769583769412679412538312974685498256173756183924";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_62() throws Exception {
        String puzzle = "1.....3.8.6.4..............2.3.1...........758.........7.5...6.....8.2...4.......";
        String solution = "125976348369428517784351926253817694416293875897645132978532461631784259542169783";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_63() throws Exception {
        String puzzle = "2....1.9..1..3.7..9..8...2.......85..6.4.........7...3.2.3...6....5.....1.9...2.5";
        String solution = "283741596615239748974865321397126854861453972452978613528394167736512489149687235";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_64() throws Exception {
        String puzzle = "..7..8.....6.2.3...3......9.1..5..6.....1.....7.9....2........4.83..4...26....51.";
        String solution = "957638421146729385832541679419352768628417953375986142791265834583174296264893517";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_65() throws Exception {
        String puzzle = "...36....85.......9.4..8........68.........17..9..45...1.5...6.4....9..2.....3...";
        String solution = "127365489853491276964278351231756894548932617679184523312547968485619732796823145";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_66() throws Exception {
        String puzzle = "34.6.......7.......2..8.57......5....7..1..2....4......36.2..1.......9.......7.82";
        String solution = "345671298987253146621984573264795831573816429198432657836529714712348965459167382";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_67() throws Exception {
        String puzzle = "......4.18..2........6.7......8...6..4....3...1.......6......2..5..1....7...3....";
        String solution = "265389471874251693193647852327894165946125387518763249631578924452916738789432516";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_68() throws Exception {
        String puzzle = ".4..5..67...1...4....2.....1..8..3........2...6...........4..5.3.....8..2........";
        String solution = "842359167573186942619274538127865394435791286968423715781942653354617829296538471";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_69() throws Exception {
        String puzzle = ".......4...2..4..1.7..5..9...3..7....4..6....6..1..8...2....1..85.9...6.....8...3";
        String solution = "538219746962874531174356298283497615741568329695123874329645187857931462416782953";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_70() throws Exception {
        String puzzle = "8..7....4.5....6............3.97...8....43..5....2.9....6......2...6...7.71..83.2";
        String solution = "863751294957432681124689573532976148619843725748125936386217459295364817471598362";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_71() throws Exception {
        String puzzle = ".8...4.5....7..3............1..85...6.....2......4....3.26............417........";
        String solution = "986324157124759368537861429413285976695173284278946513342617895869532741751498632";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_72() throws Exception {
        String puzzle = "....7..8...6...5...2...3.61.1...7..2..8..534.2..9.......2......58...6.3.4...1....";
        String solution = "945671283136482597827593461614837952798125346253964178362759814581246739479318625";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_73() throws Exception {
        String puzzle = "......8.16..2........7.5......6...2..1....3...8.......2......7..4..8....5...3....";
        String solution = "724369851651248793893715642375691428912874365486523917238456179147982536569137284";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_74() throws Exception {
        String puzzle = ".2..........6....3.74.8.........3..2.8..4..1.6..5.........1.78.5....9..........4.";
        String solution = "126437958895621473374985126457193862983246517612578394269314785548769231731852649";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_75() throws Exception {
        String puzzle = ".52..68.......7.2.......6....48..9..2..41......1.....8..61..38.....9...63..6..1.9";
        String solution = "152946837963587421847231695574863912289415763631729548796152384415398276328674159";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_76() throws Exception {
        String puzzle = "....1.78.5....9..........4..2..........6....3.74.8.........3..2.8..4..1.6..5.....";
        String solution = "269314785548769231731852649126437958895621473374985126457193862983246517612578394";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_77() throws Exception {
        String puzzle = "1.......3.6.3..7...7...5..121.7...9...7........8.1..2....8.64....9.2..6....4.....";
        String solution = "152678943864391752973245681215763894497582136638914527321856479549127368786439215";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_78() throws Exception {
        String puzzle = "4...7.1....19.46.5.....1......7....2..2.3....847..6....14...8.6.2....3..6...9....";
        String solution = "496573128381924675275861943153789462962435781847216539714352896529648317638197254";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_79() throws Exception {
        String puzzle = "......8.17..2........5.6......7...5..1....3...8.......5......2..3..8....6...4....";
        String solution = "253479861761238594894516732326791458915824376487653219548167923132985647679342185";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_80() throws Exception {
        String puzzle = "963......1....8......2.5....4.8......1....7......3..257......3...9.2.4.7......9..";
        String solution = "963741258152398674874265391345872169218956743697134825721489536589623417436517982";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_81() throws Exception {
        String puzzle = "15.3......7..4.2....4.72.....8.........9..1.8.1..8.79......38...........6....7423";
        String solution = "152398647973641285864572931598714362247936158316285794725463819431829576689157423";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_82() throws Exception {
        String puzzle = "..........5724...98....947...9..3...5..9..12...3.1.9...6....25....56.....7......6";
        String solution = "946731582157248639832659471719423865584976123623815947461397258398562714275184396";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_83() throws Exception {
        String puzzle = "....75....1..2.....4...3...5.....3.2...8...1.......6.....1..48.2........7........";
        String solution = "932475861617928534845613279568741392429836715173259648356192487294387156781564923";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_84() throws Exception {
        String puzzle = "6.....7.3.4.8.................5.4.8.7..2.....1.3.......2.....5.....7.9......1....";
        String solution = "618459723342867519579123468296534187784291635153786294927648351861375942435912876";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_85() throws Exception {
        String puzzle = "....6...4..6.3....1..4..5.77.....8.5...8.....6.8....9...2.9....4....32....97..1..";
        String solution = "957261384846537921123489567734926815295814736618375492572198643481653279369742158";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_86() throws Exception {
        String puzzle = ".32.....58..3.....9.428...1...4...39...6...5.....1.....2...67.8.....4....95....6.";
        String solution = "132749685857361924964285371216457839348692157579813246421536798683974512795128463";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_87() throws Exception {
        String puzzle = "...5.3.......6.7..5.8....1636..2.......4.1.......3...567....2.8..4.7.......2..5..";
        String solution = "746513892132869754598742316367925481925481673481637925679154238254378169813296547";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_88() throws Exception {
        String puzzle = ".5.3.7.4.1.........3.......5.8.3.61....8..5.9.6..1........4...6...6927....2...9..";
        String solution = "956327841127486395834951267548739612271864539369215478793548126415692783682173954";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_89() throws Exception {
        String puzzle = "..5..8..18......9.......78....4.....64....9......53..2.6.........138..5....9.714.";
        String solution = "935748621876231594124695783512469378643872915789153462267514839491386257358927146";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_90() throws Exception {
        String puzzle = "..........72.6.1....51...82.8...13..4.........37.9..1.....238..5.4..9.........79.";
        String solution = "143258679872964153695137482986541327451372968237896514719623845564789231328415796";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_91() throws Exception {
        String puzzle = "...658.....4......12............96.7...3..5....2.8...3..19..8..3.6.....4....473..";
        String solution = "937658241864291735125734986583419627649372518712586493471963852396825174258147369";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_92() throws Exception {
        String puzzle = ".2.3.......6..8.9.83.5........2...8.7.9..5........6..4.......1...1...4.22..7..8.9";
        String solution = "924361758156478293837592641613247985749185326582936174498623517371859462265714839";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_93() throws Exception {
        String puzzle = ".5..9....1.....6.....3.8.....8.4...9514.......3....2..........4.8...6..77..15..6.";
        String solution = "856491372143572698927368451278645139514923786639817245361789524485236917792154863";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_94() throws Exception {
        String puzzle = ".....2.......7...17..3...9.8..7......2.89.6...13..6....9..5.824.....891..........";
        String solution = "659412378238679451741385296865723149427891635913546782396157824574268913182934567";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }

    @Test
    public void test_95() throws Exception {
        String puzzle = "3...8.......7....51..............36...2..4....7...........6.13..452...........8..";
        String solution = "354186927298743615167952483481527369932614578576398241729865134845231796613479852";
        assertEquals(solution, new Sudoku(puzzle).solve(), new Sudoku(puzzle).toURL());
    }
}
