import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner=new Scanner(System.in);//让用户输入数字的函数
        System.out.println("请输入数字");
         int N =scanner.nextInt();//读取 用户输入的整数
        for(int i=1;i<=N;i++){
            sum = i + sum;
    }
        System.out.println(sum);
    }
}
