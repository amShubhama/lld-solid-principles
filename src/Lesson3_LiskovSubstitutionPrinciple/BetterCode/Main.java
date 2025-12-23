package Lesson3_LiskovSubstitutionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<UpiCompatibleCreditCard> upiCards = new ArrayList<>();
        upiCards.add(new RuPayCard());

        List<InternationalPaymentCompatibleCreditCard> interPaymentsCards = new ArrayList<>();
        interPaymentsCards.add(new MasterCard());
        interPaymentsCards.add(new VisaCard());

        for(UpiCompatibleCreditCard card : upiCards)
            card.upiPayment();

        for(InternationalPaymentCompatibleCreditCard card : interPaymentsCards)
            card.internationalPayment();
    }
}