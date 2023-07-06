package sel2in.leet.dynamic;

public class Validpare {

    public static final char CLOS = ')';
    public static final char OPN = '(';
    int testCases = 0;
    int failedTestCases = 0;

    //if extra opens - then rest from first open of that set are all invalid
    public static void main(String[] args) {
        Validpare app = new Validpare();
        app.tesCases();
    }

    private void tesCases() {
        //java.time.LocalDateTime.now()
        System.out.println(this.getClass().getCanonicalName() + " Test cases start at " + java.time.LocalDateTime.now() + ".");
        test("()", 2);
        test("", 0);

        test("())", 2);
        test(")((()()()", 0);
        test(")(())(", 4);
        test("(((()((", 2);
        test(")(()())(", 6);
        test(")(()(()))(", 8);
        test(")(((())(())))(((", 12);
        test(")))))(((", 0);
        test("(((()))))))", 8);
        test("))))))))(((((", 0);
        test(")())))))(()(((((()(((((", 6);
        test("())))))(()(((((()(((((", 6);
        test(")())))))(()(((((()", 6);
        test("())))))(()(((((()(((((", 6);
        test("())))))(()(((((()", 6);
        test("()()()", 6);


        test("(", 0);
        test("(((", 0);
        test(")", 0);
        test(")))", 0);
        System.out.println("Remember for failed test cases check the test case and the logic");
        System.out.println("test cases " + testCases + " fails :" + failedTestCases);
    }

    private void test(String testStr, int expectedValue) {
        testCases++;
        int actualResult = 0;
        try {
            actualResult = longestValidParentheses(testStr);
        } catch (Exception e) {
            System.out.println("Exce " + e + ", input str :" + testStr + "; expected :" + expectedValue);
        }
        if (actualResult != expectedValue) {
            failedTestCases++;
            System.out.println("failed test Case, input str :" + testStr + "; expected :" + expectedValue + " actual :" + actualResult);
        }
    }

    public int longestValidParentheses(String s) {

        return -1;
    }

    private int recalcStartLast(String s, int startLast, int open, int startFrom) {
        startLast--;
        while (startLast > -1 && startLast >= startFrom) {

            char c = s.charAt(startLast);
            if (c == CLOS) break;
            startLast--;
        }
        if (startLast < startFrom) return -1;
        return startLast;
    }


    int check2(String in, int posFrom, int open, int since) {
        return -1;
    }

}
