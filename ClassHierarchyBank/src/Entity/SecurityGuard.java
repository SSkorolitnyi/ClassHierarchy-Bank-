package Entity;

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
}
