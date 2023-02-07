/*b)	Derive a class BulkDiscount from DiscountPolicy.
 It should have a constructor that has two parameters, minimum and percent. 
 It should define the method computeDiscount so that if the quantity purchased
of an item is more than minimum, the discount is percent%. 
*/

public class BulkDiscount extends DiscountPolicy {
  private int minimum;
  private double percent;

  public BulkDiscount(int minimum, double percent) {
    this.minimum = minimum;
    this.percent = percent;
  }

  @Override
  public double computeDiscount(int count, double itemCost) {
    if (count >= minimum) {
      return itemCost * count * percent / 100;
    }
    return 0;
  }
}
