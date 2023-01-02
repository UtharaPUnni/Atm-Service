package org.perfomatix.training;

import java.util.Map;

    class User {
    public int acctno;
    public int updatedpin;
    public int pinno;
     double amount;
     double balance = 20000;
     public int getAcctno() {
        return acctno;
         }
         public void setAcctno() {
        this.acctno = acctno;
         }
     public int getPinno() {
        return pinno;
         }
     public void setPinno(int pinno) {
        this.pinno = pinno;
        }
        public int getUpdatedpin() {
        return updatedpin;
        }
     public void setUpdatedpin(int updatedpin) {
        this.updatedpin = updatedpin;
     }
        public double getAmount() {
        return amount;
        }
        public void setAmount(double amount) {
           this.amount = amount;
        }
     public double getBalance() {
        return balance;
        }
        public void setBalance() {
            this.balance = balance;
        }
}

