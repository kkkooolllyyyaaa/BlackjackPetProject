package org.blackjack;

import org.blackjack.shuffle.RandomShuffle;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    private Deck deck;
    private RandomShuffle shuffleAlgorithm;

    public void shuffle() {
        this.deck = new Deck();
        this.shuffleAlgorithm = new RandomShuffle(); // Создаем экземпляр RandomShuffle
    }

    // public void shuffle(ShuffleAlgorithm algorithm) {
     //   algorithm.shuffle(this.cards);
   // }
}

