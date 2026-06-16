class Solution {
    public int characterReplacement(String s, int k) {

        int[] chars=new int[26];
        int left=0;
        int maxFreq=0;
        int maxLenght=0;
        for(int right=0;right<s.length();right++)
        {
            chars[s.charAt(right)-'A']++;
            maxFreq=Math.max(chars[s.charAt(right)-'A'],maxFreq);

            if((right-left+1)-maxFreq>k)
            {
                // System.out.println("right : "+right+" left : "+left);
              chars[s.charAt(left)-'A']--;
              left++;  
            }

maxLenght=Math.max(maxLenght,right-left+1);

        }
        return maxLenght;
        
    }
}
