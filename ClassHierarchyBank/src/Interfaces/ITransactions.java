package Interfaces;

import Exceptions.TransactionException;

public interface ITransactions {

    public void checkBalance() throws TransactionException;

}
