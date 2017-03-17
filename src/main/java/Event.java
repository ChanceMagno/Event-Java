public class Event {
  private int mPartySize;
  private int mFoodSelected;
  private int mDrinkSelected;
  private int mEntertainmentSelected;
  private boolean mCouponAdded;

  public Event(int partySize, int foodSelected, int drinkSelected, int entertainmentSelected, couponAdded) {
    mPartySize = partySize;
    mFoodSelected = foodSelected;
    mDrinkSelected = drinkSelected;
    mEntertainmentSelected = entertainmentSelected;

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

  public int getEntertainmentSelected() {
    return mEntertainmentSelected;
  }
}
