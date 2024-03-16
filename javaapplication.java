package appliction;
import java.util.Scanner;
public class javaapplication {
	public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number1,number2,subtraction;
        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();
        subtraction = number1-number2;
        System.out.println("difference between two numbers"+subtraction);
        }
}
