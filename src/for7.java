import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = scanner.nextInt();
        for(int i = 1;i <= n ; i++){
            if(i / i ==0){
                System.out.println("是质数");
            }else{
                System.out.println("不是质数");
            }
        }
    }
}
