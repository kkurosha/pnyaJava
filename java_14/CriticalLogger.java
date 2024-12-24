class CriticalLogger extends Logger {
    public CriticalLogger() { super(LogLevel.CRITICAL); }
    @Override
    protected void write(String message) { System.out.println("CRITICAL: " + message); }
}