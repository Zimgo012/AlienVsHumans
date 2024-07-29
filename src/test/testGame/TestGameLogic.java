package test.testGame;

import main.characters.Characters;
import main.characters.Elarix;
import main.characters.Humans;
import main.characters.Soldier;
import main.game.GameLogic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;

class TestGameLogic{
    Characters char1 = new Soldier("Ry");
    Characters char2 = new Elarix();

    @Test
    void testShowCharDetails(){
        GameLogic.showCharacterDetails(char1);
        GameLogic.showCharacterDetails(char2);
    }

    @Test
    void testBattleSystem(){
        GameLogic.battleSystem(char1,char2);
    }


}
