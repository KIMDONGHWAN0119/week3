import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("계절 판별기 - 월을 입력하세요. (1~12) : ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("겨울");
                break;
            case 2:
                System.out.println("겨울");
                break;
            case 3:
                System.out.println("봄");
                break;
            case 4:
                System.out.println("봄");
                break;
            case 5:
                System.out.println("봄");
                break;
            case 6:
                System.out.println("여름");
                break;
            case 7:
                System.out.println("여름");
                break;
            case 8:
                System.out.println("여름");
                break;
            case 9:
                System.out.println("가을");
                break;
            case 10:
                System.out.println("가을");
                break;
            case 11:
                System.out.println("가을");
                break;
            case 12:
                System.out.println("겨울");
                break;
        }
    }
}