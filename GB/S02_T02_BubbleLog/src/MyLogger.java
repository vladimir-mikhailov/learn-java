import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

    public static Logger getLogger(String logFile) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler(logFile);
        logger.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());
        return logger;
    }
}
