class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int[] a=new int[strs.length];
        Map<String,ArrayList<String>> map=new TreeMap<>();
        for(String str:strs)
        {
            str=str.toLowerCase();
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
            String sortStr=new String(chars);
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
