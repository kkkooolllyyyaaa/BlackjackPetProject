package org.blackjack.shuffle;

import org.blackjack.Card;

import java.util.List;

public class NoShuffle implements ShuffleAlgorithm {
    @Override
    public void shuffle(List<Card> deck) {
        // Не изменяет порядок карт
    }
}

