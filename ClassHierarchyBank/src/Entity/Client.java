package Entity;

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
}
