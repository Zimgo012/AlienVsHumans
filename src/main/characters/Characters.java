package main.characters;

import java.util.Scanner;

public class Characters {
    private String name;
    private int health;
    private int maxHealth;
    private int armor;
    private int damage;
    private int xp;


    //methods

    public Characters(String name, int health, int armor, int damage, int xp){
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.armor = armor;
        this.damage = damage;
        this.xp  = xp;


    }
    //Getters and setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void attack(Characters characters){
        System.out.println(this.name + " attacks!");;
        int damageOutput = Math.max(0,this.damage - characters.getArmor());
        characters.takeDamage(damageOutput);

    }
    public void takeDamage(int damage){
        System.out.println(this.name + " took " + damage +" damage");
        this.health = this.health - damage;
    }
    public void useSkills(){}
    public void levelUp(){

        System.out.println("Character Status: Level up!");

        setDamage(getDamage() + 1);
        setMaxHealth(getMaxHealth() +5);
        setXp(getXp() + 1);
    }
}
