package com.lardani.io.modelPrompts;

import com.lardani.model.Character;

import static com.lardani.io.Prompter.prompt;
import static com.lardani.services.CharacterStoreService.addCharacter;
import static com.lardani.services.ConsoleFormatter.NEW_LINE;

public class CharacterPrompts {
//    public static Character createCharacter() {
//        Character.CharacterBuilder builder = Character.builder();
//        getNamePrompt(builder);
//        getFactionPrompt(builder);
//        try {
//            Character character = builder.build();
//            System.out.println(NEW_LINE + "Here are the stats for your new character: " + character.toString());
//            addCharacter(character);
//            return character;
//        }
//        catch (RuntimeException e) {
//            System.out.println(e.toString());
//            return createCharacter();
//        }
//    }
//
//    private static void getNamePrompt(Character.Builder builder) {
//        builder.name(prompt(NEW_LINE + "What is your character's name?" + NEW_LINE));
//    }
//
//    private static void getFactionPrompt(Character.Builder builder) {
//        try {
//            builder.faction(Character.Faction.valueOf(
//                    prompt(NEW_LINE + "What is your faction? Mage, Warrior, or Archer?" + NEW_LINE).toUpperCase())
//            );
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println(e.toString());
//            getFactionPrompt(builder);
//        }
//    }
}
