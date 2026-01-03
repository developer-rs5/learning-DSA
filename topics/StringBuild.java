import java.util.*;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("HelloWorld");

        // int left = 0;
        // int right = sc.length() - 1;

        // while (left < right) {
        //     char temp = sc.charAt(left);
        //     sc.setCharAt(left, sc.charAt(right));
        //     sc.setCharAt(right, temp);

        //     left++;
        //     right--;
        // }

        // System.out.println(sc);

        for(int i = 0 ;i<sc.length()/2;i++){
            int front = i;
            int back = sc.length() - 1 - i;

            char frontChar = sc.charAt(front);
            char backChar = sc.charAt(back);

            sc.setCharAt(front, backChar);
            sc.setCharAt(back, frontChar);
        }
        System.out.println(sc);
    }
}
