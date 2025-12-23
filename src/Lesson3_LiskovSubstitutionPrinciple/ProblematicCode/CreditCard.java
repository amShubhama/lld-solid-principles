package Lesson3_LiskovSubstitutionPrinciple.ProblematicCode;

abstract public class CreditCard
{
    private String ccNumber;
    private String cardHolerName;
    private int cvv;

    public void setCcNumber(String ccNumber)
    {
        this.ccNumber = ccNumber;
    }

    public void setCardHolerName(String cardHolerName)
    {
        this.cardHolerName = cardHolerName;
    }

    public void setCvv(int cvv)
    {
        this.cvv = cvv;
    }

    public void showCardDetails()
    {
        System.out.println("Hii, "+cardHolerName+"\nCard Number: "+ccNumber+"\nCVV: "+cvv);
    }

    abstract public void tapAndPay();
    abstract public void onlineTransfer();
    abstract public void swipeAndPay();
    abstract public void mandatePayments();
    abstract public void upiPayment();
    abstract public void internationalPayment();
}
