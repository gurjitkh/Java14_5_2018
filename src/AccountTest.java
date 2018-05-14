import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an instance of account
        Account myAccount = new Account();
        //display the default account info.

        System.out.printf("Intial bane is %s%n%n",myAccount.getName());

        //prompet the user name for an account name
        System.out.println("Please Enter an account name: ");
        String accName = input.nextLine();//Read input and save to accName
        myAccount.setName(accName);

        System.out.printf("Name of My Account is: %s %n",myAccount.getName());
    }
}
