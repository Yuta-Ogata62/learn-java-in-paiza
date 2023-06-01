import java.util.*;
public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();//1つ目のリストアイテム取得
        String line2 = sc.nextLine();//２つ目のリストアイテム取得
        int num1 = Integer.parseInt(line1);
        int num2 = Integer.parseInt(line2);
        System.out.println(num1 * num2);
    }
}