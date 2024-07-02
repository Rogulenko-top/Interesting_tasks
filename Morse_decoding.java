import java.util.HashMap;
import java.util.Map;

public class Morse_decoding {
    public static void main(String[] args) {
        System.out.println("Введите шифр Морзы: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        //String message = "-. .. -. .-   .--. .-. --- .--- . -.-. --";
        String result = encode(message);
        System.out.println(result);

    }
    public static String encode(String message) {
        String[] charArray = message.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            String character = charArray[i];
            if (index.containsKey(character)) {
                char newIndex = index.get(character);
                sb.append(newIndex);
            }
        }
        return sb.toString().replaceAll("\\s+", " ");
    }

    public static char[] ALPHABET_NUMBERS_SPACE = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9', ' '};
    public static String[] MORSE_CODE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.", ""};
    public final static Map<String, Character> index = new HashMap<>();
    static {
        for (int i = 0; i < ALPHABET_NUMBERS_SPACE.length; i++) {
            index.put(MORSE_CODE[i], ALPHABET_NUMBERS_SPACE[i]);
        }
    }
}
