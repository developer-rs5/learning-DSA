import java.util.*;

public class req {
    public static void main(String[] args) {
    
        int n = 4;
        int x = 5;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();

        for(int i=0; i<n;i++){
            for(int j=0; j<x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
