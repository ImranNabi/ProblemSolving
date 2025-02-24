class Solution {
     public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Character>a=new HashMap<>();
        Map<Character,Character>b=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(a.containsKey(c1)){
                if(a.get(c1)!=c2) return false;
            }
            else{
                a.put(c1,c2);
            }
            if(b.containsKey(c2)){
                if(b.get(c2)!=c1)return false;
            }
            else{
                b.put(c2,c1);
            }

        }
        return true;



    }
}