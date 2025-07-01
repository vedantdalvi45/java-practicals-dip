import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = scn.nextInt();
        System.out.print("Enter Second Number : ");
        int b = scn.nextInt();

        int res = (a < b) ? (a+b) : (a-b);
        System.out.print("so , the result is  " + res);
        
        scn.close();
    }
}
