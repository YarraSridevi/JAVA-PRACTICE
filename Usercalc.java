import java.util.Scanner;

public class Usercalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("First number:"+a);
        int b=sc.nextInt();
        System.out.println("Second number:"+b);
        char c=sc.next().charAt(0);
        System.out.println(c);
        
        if (c=='+')
        {
            System.out.println(add(a,b));
        }
        else if (c=='-')
        {
            System.out.println(sub(a,b));
        }
        else if (c=='*')
        {
            System.out.println(mul(a,b));
        }
        else if (c=='/') 
        {
            System.out.println(div(a,b));
        }
        else{
            System.out.println("Invalid input");
        }
    }
     public static int add(int a,int b){
    return a+b;
    }
     public static int sub(int a,int b){
    return a-b;
    }
     public static int mul(int a,int b){
    return a*b;
    }
     public static int div(int a,int b){
    return a/b;
    }
}
