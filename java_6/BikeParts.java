package bikeproject;

public interface BikeParts {
    public void setHandleBard(String newValue);
    public String getHandleBard();
    public void setFrame(String newValue);
    public String getFrame();
    public void setTyres(String newValue);
    public String getTyres();
    public void setSeatType(String newValue);
    public String getSeatType();
    public void setNumGears(int newValue);
    public int getNumGears();
    public final String make = "Oracle Cycles";
}
