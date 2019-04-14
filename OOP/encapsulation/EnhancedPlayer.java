package encapsulation;
/*
This class is an encapsulated class
MAKING VARIABLES PRIVATE AND MAKING SURE THEY ARE NOT ACCESSIBLE OUTSIDE Class

We can create private variables and private functions in our encapsulated class and we don't wanna expose them
we can change the name and it does not affect any code

We protect the member fns and variables from accessing

 */

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player Knocked out");
            //reduce no of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
