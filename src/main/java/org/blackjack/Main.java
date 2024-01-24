package org.blackjack;

public class Main {
    public static void main(String[] args) {
        // Создание банка для управления счетами
        Bank bank = new Bank();

        // Создание игры в Блэкджек
        BlackjackGame game = new BlackjackGame();

        // Создание игроков
        BlackjackPlayer player1 = new BlackjackPlayer("Alice");
        BlackjackPlayer player2 = new BlackjackPlayer("Bob");

        // Регистрация игроков в банке и добавление их в игру
        bank.registerPlayer(player1);
        bank.registerPlayer(player2);
        game.joinPlayer(player1);
        game.joinPlayer(player2);

        // Игроки делают ставки
        player1.placeBet(100); // Игрок Alice ставит 100
        player2.placeBet(200); // Игрок Bob ставит 200

        // Начало игры
        game.startGame();

        // Здесь можно добавить логику для управления ходом игры, например:
        // - игроки решают, будут ли они брать еще карты
        // - определение победителя
        // - расчет выигрышей и проигрышей

        // Пример вывода состояния игры (можно расширить)
        System.out.println("Игра началась. Удачи!");
    }
}

