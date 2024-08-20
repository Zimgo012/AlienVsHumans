package org.zimgo.aliensvshumans.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import org.zimgo.aliensvshumans.Controllers.InGameController;
import org.zimgo.aliensvshumans.characters.Characters;
import org.zimgo.aliensvshumans.characters.Elarix;
import org.zimgo.aliensvshumans.characters.Humans;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    static Scanner  scan = new Scanner(System.in);

    static Characters player;

    static int actNumber = 1;
    static boolean isRunning;
    int actnumber  = 1;

    public static void setPlayer(Characters player) {
        GameLogic.player = player;
    }

    public static Characters getPlayer() {
        return player;
    }

    //showCharacterStats

    public static String showCharacterDetails(Characters character){

        return "Name: " + character.getName()
                + "\nArmor: " + character.getArmor()
                +"\nHealth: "+ character.getHealth() +
                "\nDamage: "+ character.getDamage();
    }

    //Continues the game
    public static void continueGame(){
        isRunning = true;
        System.out.println("Continuing Game");
    }

   //Character Actions
    public static void chooseAction(Characters attacker, Characters defender){

        try{
            if (attacker instanceof Humans){ //Player

                System.out.println("Choose Action: "
                        +"\n[1] Attack");

                int option = scan.nextInt();

                switch (option){
                    case 1:
                        attacker.attack(defender);
                        break;
                    default:
                        throw new GameExceptions("Please enter 1 only");

                }
                scan.nextLine();

            } else if(attacker instanceof Elarix){ //Elarix

                int option = (int)(Math.random() * 1) + 1;

                switch (option){
                    case 1:
                        attacker.attack(defender);
                        break;
                }

            }


        } catch (GameExceptions e){
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException f){
            System.err.println("Error: Please enter numbers only.");
        }


    }


    //battleSystem
    public static void battleSystem(Characters player, Characters alien) {


        //ToDo: random numbers from 1 - 2 can be implemented here to so each turn can be randomize

        boolean someOneDied = false;
        while (!someOneDied) {

            // Display character details
            Utilities.messageDelay(2000);
            System.out.println("======== Status =======");
            showCharacterDetails(player);
            System.out.println("=======================");
            showCharacterDetails(alien);
            System.out.println("=======================");


            // Player's turn
            System.out.println();
            System.out.println("Player turn! Choose an action");
            chooseAction(player, alien);

            // Update health after player's action
            if (alien.getHealth() <= 0) {
                System.out.println("The alien is dead!");
                //level up the player here
                someOneDied = true;
                break;
            }

            // Enemy's turn
            System.out.println();
            System.out.println("Enemy turn!");
            chooseAction(alien, player);

            // Update health after alien's action
            if (player.getHealth() <= 0) {
                System.out.println("You're dead!");
                someOneDied = true;
                break;
            }
        }

        player.levelUp();

    }

    //randomEncounters

    /**
     *
     * @param prob1 Battle Probability
     * @param prob2 Rest Probability
     * @param prob3 Random
     */
    public static void randomEncounters(int prob1, int prob2, int prob3){



        int randomValue = new Random().nextInt(100) + 1; //Generate a random value

        if (randomValue <= prob1){ //80% probability
            Characters enemy = new Elarix();
            System.out.println("You encounter an alien: " + enemy.getName() );
            battleSystem(player,enemy);
        }
        else if (randomValue <= prob2){ //15% probability
            System.out.println("Character is resting");
            Utilities.messageDelay(1000);
        }else if (randomValue <= prob3){//15% probabilityq
            System.out.println("uraaaa");
        }
    }


    //print menu
    //TODO transform this to UI
    public static void printMenu(){
        Utilities.clearConsole();
        while(true){
        System.out.println("Press [1] to see current character info.");
        System.out.println("Press [2] to see current Act.");
        System.out.println("Press [3] to exit the game.");
        System.out.println("Press [4] to continue.");

        int option = scan.nextInt();




        try{

            switch (option){
                case 1 -> showCharacterDetails(player);
                case 2 -> System.out.println("Act: " + actNumber);
                case 3 -> {
                    isRunning = false;
                    return;
                }
                case 4 -> {
                    continueGame();
                    return;
                }
                default -> throw new GameExceptions("Only enter 1,2,3, or 4.");
            }

        }catch (GameExceptions e){
            System.err.println("Error: " + e.getMessage());
        }catch (InputMismatchException f){
            System.err.println("Error: Please enter numbers only.");
        }

        }

    }


    //MAIN Game Functions
    public static void startGame(InGameController inGameController, Timeline timeline){

        // Add each encounter or event as a KeyFrame in the timeline
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), e -> {
            inGameController.setDialog(Story.actOneIntro());
        }));

        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(3), e -> {
            inGameController.setDialog(Story.actOneDialog1());
            inGameController.showButtons();
        }));

        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(5), e -> {

        }));


        // Start the timeline
        timeline.play();

    }





}
