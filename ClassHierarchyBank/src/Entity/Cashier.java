package Entity;

public class Cashier extends Employee{
    private int cassMachineNumber;
    private String workingShift;
    Cashier(String name, int phoneNumber, double salary, int workingHours, int cassMachineNumber, String workingShift) {
        super(name, phoneNumber, salary, workingHours);
        this.cassMachineNumber = cassMachineNumber;
        this.workingShift = workingShift;
    }

    public void setCassMachineNumber(int cassMachineNumber) {
        this.cassMachineNumber = cassMachineNumber;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    public int getCassMachineNumber() {
        return cassMachineNumber;
    }

    public String getWorkingShift() {
        return getName();
    }
}
