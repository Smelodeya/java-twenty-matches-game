package com.company;

import com.company.service.GameService;

public class Main {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.playGame();
    }
}
