class Solution {
    public int firstUniqChar(String s) {
        char ch[]=s.toCharArray();

        int[]temp=new int[26];
        for(int i=0;i<ch.length;i++){
            temp[ch[i]-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(temp[ch[i]-'a']==1){
                return i;
            }
           
        }
        return -1;
        
    }
}