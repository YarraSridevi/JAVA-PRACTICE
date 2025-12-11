import java.util.Random;
import java.util.Scanner;

public class votesimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur name:-");
        String Name = sc.nextLine();
        System.out.println("Enter ur Age:-");
        Random rc=new Random();
        int a = sc.nextInt();
        sc.nextLine();

        int sridevi=0;
        int sathwika=0;
        int pravardhan=0;
        int rahul=0;
        

        if (a >= 18) {
            System.out.println("Congrats You are Eligible to vote");
            System.out.println("Choose one among the following");
            System.out.println("sridevi");
            System.out.println("sathwika");
            System.out.println("pravardhan");
            System.out.println("rahul");
            String Vote = sc.nextLine();
             if (Vote.equals("sridevi")) {
                sridevi++;
            } 
            else if (Vote.equals("sathwika")) {
                sathwika++;
            } 
            else if (Vote.equals("pravardhan")) {
                pravardhan++;
            } 
            else if (Vote.equals("rahul")) {
                rahul++;
            } 
            else {
                System.out.println("Invalid vote. Not counted.");
            }
        } else {
            System.out.println("Sorry, you are NOT eligible to vote.");
        }
         sridevi+=rc.nextInt(200);
         sathwika+=rc.nextInt(200);
         pravardhan+=rc.nextInt(200);
         rahul+=rc.nextInt(200);
        System.out.println("Voting Results");
        System.out.println("sridevi Votes: " + sridevi);
        System.out.println("sathwika Votes: " + sathwika);
        System.out.println("pravardhan Votes: " + pravardhan);
        System.out.println("rahul Votes: " + rahul);

        sc.close();

    }
}
