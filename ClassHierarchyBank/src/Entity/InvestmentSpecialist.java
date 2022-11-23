package Entity;

public class InvestmentSpecialist extends Employee{
    private double companyShares;
    InvestmentSpecialist(String name, int phoneNumber, double salary, int workingHours, double companyShares) {
        super(name, phoneNumber, salary, workingHours);
        this.companyShares = companyShares;
    }

    public void setCompanyShares(double companyShares) {
        this.companyShares = companyShares;
    }

    public double getCompanyShares(){
        return companyShares;
    }
}
