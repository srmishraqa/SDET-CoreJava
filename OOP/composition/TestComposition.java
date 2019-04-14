package composition;

public class TestComposition {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "DELL", "240V", dimensions);

        // Resolution nativeResolution = new Resolution(1920, 1080);
        // Monitor theMonitor = new Monitor("27Inch Beast", "Samsung", 27,
        // nativeResolution);

        // alternative way
        Monitor theMonitor = new Monitor("27Inch Beast", "Samsung", 27, new Resolution(1920, 1080));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "DELL", 4, 6, "V 2.44");

        PC thePC = new PC(theCase, theMonitor, motherBoard);

        // accessing the method form Monitor Class method through PC Class
        //getMonitor() method returns Monitor Object which is already initialized
        //that object calls Monitor class Function drawPixelAt() with the parameters
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");

        thePC.getMotherBoard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

        System.out.println(thePC.getMotherBoard().getManufacturer());

    }

}
