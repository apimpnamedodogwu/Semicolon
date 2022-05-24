package chapterTwoAndThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hourOfDay, int minOfDay, int secOfDay) {
        hour = hourOfDay;
        minute = minOfDay;
        second = secOfDay;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hourOfDay) {
        if (hourOfDay < 23) {
            hour = hourOfDay;
        } else if (hourOfDay > 23) {
            hour = 0;
        }
    }

    public void setMinute(int minOfDay) {
        if (minOfDay < 59) {
            minute = minOfDay;
        } else if (minOfDay > 59) {
            minute = 0;
        }
    }

    public void setSecond(int secOfDay) {
        if (secOfDay < 59) {
            second = secOfDay;
        } else if (secOfDay > 59) {
            second = 0;
        }
    }

    public String displayTime(){
        String time = hour + ":" + minute + ":" + second;
        return time;
    }
}


