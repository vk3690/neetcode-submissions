class Solution {
    public int lengthOfLongestSubstring(String s) {

        String ans="";
        String subString="";
        for(int i=0;i<s.length();i++)
        {
            String a= String.valueOf(s.charAt(i));
            if(!subString.contains(a))
            {
                    subString=subString+a;
            }else 
            {
                if(ans.length()<subString.length())
                {
                ans=subString;
                }
               
                subString=subString.substring(subString.indexOf(a)+1)+a;
            }
        }
        System.out.println(ans);
        if(ans.length()<subString.length())
        {
                            ans=subString;

        }
        return ans.length();
        
    }
}
