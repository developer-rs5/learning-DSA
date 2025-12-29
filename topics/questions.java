import java.util.Scanner;

public class questions {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // int y = sc.nextInt();
    // int z = sc.nextInt();

    // avg(x, y, z);
    // }
    // public static void avg(int x,int y,int z){
    // int avg = (x+y+z) / 3;
    // System.out.print(avg);
    // }

    // public static void main(String[] args) {
    // int r = 5;

    // double c = 2 * r * Math.PI;

    // System.out.println(c);
    // }

    // public static void main(String[] args) {
    //     gcdBrute(0, 0);
    // }

    // public static int gcdBrute(int a, int b) {
    //     int gcd = 1;
    //     int limit = Math.min(a, b);

    //     for (int i = 1; i <= limit; i++) {
    //         if (a % i == 0 && b % i == 0) {
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
