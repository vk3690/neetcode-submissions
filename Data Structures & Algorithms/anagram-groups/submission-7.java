class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      return  Arrays.stream(strs).collect(Collectors.groupingBy(i->{
                char[] a=i.toCharArray();
                Arrays.sort(a);
                return new String(a);
            }
        )).values().stream().collect(Collectors.toList());

        
        
    }
}
