package Module9;
//Permutations Leetcode46
    import java.util.*;

    public class Permutations {

        static List<List<Integer>> result = new ArrayList<>();

        public static void permute(int[] nums, List<Integer> temp) {

            if (temp.size() == nums.length) {

                result.add(new ArrayList<>(temp));
                return;
            }

            for (int num : nums) {

                if (temp.contains(num))
                    continue;

                temp.add(num);

                permute(nums, temp);

                temp.remove(temp.size() - 1);
            }
        }

        public static void main(String[] args) {

            int[] nums = {1, 2, 3};

            permute(nums, new ArrayList<>());

            System.out.println(result);
        }
    }

