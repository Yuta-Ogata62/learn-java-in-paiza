 import java.util.*;
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String result1 = line.substring(0, 1);//index 0番めから１つ取得
        String result2 = line.substring(line.length()-1);// リストの長さから-1でlastindex取得
        System.out.println(result1 + result2);
    
    }
}