package Entity;

public class ArmoredCarrier extends Vehicles{
    int armorThickness;
    ArmoredCarrier(int weight, int speed, int carryingWeight, int armorThickness) {
        super(weight, speed, carryingWeight);
        this.armorThickness = armorThickness;
    }

    public void setArmorThickness(int armorThickness) {
        this.armorThickness = armorThickness;
    }

    public int getArmorThickness() {
        return armorThickness;
    }
}
