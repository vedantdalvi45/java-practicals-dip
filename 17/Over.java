class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
public class Over extends Vehicle {
    void run(){
        System.out.println("Over is running");
    }
    public static void main(String[] args) {
        Over o = new Over();
        o.run();
    }
}
