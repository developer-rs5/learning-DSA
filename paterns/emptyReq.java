public class emptyReq {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == m || j == n) {
                    System.err.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
}
