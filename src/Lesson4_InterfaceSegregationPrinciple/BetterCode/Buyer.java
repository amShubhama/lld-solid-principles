package Lesson4_InterfaceSegregationPrinciple.BetterCode;

public class Buyer implements ICanBuy
{
    @Override
    public void buyProducts() {
        System.out.println("Buy Products");
    }
}
