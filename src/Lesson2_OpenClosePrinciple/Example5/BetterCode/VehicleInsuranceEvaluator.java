package Lesson2_OpenClosePrinciple.Example5.BetterCode;

public class VehicleInsuranceEvaluator
{
    public static InsuranceQuote evaluateInsurance(Vehicle vehicle)
    {
        return vehicle.calculateInsurance();
    }
}
