import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16_Exceptions_String_To_Integer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
            
        }catch(NumberFormatException nfe){
            System.out.println("Bad String");
        }
    }
}