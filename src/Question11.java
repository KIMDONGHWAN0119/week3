import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        System.out.print("1번째 값 입력 :");
        arr[0] = sc.nextInt();
        System.out.print("2번째 값 입력 :");
        arr[1] = sc.nextInt();
        System.out.print("3번째 값 입력 :");
        arr[2] = sc.nextInt();
        int m = arr[0];

        for(int i=1;i<3;i++){
            for(int j=0; j<i; j++){
                if(m < arr[i]) {
                    m = arr[i];
                };
            }
        }
        System.out.println(m);
    }
}
