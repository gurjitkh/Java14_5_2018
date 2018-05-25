public class Account {

    private  String name;
    private double balance;
    //Declare a constructor with 1 string parameter
    public  Account(String name, double balance){

     this.name = name;

     if (balance > 0.0 )
         this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }

    //deposit method
    public void deposit(double depositAmount){
        if (depositAmount >0.0 ){
            balance = balance + depositAmount;
        }
    }

    // allow user to set account name to something else
    public  void setName(String name){
        this.name = name;
    }
    //
    public String getName(){
        return name;
    }
}
