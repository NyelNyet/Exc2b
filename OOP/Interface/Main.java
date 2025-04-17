package Interface;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailService();
        NotificationService sms = new SMSService();

        User[] u = {new User(email),new User(sms)}; 

        u[0].notifyUser("Hello");
        u[1].notifyUser("Hello");
    }
}
