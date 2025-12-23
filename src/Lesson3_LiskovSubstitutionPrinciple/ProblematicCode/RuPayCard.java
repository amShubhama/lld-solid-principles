package Lesson3_LiskovSubstitutionPrinciple.ProblematicCode;

public class RuPayCard extends CreditCard
{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation for RuPayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer implementation for RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation for RuPayCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments implementation for RuPayCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI Payment implementation for RuPayCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("international Payments implementation for RuPayCard");
    }
}