package calculatorUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactorialUtils {
    public static final Logger log = LogManager.getLogger(FactorialUtils.class);
    public Integer computeFactorial(Integer number){
        Integer factorial = 1;
        if(number < 0) {
            factorial = -1;
        }else if(number == 0 || number == 1) {
            factorial = 1;
        }else {
            for (int count = number; count > 1; count--)
                factorial *= count;
        }
        log.info("Factorial - "+number+" : ["+factorial+"]");
        return factorial;
    }
}
