package org.blackjack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Card {
    private final Suit suit;
    private final Rank rank;
}
