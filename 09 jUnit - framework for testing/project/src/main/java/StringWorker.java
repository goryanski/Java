import java.util.Locale;

public class StringWorker {
    boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    int getCountVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    int getCountConsonants(String str) {
        int count = 0;
        str = str.toUpperCase();
        char[] consonants  = {'B', 'C', 'D', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X', 'Z', 'H', 'R', 'W'};
        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            for (int j = 0; j < consonants.length; j++) {
                if (ch == consonants[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    int getCountWords(String str, String word) {
        int count = 0;
        str = str.toLowerCase();
        word = word.toLowerCase();
        String[] stringsArray = str.split("[ ,?.:;!]+"); // split by one of this sign
        for (String stringPart : stringsArray) {
            if(stringPart.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
