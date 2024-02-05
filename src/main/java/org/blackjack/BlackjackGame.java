package org.blackjack;

import java.util.List;

import java.util.ArrayList;

public class BlackjackGame implements Game {
    private Dealer dealer;
    private List<BlackjackPlayer> players;
    private Deck deck;

    public BlackjackGame() {
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.players = new ArrayList<>();
    }

    @Override
    public void startGame() {
        // Инициализация и запуск игры в Блэкджек
    }
    @Override
    public void joinPlayer(BlackjackPlayer player) {
        players.add(player);
    }

    // Специфические для Блэкджека методы, например, подсчет очков, проверка условий выигрыша и проигрыша
}

