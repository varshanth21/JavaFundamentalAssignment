import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String numStr = String.valueOf(number);

        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {

            if (numStr.charAt(left) != numStr.charAt(right)) {
                System.out.println("It is NOT a Palindrome");
                sc.close();
                return;
            }

            left++;
            right--;
        }

        System.out.println("It is a Palindrome");

        sc.close();
    }
}