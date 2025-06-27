package number_game;
//import java.util.Random;
import java.util.*;
public class numbergame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int randomNumber = random.nextInt(100) + 1;
//        System.out.println("Random number between 1 and 100: " + randomNumber);
        System.out.println("***--------WELCOME TO NUMBER GAME --------***");
        int count=0;
        for(int i=1;i<=3;i++){
            System.out.print("Guess the number : ");
            int num= sc.nextInt();
            if(num>randomNumber){
                System.out.println("its too high");
            }else if(num<randomNumber){
                System.out.println("its too low");
            }else{
                count++;
                System.out.println("guess is correct ");

            }
        }
//        System.out.println();
//        System.out.println("Congratulation you win \n"+"Your score is : "+count);

        for (int i=1;i<5;i++) {
            System.out.print("IF YOU WANT TO EXIT THE GAME ENTER  1   AND IF YOU WANT TO CONTINUE THE GAME PLEASE PREE 2 : ");
            int p = sc.nextInt();

            if (p == 1) {
                System.out.println("thanks to play");
                break;
            } else if (p == 2) {
                for (int a= 1;  a<= 3; a++) {
                    System.out.print("Guess the number : ");
                    int num = sc.nextInt();
                    if (num > randomNumber) {
                        System.out.println("its too high");
                    } else if (num < randomNumber) {
                        System.out.println("its too low");
                    } else {
                        count++;
                        System.out.println("guess is correct ");

                    }
                }
            } else {
                System.out.println("sorry invalid syntax");
                break;
            }
        }
        System.out.println();
        System.out.print("Congratulation you win \n"+"Your score is : "+count);
    }
}
