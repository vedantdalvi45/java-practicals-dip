import java.util.*;
class Eodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a =sc.nextInt();

        if (a%2==0)
        System.out.println(a+" Is Enven");
        else
        System.out.print(a+" Is Odd");
    }
}