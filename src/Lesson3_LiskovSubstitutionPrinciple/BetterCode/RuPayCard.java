package Lesson3_LiskovSubstitutionPrinciple.BetterCode;

public class RuPayCard extends CreditCard implements UpiCompatibleCreditCard
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
}