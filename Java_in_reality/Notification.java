public abstract class Notification{
    String message;
    abstract void send();
    Notification(String message){
        this.message = message;
    }
    void validateMessage(){
        if (message == null || message.isEmpty()){
            System.out.println("Tin nhắn ko hợp lệ");
        }
        else{
            System.out.println("Tin nhắn hợp lệ");
        }
    }
}
class EmailNotification extends Notification{
    EmailNotification(String message){
        super(message);
    }
    
    @Override
    void send(){
        validateMessage();
        System.out.println("Thông báo từ email:"+message);
    }
}
class SMSNotification extends Notification{
    SMSNotification(String message){
        super(message);
    }
    
    @Override
    void send(){
        validateMessage();
        System.out.println("Thông báo từ SMS:"+message);
    }
}
class PushNotification extends Notification{
    PushNotification(String message){
        super(message);
    }
    
    @Override
    void send(){
        validateMessage();
        System.out.println("Thông báo từ notif:"+message);
    }
}
class Notifier{
    Notification notif;
    Notifier(Notification notif){
        this.notif = notif;
    }
    void sendNotif(){
        notif.send();
    }

}
public class Notification {
    public static void main(String[] args) {
        Notifier email = new Notifier(new EmailNotification("Có tin nhắn mới"));
        Notifier sms = new Notifier(new SMSNotification("Có tin nhắn mới"));
        Notifier push = new Notifier(new PushNotification("Có tin nhắn mới"));

        email.sendNotif();
        sms.sendNotif();
        push.sendNotif();

    }
}