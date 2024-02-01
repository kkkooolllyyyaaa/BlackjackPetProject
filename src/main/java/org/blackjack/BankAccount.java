package org.blackjack;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

<<<<<<< HEAD
    // Методы для внесения и снятия средств
=======
    public int getBalance() {
        return balance;
    }

    public void updateBalance(int amount) {
        balance += amount;
    }
>>>>>>> origin/master
}

