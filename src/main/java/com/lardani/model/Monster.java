package com.lardani.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Monster {
    private String name;
    private int health;
    private int mana;
    private int strength;

    /**
     * Copy constructor
     * @param other Object to copy from
     */
    public Monster(Monster other) {
        this.name = other.name;
        this.health = other.health;
        this.mana = other.mana;
        this.strength = other.strength;
    }
}
