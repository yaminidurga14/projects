public class nonMtchingChr {
    public static void main(String[] args) {
        String str1 = "example1"; 
        String str2 = "example2"; 
 
        String nonMatchingChars = findNonMatchingCharacters(str1, str2); 
        System.out.println("Non-matching characters: " + nonMatchingChars); 
    }
    public static String findNonMatchingCharacters(String str1, String str2) { 
        StringBuilder nonMatching = new StringBuilder();
        if(str1.length()!=str2.length()){
            return "no";
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                nonMatching.append(str1.charAt(i));

                nonMatching.append(str2.charAt(i));
            }
        }
        return nonMatching.toString();
}
}