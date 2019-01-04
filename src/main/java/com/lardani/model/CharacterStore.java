package com.lardani.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterStore {
    private static CharacterStore instance;

    private List<Character> characters = new ArrayList<>();

    public static CharacterStore getCharacterStore() {
        if (instance == null) {
            instance = new CharacterStore();
        }
        return instance;
    }

    public void addCharacter(Character character) {
        instance.characters.add(character);
    }

    public void printCharacters() {
        System.out.println(Arrays.toString(instance.characters.toArray()));
    }
}
