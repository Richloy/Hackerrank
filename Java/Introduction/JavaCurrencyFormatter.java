import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usnf.format(payment);
		
        NumberFormat inf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = inf.format(payment);
		
        NumberFormat cnf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cnf.format(payment);
		
        NumberFormat fnf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fnf.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}