package main.characters;

public class Entity {

    private String name;
    private int health;
    private int armor;
    private int damage;
    private int xp;


    //methods
    public Entity(String name, int health, int armor, int damage,int xp){
        this.name = name;
        this.health = health;
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

    public void attack(Entity entity){
        System.out.println(this.name + " attacks!");;
        int damageOutput = Math.max(0,this.damage - entity.getArmor());
        entity.takeDamage(damageOutput);

    }
    public void takeDamage(int damage){
        System.out.println(this.name + " took " + damage +" damage");
        this.health = this.health - damage;
    }
    void useSkills(){}
}
