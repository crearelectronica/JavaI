public class FiltrarPalabras {

    public static boolean hasUniqueCharacters(String input) {
        return input.chars().distinct().count() == input.length();
    }

    public static String getLargestWordWithUniqueCharacters(String input) {
        String max = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String word = input.substring( i, j );
                if (hasUniqueCharacters( word ) && word.length() > max.length()) {
                    max = word;
                }
            }
        }
        return max;
    }

    public static int getSizeLargestWordWithUniqueCharacters(String string) {
        return getLargestWordWithUniqueCharacters( string ).length();
    }


    public static void main(String[] args) {

        System.out.println( getLargestWordWithUniqueCharacters( "ahfdkjhfjdhs" ) );
        System.out.println( getSizeLargestWordWithUniqueCharacters( "ahfdkjhfjdhs" ) );
    }
}
