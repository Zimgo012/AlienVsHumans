package main.game;

import main.characters.Entity;
import main.characters.Soldier;

public class GameOptions {

    public static void intro (){
        System.out.println();
    }

    public  void start(){
        Entity soldier = new Soldier();

        System.out.println(soldier.getName());
    }
}
