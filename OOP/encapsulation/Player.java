package encapsulation;

//This class does not use encapsulation -- for example

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player Knocked out");
            //reduce no of lives remaining for the player
        }
    }

    public int healthReamining(){
        return this.health;
    }

}
