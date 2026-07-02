class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        boolean res = false;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
              res =  true;
            set.add(nums[i]);
        }
        return res;
        
    }
}