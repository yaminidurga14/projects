public class LastWordLength {
     public static int lenOfLastWord(String s){
        String[] words=s.trim().split("\\s+");
        if(words.length==0){
            return 0;
        }
        String lastWord=words[words.length-1];
        return lastWord.length();
     }



    public static void main(String[] args) {
        String A1 = " hello world ";
        String A2 = "InterviewBit";


        System.out.println("Output 1: " + lenOfLastWord(A1)); // Output: 5
        System.out.println("Output 2: " + lenOfLastWord(A2)); // Output: 12
        
    }
}
