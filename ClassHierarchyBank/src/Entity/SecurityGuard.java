package Entity;

import java.util.Objects;

public class SecurityGuard extends Employee{
    private String equipment;
    private int securityID;
    SecurityGuard(String name, int phoneNumber, double salary, int workingHours, String equipment, int securityID) {
        super(name, phoneNumber, salary, workingHours);
        this.equipment = equipment;
        this.securityID = securityID;
    }

    public void setSecurityID(int securityID) {
        this.securityID = securityID;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    public int getSecurityID() {
        return securityID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityGuard that = (SecurityGuard) o;
        return securityID == that.securityID && equipment.equals(that.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipment, securityID);
    }

    @Override
    public String toString() {
        return "SecurityGuard{" +
                "equipment='" + equipment + '\'' +
                ", securityID=" + securityID +
                ", salary=" + salary +
                ", workingHours=" + workingHours +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
