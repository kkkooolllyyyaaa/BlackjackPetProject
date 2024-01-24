package org.blackjack;

import java.util.HashMap;

public class Bank {
    private Map<Player, BankAccount> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addPlayer(Player player) {
        accounts.put(player, new BankAccount());
    }

    public void removePlayer(Player player) {
        accounts.remove(player);
    }

    public int getBalance(Player player) {
        return accounts.get(player).getBalance();
    }

    public void updateBalance(Player player, int amount) {
        accounts.get(player).updateBalance(amount);
    }
}

