package version.three;

import java.util.Scanner;
import java.text.MessageFormat;
 public class UserOption {
     public static final String MAGENTA_BOLD_BRIGHT = "\033[1;95m";
     public static final String RED_BOLD_BRIGHT = "\033[1;91m";
     public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";
     public static final String RESET = "\033[0m";
   //Static Scanner
     static Scanner save = new Scanner(System.in);
     static int[] SaveValues = new int[10];

    public void UserSaveValuesInt() throws InterruptedException {
        identifier ide = new identifier();
        //ArrayOfValues::ForIntegers
           /** 10 Array Value Spaces */

             System.out.print(RED_BOLD_BRIGHT + "::Save An Integer Value: " + RESET);
              SaveValues[0]= (save.nextInt());
               String out = MAGENTA_BOLD_BRIGHT + SaveValues[0] + RESET;
               String out2 = RED_BOLD_BRIGHT + "::The Value Is Already Saved::" + RESET;
               String save = MessageFormat.format("{0}[{1}]", out2, out);
               System.out.print(save);
                //Proceed
    }
    public void UserSaveValuesDouble() {
      //ArrayOfValues::ForDouble

    }
  }
