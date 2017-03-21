import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Event Services, to get your estimate please start by putting in your party Size. You can select from the following party sizes: 20, 50, 100");
    String partySizeString = myConsole.readLine();
    int partySize = Integer.parseInt(partySizeString);
    System.out.println("Thank you, you selected a party size of " + partySize + ". Type the number(example type(1) for just Appetizers) representing your food choice below: 1. Appetizers 2. Appetizers and Meal 3. Appetizers, Meal and Dessert");
    String foodSelectedString = myConsole.readLine();
    int foodSelected = Integer.parseInt(foodSelectedString);
    System.out.println("great, now lets choose what type of beverages you would like available. if you do not wish to have alcoholic beverages at your event just type none. Otherwise, here is a list of our beverage packages, please type the number pertaining to the package you would like: 1. Beer 2. Beer and Wine 3. Beer, Wine and Spirits.");
    String outputDrinkSelectString = "0";
    String drinkSelectedString = myConsole.readLine();
    if (drinkSelectedString.equals("none")) {
      outputDrinkSelectString = "0";
    } else if (drinkSelectedString.equals("1") || drinkSelectedString.equals("2") || drinkSelectedString.equals("3")){
      outputDrinkSelectString = drinkSelectedString;
    }
    int drinkSelected = Integer.parseInt(outputDrinkSelectString);
    System.out.println("We offer from 3 different forms of entertainment. If you do not wish to have entertainment just type 'none'. Otherwise, please choose the number pertaining to your choice: 1. Live DJ 2. Cover Band 3. Twenty one Pilots Live");
    String outputEntertainmentSelectedString = "0";
    String entertainmentSelectedString = myConsole.readLine();

    if (entertainmentSelectedString.equals("none")) {
      outputEntertainmentSelectedString = "0";
    } else if (entertainmentSelectedString.equals("1") || entertainmentSelectedString.equals("2") || entertainmentSelectedString.equals("3")){
      outputEntertainmentSelectedString = entertainmentSelectedString;
    }
    int entertainmentSelected = Integer.parseInt(outputEntertainmentSelectedString);
    String outputCouponAddedString = "0";
    System.out.println("Did you have any coupons to enter? Type yes or no");
    String couponYesOrNo = myConsole.readLine();
    if (couponYesOrNo.contains("yes")) {
      System.out.println("Great! Please enter your coupon code now");
      String couponAddedString = myConsole.readLine();
      if (couponAddedString.equals("ConcertTime")){
          outputCouponAddedString = "0";
      }  else if (couponAddedString.equals("BuddyDiscount")) {
          outputCouponAddedString = "1";
      } else {
          outputCouponAddedString = "2";
      }
    }
      int couponAdded = Integer.parseInt(outputCouponAddedString);

    Event event = new Event(partySize, foodSelected, drinkSelected, entertainmentSelected, couponAdded);
    int estimateTotal = event.addEstimateTotal(partySize, foodSelected, drinkSelected, entertainmentSelected, couponAdded);
    System.out.println("Your estimate for the event is " + estimateTotal + " dollars.");
  }
}
