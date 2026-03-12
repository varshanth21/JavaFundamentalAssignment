import java.util.*;

public class gradcalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("grade");
        int grade = sc.nextInt();

        if(grade<0 || grade >100){
            System.out.println("invalid");
        }
        else if (grade >= 90) {
            System.out.println("Grade: A");
        }

        // Grade B
        else if (grade >= 80) {
            System.out.println("Grade: B");
        }

        // Grade C
        else if (grade >= 70) {
            System.out.println("Grade: C");
        }

        // Grade D
        else if (grade >= 60) {
            System.out.println("Grade: D");
        }

        // Grade F
        else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
  
