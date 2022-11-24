package Entity;

import java.math.BigDecimal;
import java.util.Objects;

public class FinancialAnalyst extends Employee{
    private BigDecimal annualCosts;

    FinancialAnalyst(String name, int phoneNumber, double salary, int workingHours, BigDecimal annualCosts) {
        super(name, phoneNumber, salary, workingHours);
        this.annualCosts = annualCosts;
    }

    public void setAnnualCosts(BigDecimal annualCosts) {
        this.annualCosts = annualCosts;
    }

    public BigDecimal getAnnualCosts() {
        return annualCosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancialAnalyst that = (FinancialAnalyst) o;
        return annualCosts.equals(that.annualCosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annualCosts);
    }

    @Override
    public String toString() {
        return "FinancialAnalyst{" +
                "annualCosts=" + annualCosts +
                ", salary=" + salary +
                ", workingHours=" + workingHours +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
