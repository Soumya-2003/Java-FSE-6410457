public class TestLogger{
    public static void main(String[] args){
        Logger logger1 = Logger.getLoggerInstance();
        logger1.message("Error in login");

        Logger logger2 = Logger.getLoggerInstance();
        logger2.message("Clear your Cache");

        if(logger1 == logger2){
            System.out.println("Singleton works, both variables contain the same instance.");
        }
        else{
            System.out.println("Singleton failed, variables contain different instances.");
        }
    }
}