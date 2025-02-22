class Solution {
    public int lengthOfLongestSubstring(String s) {
     int start=0;
     int end=0;
     int max=0;
     List<Character>li=new ArrayList<>();

     while(end<s.length()){
        if(!li.contains(s.charAt(end))){
            li.add(s.charAt(end));
            end++;
            max=Math.max(max,li.size());
        }
        else{
            li.remove(Character.valueOf(s.charAt(start)));
            start++;
        }
     }
     return max;
    }
}