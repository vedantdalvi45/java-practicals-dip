public class Complex {
    int real;
    int img;
    Complex(int r,int i){
        this.real=r;
        this.img=i;
    }
    static void sum(Complex n1,Complex n2){
        Complex res = new Complex(0, 0);
        res.real = n1.real+n2.real;
        res.img = n1.img+n2.img;
        System.out.println(" "+n1.real+" "+n1.img+" i\n+");
        System.out.println(" "+n1.real+" "+n1.img+" i");
        System.out.println("--------");
        System.out.println(" "+res.real+" "+res.img+" i");
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        Complex c2 = new Complex(10, 20);
        sum(c1,c2);
    }
}
