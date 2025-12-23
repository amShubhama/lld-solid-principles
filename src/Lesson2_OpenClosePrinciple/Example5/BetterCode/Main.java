package Lesson2_OpenClosePrinciple.Example5.BetterCode;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle a = null;
        VehicleInsuranceEvaluator.evaluateInsurance(car);
        VehicleInsuranceEvaluator.evaluateInsurance(truck);
    }
}
