import java.util.ArrayList;
import java.util.Scanner;

class Aeroplane extends Passenger implements AeroplaneInfo{

    public double getAmountPerSeat() {
        return 25750.0;
    }

    public String getTiming() {
        return "9:00 AM";
    }
        private String planeName;
    private int seatsPerRow;
    private String captainName;

    public Aeroplane( String name,int age,String gender,String planeName, int seatsPerRow, String captainName){
        super(name,age,gender);
        this.planeName = planeName;
        this.seatsPerRow = seatsPerRow;
        this.captainName = captainName;
    }

    public String getPlaneName() {
        return planeName;
    }

    public String getCaptainName() {
        return captainName;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }
}
