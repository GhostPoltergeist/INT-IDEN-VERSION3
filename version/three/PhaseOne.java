package version.three;

import java.util.Scanner;
import java.text.MessageFormat;

public class PhaseOne extends identifier {
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String RESET = "\033[0m";

 //MoreOnDegrees
    static Scanner loop = new Scanner(System.in);
    public void DegreeToGradian(int degree) throws InterruptedException {
        System.out.println("");
        double deg = degree * 200;
        double res = deg / 180;
        String out3 = GREEN_BOLD_BRIGHT + degree + RESET;
        String gradian = GREEN_BOLD_BRIGHT + res + RESET;
        String out1 = RED_BOLD_BRIGHT + "::Degree:: " + RESET;
        String out2 = RED_BOLD_BRIGHT + " ::Gradian[g]:: " + RESET;
        String last = MessageFormat.format("{0}{1}{2}{3}",out1, out3, out2, gradian);
        System.out.print(last);
        Thread.sleep(2000);
    }
    public void DegreeToMilliradian(int degree) throws InterruptedException {
        //LoopToMain::CreateObj
        System.out.println("");
        double mrad = 1000 * 3.14;
        double res1 =  mrad * degree;
        double res2 = res1 / 180;
        String out1 = GREEN_BOLD_BRIGHT + degree + RESET;
        String out2 = GREEN_BOLD_BRIGHT + res2 + RESET;
        String out3 = RED_BOLD_BRIGHT + "::Degree:: " + RESET;
        String out4 = RED_BOLD_BRIGHT + " ::MilliRadian[mrad]:: " + RESET;
        String last = MessageFormat.format("{0}{1}{2}{3}",out3, out1, out4, out2);
        System.out.print(last);
        Thread.sleep(2000);

           System.out.println("");
           System.out.print(RED_BOLD_BRIGHT + "::[SYS]: BackToPhase0[1] Exit[2]: " + RESET);
            int Loop = loop.nextInt();
              switch(Loop) {
                  case 1 -> identifier.MainPage();
                  case 2 -> System.exit(0);
                  default -> System.out.print("::Please Indicate A number 1-2 Only::");
              }
    }
    public void DegreeToMinuteOfArc() {

    }
    /** public void DegreeToRadian() {

    }
    */
    public void DegreeToSecondOfArc() {

    }
}

