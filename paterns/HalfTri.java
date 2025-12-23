package paterns;

public class HalfTri {
    public static void main(String[] args) {
        int n = 5;

        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        // for(int i=n;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        // for(int i=0; i<=n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.err.println();
        // }

        // for(int i=n; i>0;i--){
        //     for(int j=1; j<=i;j++){
        //         System.err.print(j);
        //     }
        //     System.out.println();
        // }
        int x = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                ++x;
            }
            System.err.println();
        }


    }
}
