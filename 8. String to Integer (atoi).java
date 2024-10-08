class Solution {
    public int myAtoi(String s) {
        int index=0;
        while(index<s.length()&&s.charAt(index)==' '){
              index+=1;
        }
        int sign = 1;
        if(index<s.length() && (s.charAt(index)=='+'||s.charAt(index)=='-')){
            char element= s.charAt(index);
            sign=element=='+'?1:-1;
            index+=1;
        }
        int res=0;
       while(index<s.length()&&Character.isDigit(s.charAt(index))){
           int digit = s.charAt(index)-'0';
           if(res>(Integer.MAX_VALUE-digit)/10){
               return sign ==1?Integer.MAX_VALUE :Integer.MIN_VALUE;
           }
           res = res *10+digit;
           index++;
       }
        return res * sign;
       
    }
}
