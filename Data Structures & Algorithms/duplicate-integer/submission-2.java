

class Solution {
    public boolean hasDuplicate(int[] nums) {
boolean duplicate = false;

   Set<Integer> set = new HashSet<>();
   for (int num : nums) {
       if (set.contains(num)){
           duplicate = true;
       }
       set.add(num);
   }
   return duplicate;
   
    }
}