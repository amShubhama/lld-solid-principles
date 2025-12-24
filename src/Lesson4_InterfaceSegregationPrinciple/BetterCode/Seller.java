package Lesson4_InterfaceSegregationPrinciple.BetterCode;

public class Seller implements ICanSell
{

    @Override
    public void sellProducts() {
        System.out.println("Sell products");
    }
}
