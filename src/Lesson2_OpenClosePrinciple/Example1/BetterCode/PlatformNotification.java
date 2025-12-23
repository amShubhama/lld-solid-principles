package Lesson2_OpenClosePrinciple.Example1.BetterCode;

public class PlatformNotification implements Notification
{
    @Override
    public void sendNotification()
    {
        System.out.println("Platform notification is sent");
    }
}