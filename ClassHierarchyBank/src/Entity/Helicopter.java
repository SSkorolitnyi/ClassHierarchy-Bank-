package Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return flightAltitude == that.flightAltitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightAltitude);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "flightAltitude=" + flightAltitude +
                ", weight=" + weight +
                ", speed=" + speed +
                ", carryingWeight=" + carryingWeight +
                '}';
    }
}
