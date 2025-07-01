import java.util.*;
class great_small{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First No : ");
        int a = sc.nextInt();
        System.out.print("Enter Second No : ");
        int b = sc.nextInt();
        if(a<b)
        System.out.print(a+" is Smaller Than "+b);
        else if(a<b)
        System.out.print(a+" = "+b);
        else
        System.out.print(a+" is Greater Than "+b);
        sc.close();
    }
}