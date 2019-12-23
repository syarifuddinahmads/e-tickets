/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.interfaces;

import cinematickets.model.Film;
import cinematickets.model.Transaction;

/**
 *
 * @author udin
 */
public interface TransactionInterface {
    public Transaction createTransaction(Transaction transaction);

    public Transaction editTransaction(Transaction transaction);

    public Transaction deleteTransaction(Transaction transaction);

    public Transaction updateTransaction(Transaction transaction);

    public Transaction searchTransaction(Transaction transaction);
}
