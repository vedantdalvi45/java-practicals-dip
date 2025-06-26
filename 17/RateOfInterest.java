class Bank{
    int Interest(){
        return 0;
    }
}
class SBI extends Bank{
    int Interest(){return 8;}
}
class HDFC {
    int Interest(){return 10;}
}
class MAHARASHTRA{
    int Interest(){ return 7;}
}
public class RateOfInterest {
    public static void main(String[] args) {
        SBI a =new SBI();
        HDFC b = new HDFC();
        MAHARASHTRA c =  new MAHARASHTRA();
        System.out.println("Rate of Interest Of SBI : "+a.Interest());
        System.out.println("Rate of Interest Of HDFC : "+b.Interest());
        System.out.println("Rate of Interest Of MAHARASHTRA : "+c.Interest());
    }
}
