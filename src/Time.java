public class Time {
    /**
     * The Time class represents the Time. The time consists of hours, minutes, and seconds.
     */
    private int hour;
    private int minute;
    private int seconds;

    /**
     *Constructor for the Time class. This creates a new instance of a Time given the below parameters.
     * @param hour represents the current hour
     * @param minute represents the current minute
     * @param second represents the current second
     */
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.seconds = second;
    }

    /**
     * The tick method will increase the seconds count on the Time by one everytime it is called. It checks to see if the seconds, minute, or hour is at their limit and will properly increment minutes and hours if it is.
     */
    public void tick(){
        seconds ++;
        if (seconds == 60){
            seconds = 0;
            minute ++;
        }
        if (minute == 60){
            minute = 0;
            hour ++;
        }
        if (hour == 24){
            hour = 0;
            minute = 0;
            seconds = 0;
        }
    }

    /**
     * The add method adds the time from another Time to the current Timer given another Time object.
     * @param time represents the time from another Time
     */
    public void add(Time time){
        int minute1 = time.minute;
        int seconds1 = time.seconds;
        int hour1 = time.hour;
        this.hour += hour1;
        this.seconds += seconds1;
        this.minute += minute1;
        if (seconds >= 60){
            seconds = seconds - 60;
            minute ++;
        }
        if (minute >= 60){
            minute = minute - 60;
            hour ++;
        }
        if (hour >= 24){
            hour = hour - 24;
        }
    }

    /**
     * toString method for the Time class. This method will return a String showing the Time in a formatted String.
     * @return returns a String in a properly formatted String, containing padded zeros for single digits.
     */
    public String toString(){
        String hours = String.valueOf(hour);
        String minute = String.valueOf(this.minute);
        String seconds = String.valueOf(this.seconds);
        if (hour < 10){
            hours = "0"+ hour;
        }
        if (this.minute < 10){
            minute = "0"+minute;
        }
        if (this.seconds < 10){
            seconds= "0" + this.seconds;
        }
        return hours + ":"+minute+":"+seconds;
    }
}
