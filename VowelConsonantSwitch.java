import java.util.Scanner;

public class VowelConsonantSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a single alphabet: ");

        char ch = sc.next().charAt(0);

       
        ch = Character.toLowerCase(ch);

        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a Vowel");
                break;

            default:
                System.out.println("It is a Consonant");
        }

        sc.close();
    }
}