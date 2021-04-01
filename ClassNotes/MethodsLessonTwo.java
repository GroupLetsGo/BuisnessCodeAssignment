/*
* Date: 2021 March 26 2021
* Name: William Wu
* Teacher: Mr.Ho
* Descriptino: String Methods
**/

package ClassNotes;

class MethodsLessonTwo {
    public static void main(String[] args){

        /*
        * c o m p u t e r // These are the letters of the string
        * 0 1 2 3 4 5 6 7 // These are the numbers representing the location of the character (index)
        */

        String word = "Computer";
        // Computer have 8 words, which is 7 long, (starting from zero)
        // Use .length(); to do this
        // To find the length of the string(length of the characters)
        int len = word.length();
        System.out.println(len);

        // Try to print out the first character
        // Use charAt to do this
        // 0 represents the first letter of computer, "C"
        char character = word.charAt(len);
        System.out.println(character);

        // .toUpperCase & .toLowerCase print the strings in all upper ow lower cases
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

    }
    // Write our methods outside: here

}
