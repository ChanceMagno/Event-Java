public class Event {
  private int mPartySize;
  private int mFoodSelected;

  public Event(int partySize, int foodSelected, int drinks, int entertainment) {
    mPartySize = partySize;
    mFoodSelected = foodSelected;

  }

  public int getPartySize() {
    return mPartySize;
  }

  public int getFoodSelected() {
    return mFoodSelected;
  }
}
