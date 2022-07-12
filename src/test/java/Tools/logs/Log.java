package Tools.logs;

import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Tools.extentreports.ExtentTestManager.getTest;

public class Log {
    //Initialize Log4j instance
    private static final Logger Log = LogManager.getLogger ( Log.class );

    //Info Level Logs
    public static void info(String message) {
        Log.info ( message );
    }

    //Method for adding logs passed from test cases
    public static void reportLog(String message) {
        getTest ().log ( Status.INFO, message );

    }

    //Warn Level Logs
    public static void warn(String message) {
        Log.warn ( message );
    }

    //Error Level Logs
    public static void error(String message) {
        Log.error ( message );
    }

    //Fatal Level Logs
    public static void fatal(String message) {
        Log.fatal ( message );
    }

    //Debug Level Logs
    public static void debug(String message) {
        Log.debug ( message );
    }
}