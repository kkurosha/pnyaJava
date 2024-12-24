package bikeproject;

public class Bike implements BikeParts {

    private String handleBars, frame, tyres, seatType;
    private int NumGears;
    private final String make;

    public Bike(){
        this.make = "Oracle Cycles";
    }//end constructor

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        NumGears = numGears;
        this.make = "Oracle Cycles";
    }

    protected void printDescription() {
        System.out.println("\n" + this.make + "\n"
                + "This bike has " + this.handleBars + " handlebars on a "
                + this.frame + " frame with " + this.NumGears + " gears."
                + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }

    public void setHandleBard(String newValue) { this.handleBars = handleBars; }
    public String getHandleBard() { return handleBars; }
    public void setFrame(String newValue) { this.frame = frame; }
    public String getFrame() { return frame; }
    public void setTyres(String newValue) { this.tyres = tyres; }
    public String getTyres() { return tyres; }
    public void setSeatType(String newValue) { this.seatType = seatType; }
    public String getSeatType() { return seatType; }
    public void setNumGears(int newValue) { this.NumGears = NumGears; }
    public int getNumGears() { return NumGears; }
}


