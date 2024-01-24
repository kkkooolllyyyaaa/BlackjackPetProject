package org.blackjack;

public abstract class Dealer {
    protected Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public abstract Card dealCard();
}
