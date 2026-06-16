class Solution {
    public boolean checkInclusion(String s1, String s2) {


        int left=0;
        char[] sortedChars1=s1.toCharArray();
        Arrays.sort(sortedChars1);
        String sorteds1=new String(sortedChars1);
        for(int right=s1.length()-1;right<s2.length();right++)
        {
           char[] charSubString=s2.substring(left,right+1).toCharArray();
           Arrays.sort(charSubString);
          String sortedsubString =new String(charSubString);
        //   System.out.println(s2.substring(left,right+1) + "Sorted :"+sortedsubString);
          if(sortedsubString.equals(sorteds1))
          {
            return true;
          }
          left++;
        }
        return false;
    }

        
    }

