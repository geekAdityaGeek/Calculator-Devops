package calculatorUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactorialUtils {
    public static final Logger log = LogManager.getLogger(FactorialUtils.class);
    public Long computeFactorial(Integer number){
        Long factorial = 1l;
        if(number < 0) {
            factorial = -1l;
        }else if(number == 0 || number == 1) {
            factorial = 1l;
        }else {
            for (int count = number; count > 1; count--)
                factorial *= count;
        }
        log.info("Factorial - "+number+" : ["+factorial+"]");
        return factorial;
    }
}
