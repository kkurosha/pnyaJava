class WarningLogger extends Logger {
    public WarningLogger() { super(LogLevel.WARNING); }
    @Override
    protected void write(String message) { System.out.println("WARNING: " + message); }
}