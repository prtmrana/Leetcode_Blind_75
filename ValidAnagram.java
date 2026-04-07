import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
      String  s = "anagram", t = "nagaarm";
      System.out.println("both string are anagram - > "+isAnagram(s, t));
    }
     public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))) map.put(s.charAt(i), map.get(s.charAt(i))+1);
           else map.putIfAbsent(s.charAt(i), 1);
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))) map.put(t.charAt(i), map.get(t.charAt(i))-1); 
            else return false;

            if(map.get(t.charAt(i))<0) return false;
        }


        return true;
    }
}
