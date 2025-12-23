package Lesson2_OpenClosePrinciple.Example4.BetterCode;

public class DiscountEvaluator
{
    public static double calculateDiscount(Product product)
    {
        return product.getDiscountStrategy().calculateDiscount(product.getPrice());
    }
}