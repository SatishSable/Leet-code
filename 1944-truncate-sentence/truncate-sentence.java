class Solution {
    public String truncateSentence(String s, int k) {
       
        String[] temp = s.split(" ");
         StringBuilder result = new StringBuilder();

         for(int i =0; i < k; i++){
            result.append(temp[i]);
            result.append(" ");
         }
        return result.toString().trim();
    }
}