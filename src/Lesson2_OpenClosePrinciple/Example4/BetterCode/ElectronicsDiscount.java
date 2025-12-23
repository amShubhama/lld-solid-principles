package Lesson2_OpenClosePrinciple.Example4.BetterCode;

public class ElectronicsDiscount implements DiscountStrategy
{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
