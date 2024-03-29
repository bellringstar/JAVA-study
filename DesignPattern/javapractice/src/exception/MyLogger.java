package exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

    Logger logger = Logger.getLogger("mylogger"); //식별자를 줘 항상 같은 인스턴스를 리턴
    private static MyLogger instance = new MyLogger(); //싱글톤으로 구현



    public static final String errorLog = "log.txt";
    public static final String warningLog = "warning.txt";
    public static final String fineLog = "fine.txt";

    private FileHandler logFile = null;
    private FileHandler warningFile = null;
    private FileHandler fineFile = null;

    private MyLogger(){
        try{
            logFile = new FileHandler(errorLog, true);
            warningFile = new FileHandler(warningLog, true);
            fineFile = new FileHandler(fineLog,true);
        } catch (SecurityException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        logFile.setFormatter(new SimpleFormatter());
        warningFile.setFormatter(new SimpleFormatter());
        fineFile.setFormatter(new SimpleFormatter());

        logFile.setLevel(Level.ALL); //Fine to Severe
        fineFile.setLevel(Level.FINE); //Fine to Severe
        warningFile.setLevel(Level.WARNING); //Warning to Severe

        logger.addHandler(logFile);
        logger.addHandler(warningFile);
        logger.addHandler(fineFile);
    }

    public static MyLogger getLogger(){
        return instance;
    }

    public void log(String msg){

        logger.finest(msg);
        logger.finer(msg);
        logger.fine(msg);
        logger.config(msg);
        logger.info(msg);
        logger.warning(msg);
        logger.severe(msg);
    }

    public void fine(String msg) {
        logger.fine(msg);
    }

    public void warning(String msg){
        logger.warning(msg);
    }
}
