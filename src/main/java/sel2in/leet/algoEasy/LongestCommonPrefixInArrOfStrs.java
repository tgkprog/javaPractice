package sel2in.leet.algoEasy;

import sel2in.leet.algoEasy.longst.LongestCommonPrefix;
import sel2in.leet.algoEasy.longst.WithChar;
import sel2in.leet.algoEasy.longst.WithStr;

import java.util.Arrays;

    public class LongestCommonPrefixInArrOfStrs {

    int testCases = 0;
    int failedTestCases = 0;
    StringBuilder msgs = new StringBuilder();

    LongestCommonPrefix impl;

    //if extra opens - then rest from first open of that set are all invalid
    public static void main(String[] args) {
        LongestCommonPrefixInArrOfStrs app = new LongestCommonPrefixInArrOfStrs();
        app.timeTests();
        System.out.println("2nd run");
        app.timeTests();

    }

    void timeTests() {
        impl = new WithChar();
        tesCases();
        tesCases();
        tesCases();
        impl = new WithStr();
        tesCases();
        tesCases();
        tesCases();
    }

    private void test(String[] in, String expectedValue) {
        testCases++;
        String actualResult = null;
        try {
            actualResult = impl.longestCommonPrefix(in);
        } catch (Exception e) {
            storeMsg("Exce " + e + ", input str :" + Arrays.toString(in) + "; expected :" + expectedValue);
        }
        if (!actualResult.equals(expectedValue)) {
            failedTestCases++;
            storeMsg("failed test Case, input str :" + Arrays.toString(in) + "; expected :" + expectedValue + " actual :" + actualResult);
        }
    }

    private void tesCases() {

        //warming up jvm
        final long startTime = System.nanoTime();
        for (int i = 0; i < 15000; i++) {

            test(new String[]{"flower", "flow", "flight"}, "fl");
            test(new String[]{"gflower", "flow", "flight"}, "");
            msgs.delete(0, msgs.length());
        }
        //reset
        testCases = 0;
        failedTestCases = 0;
        System.out.println(this.getClass().getCanonicalName() + " Test cases start at " + java.time.LocalDateTime.now() + ".");

        test(new String[]{"flower", "flow", "flight"}, "fl");
        test(new String[]{"gflower", "flow", "flight"}, "");
        test(new String[]{"radio", "love", "bog"}, "");
        test(new String[]{"shadow", "shadowlight", "shadowdark"}, "shadow");
        test(new String[]{"12radio", "12love", "12bog"}, "12");
        test(new String[]{"aradio", "alove", "abog"}, "a");
        test(new String[]{"a radio", "a love", "a bog"}, "a ");
        test(new String[]{"a shadow", "a shadowlight", "a shadowdark"}, "a shadow");
        final long endTime = System.nanoTime();
        final long tm1 = endTime - startTime;
        final long tm2 = tm1 / 1000;
        final long tm3 = tm2 / 1000;
        System.out.println(msgs);
        System.out.println("Remember for failed test cases check the test case and the logic");
        System.out.println("For " + impl.getClass().getSimpleName() + ", test cases " + testCases + " fails :" + failedTestCases);
        System.out.println("Nano secs past " + (tm1) + " by 1000 :" + tm2 + " by 10^6 :" + tm3);

    }

    void storeMsg(String s) {
        msgs.append(s).append("\n\r");
    }


}
