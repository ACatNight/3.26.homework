
import java.util.Scanner;

public class forz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多个数字");
        int count = 0;
        int max = 0;

        while(true){
            int n = scanner.nextInt();
            if(n == -1){
              break;
            }
            if(n>max){
                max = n;
                count = 1;
            }
            if(n ==max){
                count = count + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
    }
