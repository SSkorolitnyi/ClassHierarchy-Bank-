package Entity;

public abstract class Vehicles {
    protected int weight;
    protected int speed;
    protected int carryingWeight;

    Vehicles(int weight, int speed, int carryingWeight) {
        this.weight = weight;
        this.speed = speed;
        this.carryingWeight = carryingWeight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCarryingWeight(int carryingWeight) {
        this.carryingWeight = carryingWeight;
    }

    public int getWeight() {
       return  weight;
    }

    public int getSpeed() {
        return  speed;
    }

    public int getCarryingWeight() {
        return carryingWeight;
    }
}
