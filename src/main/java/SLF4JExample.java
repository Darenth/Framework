import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {
    public  Logger getLogger() {
        Logger logger = LoggerFactory.getLogger(SLF4JExample.class);
        return logger;
    }
}