public class NoMatchException {    
    String s;

    NoMatchException(String s) {
        this.s = s;

        if (s.equals("India")) {
            System.out.print("Matched!\n");
        } else {
            throw new NoMatchException("Not Matched!\n");
        }
    }
}
class Ex1 extends NoMatchException {
    public static void main(String[] a) {
        NoMatchException v = new NoMatchException("America");
    }
}
