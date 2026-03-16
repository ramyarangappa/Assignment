package Module9;

//Subset Leetcode78
    import java.util.*;

    class Subsets {

        static List<List<Integer>> result = new ArrayList<>();

        public static void backtrack(int[] nums, List<Integer> temp, int start) {

            result.add(new ArrayList<>(temp));

            for (int i = start; i < nums.length; i++) {

                temp.add(nums[i]);

                backtrack(nums, temp, i + 1);

                temp.remove(temp.size() - 1);
            }
        }

        public static void main(String[] args) {

            int[] nums = {1, 2, 3};

            backtrack(nums, new ArrayList<>(), 0);

            System.out.println(result);
        }
    }

