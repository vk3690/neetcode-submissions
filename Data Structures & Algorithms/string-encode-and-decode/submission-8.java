class Solution {

    public String encode(List<String> strs) {
        StringBuilder stb=new StringBuilder();
            for(String str:strs)
            {   
                stb.append(str.length()).append("-").append(str);
            }
            return stb.toString();


    }

    public List<String> decode(String str) {

        List<String> strs=new ArrayList<>();
        if( str.isEmpty())
        {
            return strs;
        }
            Integer start=str.indexOf("-");
            Integer lenOfStr=Integer.valueOf((str.substring(0,start)));
            start++;
            Integer end=start+lenOfStr;
        while(!str.isEmpty())
        {

           String substring=str.substring(start,end);
            // System.out.println(substring);
           strs.add(substring);
           str=str.substring(end);
            // System.out.println(str);
            start=str.indexOf("-");
                        // System.out.println(start);
            if(start>0)
            {
             lenOfStr=Integer.valueOf((str.substring(0,start)));
             start++;
             end=start+lenOfStr;
             
            }else{
                break;
            }
        }
        
        return strs;

    }
}
