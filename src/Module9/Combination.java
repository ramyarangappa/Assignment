package Module9;
//Combination Leetcode39
import java.util.*;
public class Combination {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            backtrack(res, new ArrayList<>(), candidates, target, 0);
            return res;
        }

        private static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] candidates, int target, int start) {
            if (target < 0) return;
            if (target == 0) {
                res.add(new ArrayList<>(temp));
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(res, temp, candidates, target - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }

        public static void main(String[] args) {
            int[] candidates = {2, 3, 6, 7};
            int target = 7;
            System.out.println(combinationSum(candidates, target));
        }
    }


