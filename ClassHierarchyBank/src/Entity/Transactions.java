package Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return Double.compare(that.countOfMoney, countOfMoney) == 0 && fromClient.equals(that.fromClient) && toClient.equals(that.toClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromClient, toClient, countOfMoney);
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "fromClient=" + fromClient.getName() +
                ", toClient=" + toClient.getName() +
                ", countOfMoney=" + countOfMoney +
                '}';
    }
}
