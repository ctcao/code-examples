package question3;

public class Solution2 {

	static int isPangram(String n) {
        if (n.length() < 26) {
            return 0;
        }
        for(char ch = 'A'; ch <='Z'; ch++) {
            if (n.indexOf(ch) < 0 && n.indexOf((char)(ch+32)) < 0){
                return 0;
            }
        }
        return 1;
    }
}
