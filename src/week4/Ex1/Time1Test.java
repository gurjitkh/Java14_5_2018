package week4.Ex1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        System.out.printf("Universal time: " + time.toUniversalString());
        System.out.printf("Standard Time: "+ time.toString());

    }
}
