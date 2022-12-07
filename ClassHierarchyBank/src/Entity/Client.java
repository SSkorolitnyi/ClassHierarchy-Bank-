package Entity;

import java.util.Objects;

public class Client extends Person {
    private int bankCardNumber;
    float balance;
    public Client(String name, int phoneNumber, int bankCardNumber, float balance) {
        super(name, phoneNumber);
        this.bankCardNumber = bankCardNumber;
        this.balance = balance;
    }

    public void setBankCardNumber(int bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getBankCardNumber() {
        return bankCardNumber;
    }
    public float getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return bankCardNumber == client.bankCardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCardNumber);
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankCardNumber=" + bankCardNumber +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
