import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Letter : ");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'a':
                System.out.println(a+" is vowel");
                break;
            case 'e':
                System.out.println(a+" is vowel");
                break;
            case 'i':
                System.out.println(a+" is vowel");
                break;
            case 'o':
                System.out.println(a+" is vowel");
                break;
            case 'u':
                System.out.println(a+" is vowel");
                break;
            default:
            System.out.println(a+" is consonent");
                break;
        }
        sc.close();
    }
}