import java.util.Scanner;

 class Question12 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = 0;
         int awr = 0;
         for(int i = 0; i < 4; i++){
             System.out.print((i+1)+"째 값 입력 : ");
             n = sc.nextInt();
             awr += n;
         }

         if(awr / 4 >= 90){
            System.out.println("A");
         }else if(awr / 4 >= 80){
             System.out.println("B");
         }else if(awr / 4 >= 70){
             System.out.println("C");
         }else if(awr / 4 >= 60){
             System.out.println("D");
         }else{
             System.out.println("F");
         }

     }
}
