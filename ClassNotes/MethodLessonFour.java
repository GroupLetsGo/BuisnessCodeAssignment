/*
* Date: 2021 March 24 2021
* Name: William Wu
* Teacher: Mr.Ho
* Descriptino: Typecasting
**/

package ClassNotes;

class MethodLessonFour {
    public static void main(String[] args){
        String num = "100"; // When you store num as String, you can't do any mathimatical calculations

        // Typecasting
        // Convert num from a string into an integer
        int newNum = Integer.parseInt(num);

        // Squaring 100, cant just do num*num b/c Strings can't do math
        System.out.println(newNum*newNum);
    }
    
}
