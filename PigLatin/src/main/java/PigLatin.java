
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    //public String returnPigLatin(String in){
       // return "";
    //}
    public static boolean isVowel(char c) {
        return (
            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
     
    public String returnPigLatin(String in) {
     
        
        int len = in.length();
        int index = -1;
        for (int i = 0; i < len; i++)
        {
            if (isVowel(in.charAt(i))) {
            index = i;
            break;
        }
        }
     
        if (index == -1)
            return "-1";
     
        
        return in.substring(index) +
               in.substring(0, index) + "ay";
    }
     
    
}
