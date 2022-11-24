package Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmentSpecialist that = (InvestmentSpecialist) o;
        return Double.compare(that.companyShares, companyShares) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyShares);
    }

    @Override
    public String toString() {
        return "InvestmentSpecialist{" +
                "companyShares=" + companyShares +
                ", salary=" + salary +
                ", workingHours=" + workingHours +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
