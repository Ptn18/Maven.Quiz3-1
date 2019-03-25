package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
            String temp = str.toLowerCase();
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            char first = temp.charAt(0);


            for (int i = 0; i < vowels.length; i++) {
                if (first == vowels[i]) {
                    return str + "way";
                }
            }

            str = str.substring(1);
            str += first + "ay";


            return str;
        }
}
