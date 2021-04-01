/*
* Date: 2021 Feburary 22th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Use scanner to read a file on our hard drive 
**/

package ClassNotes;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class ReadFile {
    public static void main(String[] args) throws FileNotFoundException{

        // Open the file
        String fileName = "file.txt" ; // <- this is the name
        // Creat a file instance to reference the text file in java
        File textFile = new File(fileName) ;

        // Read the file
        // We create a scanner instance to read the file in java
        // Scanner reader = new Scanner(System.in) -> the normal scanner, however, for this, it need a difference one
        Scanner reader = new Scanner(textFile);
        String line = reader.nextLine();

        // Output the text into the terminal
        System.out.println(line);

        reader.close();
    }
}
