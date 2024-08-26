package org.zimgo.aliensvshumans.game;

import org.zimgo.aliensvshumans.characters.Assasin;
import org.zimgo.aliensvshumans.characters.Soldier;

import java.util.*;

public class Story {
    static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> storyline = new ArrayList<>(List.of
            (actOneIntro(), actOneMissionOneTitle(), actOneM1D1(), actOneM1D2(), actOneM1D3(), actOneM1D4(),
            actOneMissionTwo(), actOneM2D1()
                                                ));


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


    }
    public static String actOneM1D1(){
        return "Objective: Defend Apex Grove City from initial Zepharan Assult" +
                "\nCaptain Serge: Hold up! I see an alien scout patrol up ahead. Get ready for a fight!";
    }
    public static String actOneM1D2(){
        return "Captain Serge and the player are advancing towards the military base, " +
                "but the path is fraught with alien resistance." +
                "As they approach a critical junction, they encounter a random alien threat.";
    }
    public static String actOneM1D3(){
        return "Watch your step! We’ve got an alien ambush up ahead. They’re trying to block our advance. Get ready!";
    }
    public static String actOneM1D4(){
        return "Captain Serge: Good job, soldier.";
    }

    public static String actOneMissionTwo(){
        return "Captain Serge and the player are advancing towards the military base, " +
                "but the path is fraught with alien resistance." +
                "As they approach a critical junction, they encounter a random alien threat.";
    }
    public static String  actOneM2D1(){
       return "Watch your step! We’ve got an alien ambush up ahead. They’re trying to block our advance. Get ready!";

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
