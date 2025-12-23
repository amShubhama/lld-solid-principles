package Lesson2_OpenClosePrinciple.Example5.BetterCode;

public class Truck extends Vehicle
{
    @Override
    public InsuranceQuote calculateInsurance() {
        System.out.println("Truck specific logic");
        return new InsuranceQuote();
    }
}
