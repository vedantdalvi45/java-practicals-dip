import java.util.Scanner;
import java.util.Vector;

public class Vec_Meth {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you have to enter in Vector : ");
        int no = sc.nextInt();      
        System.out.println("Enter Elements : "); 
        for (int i = 0; i < no; i++) {
            int n = sc.nextInt();
            v.addElement(n);
        }
        System.out.println("Elements in Vector are : "+v);
        System.out.println("v.capacity() : "+v.capacity());
        System.out.println("v.size() : "+v.size());
        System.out.println("v.contains(0) : "+v.contains(0));
        System.out.println("v.elementAt(0) : "+v.elementAt(0));
        System.out.println("v.firstElement() : "+v.firstElement());
        System.out.println("v.lastElement() : "+ v.lastElement());
        System.out.println("v.indexOf(0) : "+v.indexOf(0));
        v.insertElementAt(0, 0);
        System.out.println("v.insertElementAt(0, 0); : "+v);
        v.removeElement(0);
        System.out.println("v.removeElement(0); : "+v);
        System.out.println("v.size() : "+v.size());
        sc.close();
    }
}
