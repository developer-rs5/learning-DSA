public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[5];
        // marks[0]=92;
        // marks[1]=44;
        // marks[2]=67;
        // marks[3]=82;

        
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        int q[] = {2,4,6,7,2,4,6,3,11,4,2};
        int find = 11;
        for(int i = 0; i<q.length; i++){
            if(q[i]==find) System.out.println(find +" is on "+(i+1)+"th number.");
        }
    }
}
