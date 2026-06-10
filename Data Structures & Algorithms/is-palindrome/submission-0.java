class Solution {
    public boolean isPalindrome(String s) {

        String a=s.replaceAll("[^a-zA-Z0-9]","");

        int end=a.length()-1;
        System.out.println(a);
        for(int i=0;i<a.length();i++)
        {
            if(i<=end )
            {
                // System.out.println(Character.toLowerCase(a.charAt(i))+ ", "+Character.toLowerCase(a.charAt(end)) );
            if(!(Character.toLowerCase(a.charAt(i))==Character.toLowerCase(a.charAt(end))))
            {
                return false;
            }
            end--;
            }else{
                break;
            }
        }
        return true;
        
    }
}
