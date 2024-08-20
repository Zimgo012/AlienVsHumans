package org.zimgo.aliensvshumans.game;

import org.zimgo.aliensvshumans.characters.Assasin;
import org.zimgo.aliensvshumans.characters.Soldier;
import org.zimgo.aliensvshumans.characters.Characters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Story {
    static Scanner scan = new Scanner(System.in);

    //Use these flags later for act requirements
    static boolean flag1 = true;
    static boolean flag2 = true;
    static boolean flag3 = true;

    //intro
    public static String intro(){

        String message = "In the year 2147, Earth has reached a pinnacle of technological advancement and space exploration. " +
                "\nHumanity has established colonies on Mars and several moons of Jupiter. " +
                "\nHowever, their presence in the cosmos has not gone unnoticed. " +
                "\nA highly advanced alien species, the Zepharans, " +
                "\nhave been monitoring Earth's progress and view humanity as a threat to their dominance in the galaxy.";

        return message;


    }

    //Pre-Hero Selection Dialog
    public static String intro2(){
        return  "Welcome to the frontline of the interstellar war! " +
                "\nBefore you dive into the battle between humans and aliens, you must choose your warrior.";
    }

    //Hero Selection

    //Hero Start Information
    public static String soldierInfo(){

        StringBuilder builder = new StringBuilder();

        builder.append("================");
        builder.append("\n" + new Soldier().getName());
        builder.append("\n================");
        builder.append("\nBase Health : " + new Soldier().getHealth());
        builder.append("\nBase Damage: " + new Soldier().getDamage());
        builder.append("\nBase Armor: " + new Soldier().getArmor());

        return builder.toString();

    }
    public static String assassinInfo(){

        StringBuilder builder = new StringBuilder();

        builder.append("================");
        builder.append("\n" + new Assasin().getName());
        builder.append("\n================");
        builder.append("\nBase Health : " + new Assasin().getHealth());
        builder.append("\nBase Damage: " + new Assasin().getDamage());
        builder.append("\nBase Armor: " + new Assasin().getArmor());

        return builder.toString();

    }


    //Dialogs

    //actOne
    public static String actOneIntro(){

       return "The game begins with the sudden appearance of Zepharan motherships in Earth's orbit. " +
                "\nThe Zepharans launch a coordinated attack on major cities, disabling communication networks, power grids, and military defenses. " +
                "\n";
    }
    public static String actOneMissionOneTitle(){
        return "=======================" + "\n=====  Mission 1  =====" + "\n=======================";

//        System.out.println("Objective: Defend Apex Grove City from initial Zepharan Assult");
//
//        System.out.println("Captain Serge: Hold up! I see an alien scout patrol up ahead. Get ready for a fight!");
//        GameLogic.randomEncounters(100,0,0);
//        System.out.println("Captain Serge: Good job, soldier.");
//
//        Utilities.messageDelay(3000);
//        System.out.println("Captain Serge: Look out! An alien is charging at us. Take it down!");
//        GameLogic.randomEncounters(100,0,0);
//        System.out.println("Captain Serge: Nice work. That alien won't be bothering us anymore.");
//
//        Utilities.messageDelay(3000);
//        System.out.println("Captain Serge: Heads up! An alien drone is circling overhead.");
//        GameLogic.randomEncounters(100,0,0);
//        System.out.println("Captain Serge: Great!. That drone is scrap metal now.");
//
//        Utilities.messageDelay(3000);
//        System.out.println("Captain Serge: Incoming! An alien form above. We need to take it out, fast");
//        GameLogic.randomEncounters(100,0,0);
//        System.out.println("Captain Serge: Well done, soldier. That heavy was a tough one.");
//        Utilities.messageDelay(1000);
//        System.out.println("Captain Serge: Now lets advance to the military base");

        //add more
        //Save Load State

    }
    public static String actOneDialog1(){
        return "Objective: Defend Apex Grove City from initial Zepharan Assult" +
                "\nCaptain Serge: Hold up! I see an alien scout patrol up ahead. Get ready for a fight!";
    }
    public static void actOneMissionTwo(){

        Utilities.messageDelay(2000);
        Utilities.clearConsole();
        System.out.println("Captain Serge and the player are advancing towards the military base, " +
                "but the path is fraught with alien resistance." +
                "As they approach a critical junction, they encounter a random alien threat.");

        Utilities.messageDelay(3000);
        System.out.println("Watch your step! We’ve got an alien ambush up ahead. They’re trying to block our advance. Get ready!");
        GameLogic.randomEncounters(100,0,0);
        System.out.println("Captain Serge: Good job, soldier.");

        Utilities.messageDelay(3000);
        System.out.println("Hold on! We’ve got an alien saboteur planting explosives around our route. We need to stop them before they destroy our path!");
        GameLogic.randomEncounters(100,0,0);
        System.out.println("Captain Serge: Well done.");

        Utilities.messageDelay(3000);
        System.out.println("Incoming! Alien reinforcements are dropping in from the skies. We need to secure the area before they overwhelm us!");
        GameLogic.randomEncounters(100,0,0);
        System.out.println("Captain Serge: URAAAAA!");

        Utilities.messageDelay(3000);
        System.out.println("Look out! An alien scout is leading a drone pair. The scout’s calling the shots, and the drones will provide cover. Take them down!");
        GameLogic.randomEncounters(100,0,0);
        System.out.println("Captain Serge: Well done!");

        Utilities.messageDelay(3000);
        System.out.println("Alert! An alien reconnaissance unit is gathering intel on our movements. " +
                            "We need to eliminate them before they relay our position!");
        GameLogic.randomEncounters(100,0,0);
        System.out.println("Captain Serge: Excellent job with the reconnaissance unit. " +
                        "Our movements won’t be compromised anymore. We’re almost there.");


    }
    public static void actOneOutro(){

        Utilities.messageDelay(3000);
        Utilities.clearConsole();
        System.out.println("We’ve made significant progress, soldier. The battles have been fierce, " +
                "but we’ve managed to push back the alien forces from key positions. " +
                "However, our fight is far from over. The Zepharans are regrouping and preparing their next move. " +
                "We need to stay vigilant.");
        Utilities.clearConsole();
        System.out.println("Act1 Ended....");
        Utilities.messageDelay(2000);
        System.out.println("Game to be continued stay tune..");

    }

    //actTwo
    public static void actTwoIntro(){}
    public static void actTwoMissionOne(){}
    public static void actTwoMissionTwo(){}
    public static void actTwoOutro(){}


    //random encounters
    public static void encounters(){}
}
