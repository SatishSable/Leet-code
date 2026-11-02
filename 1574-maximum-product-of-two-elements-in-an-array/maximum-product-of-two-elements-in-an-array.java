class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMAX = Integer.MIN_VALUE;

    for(int i = 0; i < nums.length ; i++){
        if(nums[i] > max){
            secMAX = max;
            max = nums[i];
        }else if(nums[i] > secMAX && max != 0){
            secMAX = nums[i];
        }
    }
    return  (max - 1) * (secMAX - 1);
    }
}