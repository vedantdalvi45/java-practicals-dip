import java.util.Scanner;

/**
 * if_with_for
 */
public class if_with_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of number : ");
        int limit = sc.nextInt();
        for (int i = 1; i < limit; i=i+1) {
            if (i%2==0) 
                System.out.println(i+" Is odd");
                else
                System.out.println(i+" Is even");
        }
        sc.close();
    }
}