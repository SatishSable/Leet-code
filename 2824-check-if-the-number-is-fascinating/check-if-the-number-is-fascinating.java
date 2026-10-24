class Solution {
    public boolean isFascinating(int num) {
         if(threeDigit(num) && threeDigit(num *  2) && threeDigit(num * 3) ){
            int sum = (((num*1000) + (num * 2)) * 1000) + (num * 3);

            int temp = sum ;

            int  i;

            for(i = 1 ; i <= 9; i++){
                while(temp > 0){
                    int ld  = temp % 10;
                    if(ld == i){
                        break;
                    }
                    temp /= 10;
                 }
                 if(temp == 0){
                    break;
                 }else{
                    temp = sum;
                }
                 
            }
           
              return i > 9;


         }
         return false;
         
    }
    public static boolean threeDigit(int num){
       
      return num > 99 && num <= 999;
    }
}