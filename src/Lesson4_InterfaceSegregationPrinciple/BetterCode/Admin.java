package Lesson4_InterfaceSegregationPrinciple.BetterCode;

public class Admin implements ICanModify,ICanApprove
{
    @Override
    public void approveProducts() {
        System.out.println("Product approved");
    }

    @Override
    public void modifyProduct() {
        System.out.println("Product modified");
    }
}
