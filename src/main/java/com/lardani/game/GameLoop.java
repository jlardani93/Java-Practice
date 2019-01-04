package com.lardani.game;

import com.lardani.io.gameFlowPrompts.MainMenuPrompts;

public class GameLoop {
    public static void loop() {
        com.lardani.game.MainMenu.execute();
        loop();
    }
}
