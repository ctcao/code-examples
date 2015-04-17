package question3;

public class Solution1 {

    static int[] shiftArray(int[] a, int n) {
        int[] arry = new int[a.length];
        for(int i = 0; i < a.length; i ++) {
            arry[(i + n) % a.length] = a[i];
        }
        return arry;
    }
}
