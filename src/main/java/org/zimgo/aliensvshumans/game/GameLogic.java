package org.zimgo.aliensvshumans.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import org.zimgo.aliensvshumans.Controllers.*;
import org.zimgo.aliensvshumans.characters.Characters;
import org.zimgo.aliensvshumans.characters.Elarix;
import java.util.concurrent.atomic.AtomicBoolean;

public class GameLogic {

    static Characters player;
    static Characters opponent;

    int actnumber  = 1;

    //Setter And Getter for characters

    public static void setPlayer(Characters player) {
        GameLogic.player = player;
    }

    public static Characters getPlayer() {
        return player;
    }

    public static Characters getOpponent() {
        return opponent;
    }

    public static void setOpponent(Characters opponent) {
        GameLogic.opponent = opponent;
    }

    //showCharacterStats

    public static String showCharacterDetails(Characters character){

        return "Name: " + character.getName()
                + "\nArmor: " + character.getArmor()
                +"\nHealth: "+ character.getHealth() +
                "\nDamage: "+ character.getDamage();
    }

    //MAIN Game Functions

    public static void startGame(InGameController inGameController){


        inGameController.setDialog(Story.storyline.get(0));

    }

    public static void inFight(InFightController inFightController, Timeline timeline){

        opponent = new Elarix(); // new alien object
        AtomicBoolean someOneDied = new AtomicBoolean(false);

        // Initial display of status
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), e -> {
            inFightController.setDialog(Utilities.separator() + "\n" + showCharacterDetails(player)
                    + "\n" + Utilities.separator() + "\n" + showCharacterDetails(opponent));
        }));

        // Pause for player's action
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(5), e -> {
            // Enable the attack button to allow the player to choose an action
            inFightController.enableAttackButton(); // Assuming you have a method to enable the button
//            timeline.stop();
        }));

        // After the player acts, continue with the opponent's turn
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(7), e -> {
            opponent.attack(player);
            inFightController.setDialog("You took " + opponent.getDamage() + " damage");

            // Check if the player or opponent has died
            if (player.getHealth() <= 0) {
                inFightController.setDialog("You have been defeated!");
                someOneDied.set(true);
            } else if (opponent.getHealth() <= 0) {
                inFightController.setDialog("You defeated the alien!");
                someOneDied.set(true);
                inFightController.hideExitButton();
            }

            // If no one died, repeat the cycle
            if (!someOneDied.get()) {
                inFightController.disableAttackButton(); // Disable the button to prevent premature clicks
                timeline.playFromStart(); // Restart the timeline for the next round

//                timeline.play();
            }
        }));

        timeline.play();

    }







}
