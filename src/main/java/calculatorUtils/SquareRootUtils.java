package calculatorUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SquareRootUtils {
    public static final Logger log = LogManager.getLogger(SquareRootUtils.class);
    public Double performSquareRoot(Double number){
        Double sqrt = Math.sqrt(number);
        log.info("SquareRoot - "+number+" : "+sqrt);
        return sqrt;
    }
}
