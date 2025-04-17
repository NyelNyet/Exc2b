package Interface;

public class EmailService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Sending via email: "+message);
    }
}
