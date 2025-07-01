import java.util.Scanner;
class Area{
    float area(Float a , Float b){
        return a*b;
    }
}
class Volume extends Area  {
    float volume(Float a,Float b, Float c){
        return a*b*c;
    }
}
public class Rooom {
    public static void main(String[] args) {
        Volume v = new Volume();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Room :");
        float l = sc.nextInt();
        System.out.print("Enter the Width of Room :");
        float w = sc.nextInt();
        System.out.print("Enter the Height of Room :");
        float h= sc.nextInt();
        System.out.println("The area of Room is :"+v.area(l, w));
        System.out.println("The Volume of Room is :"+v.volume(l, w,h));
        sc.close();
    }
}
