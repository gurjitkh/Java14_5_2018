package week3;
import  java.security.SecureRandom;
public class RandomNumber {

    public static void main(String[] args) {
        //create random number object

        SecureRandom randomNumbers = new SecureRandom();

        //3 for loop parameter are:
        //1  local  variable counter
        //2 . check to exit for loop
        //3. increment to counter
        //generate values for standard D6 dice

        for (int counter = 1; counter <= 20; counter++ ){
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d",face);

            if (counter % 5 ==0) {
                System.out.println();
            }
        }
    }
}
