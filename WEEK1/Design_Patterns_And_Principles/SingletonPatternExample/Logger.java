public class Logger {

    private static Logger loggerInstance;

    private Logger() {
        System.out.println("New Logger instance created");
    }

    public static Logger getLoggerInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void message(String msg) {
        System.err.println("Log Message:" + msg);
    }
}
