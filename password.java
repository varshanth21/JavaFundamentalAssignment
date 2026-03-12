import java.util.Scanner;

public class password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String secretPassword = "java123";
        String userInput;

        do {

            System.out.print("Enter the password: ");
            userInput = sc.nextLine();

            if (!userInput.equals(secretPassword)) {
                System.out.println("Wrong password. Try again.");
            }

        } while (!userInput.equals(secretPassword));

        System.out.println("Access Granted");

        sc.close();
    }
}