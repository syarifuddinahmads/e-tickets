/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.model;

/**
 *
 * @author udin
 */
public class TransactionDetail {

    private Long id;
    private int IdTransaction;
    private char tipe;
    private int Qty;

    public TransactionDetail(Long id, int IdTransaction, char tipe, int Qty) {
        this.id = id;
        this.IdTransaction = IdTransaction;
        this.tipe = tipe;
        this.Qty = Qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
    }

    public void setTipe(char tipe) {
        this.tipe = tipe;
    }

    public char getTipe() {
        return tipe;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public int getQty() {
        return Qty;
    }
}
