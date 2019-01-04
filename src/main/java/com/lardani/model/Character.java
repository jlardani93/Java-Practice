package com.lardani.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Objects;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
@Builder
public class Character {
    @NonNull
    private String name;
    @NonNull
    private Faction faction;
    private int health;
    private int mana;


    public enum Faction {
        MAGE, WARRIOR, ARCHER
    }

    public Character(String name, Faction faction) {

        this.name = name;
        this.faction = faction;

        if (faction == Faction.MAGE) {
            this.mana = 10;
            this.health = 5;
        } else if (faction == Faction.WARRIOR) {
            this.mana = 5;
            this.health = 10;
        } else {
            this.mana = 7;
            this.health = 7;
        }
    }
}


