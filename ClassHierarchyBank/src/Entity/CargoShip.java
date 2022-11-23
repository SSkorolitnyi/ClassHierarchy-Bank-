package Entity;

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
}
