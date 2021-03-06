package week3.ex4;

public class Scope {
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;
        System.out.printf("Local x in main is %d%n",x);

        useLocalVariable();
        useField();
    }
    private static void useLocalVariable(){
        int x = 25;

        System.out.printf("%nlocal x on entering method useLocalVariable() is %d%n",x);

        ++x;
        System.out.printf("%nlocal x on exiting method useLocalVariable() is %d%n",x);
    }

    private static void useField(){
        System.out.printf("Local varible entring in useField %d",x);
                x *= 10;
        System.out.printf("Local varible exiting in useField %d",x);
    }
}
