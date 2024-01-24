package org.blackjack;

import org.blackjack.shuffle.RandomShuffle;

public class Dealer {
    private Deck deck;

    public Dealer() {
        this.deck = new Deck();
    }

    private RandomShuffle shuffleAlgorithm;

    public void shuffle() {
        this.deck = new Deck();
        this.shuffleAlgorithm = new RandomShuffle(); // Создаем экземпляр RandomShuffle
    }

    public Card dealCard() {
        // Вернуть и удалить карту из колоды
    }
}

