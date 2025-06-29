//package oops;
import java.util.Scanner;
public class atm {
    public  static  class account{
        int balance;
        public  account(int balance){
            this.balance = balance;
        }
        public  void  deposite(int amount){
            this.balance+=amount;
            System.out.println("Current Balance : "+balance);
            System.out.println();
        }
        public void withdraw(int amount){
            if( amount<=balance){
                this.balance-=amount;
                System.out.println("Amount Withdraw successfully");
            }else{
                System.out.println("Amount out of range");
            }System.out.println("Current Balance: " + balance);
            System.out.println();
        }
        public void checkbalance(){
            System.out.println("Current Balance : "+balance);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        account Account = new account(100);
        while(true) {
            System.out.println("Enter what u want ");
            System.out.println("1. deposite amount");
            System.out.println("2.withdraw amount");
            System.out.println("3.check_balance");
            System.out.println("4.Exit");
            System.out.println();

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposite amount : ");
                Account.deposite(sc.nextInt());
                System.out.println("Amount deposite succesfully");

            }
            else if (choice == 2) {
                System.out.print("Enter withdrawal amount : ");
                Account.withdraw(sc.nextInt());
            }else if(choice==3){
                Account.checkbalance();
            }
            else if(choice==4){
                break;
            }else{
                System.out.println("Invalid option");
                break;
            }
        }

    }
}
