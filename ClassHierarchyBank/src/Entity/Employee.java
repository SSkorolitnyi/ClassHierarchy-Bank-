package Entity;

public abstract class Employee extends Person {
    protected double salary;
    protected int workingHours;

    protected int experience;

    Employee(String name, int phoneNumber, double salary, int workingHours) {
        super(name, phoneNumber);
        this.salary = salary;
        this.workingHours = workingHours;
        this.experience = experience;
    }

    public void setSalary(double monthlySalary) {
        this.salary = monthlySalary;
    }

    public void  setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public int getExperience() {
        return experience;
    }

}
