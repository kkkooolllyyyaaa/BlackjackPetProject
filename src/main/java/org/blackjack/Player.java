package org.blackjack;

public interface Player {
    void joinGame(BlackjackGame game);
    void placeBet(int amount);
    void playTurn();
    void receiveCard(Card card);
    int getScore();
    void receiveWinnings(int amount);
}
