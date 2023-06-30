import java.util.Scanner;

public class RestaurantBillCalculator {
    public static void main(String[] args) {
        // Constants for menu prices
        final double BURGER_PRICE = 4.99;
        final double PIZZA_PRICE = 8.99;
        final double SALAD_PRICE = 6.99;
        final double DRINK_PRICE = 1.99;

        // Variables to store the quantity of each item
        int burgerQuantity, pizzaQuantity, saladQuantity, drinkQuantity;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the quantity of each item
        System.out.println("Enter the quantity of each item:");

        System.out.print("Burger: ");
        burgerQuantity = sc.nextInt();

        System.out.print("Pizza: ");
        pizzaQuantity = sc.nextInt();

        System.out.print("Salad: ");
        saladQuantity = sc.nextInt();

        System.out.print("Drink: ");
        drinkQuantity = sc.nextInt();

        // Calculate the subtotal
        double subtotal = (burgerQuantity * BURGER_PRICE) + (pizzaQuantity * PIZZA_PRICE) +
                (saladQuantity * SALAD_PRICE) + (drinkQuantity * DRINK_PRICE);

        // Calculate the tax
        double tax = subtotal * 0.08; // Assuming 8% tax rate

        // Calculate the total
        double total = subtotal + tax;

        // Display the bill
        System.out.println();
        System.out.println("---- Bill ----");
        System.out.println("Burger x " + burgerQuantity + ": $" + (BURGER_PRICE * burgerQuantity));
        System.out.println("Pizza x " + pizzaQuantity + ": $" + (PIZZA_PRICE * pizzaQuantity));
        System.out.println("Salad x " + saladQuantity + ": $" + (SALAD_PRICE * saladQuantity));
        System.out.println("Drink x " + drinkQuantity + ": $" + (DRINK_PRICE * drinkQuantity));
        System.out.println("----------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        // Close the Scanner object
        sc.close();
    }
}
