package foundations.week-10;
//Version 1
class Solution {
  public boolean isAnagram(String s, String t) {
    char[] sa = s.toCharArray(); 
    char[] ta = t.toCharArray();

    Arrays.sort(sa);
    Arrays.sort(ta);

    return Arrays.equals(sa, ta);
  }
}

//Version 2 
class Solution {
  public boolean isAnagram(String s, String t) {
    int [] freq = new int[26];
    for (int i=0; i<s.length(); i++) freq[s.charAt(i) - 'a']++;
    for (int i=0; i<t.length(); i++) freq[t.charAt(i) - 'a']--;
    for (int f:freq) if(f!=0) return false;
    return true;
  }
}        
      
