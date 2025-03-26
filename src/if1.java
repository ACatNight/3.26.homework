import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = scanner.nextInt();
        if(n % 2 ==0){
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "是奇数");
        }
    }
}
