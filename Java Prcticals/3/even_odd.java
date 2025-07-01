import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int a = scn.nextInt();
        if (a%2==0) 
        
            System.out.println(a+" Is even Number.");            
                        
        else
            System.out.println(a+" Is odd Number.");
        scn.close();    
    }    
}
