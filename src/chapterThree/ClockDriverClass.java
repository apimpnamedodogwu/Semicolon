package chapterThree;


public class ClockDriverClass {
    public static void main(String[] args) {

        Clock aClock = new Clock(0, 0, 0);
        aClock.setHour(89);
        aClock.setMinute(65);
        aClock.setSecond(78);

        String time = aClock.getDisplayTime();
        System.out.println(time);
    }
}
