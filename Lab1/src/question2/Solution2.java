package question2;


public class Solution2 {

	static int[] findUniqueElements(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			boolean flag = true;
			for(int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					flag = false;
					break;
				}
			}
			if (flag) count++;
		}
		int [] arry = new int[count];
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			boolean flag = true;
			for(int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					flag = false;
					break;
				}
			}
			if (flag) arry[index++] = a[i];
		}
		return arry;
	}
}
