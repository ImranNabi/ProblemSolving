class Solution {
    public String frequencySort(String s) {
     Map<Character,Integer>m=new HashMap<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(m.containsKey(ch)){
            m.put(ch,m.get(ch)+1);
        }
        else{
            m.put(ch,1);
        }
     }
     List<Character>chars=new ArrayList<>(m.keySet());
     Collections.sort(chars,(a,b)->m.get(b)-m.get(a));
     StringBuilder sb=new StringBuilder();
     for(Character ch:chars){
        for(int i=0;i<m.get(ch);i++){
            sb.append(ch);
        }
     }
     return sb.toString();
    }
}