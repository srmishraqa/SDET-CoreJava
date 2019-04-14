package encapsulation;

public class TestWithoutEncapsulation {

    public static void main(String[] args) {

        Player player = new Player();
        //Although we Are not in player Class We can access the variables by class ref variable name directly
        //As we set the scope public for those variables

        //Also if we change a variable or fn name in the main class we have to change in the class as well from where we are accessing them

        // We have to initialize them as well and if we forget we can have error in our programs
        player.name = "Soumya";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthReamining());

        damage = 11;
        //Actually as health is public
        //We can reset variables of Player Class Directly as we have access to access them directly
        //Instead of -1 it will show 189
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthReamining());

    }

}
