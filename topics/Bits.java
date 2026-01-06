public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int position = 1; 
        int bitMas = 1<<position;

        // if((bitMas & n)==0){
        //     System.out.println("zero");
        // }else{
        //     System.out.println("ek hai pai jaan");
        // }

        int newNum = bitMas | n;
        System.out.println(newNum);
    }
}
