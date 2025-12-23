package Lesson2_OpenClosePrinciple.Example1.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP,
    PLATFORM;

    public void sendSMSNotification()
    {
        System.out.println("SMS Sent");
    }

    public void sendEmailNotification()
    {
        System.out.println("Email sent");
    }

    public void sendWhatsappNotification()
    {
        System.out.println("Whatsapp notification sent");
    }

    public void sendPlatformNotification()
    {
        System.out.println("Platform notification sent");
    }
}