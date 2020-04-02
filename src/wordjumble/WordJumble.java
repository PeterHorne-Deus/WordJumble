/*
 * Peter Horne-Deus
 * This program generates all the combinations of letters from a word entered
 * WordJumble.java
 * March 9, 2020
 */

package wordjumble;

import javax.swing.*;
/**
 *
 * @author Peter
 */
public class WordJumble {
 
    public static void main(String[] args) {
        //User Inputed Varaible
        String letters = JOptionPane.showInputDialog("Enter a word");
        
        //Calling the method to scramble the word
        jumbleWords(letters, "");
  }

    /**
     * This method recursivly jumbles the word
     * @param word
     * @param jumbLet 
     */
    public static void jumbleWords(String word, String jumbLet) {
        //Varaibles
        int pos;
        String remainingLetters;
        String origWord = word;
        String origJumbledLetters = jumbLet;
        
        //Base Case
        if (word.length() == 1) {
            System.out.println(jumbLet + word);
        } 
        //Word Jumbler
        else {
            for (pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                  + origWord.substring(pos + 1, origWord.length());
                //recursive call to jumbleWords()
                jumbleWords(remainingLetters, 
                  origJumbledLetters + origWord.charAt(pos));
      }
    }
  }
}
