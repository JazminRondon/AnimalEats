
package hw1;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's the temperature feel like?\n"
                + "High\nLow\nHumid\n");
        String input=userInput.nextLine();
        if(input.equalsIgnoreCase("high")){
            System.out.println("Sunblock may be needed");
        }
        if(input.equalsIgnoreCase("low")){
            System.out.println("A coat may be needed");
        }
        if(input.equalsIgnoreCase("humid")){
            System.out.println("Its muggy!");
        }
    }
}