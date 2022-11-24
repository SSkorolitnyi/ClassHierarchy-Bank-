package Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashier cashier = (Cashier) o;
        return cassMachineNumber == cashier.cassMachineNumber && workingShift.equals(cashier.workingShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cassMachineNumber, workingShift);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cassMachineNumber=" + cassMachineNumber +
                ", workingShift='" + workingShift + '\'' +
                ", salary=" + salary +
                ", workingHours=" + workingHours +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
