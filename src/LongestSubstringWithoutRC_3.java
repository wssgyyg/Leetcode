import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRC_3 {

    public int lengthOfLongestSubstring(String s){

        Map<Character, Integer> map = new HashMap<>();
        int longestLength = 0;

        for (int i = 0, j = 0; j < s.length(); j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            longestLength = Math.max(longestLength, j - i + 1);
            map.put(s.charAt(j), j);
        }

        return longestLength;

    }

}
