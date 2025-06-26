import java.io.FileNotFoundException;
import java.util.Scanner;
interface Area{
    double area(double a,double b);
}
class Circle implements Area{
    public double area(double a ,double b){
        return 3.14*a*b;
    }
}
class Rectangle implements Area{
    public double area(double a, double b){
        return a*b ;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length :");
        double a = sc.nextInt();
        System.out.print("Ennter the width/base :");
        double b = sc.nextInt();
        System.out.println("Area of Rectangle is : "+r.area(a, b));
        System.out.println("Area of Circle is : "+c.area(a, b));
    }
}
