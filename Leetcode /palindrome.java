class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int digit;
        int r=0;
        while(x>0){
            digit=x%10;
            r=r*10+digit;
            x=x/10;
        }
   return temp == r;
}
}
