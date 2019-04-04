package CodeBlocks;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        double centimeter = calculateFeetAndInchesToCentimeter(-1, 7);
        System.out.println("1st method o/p is : "+centimeter);

        centimeter = calculateFeetAndInchesToCentimeter(-1);
        System.out.println("2nd method o/p is : "+centimeter);
    }

    public static double calculateFeetAndInchesToCentimeter(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid Feet or Inches Parameters");
            return -1;

        } else {
            double cm = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " Feet " + inches + " inches " + " is " + cm + " CM");
            return cm;
        }


    }

    public static double calculateFeetAndInchesToCentimeter(double inches) {

        if (inches < 0) {
            System.out.println("Invalid Inches parameter");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches is equal to " + feet + " Feet " + remainingInches + " Inches");
        return calculateFeetAndInchesToCentimeter(feet, remainingInches);


    }


}
