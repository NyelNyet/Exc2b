package Interface;

public class User{
    private NotificationService notSer;

    public User(NotificationService notSer){
        this.notSer = notSer;
    }

    public void notifyUser(String msg){
        notSer.send(msg);
    }
}
