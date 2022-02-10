//Name: Chase Poland
//Class: CSPC 200
//Date: 02/2/22
//Version: A
//Time: 2 hours
//Status: Had a problem with the r.nextInt(), but was finally able to fix it with a little help. 

import java.util.*;

public class RandomStrings 
{
    public static void main(String[] args)
    {

        //Initialization
        Random r = new Random();
        r.setSeed(100);
        Scanner scan = new Scanner(System.in);


        // C VERSION CODE
        //PART OF C VERSION
        String stringOne = scan.nextLine(); // User inputs their string
        int random = r.nextInt(stringOne.length() - 1) + 1; // Random # generated between 1 and the length of the string.
        String sPartOne = (stringOne.substring(0, random)); 
        String sPartTwo = (stringOne.substring(random +1, stringOne.length()));
        System.out.println(sPartOne + sPartTwo);

        //B VERSION CODE
        //PART OF B VERSION
        random = r.nextInt(stringOne.length() - 1) + 1; // Another Random # generated. 
        String movedString = (stringOne.substring(random, random + 1));
        String movedString2 = (stringOne.substring(random - 1, random));
        String sPartThree = (stringOne.substring(0,random - 1));
        String sPartFour = (stringOne.substring(random + 1, stringOne.length()));
        System.out.println(sPartThree +  movedString + movedString2 + sPartFour);

        //A VERSION CODE
        //PART OF A VERSION
        StringBuilder stringAB = new StringBuilder(); 
        StringBuilder stringABC = new StringBuilder();
        stringAB.append(stringOne); // Stores the Users inputed string.
        stringAB.reverse(); // Reverses the users inputed string.
        random = r.nextInt(stringOne.length() - 1) + 1; // Another Random # generated. 
        String stringI = (stringOne.substring(0,random));
        String stringE = (stringOne.substring(random, stringOne.length()));
        System.out.println(stringAB);
        stringABC.append(stringE); // Stores the string past the random # integer. 
        stringABC.reverse(); // Reverses the stored string. 
        System.out.println(stringI + stringABC);
    }
}
