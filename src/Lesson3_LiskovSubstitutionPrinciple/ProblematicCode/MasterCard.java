package Lesson3_LiskovSubstitutionPrinciple.ProblematicCode;

public class MasterCard extends CreditCard
{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation for MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer implementation for MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation for MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments implementation for MasterCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI Payment implementation for MasterCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("international Payments implementation for MasterCard");
    }
}