package Lesson2_OpenClosePrinciple.Example1.BetterCode;

public class SMSNotification implements Notification
{
    @Override
    public void sendNotification()
    {
        System.out.println("SMS sent");
    }
}