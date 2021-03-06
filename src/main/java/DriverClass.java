import calculatorUtils.FactorialUtils;
import calculatorUtils.SquareRootUtils;
import userInterface.CMDInterfaceClass;

import java.io.IOException;

public class DriverClass {
    public static void main(String args[]) throws IOException {
        CMDInterfaceClass userInterface = new CMDInterfaceClass();
        while(true) {
            try {
                Integer choice = userInterface.displayOption().acceptOption();
                switch (choice) {
                    case 0:
                        System.exit(0);
                    case 1:
                        Double x_sqrt = userInterface.acceptInputForSquareRoot();
                        Double result_sqrt = new SquareRootUtils().performSquareRoot(x_sqrt);
                        System.out.println("Square Root of " + x_sqrt + " is " + result_sqrt);
                        break;
                    case 2:
                        Integer x_fact = userInterface.acceptInputForFactorial();
                        Integer result_fact = new FactorialUtils().computeFactorial(x_fact);
                        System.out.println("Factorial of " + x_fact + " is " + result_fact);
                        break;
                    default:
                        System.out.println("No such choice available. Please select a correct choice");
                        break;
                }
            }catch(Exception e){
                System.out.println("Invalid Choice or Invalid Input Provided. Please provide appropriate " +
                        "choice and correct input for processing");
            }
            System.out.print("\n");
        }
    }
}
