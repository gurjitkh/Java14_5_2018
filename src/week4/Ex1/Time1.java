package week4.Ex1;
//Define time in a 24 - format. But accommodate 12 hours as well eventually
public class Time1 {
    private int hour;// between 0 -23
    private int minute; //between 0 - 59
    private int seconds; //between 0 - 59

    //abilty to set time


    public void setTime(int hour, int minute, int seconds) {

        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60){

            throw new IllegalArgumentException("Hours, minute and / or second was out of range");

        }

        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;


    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,seconds);

    }
    public String toString(){
        return  String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12) ? 12: hour % 15),
                minute,
                seconds,
                (hour < 12 ? "AM" : "PM") );// fancy statement
    }
}
