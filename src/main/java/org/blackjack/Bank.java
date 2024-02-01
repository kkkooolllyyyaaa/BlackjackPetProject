package org.blackjack;
<<<<<<< HEAD
//система банка в игре - выйгрыш и проигрыш
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<BlackjackPlayer, BankAccount> accounts;
=======

import java.util.HashMap;

public class Bank {
    private Map<Player, BankAccount> accounts;
>>>>>>> origin/master

    public Bank() {
        this.accounts = new HashMap<>();
    }

<<<<<<< HEAD
    public void registerPlayer(BlackjackPlayer player) {
        // Регистрация игрока и создание банковского счета
    }

    public void processWinner(BlackjackPlayer player, int amount) {
        // Обработка выигрыша игрока
    }

    public void processLoser(BlackjackPlayer player, int amount) {
        // Снятие суммы проигрыша со счета игрока
    }

    // Дополнительные методы для управления счетами
=======
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
>>>>>>> origin/master
}

