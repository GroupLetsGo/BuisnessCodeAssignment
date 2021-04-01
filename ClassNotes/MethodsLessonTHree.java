/*
* Date: 2021 March 24 2021
* Name: William Wu
* Teacher: Mr.Ho
* Descriptino: String Methods: substring and charAt, .length(); 
**/

package ClassNotes;

public class MethodsLessonTHree {

    public static void main(String[] args){

        /*
        * c o m p u t e r // These are the letters of the string
        * 0 1 2 3 4 5 6 7 // These are the numbers representing the location of the character (index)
        */

        String word = "computer";

        // CharAt allows us to grab any individual character
        System.out.println(word.charAt(4));

        // To grab a group of letters from the string, we use something called the substring
        // Substrings are slices/sections of another string

        String newString = word.substring(4); // This substring grabs the portion of the string starting from position 4, which is u, printing out uter
        String newStringTwo = word.substring(0, 4); // clipping a specific portion from 0 to 3 .substring(beginIndex, endIndex);
        // When we substring, we omit the last character, so if I want the letter p in the terminal printed, i need to put 3+1 = 4 as the endIndex
        System.out.println(newString);

        printChar(word);
    }
    /* Prints all characters of a string on seperate lines
    * 
    * @param word - A string that we will print each character out of
    */
    public static void printChar(String word){
        int len = word.length();
        for (int i = 0; i < len; i++){
            System.out.println(word.charAt(i));
        }
    }
}

