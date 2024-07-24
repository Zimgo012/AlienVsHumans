package main.characters;

public class Humans extends  Entity {



    public Humans(String name,int health, int armor,int damage,int xp) {
        super(name,health,armor,damage,xp);
    }


    //unique traits
    public void wearArmor(){
        setArmor(getArmor() + 2);
    }
    public void useMedkit(){
        setHealth(getHealth() + 5);
    }

    public void levelUp(){
        setHealth(getHealth() + 10);
        setDamage(getDamage() + 2);
        setXp(getXp() + 1);
    }


}


