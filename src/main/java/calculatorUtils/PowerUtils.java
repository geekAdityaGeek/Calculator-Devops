package calculatorUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PowerUtils {
    public static final Logger log = LogManager.getLogger(PowerUtils.class);
    public Double computePower(Double mantissa, Double exponent){
        Double power = Math.pow(mantissa, exponent);
        log.info("Power - "+mantissa+","+exponent+" : ["+power+"]");
        return power;
    }
}
