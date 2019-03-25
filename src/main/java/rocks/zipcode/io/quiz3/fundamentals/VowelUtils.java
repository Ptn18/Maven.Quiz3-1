package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String lowercase = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                return true;
            }
        }

        return false;
    }
    final static String vowels = "aeiou";
    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        String lowerword = word.toLowerCase();
        if (lowerword.charAt(0) == 'a' ||
                lowerword.charAt(0) == 'e' ||
                lowerword.charAt(0) == 'i' ||
                lowerword.charAt(0) == 'o' ||
                lowerword.charAt(0) == 'u') {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        Character lowerchar = Character.toLowerCase(character);
        if (lowerchar == 'a' ||
                lowerchar == 'e' ||
                lowerchar == 'i' ||
                lowerchar == 'o' ||
                lowerchar == 'u') {
            return true;
        }
        return false;
    }

}
