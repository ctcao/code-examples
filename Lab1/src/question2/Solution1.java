package question2;

public class Solution1 {

    static int[] findUniqueElements(int[] a) {
        int [] counter = new int[101];
        int count=0;
        int index =0;

        for(int i = 0; i < a.length; i++) {
            counter[a[i]]++;
        }

        for(int i = 0; i < counter.length; i++) {
            if( counter[i] == 1) {
                count++;
            }
        }

        int [] arry = new int[count];
        for(int i = 0; i < a.length; i++) {
            if(counter[a[i]] == 1) {
                arry[index] = a[i];
                index++;
            }
        }
        return arry;
    }
}
