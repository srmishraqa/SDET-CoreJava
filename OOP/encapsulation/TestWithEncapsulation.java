package encapsulation;

public class TestWithEncapsulation {

    public static void main(String[] args) {


        //Even if we pass 200 pass as health while creating object as per restriction it will be set to 100

        EnhancedPlayer player = new EnhancedPlayer("Rahul", 200, "AK-56");
        System.out.println("Initial Health is : "+player.getHealth());


    }
}
