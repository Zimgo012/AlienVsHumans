//package test.testCharacters;
//
//import org.zimgo.aliensvshumans.characters.Characters;
//import org.zimgo.aliensvshumans.characters.Humans;
//import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.Test;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//
//class TestHumans {
//
//    private static Characters characters1;
//
//    @BeforeEach
//    void setup(){
//        System.out.println("Creating Human");
//        characters1 = new Humans("Assasin",100,10,10,1);
//    }
//
//
//    @Test
//    void testWearArmor(){
//        System.out.println("== Testing Wear Armor  ==");
//        characters1.setArmor(characters1.getArmor() + 2);
//        assertEquals(12 , characters1.getArmor());
//        System.out.println("== Test succeed! ✅ ==");
//
//    }
//
//    @Test
//    void testUserMedkit(){
//        System.out.println("== Testing Use Medkit  ==");
//        characters1.setHealth(characters1.getHealth() + 5);
//        assertEquals(105, characters1.getHealth());
//        System.out.println("== Test succeed! ✅ ==");
//    }
//
//    @Test
//    void testLevelUp(){
//        characters1.setHealth(characters1.getHealth() + 10);
//        characters1.setDamage(characters1.getDamage() + 2);
//        characters1.setXp(characters1.getXp() + 1);
//        assertEquals(110, characters1.getHealth());
//        System.out.println("== Test succeed! ✅ ==");
//        assertEquals(12, characters1.getDamage());
//        System.out.println("== Test succeed! ✅ ==");
//        assertEquals(2, characters1.getXp());
//        System.out.println("== Test succeed! ✅ ==");
//    }
//
//}
