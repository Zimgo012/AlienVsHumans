package main.characters;

public class Soldier  extends  Humans{


    public Soldier() {
        super("Soldier", 100, 1, 5, 0);
    }


    @Override
    void useSkills() {
        String[] skills = {"skill 1", "skill 2"};

        System.out.println("Please press [1] for skill 1 or press [2] for skill 2");

        //logic here
    }


}
