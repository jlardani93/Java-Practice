package com.lardani.services;

import com.lardani.model.Character;
import com.lardani.model.CharacterStore;

public class CharacterStoreService {
    public static void addCharacter(Character character) {
        CharacterStore characterStore = CharacterStore.getCharacterStore();
        characterStore.addCharacter(character);
    }

    public static void printCharacters() {
        CharacterStore characterStore = CharacterStore.getCharacterStore();
        characterStore.printCharacters();
    }
}
