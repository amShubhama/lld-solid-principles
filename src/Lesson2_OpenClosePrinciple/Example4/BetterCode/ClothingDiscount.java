package Lesson2_OpenClosePrinciple.Example4.BetterCode;

public class ClothingDiscount implements DiscountStrategy
{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.15;
    }
}