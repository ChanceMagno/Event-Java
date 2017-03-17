import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Event Services, to get your estimate please start by putting in your party Size. You can select from the follwing party sizes: 20, 50, 100");
    String partySizeString = myConsole.readLine();
    int partySize = Integer.parseInt(partySizeString);
    System.out.println("Thank you, you selected a party size of " + partySize + ". Type the number(example type(1) for just Appetiezers) representing your food choice below: 1. Appetiezers 2. Appetiezers and Meal 3. Appetiezers, Meal and Dessert");
    String foodSelectedString = myConsole.readLine();
    int foodSelected = Integer.parseInt(foodSelectedString);

  }
}
