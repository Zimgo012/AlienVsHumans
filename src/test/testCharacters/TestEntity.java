package test.testCharacters;

import main.characters.Entity;
import main.characters.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;

class TestEntity {

    private static Entity entity1;
    private static Entity entity2;

    @BeforeEach
     void setup(){
        System.out.println("Creating Soldier");
        entity1 = new Soldier();
        entity2 = new Soldier();
    }


    @Test
    void testAttack(){
        System.out.println("== Testing Attack ✅ ==");
        entity1.attack(entity2);
        assertNotEquals(100,entity2.getHealth());
    }

    @Test
    void testTakeDamage(){
        System.out.println("== Testing Taking Damage ✅ ==");
        entity1.getDamage();
        assertNotEquals(100,entity1);
    }


}
