import java.util.Random;
import java.util.Scanner;

public class ifZ {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏");
        int r = random.nextInt(100) + 1;
        int a = 0;
        boolean b = false;
        while(!b){
            int n = scanner.nextInt();
            a=a+1;
            if(n == r){
                System.out.println("恭喜你猜对了" + ",一共猜了" + a);
                b = true;
            }else if(n < r){
                System.out.println("太小了");
            }else if(n > r){
                System.out.println("太大了");
            }
        }

        }
    }

