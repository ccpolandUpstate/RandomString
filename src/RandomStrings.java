//Name: Chase Poland
//Class: CSPC 200
//Date: 02/2/22
//Version: C
//Time: 2 hours
//Status: 

import java.util.*;

public class RandomStrings {
    public static void main(String[] args)
    {

        //Initialization
        Random r = new Random();
        long seed = 100;
        r.setSeed(seed);
        Scanner scan = new Scanner(System.in);


        // C VERSION CODE
        //PART OF C VERSION
        String stringOne = scan.nextLine();
        int random = r.nextInt(1,stringOne.length());
        String sPartOne = (stringOne.substring(0, random - 1));
        String sPartTwo = (stringOne.substring(random, stringOne.length()));
        System.out.println(sPartOne + sPartTwo);

        //B VERSION CODE
        //PART OF B VERSION
        //random = r.nextInt(1,stringOne.length());
        //System.out.println(random);
        /*String movedString = (stringOne.substring(random -1, random));
        String movedString2 = (stringOne.substring(random -2, random -1));
        String sPartThree = (stringOne.substring(0,random -2));
        String sPartFour = (stringOne.substring(random, stringOne.length()));
        System.out.println(sPartThree + movedString + movedString2 + sPartFour);*/

        //A VERSION CODE
        //PART OF A VERSION
        String stringA = scan.nextLine();
        StringBuilder stringAB = new StringBuilder();
        random = r.nextInt(1,stringA.length());
        String stringI = (stringA.substring(0,random));
        String stringE = (stringA.substring(random, stringA.length()));
        stringAB.append(stringE);
        stringAB.reverse();
        System.out.println(random);
        System.out.println(stringI + stringAB);
        

        



    }
}
