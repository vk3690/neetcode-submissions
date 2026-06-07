class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
    for(int num1:nums)
    {
        if(!set.add(num1))
        {
            return true;
        }

    }
    return false;
    }
}