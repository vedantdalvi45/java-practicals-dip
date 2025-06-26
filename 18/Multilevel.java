
class Salary1{
    float s = 3100;
}
class Salary2 extends Salary1{
    float s2 = 2100;
}
class Salary3 extends Salary2{
    float s3=1100;
}
public class  Multilevel extends Salary1{
    
    public static void main(String[] args) {
        Salary3 m = new Salary3();
        System.out.println("The salary of parant is :"+m.s);
        System.out.println("The salary of Child1 is :"+m.s2);
        System.out.println("The salary of Child2 is :"+m.s3);
    }
}
