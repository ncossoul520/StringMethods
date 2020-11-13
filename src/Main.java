public class Main {
    public static void main(String[] args) {
        System.out.println( StringMethods.isLetter("a") ); // true
        System.out.println( StringMethods.isLetter(",") ); // false

        System.out.println( StringMethods.isVowel("a") );  // true
        System.out.println( StringMethods.isVowel(",") );  // false
        System.out.println( StringMethods.isVowel("v") );  // false

        System.out.println( StringMethods.isConsonant("a") ); // false
        System.out.println( StringMethods.isConsonant(",") ); // false
        System.out.println( StringMethods.isConsonant("v") ); // true

        System.out.println( StringMethods.isWhiteSpace("a") );  // false
        System.out.println( StringMethods.isWhiteSpace(",") );  // false
        System.out.println( StringMethods.isWhiteSpace(" ") );  // true
        System.out.println( StringMethods.isWhiteSpace("\t") ); // true
        System.out.println( StringMethods.isWhiteSpace("\n") ); // true

        System.out.println( StringMethods.hasVowelConsonantVowel("nim") );     // false
        System.out.println( StringMethods.hasVowelConsonantVowel("ani") );     // true
        System.out.println( StringMethods.hasVowelConsonantVowel("an i") );    // false
        System.out.println( StringMethods.hasVowelConsonantVowel("qwanirt") ); // true

        System.out.println( StringMethods.getNumSpaces("ani") );   // 0
        System.out.println( StringMethods.getNumSpaces(" ani") );  // 1
        System.out.println( StringMethods.getNumSpaces("a ni") );  // 1
        System.out.println( StringMethods.getNumSpaces("ani ") );  // 1
        System.out.println( StringMethods.getNumSpaces("  ani") ); // 2
        System.out.println( StringMethods.getNumSpaces("a n i") ); // 2
        System.out.println( StringMethods.getNumSpaces("an i ") ); // 2
        System.out.println( StringMethods.getNumSpaces("ani  ") ); // 2

        System.out.println( StringMethods.getSpaceIndexes("ani") );   // null
        System.out.println( StringMethods.getSpaceIndexes(" ani") );  // 0
        System.out.println( StringMethods.getSpaceIndexes("a ni") );  // 1
        System.out.println( StringMethods.getSpaceIndexes("ani ") );  // 3
        System.out.println( StringMethods.getSpaceIndexes("  ani") ); // 0, 1
        System.out.println( StringMethods.getSpaceIndexes("a n i") ); // 1, 3
        System.out.println( StringMethods.getSpaceIndexes("an i ") ); // 2, 4
        System.out.println( StringMethods.getSpaceIndexes("ani  ") ); // 3, 4

        System.out.println( StringMethods.trim("ani") );       // ani
        System.out.println( StringMethods.trim(" ani") );      // ani
        System.out.println( StringMethods.trim("ani ") );      // ani
        System.out.println( StringMethods.trim("  ani") );     // ani
        System.out.println( StringMethods.trim("ani  ") );     // ani
        System.out.println( StringMethods.trim(" ani bob ") ); // ani bob

        System.out.println( StringMethods.splitOnSpace("ani bob ") );  // ani, bob
        System.out.println( StringMethods.splitOnSpace(" ani bob ") ); // ani, bob
        System.out.println( StringMethods.splitOnSpace(" ani bob") );  // ani

        System.out.println( StringMethods.cleanWord("ani") );   // ani
        System.out.println( StringMethods.cleanWord("_ani.") ); // ani

        System.out.println( StringMethods.extractWords("_ani+ bob_") ); // ani
    }
}
