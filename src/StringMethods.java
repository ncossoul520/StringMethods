import java.util.ArrayList;

public class StringMethods {
    // return true if input is length 1 and a valid letter (and not whitespace or punctuation, etc.)
    public static boolean isLetter(String letter) {
        if ( letter.length() != 1 ) return false;
        return "abcdefghijklmnopqrstuvwxyz".contains( letter.toLowerCase() );
    }

    // Return true if letter is length 1 and is a vowel
    public static boolean isVowel(String letter) {
        if ( letter.length() != 1 ) return false;
        return "aeiou".contains( letter.toLowerCase() );
    }

    // Return true if letter is length 1 and a consonant (not a vowel)
    public static boolean isConsonant(String letter) {
        return isLetter(letter) && !isVowel(letter);
    }

    // Return true if character is length 1 and is whitespace (a space, a tab (\t) or a newline (\n))
    public static boolean isWhiteSpace(String character) {
        if ( character.length() != 1 ) return false;
        return (character.equals(" ") || character.equals("\n") || character.equals("\t"));
    }

    // Return true if str contains a vowel followed by a consonant followed by a vowel
    public static boolean hasVowelConsonantVowel(String str) {
        for(int i = 0; i < str.length() - 2; i++) {
            if ( isVowel( str.substring(i, i+1) ) && isConsonant( str.substring(i+1, i+2) ) && isVowel( str.substring(i+2, i+3) ) ) {
                return true;
            }
        }
        return false;
    }

    // Return the number of spaces in str
    public static int getNumSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( isWhiteSpace( str.substring(i, i+1) ) ) {
                count++;
            }
        }
        return count;
    }

    // Return an ArrayList<Integer> giving the indexes of all spaces in str
    public static ArrayList<Integer> getSpaceIndexes(String str) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if ( isWhiteSpace( str.substring(i, i+1) ) ) {
                out.add( i );
            }
        }
        return out;
    }

    // Return the string with all whitespace at the start and end removed.  (Whitespace includes spaces, tabs
// (\t), and new-line characters(\n) ).
    public static String trim(String word) {
        String out = "";
        int start_index = 0;
        while ( isWhiteSpace( word.substring(start_index, start_index+1) ) ) { start_index++; }

        int end_index = word.length()-1;
        while ( isWhiteSpace( word.substring(end_index, end_index+1) ) ) { end_index--; }

        return word.substring( start_index, end_index+1 );
    }

    // Return the first word (sequence of non-whitespace characters) in the string or return “” if there are no
// spaces.  Note that msg may start with whitespace, or contain ONLY whitespace
    public static String getFirstWord(String msg) {
        //TODO
        return "";
    }

    // Return an ArrayList<String> of word (one word per element).  [note:  “word” here means “sequence of
// non-whitespace characters occurring between whitespace].
    public static ArrayList<String> splitOnSpace(String str) {
        ArrayList<String> out = new ArrayList<>();
        String word = "";
        for (int i=0; i < str.length(); i++) {
            if ( !isWhiteSpace( str.substring(i, i+1) ) ) {
                word += str.substring(i, i+1);
            } else if ( word.length() != 0 ) {
                out.add( word );
                word = "";
            }
        }
        return out;
    }

    // Remove all characters from the start and end of the word which aren’t letters.
    public static String cleanWord(String word) {
        String out = "";
        int start_index = 0;
        while ( !isLetter( word.substring(start_index, start_index+1) ) ) { start_index++; }

        int end_index = word.length()-1;
        while ( !isLetter( word.substring(end_index, end_index+1) ) ) { end_index--; }

        return word.substring( start_index, end_index+1 );
    }


    // Similar to splitOnSpace, but it “cleans” every word before adding it to the output
    public static ArrayList<String> extractWords(String str) {
        ArrayList<String> out = new ArrayList<>();
        String word = "";
        for (int i=0; i < str.length(); i++) {
            if ( !isWhiteSpace( str.substring(i, i+1) ) ) {
                word += str.substring(i, i+1);
            } else if ( word.length() != 0 ) {
                out.add( cleanWord( word ) );
                word = "";
            }
        }
        return out;
    }
}
