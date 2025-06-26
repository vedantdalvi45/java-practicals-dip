import java.util.*;
class Eodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Number : ");
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            if (i%2==0){
            System.out.println(i+" is even no");}
            else{
            System.out.println(i+" is odd no");}
        }
    }
}