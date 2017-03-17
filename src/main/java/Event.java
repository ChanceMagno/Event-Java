public class Event {
  private int mPartySize;
  private int mFoodSelected;
  private int mDrinkSelected;

  public Event(int partySize, int foodSelected, int drinkSelected, int entertainment) {
    mPartySize = partySize;
    mFoodSelected = foodSelected;
    mDrinkSelected = drinkSelected;

  }

  public int getPartySize() {
    return mPartySize;
  }

  public int getFoodSelected() {
    return mFoodSelected;
  }

  public int getDrinkSelected() {
    return mDrinkSelected;
  }
}
