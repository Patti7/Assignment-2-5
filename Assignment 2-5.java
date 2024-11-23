
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the subtotal:");
       double subtotal = input.nextDouble();

       System.out.println("Enter the gratuity rate(in %):");
       double gratuityRate = input.nextDouble();

       double gratuity = subtotal * (gratuityRate / 100);
       double total = subtotal + gratuity;

       System.out.printf("Gratuity: $%.2f%n", gratuity);
       System.out.printf("Total: $%.2f%n", total);
   }
}

