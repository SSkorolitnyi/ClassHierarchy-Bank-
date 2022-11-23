package Entity;

public class Transactions {
    private Client fromClient;
    private Client toClient;
    double countOfMoney;

    Transactions(Client fromClient, Client toClient, double countOfMoney) {
        this.fromClient = fromClient;
        this.toClient = toClient;
        this.countOfMoney = countOfMoney;
    }

    public void setFromClient(Client fromClient) {
        this.fromClient = fromClient;
    }

    public void setToClient(Client toClient) {
        this.toClient = toClient;
    }

    public void setCountOfMoney(double countOfMoney) {
        this.countOfMoney = countOfMoney;
    }

    public Client getFromClient() {
        return fromClient;
    }

    public Client getToClient() {
        return toClient;
    }

    public double getCountOfMoney() {
        return countOfMoney;
    }
}
