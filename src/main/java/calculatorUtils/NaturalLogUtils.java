package calculatorUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NaturalLogUtils {
    public static final Logger log = LogManager.getLogger(NaturalLogUtils.class);
    public Double computeNaturalLog(Double number){
        Double naturalLog = Math.log(number);
        log.info("NaturalLog - "+number+" : ["+naturalLog+"]");
        return naturalLog;
    }
}
