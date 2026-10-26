class Solution {
    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for(int  i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                redCount++;
            }else if(nums[i] == 1){
                whiteCount++;
            }else{
                blueCount++;
            }
        }
        int idx = 0;
        
        while(redCount > 0) {
            nums[idx] = 0;
            idx++;
            redCount--;
        }
        while(whiteCount > 0){
            nums[idx] = 1;
            idx++;
            whiteCount--;
        }
        while(blueCount > 0){
            nums[idx] = 2;
            idx++;
            blueCount--;
        }

    }
}