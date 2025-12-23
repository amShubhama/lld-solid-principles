package Lesson2_OpenClosePrinciple.Example1.ProblematicCode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
public class NotificationSender
{

    public static void sentNotification(@NotNull List<NotificationType> notificationTypes)
    {
        for(NotificationType type : notificationTypes)
        {
            if(type == NotificationType.SMS)
                type.sendSMSNotification();
            else if(type == NotificationType.EMAIL)
                type.sendEmailNotification();
            else if (type == NotificationType.WHATSAPP)
                type.sendWhatsappNotification();
            else if(type == NotificationType.PLATFORM)
                type.sendPlatformNotification();
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        List<NotificationType> type = new ArrayList<>();
        type.add(NotificationType.SMS);
        type.add(NotificationType.EMAIL);
        type.add(NotificationType.PLATFORM);
        NotificationSender.sentNotification(type);
    }
}
