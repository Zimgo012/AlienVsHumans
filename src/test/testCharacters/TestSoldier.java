package test.testCharacters;

import main.characters.Characters;
import main.characters.Soldier;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

class TestSoldier{

    private static Characters characters;

    @BeforeAll
    static void setup(){
        System.out.println("Creating Soldier");
        characters = new Soldier("Ry");
    }


    @Test
    void testHealth() {
        System.out.println("Testing health");
        assertEquals(100, characters.getHealth());
        System.out.println("Test complete!");
    }

    @Test
    void testArmor(){
        System.out.println("Testing armor");
        assertEquals(1, characters.getArmor());
        System.out.println("Test complete!");
    }

    @Test
    void testUseSkills(){
        characters.useSkills();
    }



}
