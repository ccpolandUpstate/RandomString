//Name: Chase Poland
//Class: CSPC 200
//Date: 02/2/22
//Version: A
//Time: 2 hours
//Status: Had a problem with the r.nextInt(), but was finally able to fix it with a little help. 

// If you're looking at the code, I am purposely making it as confusing as possible on this last submittion :)

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
        String _userInput_ = scan.nextLine(); // User inputs their string
        int _r_ = r.nextInt(_userInput_.length() - 1) + 1; // _r_ # generated between 1 and the length of the string.
        String _1_ = (_userInput_.substring(0, _r_)); 
        String _2_ = (_userInput_.substring(_r_ +1, _userInput_.length()));
        System.out.println(_1_ + _2_);

        //B VERSION CODE
        //PART OF B VERSION
        _r_ = r.nextInt(_userInput_.length() - 1) + 1; // Another _r_ # generated. 
        String m1 = (_userInput_.substring(_r_, _r_ + 1));
        String m2 = (_userInput_.substring(_r_ - 1, _r_));
        String _3_ = (_userInput_.substring(0,_r_ - 1));
        String _4_ = (_userInput_.substring(_r_ + 1, _userInput_.length()));
        System.out.println(_3_ +  m1 + m2 + _4_);

        //A VERSION CODE
        //PART OF A VERSION
        StringBuilder _initString_ = new StringBuilder(); 
        StringBuilder _reversed_ = new StringBuilder();
        _initString_.append(_userInput_); // Stores the Users inputed string.
        _initString_.reverse(); // Reverses the users inputed string.
        _r_ = r.nextInt(_userInput_.length() - 1) + 1; // Another _r_ # generated. 
        String _i_ = (_userInput_.substring(0,_r_));
        String _f_ = (_userInput_.substring(_r_, _userInput_.length()));
        System.out.println(_initString_);
        _reversed_.append(_f_); // Stores the string past the _r_ # integer. 
        _reversed_.reverse(); // Reverses the stored string. 
        System.out.println(_i_ + _reversed_);
    }
}
