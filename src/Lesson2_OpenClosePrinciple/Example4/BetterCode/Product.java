package Lesson2_OpenClosePrinciple.Example4.BetterCode;

public class Product
{
    private final double price;
    private final DiscountStrategy discountStrategy;

    Product(double price, DiscountStrategy discountStrategy)
    {
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public double getPrice()
    {
        return price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }
}