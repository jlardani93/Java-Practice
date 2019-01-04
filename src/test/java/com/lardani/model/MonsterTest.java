package com.lardani.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonsterTest {

    @Test
    public void verifyCopyConstructor() {
        Monster monster = Monster.builder()
                .health(10)
                .mana(10)
                .name("monster")
                .strength(10)
                .build();
        Monster monster2 = new Monster(monster);
        assertEquals(monster, monster2);
    }

}