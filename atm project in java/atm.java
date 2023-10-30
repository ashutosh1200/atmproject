import java.util.Scanner;

/**
 * atm
 */
public class atm {
    float Balance;
    int pin=1234;

    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner (System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1: Check A/C Balance");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Deposit Money");
        System.out.println("4: Exit");

    Scanner sc = new Scanner (System.in);
    int opt = sc.nextInt();

    if (opt==1){
        checkBalance();
    }
      else if (opt==2){
        withdrawMoney();
    }
     else if (opt==3){
       depositMoney();
    }
    else if (opt==4){
       return;
    }
    else{
        System.out.println("Enter a Valid Choice");
    }
    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
    }
    public void withdrawMoney(){
        System.out.println("Enter withdraw amount ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
    }
    else{
        Balance = Balance - amount;
        System.out.println("Money Withdraw Successfully");
    }
    menu();
 }
   public void depositMoney(){
    System.out.println("Enter deposit amount");
    Scanner sc = new Scanner(System.in);
     float amount = sc.nextFloat();
     Balance = Balance + amount;
     System.out.println("Money deposited successfully");
     menu();
   }
 public static void main(String[] args) {
    atm obj = new atm();
    obj.checkpin();
 }

}
