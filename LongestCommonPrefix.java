public class LongestCommonPrefix {
   public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return ""; 
        }
     String prefix=strings[0];
     for(int i=1;i<strings.length;i++){
        while(!strings[i].startsWith(prefix)){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()){
                return "";
            }
        }
     }
        
return prefix;

    }

    public static void main(String[] args) {
        String[] A1 = {"abcdefgh", "aefghijk", "abcefgh"};
        String[] A2 = {"abab", "ab", "abcd"};

        System.out.println("Output 1: " + longestCommonPrefix(A1)); // Output: "a"
        System.out.println("Output 2: " + longestCommonPrefix(A2)); // Output: "ab"
    }
}
