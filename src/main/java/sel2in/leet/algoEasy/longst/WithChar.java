package sel2in.leet.algoEasy.longst;

public class WithChar implements LongestCommonPrefix {

    /*Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".



    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.



    Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.

    */
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
        char cur;
        StringBuilder pos = new StringBuilder();
        while (ln <= shortestLn) {
            cur = strs[0].charAt(ln - 1);
            for (int i = 1; i < strs.length; i++) {
                if (cur != strs[i].charAt(ln - 1)) {
                    return pos.toString();
                }
            }
            pos.append(cur);
            ln++;
        }
        return pos.toString();
    }
}
