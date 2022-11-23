package Entity;

public class Helicopter extends Vehicles{
    int flightAltitude;
    Helicopter(int weight, int speed, int carryingWeight, int flightAltitude) {
        super(weight, speed, carryingWeight);
        this.flightAltitude = flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }
}
