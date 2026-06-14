class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       nums= Arrays.stream(nums).sorted().toArray();  
       Set<List<Integer>> arrs=new HashSet<>();

       for(int i=0;i<nums.length-2;i++)
       {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {

                if(i!=j && i!=k)
                {
                    int sum= -1*(nums[j]+nums[k]);
                    if(nums[i] < sum)
                    {
                // System.out.print(j +","+k);

                        j++;
                    }else if(nums[i]>sum)
                    {
                        k--;
                    }else{
                        arrs.add(List.of(nums[i],nums[j],nums[k]));
                        j++;
                    }
                    
                }
                
                
            }
       }
       return new ArrayList<>(arrs);

        
    }
}
