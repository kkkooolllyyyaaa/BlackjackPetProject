package org.blackjack;
//система банка в игре - выйгрыш и проигрыш
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<BlackjackPlayer, BankAccount> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

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
}

