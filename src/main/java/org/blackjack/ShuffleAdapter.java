package org.blackjack;

import java.util.List;

//адаптер
public class ShuffleAdapter implements ShuffleAlgorithm {
    private final CardShuffler cardShuffler;

    public ShuffleAdapter(CardShuffler cardShuffler) {
        this.cardShuffler = cardShuffler;
    }

    @Override
    public void shuffle(List<Card> cards) {
        cardShuffler.shuffle(cards);
    }
}
