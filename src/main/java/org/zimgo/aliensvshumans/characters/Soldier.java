package org.zimgo.aliensvshumans.characters;

import java.util.Scanner;

public class Soldier  extends  Humans{
    Scanner scan;
    String[] skills = {"Gunglaze", "Medkit"};

    public Soldier() {
        super("Soldier", 90, 1, 5, 0);
        scan = new Scanner(System.in);
    }

    //Getters and Setters
    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

//    @Override
//    public void useSkills() {
//
//        System.out.println("=====Skills======");
//        System.out.println(Arrays.toString(getSkills()));
//        System.out.println("=================");
//        System.out.println("Please press [1] for skill 1 or press [2] for skill 2.");
//
//        int option = scan.nextInt();
//        if (option == 1){
//            System.out.println("Using Gunglaze");
//            System.out.println("Health increased by 5");
//        } else if (option == 2){
//            System.out.println("Using Medkit");
//            armorUp();
//            System.out.println("Health increased by 2");
//        } else {
//            System.out.println("Error"); //change this to exception
//        }
//    }

    public void useBandage(){
        setHealth(getHealth() + 5);
    }

    public void armorUp(){
        setArmor(getArmor() + 2);
    }

}
