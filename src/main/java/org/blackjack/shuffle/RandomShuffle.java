package org.blackjack.shuffle;

import org.blackjack.Card;

import java.util.Collections;
import java.util.List;

public class RandomShuffle implements ShuffleAlgorithm {
    @Override
    public void shuffle(List<Card> deck) {
        Collections.shuffle(deck);
    }
}

