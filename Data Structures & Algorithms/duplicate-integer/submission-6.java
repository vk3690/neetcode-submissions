class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer,Integer> map=new Hashtable<>();
    for(int num1:nums)
    {
        if(!map.containsKey(num1))
        {
            map.put(num1,1);
        }else{
                return true;

        }

    }
    return false;
    }
}