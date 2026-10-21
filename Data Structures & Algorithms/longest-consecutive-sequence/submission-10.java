class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        int Currentcount =1;
        int LongestCount=1;

        java.util.Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
                if (nums[i] == nums[i + 1]) continue;

                if(nums[i]+1==nums[i+1]){
                    Currentcount++;

                    if(Currentcount>LongestCount){
                        LongestCount =Currentcount;

                    }

                }
                else
                    Currentcount =1;

            }

        return LongestCount;
    }
}