package userInterface;

import constants.OperationCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMDInterfaceClass {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public CMDInterfaceClass displayOption(){
        System.out.println("AVAILABLE OPERATIONS ARE : ");
        System.out.println("=======================================");
        System.out.println("CODE\tOPERATION\tWORKING");
        System.out.println("----\t---------\t--------");
        System.out.println(OperationCode.SQRT_code+"\t\tSQRT\t\ty=sqrt(x)");
        System.out.println(OperationCode.EXIT_code+"\t\tEXIT\t\tEXIT");
        return this;
    }
    public Integer acceptOption()throws IOException{
        System.out.print("Please enter code of operation to perform : ");
        return Integer.parseInt(br.readLine());
    }
    public Double acceptInputForSquareRoot() throws IOException {
        System.out.print("Enter the number for which square root to be calculated : ");
        return Double.parseDouble(br.readLine());
    }
}