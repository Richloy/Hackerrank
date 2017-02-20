import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaDateAndTime {

    public static void main(String[] args) {
        
        final String[] DAYSOFWEEK = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
		
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
		
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
		
        int dow = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(DAYSOFWEEK[dow-1]);
    }
}
