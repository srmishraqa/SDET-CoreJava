package p5.switchcase;

import java.util.Scanner;

public class SwitchCaseChallengeOne {

    public static void main(String[] args) {

        char testVar = 'F';

        switch(testVar) {

            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The Input is "+ testVar);
                break;


            default:
            System.out.println("The input is not valid");
            break;
        }

    }
}
