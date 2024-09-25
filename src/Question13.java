import java.util.Scanner;


public class Question13 {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 값 입력 : ");
        int n1 = sc.nextInt();
        System.out.print("두번째 값 입력 : ");
        int n2 = sc.nextInt();
        System.out.print("세번째 값 입력 : ");
        int n3 = sc.nextInt();
        System.out.print("첫번째 부호 입력 : ");
        String sign1 = sc.next();
        System.out.print("두번째 부호 입력 : ");
        String sign2 = sc.next();

        switch(sign1){
            case "*": number += (n1 * n2); break;
            case "/": number += (n1 / n2); break;
            default:switch(sign2){
                case "+": number += (n1 + n2); break;
                case "-": number += (n1 - n2); break;
            }
        }

        switch(sign2){
            case "*": number = (number * n3); break;
            case "/": number = (number / n3); break;
            default:switch(sign2){
                case "+": number = (number + n3); break;
                case "-": number = (number - n3); break;
            }
        }

        System.out.println(number);

    }
}
