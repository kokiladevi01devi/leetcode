class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            int l1=words[i].length();
            if(l1<=s.length())
            {

            if(s.substring(0,l1).equals(words[i]))
            c++;
            }
        }
        return c;
    }
}