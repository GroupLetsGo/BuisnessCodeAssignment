package Assignments.Summative.MethodAssignment;
    
import java.io.File;    
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class UniquePassword {
    public static void main(String[] args) throws FileNotFoundException{

        String fileName = "ID.txt" ; // <- this is the name
        // Creat a file instance to reference the text file in java
        File textFile = new File(fileName) ;
        Scanner reader = new Scanner(textFile);
        String line = reader.nextLine();
        int mathLine = Integer.parseInt(line);
        
        reader.close();

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter("ID.txt");  
        //  inputs i into ID.txt

        int newID;  

        for (int i = 0; i == mathLine; i++){

            if (i != mathLine){
                newID = i;
            
                out.println(newID);
                
                System.out.println("ID: " + newID);
            }
        }
        out.close();
    }
}


        