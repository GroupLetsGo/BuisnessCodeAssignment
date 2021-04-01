/*
* Date: 2021 March 16rd
* Name: William Wu
* Teacher: Mr.Ho
* Description: Nim Game summative assignment
**/

package Assignments.Summative;

// This is a package called scanner in order for the program to take in user inputs
import java.util.Scanner;
// This is a random package to generate random numbers
import java.util.Random;

class NimGame {
    public static void main(String[] args){
        // Declaring all necessary variables or just initializing Scanner
        Scanner reader = new Scanner(System.in);
        // Initialize random
        Random rand = new Random();

        // Setting up the symbol variable that I will use to displace as the sticks for both pvp and player vs AI
        String symbol = "* ";

        // Setting the min and max variables FOR PILE NUMBERS to use as the random min and max values the random number generator will generate for both pvp and player vs ai
        int max = 10;
        int min = 1;
        
        // Setting the min and max values the random number generator will generate FOR THREE DIFFERENT PILES for both pvp and player vs ai
        int randPileNumberOne = rand.nextInt(max-min) + min;
        int randPileNumberTwo = rand.nextInt(max-min) + min;
        int randPileNumberThree = rand.nextInt(max-min) + min;

        // Setting up the sum variable for all three random pile numbers
        int randTotal = randPileNumberOne + randPileNumberTwo + randPileNumberThree; 

        // Setting the min and max variables to use as the random min and max values the random number generator to determine THE STARTER in player vs AI 
        int maxCom = 3;
        int minCom = 1;

        // Setting the variable that determines the player that wins and the player that loses in PvP 
        int o = 1;

        // Setting the min and max values the random number generator will generate TO DETERMINE STARTER for player vs ai
        int i = rand.nextInt(maxCom-minCom) + minCom;

        // Setting up the pile varibles in which displays the pile group A, group B, and C
        String pileA = "A: ";
        String pileB = "B: ";
        String pileC = "C: ";

        // Setting up the name varible for computer to use as his name
        String computer = "computer";

        //Booleans for true or false, if true, boolean ends loop, if false, boolean continues loop
        boolean correctGameOppoent;
        boolean correctRemoveAmount;
        boolean correctPileGroup;

        // Prompt the user to either play against a friend or computer and store user choice
        System.out.println("Would you like to play against computer or a friend");
        System.out.println("Please enter com/friend");
        String gameOpponent = reader.nextLine();

        // A do while loop in which if the user input for game mode is not com or friend, the code will start to loop and continuously ask for the user to input either com or friend until com or 
        // friend is actually entered
        do{
            // If the player chose to play against computer, code prompts for player name and stores it in a string called playerName as well as giving the user a description of the game.  
            if (gameOpponent.equals("com")){
                correctGameOppoent = true;
                System.out.println("What is your name"); 
                String playerName = reader.nextLine();
                System.out.println("Welcome to the game of Nim. In this game, " + playerName + " and " + computer + " will be given three piles of sticks. Who ever picks up the last stick of the three piles is the loser.");
                // A while loop that will determines when the game ends; when there zero stick left in all three piles.
                while(randTotal != 1){ 
                    // A for loop that will continue add one to the variable i which is randomized to be able to either start as integer 1 or 2 if the total amount of 
                    // sticks left in the three pile does not equal to one 
                    for (;i/randTotal != i; i++){

                        //Show the player of the three pile of sticks in which each pile will have a random number of sticks beween 1 to 10 
                        System.out.println("Here are the three piles");
                        System.out.println();
                        System.out.print(pileA);
                        for (int j = 0; j < randPileNumberOne; j++){
                            System.out.print(symbol);
                        }
                        System.out.println();
                        System.out.print(pileB);
                        for (int a = 0; a < randPileNumberTwo; a++){
                            System.out.print(symbol);
                        }
                        System.out.println();
                        System.out.print(pileC);
                        for (int b = 0; b < randPileNumberThree; b++){
                            System.out.print(symbol);
                        }
                        
                        // If the variable randomized in the beginning is starting off being a 1, then, it is the player's turn. Tell the player that it is his turn and prompt the player
                        // to choose a pile from the display above and how many sticks the player would like to remove from that group
                        if (i%2 != 0){
                            System.out.println();
                            System.out.println(playerName + "'s turn");
                            System.out.println();
                            System.out.print("Please choose a pile: ");
                            String pileGroup = reader.nextLine();
                            System.out.print("Please determine an amount of sticks you would like to remove: ");
                            int removeAmount = reader.nextInt(); 
                            reader.nextLine();

                            // If the selected pile group of the three no longer have any sticks, the program will prompt the user to enter a pile group which does have at least one stick
                            if ((pileGroup.equals("C")&&(randPileNumberThree == 0)) || (pileGroup.equals("B")&&randPileNumberTwo == 0) || (pileGroup.equals("A")&&randPileNumberOne == 0)){
                                correctPileGroup = false;
                                System.out.println("Nice try, but this pile is empty. Please pick a pile where there are sticks.");
                                pileGroup = reader.nextLine();
                            }
                            // If the choosen group is A, then the program continues to ask the player the amount of sticks he/she would like to remove
                            else if (pileGroup.equals("A")){
                                correctPileGroup = true;
                                // A do while loop for if the entered stick removing amount is not realistic, then the code will loop until it receives an input that is realisitic
                                do{
                                    // If the player entered a removing stick number that is greater than the number of sticks there is in the pile, it's not realisitc, thus, loops until realistic answer
                                    if (removeAmount > randPileNumberOne){
                                        correctRemoveAmount = false;
                                        System.out.println("You cannot remove " + removeAmount + " sticks when there's only " + randPileNumberOne + " in this pile. Please enter again");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                    // If the player enters 0 sticks to remove, he is trying to cheat as the rules state to remove at least one stick. Thus, it's not realisitci, loops until realisitic answer
                                    else if(removeAmount == 0){
                                        correctRemoveAmount = false;
                                        System.out.println("You must remove at least one stick.");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                    // If the player enters a removing stick number that is smaller than or equal to the number of sticks there actually is, it is realisitic, thus ends the loop and ends turn for player
                                    else if (removeAmount <= randPileNumberOne){
                                        correctRemoveAmount = true;
                                    // for everything else, it is not a valid answer, unrealisitic, thus, will loop until system receives a realisitic answer
                                    }
                                    else{
                                        correctRemoveAmount = false;
                                        System.out.println("Invalid Input");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                }while(!(correctRemoveAmount));
                                // This line is written to refresh the code with the new number of the sticks in the pile after player removed some
                                randPileNumberOne = randPileNumberOne - removeAmount;
                            }
                            // If the choosen group is B, then the program continues to ask the player the amount of sticks he/she would like to remove
                            else if (pileGroup.equals("B")){
                                correctPileGroup = true;
                                // A do while loop for if the entered stick removing amount is not realistic, then the code will loop until it receives an input that is realisitic
                                do{
                                    // If the player entered a removing stick number that is greater than the number of sticks there is in the pile, it's not realisitc, thus, loops until realistic answer
                                    if (removeAmount > randPileNumberTwo){
                                        correctRemoveAmount = false;
                                        System.out.println("You cannot remove " + removeAmount + " sticks when there's only " + randPileNumberTwo + " in this pile. Please enter again");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                    // If the player enters 0 sticks to remove, he is trying to cheat as the rules state to remove at least one stick. Thus, it's not realisitci, loops until realisitic answer
                                    else if(removeAmount == 0){
                                        correctRemoveAmount = false;
                                        System.out.println("You must remove at least one stick.");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    } 
                                    // If the player enters a removing stick number that is smaller than or equal to the number of sticks there actually is, it is realisitic, thus ends the loop and ends turn for player
                                    else if (removeAmount <= randPileNumberTwo){
                                        correctRemoveAmount = true;
                                    }
                                    // for everything else, it is not a valid answer, unrealisitic, thus, will loop until system receives a realisitic answer
                                    else{
                                        correctRemoveAmount = false;
                                        System.out.println("Invalid Input");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                }while(!(correctRemoveAmount));
                                // This line is written to refresh the code with the new number of the sticks in the pile after player removed some
                                randPileNumberTwo = randPileNumberTwo - removeAmount;
                            }
                            // If the choosen group is C, then the program continues to ask the player the amount of sticks he/she would like to remove
                            else if (pileGroup.equals("C")){
                                correctPileGroup = true;
                                // A do while loop for if the entered stick removing amount is not realistic, then the code will loop until it receives an input that is realisitic
                                do{
                                    // If the player entered a removing stick number that is greater than the number of sticks there is in the pile, it's not realisitc, thus, loops until realistic answer
                                    if (removeAmount > randPileNumberThree){
                                        correctRemoveAmount = false;
                                        System.out.println("You cannot remove " + removeAmount + " sticks when there's only " + randPileNumberThree + " in this pile. Please enter again");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                    // If the player enters 0 sticks to remove, he is trying to cheat as the rules state to remove at least one stick. Thus, it's not realisitci, loops until realisitic answer
                                    else if(removeAmount == 0){
                                        correctRemoveAmount = false;
                                        System.out.println("You must remove at least one stick.");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                    // If the player enters a removing stick number that is smaller than or equal to the number of sticks there actually is, it is realisitic, thus ends the loop and ends turn for player
                                    else if (removeAmount <= randPileNumberThree){
                                        correctRemoveAmount = true;
                                    }
                                    // for everything else, it is not a valid answer, unrealisitic, thus, will loop until system receives a realisitic answer
                                    else{
                                        correctRemoveAmount = false;
                                        System.out.println("Invalid Input");
                                        removeAmount = reader.nextInt();
                                        reader.nextLine();
                                    }
                                }while(!(correctRemoveAmount));
                                // This line is written to refresh the code with the new number of the sticks in the pile after player removed some
                                randPileNumberThree = randPileNumberThree - removeAmount;
                            }
                            // If the player did not enter group A,B or C, then the input is wrong thus program will loop to ask the player to enter either A,B or C and have him input again
                            else {
                            correctPileGroup = false;
                            System.out.println("Invalid Input, please enter either group A,B or C");
                            pileGroup = reader.nextLine();
                        }
                        }
                        // If the variable randomized in the beginning is starting off being a 2, then, it is the computer's turn. System will print how many sticks the computer removed
                        // to the player 
                        else if (i%2 == 0){
                            System.out.println();
                            System.out.println(computer + "'s turn");

                            // Setting up the fixed way of the computer to remove a number of sticks FROM THREE DIFFERENT PILES for player vs computer
                            int comRemoveOne = randPileNumberOne - 1;
                            int comRemoveTwo = randPileNumberTwo - 1;
                            int comRemoveThree = randPileNumberThree - 1;
    
                            // All of below is written for the computer to decide which group to remove sticks from and how many
                            // If all pile have 1 left, then computer will remove from pile B
                            if ((randPileNumberThree == 1) && (randPileNumberTwo == 1) && (randPileNumberOne == 1)){
                                randPileNumberTwo = randPileNumberTwo - 1;
                                System.out.println("The computer removed 1 stick from pile B");
                            }
                            // If have A and C have one left, computer will remove from pile A
                            else if ((randPileNumberThree == 1) && (randPileNumberTwo == 0) && (randPileNumberOne == 1)){
                                randPileNumberOne = randPileNumberOne - 1;
                                System.out.println("The computer removed 1 stick from pile A");
                            }
                            // If have C and B have one left, computer will remove from pile C
                            else if((randPileNumberThree == 1) && (randPileNumberTwo == 1) && (randPileNumberOne == 0)){
                                randPileNumberThree = randPileNumberThree - 1;
                                System.out.println("The computer removed 1 stick from pile C");
                            }
                            // If have A and B have one left, computer will remove from pile B
                            else if ((randPileNumberThree == 0) && (randPileNumberTwo == 1) && (randPileNumberOne == 1)){
                                randPileNumberTwo = randPileNumberTwo - 1;
                                System.out.println("The computer removed 1 stick from pile B");
                            }
                            // If pile A still have sticks, then the computer will choose remove from pile A
                            else if(randPileNumberOne > 1){      
                                randPileNumberOne = randPileNumberOne - comRemoveOne;                  
                                System.out.println("The computer removed " + comRemoveOne + " from pile A");
                            } 
                            // If pile A is empty and pile B is not empty yet, then computer will remove from pile B
                            else if ((randPileNumberOne == 1)&&(randPileNumberTwo > 1)){
                                randPileNumberTwo = randPileNumberTwo - comRemoveTwo;
                                System.out.println("The computer removed " + comRemoveTwo + " from pile B");
                            }    
                            // If pile A is empty and pile C is not empty yet, then computer will remove from pile C
                            else if ((randPileNumberOne == 1)&&(randPileNumberThree > 1)){
                                randPileNumberThree = randPileNumberThree - comRemoveThree;
                                System.out.println("The computer removed " + comRemoveThree + " from pile C");
                            } 
                            // If pile B still have sticks, then the computer will choose remove from pile B 
                            else if(randPileNumberTwo > 1){
                                randPileNumberTwo = randPileNumberTwo - comRemoveTwo;                  
                                System.out.println("The computer removed " + comRemoveTwo + " from pile B");
                            }    
                            // If pile B is empty and pile A is not empty yet, then computer will remove from pile A
                            else if((randPileNumberTwo == 1)&&(randPileNumberOne > 1)){
                                randPileNumberOne = randPileNumberOne - comRemoveOne;
                                System.out.println("The computer removed " + comRemoveOne + " from pile A");
                            }
                            // If pile B is empty and pile C is not empty yet, then computer will remove from pile C
                            else if ((randPileNumberTwo == 1)&&(randPileNumberThree > 1)){
                                randPileNumberThree = randPileNumberThree - comRemoveThree;
                                System.out.println("The computer removed " + comRemoveThree + " from pile C");
                            }
                            // If pile C still have sticks, then the computer will choose remove from pile C 
                            else if(randPileNumberThree > 1){
                                randPileNumberThree = randPileNumberThree - comRemoveThree;
                                System.out.println("The computer removed " + comRemoveThree + " from pile C");
                            }
                            // If pile C is empty and pile A is not empty yet, then computer will remove from pile A
                            else if((randPileNumberThree == 1)&&(randPileNumberOne > 1)){
                                randPileNumberOne = randPileNumberOne - comRemoveOne;                  
                                System.out.println("The computer removed " + comRemoveOne + " from pile A");
                            }
                            // If pile C is empty and pile B is not empty yet, then computer will remove from pile B
                            else if((randPileNumberThree == 1)&&(randPileNumberTwo > 1)){
                                randPileNumberTwo = randPileNumberTwo - comRemoveTwo;
                                System.out.println("The computer removed " + comRemoveTwo + " from pile B");
                            }
                            // These lines of code below were done to refresh the code of the amount of sticks left after computers turn
                            pileA = "A: ";
                            pileB = "B: ";
                            pileC = "C: ";
                            randTotal = randPileNumberThree + randPileNumberTwo + randPileNumberOne;
                        }
                        
                        // If the total of the three pile is one stick, thus the next player will have to pick it up and face a lose. To be nice, the below code
                        // elminates the fact that player needs to pick up the last stick and lose 
                        if(randTotal == 1){
    
                            if(i%2 == 0){
                                System.out.println(computer + " , there is only one stick left, so you have to pick it up, thus " + playerName + " won");
                            }
                            else{
                                System.out.println(playerName + " , there is only one stick left, so you have to pick it up, thus " + computer + " won");
                            }
                        }
                    }
                }
            }
            // If the player chose to play against friend, code prompts for both players' names and stores it in two strings; playerOne and playerTwo. Code will also
            // provide a description of the game.
            else if (gameOpponent.equals("friend")){
                correctGameOppoent = true;
                System.out.println("Player one enter your name");
                String playerOne = reader.nextLine();
                System.out.println("Player two enter your name");
                String playerTwo = reader.nextLine();
                System.out.println("Welcome to the game of Nim. In this game, " + playerOne + " and " + playerTwo + " will be given three piles of sticks. Who ever picks up the last stick of the three piles is the loser.");
                
                // If the total of the three piles does not euqal to one, that means the game cannot possibly finish next round, thus loops until the total of stick 
                // in all three piles to be one.   
                while(randTotal > 1){     
                 
                    // This for loop increases the value of o by 1 starting from 1 until the total sum of all three piles of stick is equal to one
                    for (;o/randTotal != o; o++){
                        
                        // If the value of o is divisble by 2, then, it is player one's turn
                        if (o%2 == 0){
                            System.out.println(playerOne + "'s turn");
                        }
                        // If the value of o is not divisble by 2, then, it is player two's turn
                        else if (o%2 != 0){
                            System.out.println(playerTwo + "'s turn");
                        }
                        // The following lines print a random number of stars between the range of 1-10 for three piles, pile A, B and C
                        System.out.println("Here are the three piles");
                        System.out.println();
                        System.out.print(pileA);

                        // A for loop used to print a random number of stars between the range of 1-10 for pile A
                        for (int j = 0; j < randPileNumberOne; j++){
                            System.out.print(symbol);
                        }
                        System.out.println();
                        System.out.print(pileB);

                        // A for loop used to print a random number of stars between the range of 1-10 for pile B
                        for (int a = 0; a < randPileNumberTwo; a++){
                            System.out.print(symbol);
                        }
                        System.out.println();
                        System.out.print(pileC);
                    
                        // A for loop used to print a random number of stars between the range of 1-10 for pile C
                        for (int b = 0; b < randPileNumberThree; b++){
                            System.out.print(symbol);
                        }
                        // Prompts the player of the current turn to choose a pile and the amount of sticks they would like to remove from this pile
                        System.out.println();
                        System.out.print("Please choose a pile: ");
                        String pileGroup = reader.nextLine();
                        System.out.print("Please determine an amount of sticks you would like to remove: ");
                        int removeAmount = reader.nextInt(); 
                        reader.nextLine();

                        // If the selected pile group of the three no longer have any sticks, the program will prompt the user to enter a pile group which does have at least one stick
                        if ((pileGroup.equals("C")&&(randPileNumberThree == 0)) || (pileGroup.equals("B")&&randPileNumberTwo == 0) || (pileGroup.equals("A")&&randPileNumberOne == 0)){
                            correctPileGroup = false;
                            System.out.println("Nice try, but this pile is empty. Please pick a pile where there are sticks.");
                            pileGroup = reader.nextLine();
                        }
                        // If the choosen group is A, then the program continues to ask the player the amount of sticks he/she would like to remove
                        else if (pileGroup.equals("A")){
                            correctPileGroup = true;
                            // A do while loop for if the entered stick removing amount is not realistic, then the code will loop until it receives an input that is realisitic
                            do{
                                // If the player entered a removing stick number that is greater than the number of sticks there is in the pile, it's not realisitc, thus, loops until realistic answer
                                if (removeAmount > randPileNumberOne){
                                    correctRemoveAmount = false;
                                    System.out.println("You cannot remove " + removeAmount + " sticks when there's only " + randPileNumberOne + " in this pile. Please enter again");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                                // If the player enters 0 sticks to remove, he is trying to cheat as the rules state to remove at least one stick. Thus, it's not realisitci, loops until realisitic answer
                                else if(removeAmount == 0){
                                    correctRemoveAmount = false;
                                    System.out.println("You must remove at least one stick.");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                                // If the player enters a removing stick number that is smaller than or equal to the number of sticks there actually is, it is realisitic, thus ends the loop and ends turn for player
                                else if (removeAmount <= randPileNumberOne){
                                    correctRemoveAmount = true;
                                // for everything else, it is not a valid answer, unrealisitic, thus, will loop until system receives a realisitic answer
                                }
                                else{
                                    correctRemoveAmount = false;
                                    System.out.println("Invalid Input");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                            }while(!(correctRemoveAmount));
                            // This line is written to refresh the code with the new number of the sticks in the pile after player removed some
                            randPileNumberOne = randPileNumberOne - removeAmount;
                        }
                        // If the choosen group is B, then the program continues to ask the player the amount of sticks he/she would like to remove
                        else if (pileGroup.equals("B")){
                            correctPileGroup = true;
                            // A do while loop for if the entered stick removing amount is not realistic, then the code will loop until it receives an input that is realisitic
                            do{
                                // If the player entered a removing stick number that is greater than the number of sticks there is in the pile, it's not realisitc, thus, loops until realistic answer
                                if (removeAmount > randPileNumberTwo){
                                    correctRemoveAmount = false;
                                    System.out.println("You cannot remove " + removeAmount + " sticks when there's only " + randPileNumberTwo + " in this pile. Please enter again");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                                // If the player enters 0 sticks to remove, he is trying to cheat as the rules state to remove at least one stick. Thus, it's not realisitci, loops until realisitic answer
                                else if(removeAmount == 0){
                                    correctRemoveAmount = false;
                                    System.out.println("You must remove at least one stick.");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                } 
                                // If the player enters a removing stick number that is smaller than or equal to the number of sticks there actually is, it is realisitic, thus ends the loop and ends turn for player
                                else if (removeAmount <= randPileNumberTwo){
                                    correctRemoveAmount = true;
                                }
                                // for everything else, it is not a valid answer, unrealisitic, thus, will loop until system receives a realisitic answer
                                else{
                                    correctRemoveAmount = false;
                                    System.out.println("Invalid Input");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                            }while(!(correctRemoveAmount));
                            // This line is written to refresh the code with the new number of the sticks in the pile after player removed some
                            randPileNumberTwo = randPileNumberTwo - removeAmount;
                        }
                        // If the choosen group is C, then the program continues to ask the player the amount of sticks he/she would like to remove
                        else if (pileGroup.equals("C")){
                            correctPileGroup = true;
                            // A do while loop for if the entered stick removing amount is not realistic, then the code will loop until it receives an input that is realisitic
                            do{
                                // If the player entered a removing stick number that is greater than the number of sticks there is in the pile, it's not realisitc, thus, loops until realistic answer
                                if (removeAmount > randPileNumberThree){
                                    correctRemoveAmount = false;
                                    System.out.println("You cannot remove " + removeAmount + " sticks when there's only " + randPileNumberThree + " in this pile. Please enter again");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                                // If the player enters 0 sticks to remove, he is trying to cheat as the rules state to remove at least one stick. Thus, it's not realisitci, loops until realisitic answer
                                else if(removeAmount == 0){
                                    correctRemoveAmount = false;
                                    System.out.println("You must remove at least one stick.");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                                // If the player enters a removing stick number that is smaller than or equal to the number of sticks there actually is, it is realisitic, thus ends the loop and ends turn for player
                                else if (removeAmount <= randPileNumberThree){
                                    correctRemoveAmount = true;
                                }
                                // for everything else, it is not a valid answer, unrealisitic, thus, will loop until system receives a realisitic answer
                                else{
                                    correctRemoveAmount = false;
                                    System.out.println("Invalid Input");
                                    removeAmount = reader.nextInt();
                                    reader.nextLine();
                                }
                            }while(!(correctRemoveAmount));
                            // This line is written to refresh the code with the new number of the sticks in the pile after player removed some
                            randPileNumberThree = randPileNumberThree - removeAmount;
                        }
                        // If the player did not enter group A,B or C, then the input is wrong thus program will loop to ask the player to enter either A,B or C and have him input again
                        else {
                            correctPileGroup = false;
                            System.out.println("Invalid Input, please enter either group A,B or C");
                            pileGroup = reader.nextLine();
                        }
                        // These lines of code are used to refresh the amount of sticks left to display for each of the three piles after players' turns
                        pileA = "A:";
                        pileB = "B:";
                        pileC = "C:";
                        randTotal = randPileNumberThree + randPileNumberTwo + randPileNumberOne;
                        // When the total of the three piles is just one stick, the next player will lose for sure, to be nice to him, code will just say he lost and make the other player winner
                        if(randTotal == 1){

                            if(o%2 == 0){
                                System.out.println(playerTwo + " , there is only one stick left, so you have to pick it up, thus " + playerOne + " won");
                            }
                            else{
                                System.out.println(playerOne + " , there is only one stick left, so you have to pick it up, thus " + playerTwo + " won");
                            }
                        }
                    }
                }
            }
            // If the player inputed something that is not com nor friend. It is not a valid input, thus, the code will loop until either friend or com is inputed.
            else {
                correctGameOppoent = false;
                System.out.println("Invalid Input, please enter either com/friend");
                gameOpponent = reader.nextLine();
            }
        }while(!(correctGameOppoent));
        // Closes the stream and release the resources that were busy in the stream
        reader.close();
    }
}