package calculatorUtils;

public class FactorialUtils {
    public Integer computeFactorial(Integer number){
        if(number < 0)  return -1;
        if(number == 0 || number == 1)
            return 1;
        Integer factorial = 1;
        for(int count = number; count>1; count--)
            factorial *= count;
        return factorial;
    }
}
