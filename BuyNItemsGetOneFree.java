/*Derive a class BuyNItemsGetOneFree from DiscountPolicy. 
The class should have a constructor that has a single parameter ‘n’. 
In addition, the class should define the method computeDiscount so that every nth item is free. 
*/
public class BuyNItemsGetOneFree extends DiscountPolicy {
    private int n;
  
    public BuyNItemsGetOneFree(int n) {
      this.n = n;
    }
  
    @Override
    public double computeDiscount(int count, double itemCost) {
      return itemCost * (count / n) * n;
    }
  }
