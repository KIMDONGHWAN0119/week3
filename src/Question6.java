import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if(n%4==0||n/100!=0||n%400==0){
            System.out.println("윤년");
        }else{
            System.out.println("윤년아님.");
        }
    }
}
