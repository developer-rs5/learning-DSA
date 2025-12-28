import java.util.*;

public class functions{
    
    // public static void PrintMyName(String name){
    //     System.out.print(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     // PrintMyName("bilu badmos");

    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
    //     PrintMyName(name);
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = sumTwoNumber(a, b);
    //     System.out.println(sum);
    // }

    // public static int sumTwoNumber(int a, int b){
    //     // System.out.println(a+b);
    //     return a+b; 
    // }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Factorial(a);
    }

    public static void Factorial(int a){
        if(0==a){
            System.out.println("0");
            return;
        }
        if(a<0){
            System.out.println("Number cant be negative for factorial .");
            return;
        }
        int fac = 1;
        for(int i=a;i>=1;i--){
            fac = fac * i;
        }
        System.out.println(fac);
        return;
    }
}