class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder x = new StringBuilder();;int c=0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='('&& c++>0)
        x.append("(");
        if(s.charAt(i)==')' && c-->1)
        x.append(")");
       } 
       return x.toString();
    }
}