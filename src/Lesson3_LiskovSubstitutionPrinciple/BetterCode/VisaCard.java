package Lesson3_LiskovSubstitutionPrinciple.BetterCode;

public class VisaCard extends CreditCard implements InternationalPaymentCompatibleCreditCard
{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation for VisaCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer implementation for VisaCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation for VisaCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments implementation for VisaCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("international Payments implementation for VisaCard");
    }
}