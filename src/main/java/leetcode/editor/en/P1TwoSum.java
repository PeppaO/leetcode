//Given an array of integers nums and an integer target, return indices of the t
//wo numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may n
//ot use the same element twice.
//
// You can return the answer in any order.
//
//
// Example 1:
//
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//
// Example 2:
//
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//
//
// Example 3:
//
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//
// Constraints:
//
//
// 2 <= nums.length <= 103
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
//
// Related Topics Array Hash Table
// 👍 20850 👎 727

package leetcode.editor.en;

import java.util.HashMap;

// java : Two Sum
public class P1TwoSum{
    public static void main(String[] args){
        Solution solution = new P1TwoSum().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<nums.length;i++){
                int tmp = target - nums[i];
                if(map.containsKey(tmp) ){
                    return new int[]{map.get(tmp),i};
                }
                map.put(nums[i],i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
