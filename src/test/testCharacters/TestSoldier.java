package test.testCharacters;

import main.characters.Entity;
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

    private static Entity entity;

    @BeforeAll
    static void setup(){
        System.out.println("Creating Soldier");
        entity = new Soldier();
    }


    @Test
    void testHealth() {
        System.out.println("Testing health");
        assertEquals(100,entity.getHealth());
        System.out.println("Test complete!");
    }

    @Test
    void testArmor(){
        System.out.println("Testing armor");
        assertEquals(1,entity.getArmor());
        System.out.println("Test complete!");
    }



}
