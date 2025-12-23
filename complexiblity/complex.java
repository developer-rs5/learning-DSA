package complexiblity;
public class complex {      
    static void constTime() {
        int array[] = {
            1, 2, 3, 4, 4, 3, 6, 3, 6, 3663, 6, 453, 3, 53, 3, 2, 3, 5, 6, 24, 2, 2, 52, 5, 5,
        };

        System.out.println(array[0]);
        // O(n)

    }

    static void linearTime() {
        int array[] = {
                1, 2, 3, 3, 52, 6, 22, 6, 62, 2622
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
    } //0(n)

    static void quadraticTime(){

    } //t(n*n)

    public static void main(String[] args) {
        // constTime();
        linearTime();
    }
}
