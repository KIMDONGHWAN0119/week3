import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키 입력: ");
        double k = sc.nextDouble();
        System.out.print("몸무게 입력 : ");
        double m = sc.nextDouble();
        k/=100;
        double bmi = (m / (k*k));
        if(bmi >= 30){
            System.out.println("비만");
        }else if(bmi >= 25){
            System.out.println("과체중");
        }else if(bmi >= 18.5){
            System.out.println("정상");
        }else{
            System.out.println("저체중");
        }
    }
}
