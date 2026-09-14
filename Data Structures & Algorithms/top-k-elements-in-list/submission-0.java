
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
  Map<Integer,Integer> count =  new HashMap<>();
    for(int i :nums){
        count.put(i,count.getOrDefault(i,0)+1);

    }

    List<int[]> set = new ArrayList<>();
    for(Map.Entry<Integer,Integer> entry: count.entrySet()){
        set.add(new int[] {entry.getValue(),entry.getKey()});
    }
        set.sort((a,b)->b[0]-a[0]);
    int[] res = new int[k];

    for(int i =0 ; i<k;i++){
        res[i] =set.get(i)[1];

    }
return res;


    }
}