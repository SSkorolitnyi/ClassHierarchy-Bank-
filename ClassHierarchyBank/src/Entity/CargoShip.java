package Entity;

import java.util.Objects;

public class CargoShip extends Vehicles{
    int capacity;
    CargoShip(int weight, int speed, int carryingWeight, int capacity) {
        super(weight, speed, carryingWeight);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoShip cargoShip = (CargoShip) o;
        return capacity == cargoShip.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "capacity=" + capacity +
                ", weight=" + weight +
                ", speed=" + speed +
                ", carryingWeight=" + carryingWeight +
                '}';
    }
}
