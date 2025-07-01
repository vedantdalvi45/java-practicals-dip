
class add {
    int no1;
    int no2;

    add() {
        System.out.println("Constructor is called.");
    }

    add(int a, int b) {
        this.no1 = a;
        this.no2 = b;

    }
}

class Multi_const {

    public static void main(String[] args) {
        System.out.println("Default Constructor :");
        new add();
        System.out.println("Paramieterised Constructor : ");
        add ad = new add(20, 10);
        int c = ad.no1 + ad.no2;
        System.out.println("The addition is " + c);

    }

}
