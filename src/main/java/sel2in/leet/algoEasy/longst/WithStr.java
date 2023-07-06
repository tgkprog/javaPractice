package sel2in.leet.algoEasy.longst;

public class WithStr implements LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int shortestIs = -1;
        int shortestLn = 201;
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (s.length() < shortestLn) {
                shortestIs = i;
                shortestLn = s.length();
            }
        }
        int ln = 1;
        String cur = null;
        String pos = "";
        while (ln <= shortestLn) {
            cur = strs[0].substring(0, ln);
            for (int i = 1; i < strs.length; i++) {
                if (!cur.equals(strs[i].substring(0, ln))) {
                    return pos;
                }
            }
            pos = cur;
            ln++;
        }
        return pos;
    }
}
