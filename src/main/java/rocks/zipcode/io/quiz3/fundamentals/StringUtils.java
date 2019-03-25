package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) + str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String base = baseString.toLowerCase();
        Character character = base.charAt(indexOfString);
        character = Character.toLowerCase(character);
        if (character.equals(characterToCheckFor)) {
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String[] subA = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length() - i; j++) {
                String sub = string.substring(i, i + j);
                subA = sub.split(" ");

            }
        }
        return subA;
    }

        public static Integer getNumberOfSubStrings (String input){
            return null;
        }
    }

