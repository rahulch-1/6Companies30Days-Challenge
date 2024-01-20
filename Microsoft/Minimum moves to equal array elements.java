//CHEREDDY RAHUL
class Solution {
    public int minMoves2(int[] nums) {
        //Sort the array
        Arrays.sort(nums);

        //Calculating the median
        int middleIndex=nums.length / 2;
        int median=nums[middleIndex];

        //Calculating the sum of absolute differences from the median
        int totalMoves=0;
        for (int i=0;i<nums.length;i++) {
            totalMoves+=Math.abs(nums[i]-median);
        }

        return totalMoves;
    }
}
