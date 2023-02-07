/*Derive a class CombinedDiscount from DiscountPolicy.
 It should have a constructor that has two parameters of type DiscountPolicy.
  It should define the method computeDiscount to return the maximum value 
  returned by computeDiscount for each of its two private discount policies.
   The two discount policies are described in (b) and (c). 
*/
public class CombinedDiscount extends DiscountPolicy {
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;
  
    public CombinedDiscount(DiscountPolicy policy1, DiscountPolicy policy2) {
      this.policy1 = policy1;
      this.policy2 = policy2;
    }
  
    
  }
  
