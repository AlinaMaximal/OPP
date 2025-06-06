package Lab7.Task1.Task5;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            System.out.println("від 0 до 23");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.println("від 0 до 59");
        }
        }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (minutes >= 0 && minutes < 60) {
        this.seconds = seconds;
        } else {
            System.out.println("від 0 до 59");
        }
    }
    public void displayTime(){
        System.out.println("Поточний час: " + getHours() + ":" + getMinutes() + ":" + getSeconds());
    }
    public void tick(){
        hours++;
        if (hours >= 24) {
            hours =0;
        }
        minutes++;
        if (minutes>=60){
            minutes=0;
        }
        seconds++;
        if (seconds>=60){
            seconds=0;
        }
    }
}


