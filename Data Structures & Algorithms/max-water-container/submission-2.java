class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;
        int height=0;
        while(left<right)
        {
               int currheight=((right-left))*Math.min(heights[left],heights[right]);
            //    System.out.println("right -"+right +" | "+"left -"+left);
                height=Math.max(currheight,height);
                if(heights[left]<heights[right])
                {
                    left++;
                }else{
                    right--;
                }
        }
        return height;
        
    }
}
