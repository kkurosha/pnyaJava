public class Main {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();
        Logger criticalLogger = new CriticalLogger();
        Logger debugLogger = new DebugLogger();

        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(criticalLogger);
        criticalLogger.setNextLogger(debugLogger);

        infoLogger.logMessage(LogLevel.INFO, "Уровень INFO");
        infoLogger.logMessage(LogLevel.WARNING, "Уровень WARNING");
        infoLogger.logMessage(LogLevel.ERROR, "Уровень ERROR");
        infoLogger.logMessage(LogLevel.CRITICAL, "Уровень CRITICAL");
        infoLogger.logMessage(LogLevel.DEBUG, "Уровень DEBUG");
    }
}