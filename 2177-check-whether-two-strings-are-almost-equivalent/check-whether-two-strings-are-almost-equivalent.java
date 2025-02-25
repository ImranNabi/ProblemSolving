class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int ch[] =new int[26]; 
       if (word1.length() != word2.length()) {
            return false;
        }
     for(int i = 0;i<word1.length(); i++) {
           ch[word1.charAt(i)-'a']++;
           ch[word2.charAt(i)-'a']--;

        }
        for(int i=0;i<26;i++){
            if(Math.abs(ch[i])>3){
                return false;
            }
        }
        return true;

    }
}
