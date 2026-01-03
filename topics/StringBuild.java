import java.util.*;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("HelloWorld");

        int left = 0;
        int right = sc.length() - 1;

        while (left < right) {
            char temp = sc.charAt(left);
            sc.setCharAt(left, sc.charAt(right));
            sc.setCharAt(right, temp);

            left++;
            right--;
        }

        System.out.println(sc);
    }
}
