//Sijjad Khalid
//10-24-17
//Sum Of Numbers

import java.util.*;
public class SumOfNumbersSK {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        //Give Directions
        System.out.println("This program will find the factorial of whatever number that is entered.");

        //Save variables
        int number = 0, count = 0, total = 1;

        //Direction
        System.out.println("Enter a number that is greater than 0");
        number = keyboard.nextInt();
        

        while (number < 1) {
        System.out.println("Enter a number that is greater than 0");
        number = keyboard.nextInt(); }

        while (number != count) {
            count++;
            System.out.printf(count+" x ");
            total = total * count;}
            
            System.out.println("\n= "+total);



    }
}