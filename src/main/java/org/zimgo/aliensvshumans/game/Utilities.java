package org.zimgo.aliensvshumans.game;

public class Utilities {

    //Clears the console virtually
    public static void clearConsole(){

        for (int i = 0; i < 100 ; i++) {
            System.out.println();
        }
    }

    public static void messageDelay(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //print a separator
    public static String separator(){
        return "==========================";
    }
}
