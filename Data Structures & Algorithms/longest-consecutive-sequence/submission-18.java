class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length<=0)
        {
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
   
            set.add(nums[i]);
         
        }
        int largecount=0;

        for(Integer in:set)
        {

           if(set.contains(in))
           {
                int diff=in+1;
                int count=1;
                while(set.contains(diff))
                {
                    count++;
                    diff++;
                }
                if(largecount<count)
                {
                    largecount=count;
                }
           } 
        }
 
        return largecount;
        
    }
}
