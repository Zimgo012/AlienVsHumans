package main.game;

import main.characters.Characters;
import main.characters.Soldier;

import java.util.Scanner;

public class Story {
    static Scanner scan = new Scanner(System.in);

    //Use these flags later for act requirements
    static boolean flag1 = true;
    static boolean flag2 = true;
    static boolean flag3 = true;

    //intro
    public static void intro(){
        System.out.println("In the year 2147, Earth has reached a pinnacle of technological advancement and space exploration. " +
                "\nHumanity has established colonies on Mars and several moons of Jupiter. " +
                "\nHowever, their presence in the cosmos has not gone unnoticed. " +
                "\nA highly advanced alien species, the Zepharans, " +
                "\nhave been monitoring Earth's progress and view humanity as a threat to their dominance in the galaxy.");

    }

    //Hero Selection
    public static Characters choosingHero (){
        Utilities.messageDelay(4000);
        Utilities.clearConsole();
        System.out.println("Welcome to the frontline of the interstellar war! " +
                "\nBefore you dive into the battle between humans and aliens, you must choose your warrior.");

        Utilities.messageDelay(3000);
        Utilities.clearConsole();
        System.out.println("====================");
        System.out.println("[1] Human Soldier");
        System.out.println("====================");

        System.out.println(
                "Description: Equipped with advanced military training and high-tech weaponry, the Human Soldier is a balanced fighter, skilled in both offense and defense. \n" +
                "Base Health: 90\n" +
                "Base Damage: 5\n" +
                "Base Armor: 1");
        System.out.println();

        Utilities.messageDelay(4000);
        Utilities.clearConsole();
        System.out.println("====================");
        System.out.println("Press [1] for Soldier");

        int option = scan.nextInt();

        if (option == 1){
            return soldierSelected();
        } else{
            return null;
        }
    }
    public static Characters soldierSelected(){
        Utilities.clearConsole();
        System.out.println("You have chosen to be a Soldier. Prepare yourself for the epic clash between species, and may victory be yours!" +
                "\nBut before that, can you let us know your name?");

        scan.nextLine();
        System.out.println("Enter your name:");

        String name = scan.nextLine();

        Characters player = new Soldier(name);

        System.out.println("Welcome " + name + "!");
        Utilities.messageDelay(2000);
        Utilities.clearConsole();
        return player;



    }

    //actOne
    public static void actOneIntro(){

        Utilities.messageDelay(1000);
        System.out.println("The game begins with the sudden appearance of Zepharan motherships in Earth's orbit. " +
                "\nThe Zepharans launch a coordinated attack on major cities, disabling communication networks, power grids, and military defenses. " +
                "\n");





    }
    public static void actOneMissionOne(){
        Utilities.messageDelay(2000);
        Utilities.clearConsole();
        System.out.println("=======================");
        System.out.println("=====  Mission 1  =====");
        System.out.println("=======================");

        Utilities.messageDelay(2000);
        Utilities.clearConsole();
        System.out.println("Objective: Defend Apex Grove City from initial Zepharan Assult");

        System.out.println("Captain Serge: Hold up! I see an alien scout patrol up ahead. Get ready for a fight!");
        GameLogic.randomEncounters(95,80,100);
        System.out.println("Captain Serge: Good job, soldier.");

        Utilities.messageDelay(3000);
        System.out.println("Captain Serge: Look out! An alien is charging at us. Take it down!");
        GameLogic.randomEncounters(98,99,100);
        System.out.println("Captain Serge: Nice work. That alien won't be bothering us anymore.");

        Utilities.messageDelay(3000);
        System.out.println("Captain Serge: Heads up! An alien drone is circling overhead.");
        GameLogic.randomEncounters(98,99,100);
        System.out.println("Captain Serge: Great!. That drone is scrap metal now.");

        Utilities.messageDelay(3000);
        System.out.println("Captain Serge: Incoming! An alien form above. We need to take it out, fast");
        GameLogic.randomEncounters(98,99,100);
        System.out.println("Captain Serge: Well done, soldier. That heavy was a tough one.");

//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();

        //Save Load State

    }
    public static void actOneMissionTwo(){

//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
//        GameLogic.randomEncounters();
    }
    public static void actOneOutro(){

        Utilities.messageDelay(1000);
        System.out.println("");

    }

    //actTwo
    public static void actTwoIntro(){}
    public static void actTwoMissionOne(){}
    public static void actTwoMissionTwo(){}
    public static void actTwoOutro(){}

    //actThree
    public static void actThreeIntro(){}
    public static void actThreeMissionOne(){}
    public static void actThreeMissionTwo(){}
    public static void actThreeOutro(){}

    //Final
    public static void finalIntro(){}
    public static void finalBoss(){}
    public static void finalOutro(){}

    //random encounters
    public static void encounters(){}
}
