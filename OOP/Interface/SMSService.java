package Interface;

public class SMSService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Sending via SMS: "+message);
    }
}
