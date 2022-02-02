/*
Name: Chase Poland
Class: CSPC 200
Date: 02/2/22
Version:
Time: 2 hours
Status:
*/
import java.util.*;

public class RandomString {
    public static void main(String[] args)
    {

        /* C VERSION CODE
        PART OF C VERSION*/

        // Setting The Seed
        Random r = new Random();
        System.out.println("Random: " + r.nextInt());
        long seed = 100;
        r.setSeed(seed);
        System.out.println("Random: " + r.nextInt());

        // Picking a random number based on string length
        String stringOne = "Papa loves pies";
        int random = (int)(Math.random() * stringOne.length()) +1;
        System.out.println(random);
        String sPartOne = (stringOne.substring(0, random - 1));
        String sPartTwo = (stringOne.substring(random, stringOne.length()));
        System.out.println(sPartOne + sPartTwo);


        /* B VERSION CODE
        PART OF B VERSION*/



    }
}
