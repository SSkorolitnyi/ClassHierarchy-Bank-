package Entity;

import Interfaces.ICredit;

import org.apache.log4j.Logger;

public class Credit implements ICredit {
    private static Logger logger = Logger.getLogger(Credit.class);

    private double urCredit;
    private Client fromClient;

    public Credit(double urCredit, Client fromClient) {
        this.urCredit = urCredit;
        this.fromClient = fromClient;
    }

    public void setCredit(double urCredit) {
        this.urCredit = urCredit;
    }

    public void setFromClient(Client fromClient) {
        this.fromClient = fromClient;
    }

    public double getUrCreditCredit() {
        return urCredit;
    }

    public Client getFromClient() {
        return fromClient;
    }

    @Override
    public void takeCredit() {
        double FromClient = fromClient.getBalance();
        FromClient = FromClient + urCredit;
        logger.info("Ur new Balance: " + FromClient + " - " + "Your Credit: " + urCredit);

    }

    @Override
    public void repayCredit() {
        double FromClient = fromClient.getBalance();


    }

}
