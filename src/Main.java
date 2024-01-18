import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 15 ;
//        if(i%2 == 0) {
//            System.out.println(i+" la so chan ");
//        }
//        else {
//            System.out.println( i+ " la so le ");

//        int a = 11;
//        int b = 8;
//        int c = 5;
//        if(a>b){
//            if(a>c){
//            System.out.println(a+ " la so lon nhat");
//            }else{
//            System.out.println(c+ " la so lon nhat");
//            }
//        }else{
//            if(b<c){
//                System.out.println(c+ " la so lon nhat");
//            }else{
//                System.out.println(b+ " la so lon nhat ");
//            }
//        }
//        double score = 7.5;
//        if(score>=8){
//            System.out.println("hoc sinh gioi");
//        }else if (score<8 && score>=6.5){
//            System.out.println("hoc sinh kha");
//        }else {
//            System.out.println("hoc sinh trung binh ");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tham so a , b trong phuong trinh ax+b = 0 ");
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float x = -b/a;
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a!=0) {
            System.out.println("phuong trinh co nghiem duy nhat la " +x);
        }



    }
}




