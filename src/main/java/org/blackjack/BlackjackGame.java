package org.blackjack;


import java.util.List;

public abstract class BlackjackGame {
    protected List<Player> players;
    protected Dealer dealer;
    protected Bank bank;

    public BlackjackGame(List<Player> players, Dealer dealer, Bank bank) {
        this.players = players;
        this.dealer = dealer;
        this.bank = bank;
    }

    public abstract void startGame();

    public abstract void endGame();

    protected abstract void compareScores(Player player, int dealerScore);

    protected abstract void payWinnings(Player player, int amount);
}

