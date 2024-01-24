package org.blackjack;
//декоратор
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CardDecorator implements Card {
    private Card decoratedCard;

    @Override
    public Rank getRank() {
        return decoratedCard.getRank();
    }

    @Override
    public Suit getSuit() {
        return decoratedCard.getSuit();
    }

    @Override
    public int getValue() {
        return decoratedCard.getValue();
    }
}

