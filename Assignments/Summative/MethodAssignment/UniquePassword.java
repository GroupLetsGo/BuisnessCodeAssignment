package Assignments.Summative.MethodAssignment;
    
import java.io.File;    
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class UniquePassword {
    public static void main(String[] args) throws FileNotFoundException{

        String fileName = "ID.txt" ; // <- this is the name

        File textFile = new File(fileName) ;
        Scanner reader = new Scanner(textFile);
        
        int nextInt = reader.nextInt();
        int num = nextInt;

        reader.close();

        int zero = 0;
        int i = 1;
    
        if (num > i){
            int diff = num - i;
            i = i + diff;
            if (num == i);
            PrintWriter out = new PrintWriter(fileName); 
            i++;
            out.println(i);
            System.out.println("Your ID is: " + i);
            out.close();
        }
        else if (num == i){
            PrintWriter out = new PrintWriter(fileName); 
            i++;
            out.println(i);
            System.out.println("Your ID is: " + i);
            out.close();
        }
        else if (num == 0){
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(fileName); 
            out.println(i);
            System.out.println("Your ID is: " + i);
            out.close();
        }
    }
}