public class for6 {
    public static void main(String[] args) {
        int much = 0;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <=9; j++){
                much = i * j;
                System.out.println(i + "*" + j + "=" + much);
            }
            System.out.print("");
        }
    }
}
