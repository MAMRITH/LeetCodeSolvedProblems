class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean f=false;
        int j=0;
        int index=0;
        int count=0;
        if(s.length()==0)
        {
            return true;
        }
      for(int i=0;i<s.length();i++)
      {
        j=index;
        for(;j<t.length();j++)
        {
            if(t.charAt(j)==s.charAt(i))
            {
                count++;
                f=true;
                index=j+1;
                break;

            }
            else
            {
                f= false;
            }
        }
        if(f==false)
        {
            return false;
        }
      }  
    return count==s.length()? true:false;    
    }
}