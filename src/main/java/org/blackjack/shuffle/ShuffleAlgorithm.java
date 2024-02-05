package org.blackjack.shuffle;

import org.blackjack.Card;

import java.util.List;

public interface ShuffleAlgorithm {
    void shuffle(List<Card> deck);
}
