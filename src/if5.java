import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("是负数");
        } else if (n > 0) {
            System.out.println("是正数");
        } else {
            System.out.println("是零");
        }
    }
}
