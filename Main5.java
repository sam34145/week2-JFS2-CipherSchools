import java.util.InputMismatchException;
import java.util.Scanner;

public class Main5 {

    int n1,n2,result;
    Scanner sc = new Scanner(System.in);
            void calculate(){

               try {
                   System.out.println("Enter First Number ");

                   n1 = sc.nextInt();

                   System.out.println("Enter Second Number ");
                   n2 = sc.nextInt();

                   result = n1 / n2;
               }
               catch (InputMismatchException ime){
                   System.out.println("IME Detected");
               }
               catch (ArithmeticException ae){
                   System.out.println("AE Detected");
               }
               catch (Exception e) {
                   System.out.println("Ouch!! Exception Detected! " + e.getMessage());
               }
                System.out.println("The Division is " + result);
            }

    public static void main(String[] args) {
        Main5 obj = new Main5();
        obj.calculate();
    }
}
