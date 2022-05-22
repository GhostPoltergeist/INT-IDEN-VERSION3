package version.three;

import java.text.MessageFormat;

public class Formula extends identifier {
    //Constants::Depending::OnValuesReferences
    public static final double pi = 3.14;
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String RESET = "\033[0m";
    //Constants::FinalDoubleDataType
    public void data(int x) throws InterruptedException {
        System.out.println("");
        double rad = x * pi;
        double res = rad / 180;
        String degree = GREEN_BOLD_BRIGHT + x + RESET;
        String radian = GREEN_BOLD_BRIGHT + res + RESET;
        String out1 = RED_BOLD_BRIGHT + "::Degree:: " + RESET;
        String out2 = RED_BOLD_BRIGHT + " ::Radian:: " + RESET;
        String last = MessageFormat.format("{0}{1}{2}{3}",out1, degree, out2, radian);
        System.out.print(last);
        Thread.sleep(2000);
    }
    public void PerformRadianCalc(int x) throws InterruptedException {
        System.out.println("");
        int rad = x * 180;
        double res = rad / pi;
        String radian = GREEN_BOLD_BRIGHT + x + RESET;
        String degree = GREEN_BOLD_BRIGHT + res + RESET;
        String out1 = RED_BOLD_BRIGHT + "::Radian:: " + RESET;
        String out2 = RED_BOLD_BRIGHT + " ::Degree:: " + RESET;
        String last = MessageFormat.format( "{0}{1}{2}{3}", out1, radian, out2, degree);
        System.out.print(last);
        Thread.sleep(2000);
    }
    public void PerformSinCalc(int degree, double opposite, double hypotenuse) throws InterruptedException {
        System.out.println("");
        double res = opposite / hypotenuse;
	String out1 = GREEN_BOLD_BRIGHT + degree + RESET;
	String out2 = GREEN_BOLD_BRIGHT + res + RESET;
	String out3 = RED_BOLD_BRIGHT + "Degree: " + RESET;
	String out4 = RED_BOLD_BRIGHT + " Sin: " + RESET;
	String finalout = MessageFormat.format("{0}{1}{2}{3}", out3, out1, out4, out2);
	System.out.print(finalout);
    Thread.sleep(2000);
    }
    public void PerformCosCalc(int degree, double adjacent, double hypotenuse) throws InterruptedException {
	/** Syntax for performing Cos Calculations */
	  /** Operators are almost the same with sin calculations */
	    
	 System.out.println("");
	 double res = adjacent / hypotenuse;
	 String out1 = GREEN_BOLD_BRIGHT + degree + RESET;
	 String out2 = GREEN_BOLD_BRIGHT + res + RESET;
	 String out3 = RED_BOLD_BRIGHT + "Degree: " + RESET;
	 String out4 = RED_BOLD_BRIGHT + " Cos: " + RESET;
	 String finalout = MessageFormat.format("{0}{1}{2}{3}", out3, out1, out4, out2);
	 System.out.print(finalout);
     Thread.sleep(2000);
    }

    public void PerformTanCalc(int degree, double opposite, double adjacent) throws InterruptedException {
        System.out.println("");
        double res = opposite / adjacent;
        String out1 = GREEN_BOLD_BRIGHT + degree + RESET;
        String out2 = GREEN_BOLD_BRIGHT + res + RESET;
        String out3 = RED_BOLD_BRIGHT + "Degree: " + RESET;
        String out4 = RED_BOLD_BRIGHT + " Tan: " + RESET;
        String finalout = MessageFormat.format("{0}{1}{2}{3}", out3, out1, out4, out2);
        System.out.print(finalout);
        Thread.sleep(2000);
    }
}
