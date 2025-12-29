import java.util.*;


public class D2Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int find = sc.nextInt();

        int arr[][] = new int[row][colum];
        
        for (int i = 0; i < row; i++) {
            System.out.println("ENTER "+i+" ROW DIGITS");
            for(int j=0;j<colum;j++){
                arr[i][j] = sc.nextInt();              
            };
        }
        // System.out.println("pringting array");

        // for(int i = 0; i<row;i++){
        //     System.out.println(i+" NUMBER ROW DATA.");
        //     for(int j = 0; j<colum; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.err.println("");
        // }

        for(int i = 0; i<row; i++){
            for(int j= 0; j<colum;j++){
                if(arr[i][j]==find){
                    System.out.println("The "+find+" is on "+ i+","+j);
                }
            }
        }
    }
}