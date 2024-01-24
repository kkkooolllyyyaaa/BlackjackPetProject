package org.blackjack;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BlackjackPlayer {
    private String name;
    private List<Card> hand = new ArrayList<>();
    private int bet;
    private boolean isStanding;
    private BankAccount account;

    public BlackjackPlayer(String name) {
        this.name = name;
        this.account = new BankAccount();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void placeBet(int amount) {
        this.bet = amount;
        // Можно добавить логику для проверки достаточности средств на счете
    }

    // Другие методы, такие как подсчет очков, решение о взятии дополнительной карты и т.д.
}

