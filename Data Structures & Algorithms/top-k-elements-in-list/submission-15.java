class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 int size=nums.length;

     
Map<Integer,Integer> map=  Arrays.stream(nums).boxed().collect(Collectors.
                        toMap(i->i ,i->1,(a,b)->a+b));

      
                return map.keySet().stream().sorted(
                    (a,b)->
                    {
                        if(map.get(a)>map.get(b)) {
                                return -1;
                            }else if (map.get(a)<map.get(b)){
                                return 1;
                            }else{
                                return 0;
                            }   
                    }
                    )
                .limit(k).
                mapToInt(Integer::intValue).toArray();

           
    }
}
