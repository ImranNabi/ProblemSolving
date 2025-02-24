class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]words=s.split(" ");
      if(pattern.length()!=words.length) {
        return false;
      } 
      Set<String>mapSet=new HashSet<>();
            Set<Character>ch=new HashSet<>();
                  Set<String>st=new HashSet<>();
                  for(int i=0;i<pattern.length();i++){
                    mapSet.add(pattern.charAt(i)+"-"+words[i]);
                    ch.add(pattern.charAt(i));
                    st.add(words[i]);
                  }
                  return mapSet.size()==ch.size()&& ch.size()==st.size();


    }
}