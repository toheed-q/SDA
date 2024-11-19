
import DataLayer.Student;

public class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public void sendNotification(Student student) {
        System.out.println(student.getName() + " received notification: " + message);
    }
}

