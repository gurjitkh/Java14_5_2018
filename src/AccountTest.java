import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*

        Scanner input = new Scanner(System.in);

        //create an instance of account
        Account myAccount = new Account("gurjit singh");
        //display the default account info.

        System.out.printf("Intial Name is %s%n%n",myAccount.getName());

        //prompet the user name for an account name
        System.out.println("Please Enter an account name: ");
        String accName = input.nextLine();//Read input and save to accName

        myAccount.setName(accName);

        System.out.printf("Name of My Account is: %s %n",myAccount.getName());
        */

        Account account1 = new Account("Gurjit Singh",1000);
        Account account2 = new Account("Harjit",2000);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account1.getBalance());

        double depositAmount = input.nextDouble();
        System.out.printf("%n Adding %.2f to Account1 Balance%n%n",depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account1.getBalance());
    }
}
