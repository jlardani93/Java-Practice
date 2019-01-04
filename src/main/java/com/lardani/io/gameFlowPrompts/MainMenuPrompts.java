package com.lardani.io.gameFlowPrompts;

import static com.lardani.io.Prompter.prompt;
import static com.lardani.services.ConsoleFormatter.NEW_LINE;

public class MainMenuPrompts {
    public static String mainMenuPrompt() {

        return prompt(NEW_LINE + "Welcome! What would you like to do?" + NEW_LINE +
                "[1] View existing characters" + NEW_LINE +
                "[2] Create a new character" + NEW_LINE
        );
    }
}
