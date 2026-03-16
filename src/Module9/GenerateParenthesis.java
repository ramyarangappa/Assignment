package Module9;
// GenerateParenthesis Leetcode22
    import java.util.*;

    public class GenerateParenthesis {
        public static List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            backtrack(res, "", 0, 0, n);
            return res;
        }

        private static void backtrack(List<String> res, String curr, int open, int close, int max) {
            if (curr.length() == max * 2) {
                res.add(curr);
                return;
            }
            if (open < max)
                backtrack(res, curr + "(", open + 1, close, max);
            if (close < open)
                backtrack(res, curr + ")", open, close + 1, max);
        }

        public static void main(String[] args) {
            System.out.println(generateParenthesis(3));
        }
    }


