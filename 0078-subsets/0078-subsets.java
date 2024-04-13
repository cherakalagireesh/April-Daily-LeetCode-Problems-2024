class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        int subsets = 1 << length;

        for(int i = 0 ; i < subsets ; i++)
        {
            List<Integer> subset = new ArrayList<>();

            for(int j = 0 ; j < length ; j++)
            {
                if( (i & (1 << j)) != 0)
                    subset.add(nums[j]);
            }

            ans.add(subset);
        }
        
        return ans;
    }
}