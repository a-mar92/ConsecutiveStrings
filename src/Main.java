// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    public static String longestConsec(String[] strarr, int k) {
        if ((strarr.length == 0) || (k > strarr.length) || (k <= 0)) {
            return "";
        }


        int longestWord = 0;
        StringBuilder longestWordString = new StringBuilder();
        StringBuilder currentString = new StringBuilder();

        for (int i = 0; i < strarr.length; i++) {
            String currentlWord = strarr[i];
            currentString.append(currentlWord );
            if (i>= k - 1) {
                int currentLenght = currentString.length();
                if (currentLenght > longestWord) {
                    longestWord = currentLenght;
                    longestWordString = new StringBuilder(currentString);
                }
                    currentString.delete(0, strarr[i - k + 1].length());
            }
        }
        return longestWordString.toString();
    }
}