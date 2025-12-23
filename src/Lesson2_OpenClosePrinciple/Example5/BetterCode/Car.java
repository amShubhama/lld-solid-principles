package Lesson2_OpenClosePrinciple.Example5.BetterCode;

public class Car extends Vehicle
{
    @Override
    public InsuranceQuote calculateInsurance()
    {
        System.out.println("Car specific logic");
        return new InsuranceQuote();
    }
}
