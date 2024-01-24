package org.blackjack;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlayingCard implements Card {
    private final Rank rank;
    private final Suit suit;

    @Override
    public int getValue() {
        return rank.getValue();
    }
}