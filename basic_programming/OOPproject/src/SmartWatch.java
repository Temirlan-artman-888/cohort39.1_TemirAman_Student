import java.util.ArrayList;
import java.util.List;

public class SmartWatch {
            private String currentTime;
            private int steps;
            private List<String> notifications;

            public SmartWatch(String currentTime, int steps, String[] notifications){
                this.currentTime = "12:00";
                this.steps = 0;
                this.notifications = new ArrayList<>();
            }
            public void showTime(){

                System.out.println("Current time is " + currentTime);
            }
            public void trackSteps(){
                steps +=100;
                System.out.println("Quantity of steps" + steps);
            }
            public void receiveNotification(String message){
                notifications.add(message);
                System.out.println("New notification " + message);
            }
            public String getCurrentTime(){
                return currentTime;
            }
            public void setCurrentTime(String currentTime){
                this.currentTime = currentTime;
            }
            public int getSteps(){
                return steps;
            }
            public void setSteps(int steps){
                this.steps = steps;
            }

            public List<String> getNotifications() {
                return notifications;
            }
    }
