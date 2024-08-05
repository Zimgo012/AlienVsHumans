//package test.testCharacters;
//
//import org.zimgo.aliensvshumans.characters.Characters;
//import org.zimgo.aliensvshumans.characters.Soldier;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.testng.Assert.assertNotEquals;
//
//class TestCharacters{
//
//    private static Characters characters1;
//    private static Characters characters2;
//
//    @BeforeEach
//     void setup(){
//        System.out.println("Creating Soldier");
//        characters1 = new Soldier("Ry");
//        characters2 = new Soldier("JC");
//    }
//
//
//    @Test
//    void testAttack(){
//        System.out.println("== Testing Attack ✅ ==");
//        characters1.attack(characters2);
//        assertNotEquals(100, characters2.getHealth());
//    }
//
//    @Test
//    void testTakeDamage(){
//        System.out.println("== Testing Taking Damage ✅ ==");
//        characters1.getDamage();
//        assertNotEquals(100, characters1);
//    }
//
//
//}
