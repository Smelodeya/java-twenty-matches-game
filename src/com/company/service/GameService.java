package com.company.service;

import com.company.entity.Player;

public class GameService {
    Player computer = new Player("Компьютер");
    Player user = new Player("Пользователь");
    PlayerService playerService = new PlayerService();
    GameMessagesService gameMessagesService = new GameMessagesService();

    public String changePlayer(String currentPlayer) {
        String nextPlayer;
        if (currentPlayer.equals(computer.getName())) {
            nextPlayer = user.getName();
        } else {
            nextPlayer = computer.getName();
        }
        return nextPlayer;
    }

    public void playGame() {
        int numberOfMatches = 20;
        int takenMatches;
        String currentPlayer = computer.getName();
        while (numberOfMatches > 1){
            if (numberOfMatches == 20) {
                gameMessagesService.startMessage();
                gameMessagesService.whoseTurnMessage(currentPlayer);
                takenMatches = playerService.computerTurn(numberOfMatches);
                numberOfMatches = numberOfMatches - takenMatches;
                gameMessagesService.turnMessage(currentPlayer, numberOfMatches, takenMatches);
                currentPlayer = changePlayer(currentPlayer);
            } else {
                if (currentPlayer.equals(user.getName())) {
                    gameMessagesService.whoseTurnMessage(currentPlayer);
                    gameMessagesService.selectUserMessage();
                    takenMatches = playerService.userTurn(numberOfMatches);
                    numberOfMatches = numberOfMatches - takenMatches;
                } else {
                    gameMessagesService.whoseTurnMessage(currentPlayer);
                    takenMatches = playerService.computerTurn(numberOfMatches);
                    numberOfMatches = numberOfMatches - takenMatches;
                }
                gameMessagesService.turnMessage(currentPlayer, numberOfMatches, takenMatches);
                currentPlayer = changePlayer(currentPlayer);
            }
            if (numberOfMatches == 1) {
                currentPlayer = changePlayer(currentPlayer);
                gameMessagesService.endMessage(currentPlayer);
            }
        }
    }
}
