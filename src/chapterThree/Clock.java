package chapterThree;

public class Clock {

    int hour;
    int minute;
    int second;

    Clock(int hourOfTheDay, int minuteOfTheDay, int secondOfTheDay) {

        hour = hourOfTheDay;
        minute = minuteOfTheDay;
        second = secondOfTheDay;
    }

    public void setHour(int hourOfTheDay) {
        if (hourOfTheDay < 23) {
            hour = hourOfTheDay;
        } else if (hourOfTheDay > 23) {
            hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minuteOfTheDay) {
        if (minuteOfTheDay < 59) {
            minute = minuteOfTheDay;
        } else if (minuteOfTheDay > 59) {
            hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int secondOfTheDay) {
        if (secondOfTheDay < 59) {
            second = secondOfTheDay;
        } else if (secondOfTheDay > 59) {
            second = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public String getDisplayTime(){
        String time = hour + ":" + minute + ":" + second;
        return time;

    }
}