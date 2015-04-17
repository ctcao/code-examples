package question1;

public class Solution1 {

    static int[] mergeArrays(int[] a1, int[] a2, int[] a3) {

        int[] arry = new int[a1.length + a2.length + a3.length];
        int counter = 0;

        for(int i = 0; i < a1.length ; i++) {
            arry[counter]= a1[i];
            counter++;
        }

        for(int i = 0; i < a2.length ; i++) {
            arry[counter]= a2[i];
            counter++;
        }

        for(int i = 0; i < a3.length ; i++) {
            arry[counter]= a3[i];
            counter++;
        }
        return arry;
    }

}
