import java.util.Scanner;
import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        System.out.println("How many elements you have to enter in vector : ");
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            System.out.print("Enter "+i+"th Element in vector : ");
            int ele = sc.nextInt();
            v.addElement(ele);
        }
        System.out.println("The elements in vector : "+v);
        sc.close();
    }
}
