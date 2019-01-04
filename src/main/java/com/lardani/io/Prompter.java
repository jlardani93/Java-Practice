package com.lardani.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompter {
    /**
     * Takes in a prompt and returns the user's response
     * @param input A prompt to be asked to user
     * @return The user's response to prompt
     */
    public static String prompt(String input) {
        System.out.println(input);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
