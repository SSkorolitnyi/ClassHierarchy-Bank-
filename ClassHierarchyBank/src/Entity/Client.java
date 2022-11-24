package Entity;

import java.util.Objects;

public class Client extends Person{
    private int bankCardNumber;
    private double credit;
    String contract;
    Client(String name, int phoneNumber, int bankCardNumber, double credit, String contract) {
        super(name, phoneNumber);
        this.contract = contract;
        this.credit = credit;
        this.bankCardNumber = bankCardNumber;
    }

    public void setBankCardNumber(int bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return bankCardNumber == client.bankCardNumber && Double.compare(client.credit, credit) == 0 && contract.equals(client.contract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCardNumber, credit, contract);
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankCardNumber=" + bankCardNumber +
                ", credit=" + credit +
                ", contract='" + contract + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
