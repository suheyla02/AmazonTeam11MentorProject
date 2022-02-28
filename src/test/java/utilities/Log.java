package utilities;

import java.util.logging.Logger;

public class Log {

    private static Logger Log= (Logger)Logger.getLogger(Log.class.getName());

    public static void startTestCase(String sTestCaseName){
        Log.info("-------------------------------------------------------");
        Log.info("****************"+ sTestCaseName +"START **************");
        Log.info("-------------------------------------------------------");
    }

    public static void endTestCase(String sTestCaseName){
        Log.info("-------------------------------------------------------");
        Log.info("****************"+sTestCaseName+"END ****************");
        Log.info("-------------------------------------------------------");
    }

    public static void info(String message){
        Log.info(message);
    }

    public static void warn(String message){
        Log.warning(message);
    }

    public static void error(String message){

    }
}
