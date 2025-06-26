import java.util.*;
class Vow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Char : ");
        char a = sc.next().charAt(0);

        switch (a) {
            case 'a':
            System.out.print(a+" is a vowel.");
                break;
                case 'e':
            System.out.print(a+" is a vowel.");
                break;
                case 'i':
            System.out.print(a+" is a vowel.");
                break;
                case 'o':
            System.out.print(a+" is a vowel.");
                break;
                case 'u':
            System.out.print(a+" is a vowel.");
                break;
        
            default:
            System.out.print(a+" is a consonent.");
                break;
        }
    }
}