import java.util.Scanner;
public class handling2  {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0 Exception caught");
        }
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught");
        }
        try {
            int arr[] = {1, 2, 3};
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught");
        }
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception caught");
        }
        try {
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();  
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input Mismatch Exception caught");
        }
    }
}