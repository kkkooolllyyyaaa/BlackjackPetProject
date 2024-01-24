package org.blackjack;
//паттерн заместитель
public class BlackjackProxyCard implements Card {
    private Card realCard;

    public BlackjackProxyCard(Card realCard) {
        this.realCard = realCard;
    }

    @Override
    public Rank getRank() {
        return realCard.getRank();
    }

    @Override
    public Suit getSuit() {
        return realCard.getSuit();
    }

    @Override
    public int getValue() {
        int value = realCard.getValue();
        if (value == 11) {  // Заместитель для проверки на ACE
            // Реализация проверки на буст
            // ...
        }
        return value;
    }
}

