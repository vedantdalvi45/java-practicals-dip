public class Arr {
    public static void main(String[] args) {
        int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
        //inta[] = new int[5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|"+ar[i][j]+"|");
            }
            System.out.println();
        }
    }
}
