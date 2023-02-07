/*a)Create an abstract class DiscountPolicy.
 It should have a single abstract method computeDiscount that 
 will return the discount for the purchase of a given number 
 of a single item. The method has two parameters, count and itemCost. 
*/
public abstract class DiscountPolicy {
    public abstract double computeDiscount(int count, double itemCost);
  }