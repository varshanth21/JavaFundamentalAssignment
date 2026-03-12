import java.util.Scanner;

public class fact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int factorial = 1;  
        while (number > 0) {

            factorial = factorial * number;

            number--;
        }
        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}