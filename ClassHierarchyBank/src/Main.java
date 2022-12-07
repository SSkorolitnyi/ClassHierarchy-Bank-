import Entity.Client;
import Entity.Transactions;

public class Main {
    public static void main(String[] args) {
        Client Serhiy = new Client("Serhiy Skorolitnyi",997637121,555111333,500);
        Client Vova = new Client("Vova Maslo",99117013,885553535,5000);
        Transactions transactions = new Transactions(Serhiy,Vova,700);
        System.out.println(transactions);
        transactions.checkBalance();
    }
}