package test.testCharacters;

import main.characters.Entity;
import main.characters.Humans;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class TestHumans {

    private static Entity entity1;

    @BeforeEach
    void setup(){
        System.out.println("Creating Human");
        entity1 = new Humans("Assasin",100,10,10,1);
    }


    @Test
    void testWearArmor(){
        System.out.println("== Testing Wear Armor  ==");
        entity1.setArmor(entity1.getArmor() + 2);
        assertEquals(12 ,entity1.getArmor());
        System.out.println("== Test succeed! ✅ ==");

    }

    @Test
    void testUserMedkit(){
        System.out.println("== Testing Use Medkit  ==");
        entity1.setHealth(entity1.getHealth() + 5);
        assertEquals(105, entity1.getHealth());
        System.out.println("== Test succeed! ✅ ==");
    }

    @Test
    void testLevelUp(){
        entity1.setHealth(entity1.getHealth() + 10);
        entity1.setDamage(entity1.getDamage() + 2);
        entity1.setXp(entity1.getXp() + 1);
        assertEquals(110, entity1.getHealth());
        System.out.println("== Test succeed! ✅ ==");
        assertEquals(12, entity1.getDamage());
        System.out.println("== Test succeed! ✅ ==");
        assertEquals(2, entity1.getXp());
        System.out.println("== Test succeed! ✅ ==");
    }

}
