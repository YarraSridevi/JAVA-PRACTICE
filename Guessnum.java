import java.util.Random;
import java.util.Scanner;


public class Guessnum {
    
    public static void main(String[] args) {
        Random rc=new Random();    //making an obj of random class
        Scanner sc=new Scanner(System.in);  //making an obj of Scanner class
        int num=rc.nextInt(10);
        int attempts=1;
        int guess=0;
        while(num!=guess)
        {
            System.out.println("Enter a number between 1 and 100:");
            guess=sc.nextInt(); //take user input
            if(guess==num){
                System.out.println("You got the  correct number!"+"with number of attempts"+attempts);
                break;
            }
            else if(guess<num){
                System.out.println("Your num is less than actual num"+"with num of attempts"+attempts++);
            }
            else {
                System.out.println("Your num is greater than actual num"+"with num of attempts"+attempts++);
            }

        }

    }
}
