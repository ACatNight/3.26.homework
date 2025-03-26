import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int N = scanner.nextInt();
        if(N >= 90 && N <=100){
            System.out.println("A");
        }else if(N >= 80){
            System.out.println("B");
        }else if(N >= 70){
            System.out.println("C");
        }else if(N >= 60){
            System.out.println("D");
        }else if (N < 60 && N>=0) {
            System.out.println("F");
        }else {
            System.out.println("您输入的成绩错误");
        }
    }
}
