//20301107 刘佳垚 2021.3.13
public class NestedLoops {
    public boolean isSubString(String check, String all) {
        int k = check.length();
        int a = all.length();
        int i = 0;
        int w = 0;
        do {
            for (; i <= a - k; i++) {
                //Use the charAt(int index) method in the String class to retrieve a specific character from a string
                if (check.charAt(w) == all.charAt(i)) {
                    w++;
                } else {
                    w = 0;
                }
                if (w == k) {
                    return true;
                }
            }
        } while (i <= a - k);
        return false;
    }
}

