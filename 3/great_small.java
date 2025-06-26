import java.util.*;

public class great_small {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = scn.nextInt();
        System.out.print("Enter Second Number : ");
        int b = scn.nextInt();

        if (a > b) {
            System.out.println("\n"+a+" Is the greater number.");
            System.out.println(b+" Is the Smaller number.");
        }       
        else if(a == b){
            System.out.println("\n"+a+" = "+b+" So,those two are Equal.");
        }
        else{
            System.out.println("\n"+b+" Is the greater number.");
            System.out.println(a+" Is the Smaller number.");
        }
        scn.close();
    }
}
