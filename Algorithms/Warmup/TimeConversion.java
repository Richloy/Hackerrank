import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        String time = in.next();
		String hr;
		String[] parts = time.split(":");
		int hh = Integer.parseInt(parts[0]);
		String min = parts[1];
		String amPM = parts[2].substring(2,4);
		String sec = parts[2].substring(0,2);
		if (amPM.toLowerCase().equals("pm")) hh += 12;
		if(hh < 10){
			hr = "0"+Integer.toString(hh);
		} else if(hh == 12){
			hr = "00";
		} else if(hh == 24){
			hr = "12";
		}else {
			hr = Integer.toString(hh);
		}
		System.out.println(hr+":"+min+":"+sec);
    }
}
