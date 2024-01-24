package org.blackjack;
//фасад
import java.util.List;

public class BlackjackFacade {
    private BlackjackGame blackjackGame;

    public BlackjackFacade(List<Player> players, Dealer dealer, Bank bank) {
        this.blackjackGame = new StandardBlackjackGame(players, dealer, bank);
    }

    public void startGame() {
        blackjackGame.startGame();
    }

    public void endGame() {
        blackjackGame.endGame();
    }
}

