package Lesson2_OpenClosePrinciple.Example1.BetterCode;
import java.util.ArrayList;
import java.util.List;

public class NotificationSender {
    public static void sender(List<Notification> notifications)
    {
        for(Notification notification : notifications)
            notification.sendNotification();
    }
}



class Test
{
    public static void main(String[] args)
    {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new SMSNotification());
        notifications.add(new EmailNotification());
        notifications.add(new PlatformNotification());
        NotificationSender.sender(notifications);
    }
}