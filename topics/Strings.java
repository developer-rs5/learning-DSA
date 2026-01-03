import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullLine = sc.nextLine();

        // System.out.println(fullLine);
        // System.out.print(fullLine.length());
        
        for(int i=0;i<fullLine.length();i++){
            System.out.println(fullLine.charAt(i));
        }
    }
}
