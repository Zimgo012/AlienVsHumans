package main.game;

import main.characters.Aliens;
import main.characters.Characters;
import main.characters.Elarix;
import main.characters.Humans;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    static Scanner  scan = new Scanner(System.in);
    static Characters player;
    static int actNumber = 1;
    static boolean isRunning;

    int actnumber  = 1;

    //showCharacterStats
    public static void showCharacterDetails(Characters character){
        System.out.println(character.getName());
        System.out.println("Armor: " + character.getArmor());
        System.out.println("Health: "+ character.getHealth());
    }

    //
    public static void continueGame(){
        isRunning = true;
        System.out.println("Continuing Game");
    }

    //choose action
    //update player choice
    //throw exception
    public static void chooseAction(Characters attacker, Characters defender){

        if (attacker instanceof Humans){ //Player

            System.out.println("Choose Action: "
                    +"\n[1] Attack"
                    + "\n[2] useSkills");

            int option = scan.nextInt();

            switch (option){
                case 1:
                    attacker.attack(defender);
                    break;
                case 2:
                    attacker.useSkills();
                    break;
                default:
                    //ToDo: Throw exception here
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
//        String[] encounters = {"battle" , "dialog", "rest"};
//        int randomencounter = (int)(Math.random() * encounters.length);


        int randomValue = new Random().nextInt(100) + 1; //Generate a random value

        if (randomValue <= 0){ //80% probability
            Characters enemy = new Elarix();
            System.out.println("You encounter an alien: " + enemy.getName() );
            battleSystem(player,enemy);
        }
        else if (randomValue <= 100){ //15% probability
            System.out.println("Character is resting");
            Utilities.messageDelay(1000);
        }else if (randomValue <= 0){//15% probability
            System.out.println("uraaaa");
        }
    }

    //print menu
    public static void printMenu(){
        Utilities.clearConsole();
        System.out.println("Press [1] to see current character info.");
        System.out.println("Press [2] to see current Act.");
        System.out.println("Press [3] to exit the game.");
        System.out.println("Press [4] to continue.");

        int option = scan.nextInt();

        switch (option){
            case 1 -> showCharacterDetails(player);
            case 2 -> System.out.println("Act: " + actNumber);
            case 3 -> isRunning = false;
            case 4 -> continueGame();
            default -> printMenu();
        }
    }


    //MAIN Game Functions
    public static void startGame(){

        boolean start = true;

        Story.intro();
       player = Story.choosingHero(); // initialize new player

        isRunning = true;

        //Story Stucture
        while(isRunning){

            //Act1
            Story.actOneIntro();
            Story.actOneMissionOne();
            printMenu();
            if (!isRunning) break;


        }

        System.out.println("Thank you for playing the game.");



    }





}
