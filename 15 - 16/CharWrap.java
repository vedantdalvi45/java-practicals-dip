public class CharWrap {
    public static void main(String[] args) {
        char c1,c2;
        c1 = '1';
        c2='a';
        System.out.println(c1+" is Digit is "+Character.isDigit(c1));
        System.out.println(c2+" is Digit is "+Character.isDigit(c2));
        System.out.println(c1+" is Lette is "+Character.isLetter(c1));
        System.out.println(c2+" is Letter is "+Character.isLetter(c2));
        System.out.println(c1+" is Lower Case is "+Character.isLowerCase(c1));
        System.out.println(c2+" is Lower Case is "+Character.isLowerCase(c2));
    }
}
