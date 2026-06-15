class Solution {
    public int trap(int[] height) {

       
       int leftind=0;
       int rightind=height.length-1;
       int water=0;
       int leftmax=height[0];
       int rightmax=height[height.length-1];

       while(leftind<rightind)
       {
            if(height[leftind]<height[rightind])
            {
                leftmax=Math.max(leftmax,height[leftind]);
                water=water+(leftmax-height[leftind]);
                leftind++;

            }else{
                rightmax=Math.max(rightmax,height[rightind]);
                water=water+(rightmax-height[rightind]);
                rightind--;
            }

       }
       return water;

       
    } 
    
}
