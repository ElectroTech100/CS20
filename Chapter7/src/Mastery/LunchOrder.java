package Mastery;
import java.util.Scanner;

import java.text.NumberFormat;

public class LunchOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // Create Food objects using the provided chart
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food fries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

       
        System.out.print("Enter number of hamburgers: ");
        int numBurgers = input.nextInt();
        System.out.println("Each hamburger has " + hamburger.getFat() + "g of fat, " + 
                           hamburger.getCarbs() + "g of carbs, and " + 
                           hamburger.getFiber() + "g of fiber.\n");
        System.out.print("Enter number of salads: ");
        int numSalads = input.nextInt();
        System.out.println("Each salad has " + salad.getFat() + "g of fat, " + 
                           salad.getCarbs() + "g of carbs, and " + 
                           salad.getFiber() + "g of fiber.\n");


        System.out.print("Enter number of fries: ");
        int numFries = input.nextInt();
        System.out.println("French fries have " + fries.getFat() + "g of fat, " + 
                           fries.getCarbs() + "g of carbs, and " + 
                           fries.getFiber() + "g of fiber.\n");

        System.out.print("Enter number of sodas: ");
        int numSodas = input.nextInt();
        System.out.println("Each soda has " + soda.getFat() + "g of fat, " + 
                           soda.getCarbs() + "g of carbs, and " + 
                           soda.getFiber() + "g of fiber.\n");

      
        double total = (numBurgers * hamburger.getPrice()) +
                       (numSalads * salad.getPrice()) +
                       (numFries * fries.getPrice()) +
                       (numSodas * soda.getPrice());

        // Display formatted total
        System.out.println("Your order comes to: " + money.format(total));
        
        input.close();
    }
}
