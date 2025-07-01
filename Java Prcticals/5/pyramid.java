
public class pyramid {
    
    public static void main(String[] args) {
        int r=9,i;
        for( i=0;i<=r-1;i++){
        for (int space = r-i; space > 0 ; space--)
            System.out.print(" ");
        
        for(int j=0;j <= i ;j++)
            System.out.print(" *");
        
         System.out.println();
        }
    }    
}
