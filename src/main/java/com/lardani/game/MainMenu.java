package com.lardani.game;

import com.lardani.io.gameFlowPrompts.MainMenuPrompts;

import static com.lardani.io.gameFlowPrompts.MainMenuPrompts.mainMenuPrompt;
import static com.lardani.services.CharacterStoreService.printCharacters;
import static com.lardani.services.ConsoleFormatter.NEW_LINE;

public class MainMenu {

    static void execute() {
        makeChoice(MainMenuPrompts.mainMenuPrompt());
    }

    static void makeChoice(String input) {
//        switch(input) {
//            case "1":
//                printCharacters();
//                break;
//            case "2":
//                createCharacter();
//                break;
//            default:
//                System.out.println(NEW_LINE + '"' + input + '"' + " is not a valid option.");
//                mainMenuPrompt();
//                break;
//        }
    }
}
