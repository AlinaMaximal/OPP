package Lab9.Task1.Task5;

public class PushNotification extends Notification {
    @Override
  void send(String message){
        System.out.println("Sending push notification: " + message);

    }
}
