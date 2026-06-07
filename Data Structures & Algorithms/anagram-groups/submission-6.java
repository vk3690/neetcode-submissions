class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,ArrayList<String>> map=new TreeMap<>();
        for(String str:strs)
        {
            int[] index=new int[26];
           for(char c:str.toCharArray())
           {
                index[Character.toLowerCase(c)-'a']++;
           }
           String sortStr=Arrays.toString(index);
           if(map.containsKey(sortStr))
           {
            map.get(sortStr).add(str);
           }else{
            map.put(sortStr,new ArrayList<>(List.of(str)));

           }
          
        }
        return new ArrayList<>(map.values());

    }
}
