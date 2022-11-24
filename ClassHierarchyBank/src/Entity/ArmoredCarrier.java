package Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArmoredCarrier that = (ArmoredCarrier) o;
        return armorThickness == that.armorThickness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(armorThickness);
    }

    @Override
    public String toString() {
        return "ArmoredCarrier{" +
                "armorThickness=" + armorThickness +
                ", weight=" + weight +
                ", speed=" + speed +
                ", carryingWeight=" + carryingWeight +
                '}';
    }
}
