package Lesson2_OpenClosePrinciple.Example1.BetterCode;

public class WhatsappNotification implements Notification
{
    @Override
    public void sendNotification()
    {
        System.out.println("Whatsapp notification sent");
    }
}