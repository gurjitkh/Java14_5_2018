package week3.ex6;

public class MethodOverLoading {
    public static void main(String[] args) {

        System.out.printf(" square with INT argument: %d%n",square(7));
        System.out.printf(" square with INT argument: %f%n",square(8.3));

    }
    public static int square(int value){
        System.out.printf("Called square with INT argument: %d%n",value);
        return value * value;
    }

    public static double square(double value){
        System.out.printf("Called square with double argument: %f%n",value);
        return value * value;
    }
}
