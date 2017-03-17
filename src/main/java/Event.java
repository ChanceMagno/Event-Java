public class Event {
  private int mPartySize;
  private int mFoodSelected;
  private int mDrinkSelected;
  private int mEntertainmentSelected;
  private int mCouponAdded;

  public Event(int partySize, int foodSelected, int drinkSelected, int entertainmentSelected, int couponAdded) {
    mPartySize = partySize;
    mFoodSelected = foodSelected;
    mDrinkSelected = drinkSelected;
    mEntertainmentSelected = entertainmentSelected;
    mCouponAdded = couponAdded;
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

  public int getCouponAdded() {
    return mCouponAdded;
  }

  public Integer addEstimateTotal(int partySize, int foodSelected, int drinkSelected, int entertainmentSelected, int couponAdded) {
    Integer estimateTotal = 0;
    if(couponAdded == 0){
       estimateTotal = partySize * 10 + foodSelected * 5 * partySize + drinkSelected * 5 * partySize + entertainmentSelected * 500 * couponAdded;
    } else if (couponAdded == 1) {
      estimateTotal = (partySize * 10 + foodSelected * 5 * partySize + drinkSelected * 5 * partySize + entertainmentSelected * 500) - 100;
    }  else if (couponAdded == 2){ 
      estimateTotal = partySize * 10 + foodSelected * 5 * partySize + drinkSelected * 5 * partySize + entertainmentSelected * 500;
    }return estimateTotal;

  }
}
