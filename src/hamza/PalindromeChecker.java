package hamza;

import acm.program.ConsoleProgram;

import java.util.Locale;

/**
 * File: PalindromeChecker.java
 * -----------------------------
 * checks to see if a string is a palindrome
 */
public class PalindromeChecker extends ConsoleProgram {

    /**
     * the main entry point into the program
     *
     * @param args the passed and needed program
     */
    public static void main(String[] args) {

        //initialization of the class for acm package
        new PalindromeChecker().start(args);
    }

    /**
     * the main entry point into for the acm package
     */
    public void run() {

        while (true) {
            String sentence = readLine("enter the word: ");
            println(isPalindrome(sentence));
        }
    }

    /**
     * checks to see if a sentence is a palindrome
     *
     * @param theSentence the provided sentence
     * @return result of the check
     */
    public boolean isPalindrome(String theSentence) {

        //all needed fields
        String lowered = theSentence.toLowerCase();
        String sentence = "";

        for (int i = 0; i < lowered.length(); i++) {
            if (lowered.charAt(i) >= 'a' && lowered.charAt(i) <= 'z') {
                sentence = sentence.concat(String.valueOf(lowered.charAt(i)));
            }
        }

        int sentenceLength = sentence.length();

        if (sentenceLength % 2 == 0) {
            //then we have an even number of chars in the string
            String firstHalf = "";
            String secondHalf = "";
            String secondHalfBackward = "";

            firstHalf = sentence.substring(0, sentenceLength / 2);
            secondHalf = sentence.substring(sentenceLength / 2);

            for (int i = secondHalf.length(); i > 0; i--) {
                secondHalfBackward = secondHalfBackward.concat(String.valueOf(secondHalf.charAt(i - 1)));
            }

            if (firstHalf.equals(secondHalfBackward)) {
                return true;
            }

        } else {
            //then we have an odd number of chars in the string
            String firstHalf = "";
            String secondHalf = "";
            String secondHalfBackWard = "";

            firstHalf = sentence.substring(0, (sentenceLength - 1) / 2);
            secondHalf = sentence.substring(((sentenceLength - 1) / 2) + 1);

            for (int i = secondHalf.length(); i > 0; i--) {
                secondHalfBackWard = secondHalfBackWard.concat(String.valueOf(secondHalf.charAt(i - 1)));
            }

            if (firstHalf.equals(secondHalfBackWard)) {
                return true;
            }
        }

        return false;
    }
}
