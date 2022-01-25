package com.company.service;

import java.util.Scanner;

public class PlayerService {
    GameMessagesService gameMessagesService = new GameMessagesService();

    public int computerTurn(int numberOfMatches) {
        int takenMatches;

        if (numberOfMatches >= 4) {
            if ((numberOfMatches % 4) == 0) {
                takenMatches = 3;
            } else {
                takenMatches = (numberOfMatches % 4) - 1;
            }
        } else {
            takenMatches = numberOfMatches - 1;
        }
        return takenMatches;
    }

    public int userTurn (int numberOfMatches) {
        Scanner scanner = new Scanner(System.in);
        int takenMatches = 0;
        while (takenMatches == 0) {
            if (scanner.hasNextInt()) {
                takenMatches = scanner.nextInt();
                while ((takenMatches > 3) || (takenMatches < 1)) {
                    gameMessagesService.incorrectUsersInputMessage();
                    takenMatches = scanner.nextInt();
                }
            } else {
                gameMessagesService.incorrectUsersInputMessage();
            }
        }
        return takenMatches;
    }
}
