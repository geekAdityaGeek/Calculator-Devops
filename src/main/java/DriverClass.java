import calculatorUtils.SquareRootUtils;
import userInterface.CMDInterfaceClass;

import java.io.IOException;

public class DriverClass {
    public static void main(String args[]) throws IOException {
        CMDInterfaceClass userInterface = new CMDInterfaceClass();
        while(true) {
            Integer choice = userInterface.displayOption().acceptOption();
            switch (choice) {
                case 0: System.exit(0);
                case 1:
                    Double x = userInterface.acceptInputForSquareRoot();
                    Double result = new SquareRootUtils().performSquareRoot(x);
                    System.out.println("Square Root of " + x + " is " + result);
                    break;
                default:
                    System.out.println("No such choice available. Please select a correct choice");
                    break;
            }
            System.out.print("\n");
        }
    }
}
