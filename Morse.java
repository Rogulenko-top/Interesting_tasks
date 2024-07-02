import java.util.*;

public class Morse_encryption {
    public static void main(String[] args) {
        String message = "THE NINA PROJECT";
        String result = encode(message);
        System.out.println(result);

    }
    public static String encode(String message) {
        char[] charArray = message.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (index.containsKey(character)) {
                String newIndex = index.get(character);
                sb.append(newIndex);
            }
        }
        return sb.toString();
    }

    public static char[] ALPHABET_NUMBERS_SPACE = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9', ' '};
    public static String[] MORSE_CODE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.", " "};
    public final static Map<Character, String> index = new HashMap<>();
    static {
        for (int i = 0; i < ALPHABET_NUMBERS_SPACE.length; i++) {
            index.put(ALPHABET_NUMBERS_SPACE[i], MORSE_CODE[i]);
        }
    }
}
