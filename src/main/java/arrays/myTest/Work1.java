package arrays.myTest;

public class Work1 {


    public static StringBuilder[] getstr(String str) {
        StringBuilder[] restr = new StringBuilder[3];
        char[] chars = str.toCharArray();
        char val;
        int n = 0;
        for (int i = 0; i < chars.length && n < 3; i++) {
            val = str.charAt(i);
            if (val >= '0' && val <= '9') {
                if (n % 2 == 1)
                    n++;
                if (n % 2 == 0) {
                    if (restr[n] == null)
                        restr[n] = new StringBuilder();
                    restr[n].append(val);
                } else {
                    if (n % 2 == 0)
                        n++;
                    if (n % 2 == 1) {
                        if (restr[n] == null)
                            restr[n] = new StringBuilder();
                        restr[n].append(val);
                    }
                }
            }
            return restr;
        }
        return restr;
    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        StringBuilder[] getstr = getstr(args[0]);
        System.out.println(getstr[0]);
        System.out.println(getstr[1]);
        System.out.println(getstr[2]);
    }
}