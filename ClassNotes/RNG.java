/*
* Date: 2021 Feburary 22th
* Name: William Wu
* Teacher: Mr.Ho
* Descriptino: Randomly Generate numbers and output them
**/

package ClassNotes;

import java.util.Random; // Random package we will use to generate our numbers

class RNG {
    public static void main(String [] args) {
        //Initalize an instance of our random package within our program
        Random rand = new Random() ;

        //Generatethe random number
        //This line generates a random number between 0 and 100
        int randnum = rand.nextInt(100) ; //100 represents the highest number we can generate

        //everytime we finish generate a random number, it will be forgetten immediatly

        System.out.println(randnum) ;
    }
}
