package Entity;

import java.math.BigDecimal;

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
}
