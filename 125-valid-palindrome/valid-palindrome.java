import java.lang.Character;
class Solution {
    public boolean isPalindrome(String s) {
        String newString="";
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
           // if((ch>='A' && ch<='Z')||(ch>='0' && ch<='9')||ch>='a' && ch<='z')
           // {
           //     newString=newString+ch;
           // }
           if(Character.isLetter(ch) || Character.isDigit(ch))
            {
                newString=newString+ch;
            }
           
        }
        for(int j=newString.length()-1;j>=0;j--)
        {
            char ch=newString.charAt(j);
            rev=rev+ch;
        }
        if(newString.equalsIgnoreCase(rev))
        {
            return true;
        }
        else{
            return false;
        }
    }
}