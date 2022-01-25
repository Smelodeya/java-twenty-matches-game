package com.company.service;

public class GameMessagesService {
    void startMessage(){
        System.out.println("Игра началась!");
    }

    void whoseTurnMessage(String currentPlayer) {
        System.out.println("Ходит " + currentPlayer);
    }

    void turnMessage(String currentPlayer, int numberOfMatches, int takenMatches) {
        if (takenMatches == 1) {
            System.out.println(currentPlayer + " взял " + takenMatches + " спичку. Остаток спичек на столе равен: " + numberOfMatches);
        } else {
            System.out.println(currentPlayer + " взял " + takenMatches + " спички. Остаток спичек на столе равен: " + numberOfMatches);
        }
    }

    void selectUserMessage() {
        System.out.print("Можно взять от 1 до 3 спичек. Сколько спичек хотите взять? ");
    }

    void endMessage(String currentPlayer) {
        System.out.println("На столе осталась 1 спичка. Победитель " + currentPlayer);
    }

    void incorrectUsersInputMessage() {
        System.out.print("Некорректный ввод. Введите число от 1 до 3!");
    }
}
