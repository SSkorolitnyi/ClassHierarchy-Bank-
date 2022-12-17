import Entity.Client;
import Entity.Credit;
import Entity.Transactions;

import Exceptions.TransactionException;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws TransactionException {
        Client Serhiy = new Client("Serhiy Skorolitnyi",997637121,555111333,500);
        Client Vova = new Client("Vova Maslo",99117013,885553535,5000);
        Transactions transactions = new Transactions(Serhiy,Vova,600);
        logger.info(transactions);
        transactions.checkBalance();

        Credit credit = new Credit(15000,Serhiy);
        logger.info(credit);
        credit.takeCredit();


    }
}