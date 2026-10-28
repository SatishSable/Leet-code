class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int idx = 0;
        int  i = 0;
        int j = n;

        while(i < n){
            ans[idx++] = nums[i];
            i++;
            ans[idx++] = nums[j];
            j++;
        }
        return ans;
    }
}