package Classwork.ClassworkOnOOP;

public class MainClass {
    public static void main(String[] args) {
        Native myNative = new Native();
        myNative.sleep();
        String resultJava = myNative.learnJava();
        String resultPython = myNative.learnPython();

        System.out.println(resultJava);
        System.out.println(resultPython);

        Facilitator myFacilitator = new Facilitator();
        myFacilitator.sleep();
        String teachOne = myFacilitator.teachJava();
        String teachTwo = myFacilitator.teachPython();

        System.out.println(teachOne);
        System.out.println(teachTwo);

    }
}
