import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int age = sc.nextInt();
        if (age >= 18) {System.out.print("성인입니다"); } else {System.out.print("미성년자입니다.");}
    }
}
