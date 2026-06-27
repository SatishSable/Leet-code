class Solution {
    public boolean isVowel(char ch){
        if(ch == 'A' || ch == 'a' || ch == 'E' || ch =='e'||ch=='i'||ch=='I'||ch=='o' || ch=='O'|| ch=='u'||ch=='U'){
            return true;
        }
        return false;
    }
    private void swap(char[] word , int start , int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int start = 0;
        char ch[] = s.toCharArray();
        int end = s.length()-1;

       while (start < end) {

    while (start < end && !isVowel(ch[start])) {
        start++;
    }

    while (start < end && !isVowel(ch[end])) {
        end--;
    }

    if (start < end) {
        swap(ch, start, end);
        start++;
        end--;
    }
}
        return String.valueOf(ch);
    }
}