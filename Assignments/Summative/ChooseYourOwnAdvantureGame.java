/*
* Date: 2021 March 3rd
* Name: William Wu
* Teacher: Mr.Ho
* Description: Choose Your Own Advanture Game summative assignment
**/

package Assignments.Summative;

// Random package I will use to generate my random numbers
import java.util.Random;
// Use a package called scanner in order for the program to take in user inputs
import java.util.Scanner;

class ChooseYourOwnAdvantureGame {
    public static void main(String[] args){

        // Initialize random
        Random rand = new Random() ;

        // Declaring all necessary variables or just initializing Scanner
        Scanner reader = new Scanner(System.in);

        // Setting the min and max variables to use as the random min and max values the random number generator will generate
        int min = 0;
        int max = 10;
                  
        // Setting the min and max values the random number generator will generate
        int randNum = rand.nextInt(max-min) + min;
        int randNum2 = rand.nextInt(max-min) + min;
        int randNum3 = rand.nextInt(max-min) + min;

        // Setting an double that stores the product of randNum,randNum2 and randNum3
        double answer = randNum * randNum2 * randNum3;
        
        int randNum4 = rand.nextInt(100);



        // Introducing the users of the game
        System.out.println("Welcome to William Wu's Advanture!");
        System.out.println("");
        
        // Prompting the reader to make the first choice to either kick or leave an object
        System.out.println("You are inside an escape room without any light, infront of you is a dark object. Would you like to 'kick it' or 'leave it' alone?");
        System.out.println("Please enter either 'kick it' or 'leave it'.");
        String powerHealth = reader.nextLine();
        
        // Prompting the reader to decide to either turn on the light or not if the user decided to kick the unkown object
        if (powerHealth.equals("kick it")){
            System.out.println("You decided to kick this object and completly destroyed it. Afterwards, you spotted an light switch. Would you like to turn it 'on' or 'leave it' and continue to try and escape but without any lights.");
            System.out.println("Please enter either 'on' or 'leave it' ");
            String light = reader.nextLine();
            
            // If the user decides to turn on the lights but kicked the power switch
            if (light.equals("on") && (powerHealth.equals("kick it"))){
                System.out.println("The object you broke in the beginning is the power switch, you cannot turn on the light without power. Would you like to 'give up' and ring the help bell or 'keep trying' to find a way out without the light ");
                System.out.println("Please enter either 'give up' or 'keep trying' ");
                String decision = reader.nextLine();
            
                // If the user decided to give up and ring the bell but kicked the power switch or if the user decided to keep trying to escape
                // or if the user inputed an invalid input
                if (decision.equals("give up") && (powerHealth.equals("kick it"))){
                    System.out.println("Since the help bell is based on power, that means you cannot get any help and is now trapped!");
                    System.out.println("Adventure ends here."); 
                }
                else if (decision.equals("keep trying")){
                    System.out.println("You decided to keep searching for an escape route with power off. However, due to limited vision, you failed to find a single way to get out");
                    System.out.println("Adventure ends here.");
                }
                else {
                    System.out.println("Invalid Input.");
                    String againOne = reader.nextLine();
                    
                }
            }
            // If the user decided leave the lights off
            else if (light.equals("leave it")){
                System.out.println("You decided to search in the darkness. Soon enough, you felt an object that is locked but could be opened. Would you like to 'break' open the lock on the object or 'leave it'?");
                System.out.println("Please enter either 'break' or 'leave it'.");
                String windowOpen = reader.nextLine();
                
                // If the user decided to break open the lock on the object
                if (windowOpen.equals("break")){
                    System.out.println("Are you breaking it with 'force' or is just 'staring' down the lock hoping it would open?");
                    System.out.println("Please enter either 'force' or 'staring' ");
                    String windowOpenForce = reader.nextLine();
                
                    // If the user is breaking the lock with force or is just staring at it
                    // or if the user inputed an invalid input
                    if (windowOpen.equals("break") && windowOpenForce.equals("force")){
                        System.out.println("You broke the lock of the window and accidentally fell out of the escape room on a three story building from the window! In the end, you escaped the room with an injury.");
                        System.out.println("Advanture ends here.");
                    }
                    else if (windowOpen.equals("break") && windowOpenForce.equals("staring")){
                        System.out.println("Your attempt to breaking open the locked object is unsucessful and could not find anyother way out in the darkness.");
                        System.out.println("Advanture ends here. ");
                    }
                    else{
                        System.out.println("Invalid input. Please enter again");
                        String reInput = reader.nextLine();
                        reInput.equals(windowOpenForce); 
                        String againTwo = reader.nextLine();
                    }
                }
                // If the user does not want to break the lock on the mysterious object
                // or if the user inputed an invalid input
                else if (windowOpen.equals("leave it")) {
                    System.out.println("You decided to leave the lock on the mysterious object. As time pass by, you fail to find anyother way to escape the room.");
                    System.out.println("Adventure ends here");
                }
                else{
                    System.out.println("Invalid Input. Please enter again");
                    String againThree = reader.nextLine();
                }
            }
            // If the user inputed an invalid input
            else {
                System.out.println("Invalid Input.");
                String againFour = reader.nextLine();
            }
        }
        // If the user decided not to kick the mysterious object
        else if (powerHealth.equals("leave it")){
            System.out.println("You decided to leave this object as is. As you continue your search to leave the room, you soon spotted an light switch. Would you like to turn it 'on' or 'leave it' and continue searching for an escape without any lights.");
            System.out.println("Please enter either 'on' or 'leave it' ");
            String light = reader.nextLine();
            
            // Prompt the user to chose a way to unlock the front door if the user turned on the light
            if (light.equals("on")&&(powerHealth.equals("leave it"))){
                System.out.println("Your vision is now clear with the lights on. After a while of searching, you found a rusted key that could only be used once to the escape room through the locked front door. Would you like to try opening the lock of the room handelling the key 'carefully' or 'carelessly' to which of the two locks on the front door ; 'lock a' or 'lock b'?");
                System.out.println("Please enter either 'carefully' or 'carelessly' ");
                String keyHealth = reader.nextLine();
                System.out.println("Please enter either 'lock a' or 'lock b' ");
                String lockchoice = reader.nextLine();

                // If the user opened the door with the correct way or the wrong wat
                // or if the user inputed and invalid input
                if (keyHealth.equals("carefully")&&(lockchoice.equals("lock a"))){
                    System.out.println("You carefully unlocked the correct lock using the rusted key! Good job! You have just succesfully got out of the escape room!");
                    System.out.println("Adventure ends here. ");
                }
                else if (keyHealth.equals("carelessly")&&(lockchoice.equals("lock a"))){
                    System.out.println("You broke the key while inserting it into lock a carelessly.");
                    System.out.println("Adventure ends here.");
                }
                else if (keyHealth.equals("carefully")&&lockchoice.equals("lock b")||(keyHealth.equals("carelessly")&&lockchoice.equals("lock b"))){
                    System.out.println("You chose the wrong lock and cannot use the key again.");
                    System.out.println("Adventure ends here as you fail to find another escape route.");
                }
                else{
                    System.out.println("Invalid input");
                    String againFive = reader.nextLine();
                }
            }
            // Prompt the user to either read or not read a piece of paper in the darkness
            else{
                System.out.println("You decided to search in the darkness. Soon enough, you find a scroll of paper.");
                System.out.println("would you like to unscroll it up and 'read' it or 'ignore' it?");
                System.out.println("Please enter 'read' or 'ignore' ");
                String knowPassword = reader.nextLine();

                // If the user wanted to read the paper
                if (knowPassword.equals("read")){
                    System.out.println("You unscrolled the paper, on the paper, it wrote; Password: Password");
                }
                    // Prompt the user to chose to open a wall  door
                    System.out.println("A bit later, you find a wall with a computer engraved in it. On the computer screen, it is asking for a password. Would you like to try and enter the password?");
                    System.out.println("Please enter 'yes' or 'ignore'.");
                    String computerInput = reader.nextLine();
                
                    // If the user decided to open the wall door
                    if (computerInput.equals("yes")){
                        System.out.println("Please enter the password");
                        String passwordInput = reader.nextLine();
                
                        // If the user enters the password correctly or incorrectly
                        if (knowPassword.equals("read") && (passwordInput.equals("Password"))){
                            System.out.println("Congrats! The wall opened and you got out of the escape room!");
                        }
                        else if (knowPassword.equals("ignore") && (passwordInput.equals("Password"))) {
                            System.out.println("How lucky, you guessed the password! The wall opened and you got out of the escape room");
                            System.out.println("Adventure ends here.");
                        }
                        else {
                            System.out.println("The password was incorrect and the computer screen went dark.");
                            System.out.println("You failed to find another escape route, adventure ends here.");
                        }
                    }  
                    // Prompt the user to keep a lighter found on the ground or leave it If the user chose to ignore the wall door
                    else if (computerInput.equals("ignore")){
                        System.out.println("You chose to ignore the wall. On your way to searching for another way to escape, you find a lighter. Would you like to 'keep it' or 'leave it'."); 
                        System.out.println("Please enter either 'keep it' or 'leave it' ");
                        String lighterOrNot = reader.nextLine();
                        // Prompt the user to decide if they will try to escape through the door with an electric lock
                        System.out.println("Soon after the discovery of the lighter, you finds an another metal door. It is locked with a electric lock that is changing password every hour. Beside the door is a table. On it, was a computer, an ipad and a piece of paper.");
                        System.out.println("The paper reads: You will be given two chances only to solve a mystery shown on the ipad. Should you choose to solve the problem is up to you. When you finish the question and enter the answer on the computer, the password to the lock will be printed from the printer beside you. You will have only one chance to enter the correct password for the electric lock. Good luck!");
                        System.out.println("Please enter 'I will try' if you wish to try solve the problem, other wise, enter 'ignore'.");
                        String choice = reader.nextLine();
                    
                        // If the user decided to try escape this way
                        if (choice.equals("I will try")){
                            System.out.println("The ipad randomlized three numbers show below: ");
                            System.out.println("Number 1 is " + randNum);
                            System.out.println("Number 2 is " + randNum2);
                            System.out.println("Number 3 is " + randNum3);
                            System.out.println("Ipad: Please find the product of the three numbers shown above and input it in the computer");
                            
                            int answerInput = reader.nextInt();

                            // Prompt the user to either enter the answer to the question to the lock code if answer was correct
                            if (answerInput == answer){
                                System.out.println("You solved the mystery! Congradulations!");
                                System.out.println("The current password to the lock is " + randNum4);
                                System.out.println("Would you like to enter the password into the electric lock?");
                                System.out.println("Please enter either 'yes' or 'no'.");
                                reader.nextLine();
                                String exitOrNot = reader.nextLine();
                            
                                // If reader decided to enter the code to the lock
                                if (exitOrNot.equals("yes")){
                                    System.out.println("Please enter the password to the lock");
                                    int lockOpen = reader.nextInt();

                                    // If reader entered the correct code to the lock or did not enter the correct code.
                                    if (lockOpen == randNum4){
                                        System.out.println("Congradulations, you opened the door and escaped from the escape room!");
                                        System.out.println("Adventure ends here.");
                                    }
                                    else {
                                        System.out.println("The password is incorrect. You used up your only chance to open the door but failed to open the door. You continued to look for another way to escape and could not find any other way to escape the room.");
                                        System.out.println("Adventure ends here.");
                                    }
                                }
                                // If the reader decided not the enter the code to the lock or entered an invalid input
                                else if (exitOrNot.equals("no")){
                                    System.out.println("You decided to not enter the passord into the lock despite the fact that you have the password. You walked off to find another way to escape but failed to succeed.");
                                    System.out.println("Adventure ends here.");
                                }
                                else{
                                    System.out.println("Invalid Input.");
                                    String againSeven = reader.nextLine();
                                }
                            }
                            // Prompt the user to try again if the user did not solve the problem to the code of the lock or typed an wrong answer
                            else if (answerInput != answer){
                                System.out.println("Incorrect answer. Would you like to try again?");
                                System.out.println("Please enter either 'yes' or no.");
                                String secondTry = reader.nextLine();
                                
                                // If user decided to try again
                                if (secondTry.equals("yes")){
                                    System.out.println("The ipad randomlized three numbers again shown below: ");
                                    System.out.println("Number 1 is " + randNum);
                                    System.out.println("Number 2 is " + randNum2);
                                    System.out.println("Number 3 is " + randNum3);
                                    System.out.println("Ipad: Please find the product of the three numbers shown above and input it in the computer");
                                    int answerInputAgain = reader.nextInt();

                                    reader.nextLine();
                                    
                                    // If the user got the answer to the mystery
                                    if (answerInputAgain == answer){
                                        System.out.println("You solved the mystery! Congradulations!");
                                        System.out.println("The current password to the lock is " + randNum4);
                                        System.out.println("Would you like to enter the password into the electric lock?");
                                        System.out.println("Please enter either 'yes' or 'no'.");
                                        String exitOrNotTwo = reader.nextLine();
                                    
                                        // If the user decided to try and enter the code of the lock to the lock
                                        if (exitOrNotTwo.equals("yes")){
                                            System.out.println("Please enter the password to the lock");
                                            int lockOpenTwo = reader.nextInt();
        
                                            // If the user entered the correct code to the lock or the incorrect code to the lock
                                            if (lockOpenTwo == randNum4){
                                                System.out.println("Congradulations, you opened the door and escaped from the escape room!");
                                                System.out.println("Adventure ends here.");
                                            }
                                            else {
                                                System.out.println("The password is incorrect. You used up your only chance to open the door but failed to open the door. You continued to look for another way to escape and could not find any other way to escape the room.");
                                                System.out.println("Adventure ends here.");
                                            }
                                        }
                                        // If the user chose not to enter the code to the lock or if the user typed an invalid input
                                        else if (exitOrNotTwo.equals("no")){
                                            System.out.println("You decided to not enter the passord into the lock despite the fact that you have the password. You walked off to find another way to escape but failed to succeed.");
                                            System.out.println("Adventure ends here.");
                                        }
                                        else{
                                            System.out.println("Invalid Input.");
                                            String againEight = reader.nextLine();
                                        }
                                    }
                                }
                            }
                        }
                        // Present to the user a pack of cigar and prompt the user to either smoke it or not if the user decided not to escape 
                        // through the electric locked door
                        else if (choice.equals("ignore")){
                            System.out.println("You decided to walk away from what seems like a way to escape the room. During another hour of constant searching for an escape route, you found a brand new pack of cigar. Would you like to 'smoke it' or 'ignore' it.");
                            System.out.println("Please enter either 'smoke it' or 'ignore it'.");
                            String smokeOrNot = reader.nextLine();

                            // If the reader decided to smoke the cigar and kept the lighter from before, did not keep the lighter from before
                            // or if the reader decided to not smoke the cigar and ignore it or inputed and invalid input
                            if (smokeOrNot.equals("smoke it") && (lighterOrNot.equals("keep it"))){
                                System.out.println("You opened the pack of cigar and lit it using the lighter that you found previously. However, the momment you lit the cigar, the smoke sensor was triggered. You were rescued out of the escape room by the escape room staffs. After they learned what had happened, they kicked you out of the escape room.");
                                System.out.println("Adventure ends here.");
                            }
                            else if (smokeOrNot.equals("smoke it") && (lighterOrNot.equals("leave it"))) {
                                System.out.println("You do not have any lighter to smoke. Afterwards, you failed to find a single way to escape the room.");
                                System.out.println("Adventure ends here.");
                            }
                            else if (smokeOrNot.equals("ignore it") && (lighterOrNot.equals("keep it"))){
                                System.out.println("You ignored the cigars and continued to search to a way to escape. However, you have failed to discover a single escape route.");
                                System.out.println("Adventure ends here.");
                            }
                            else {
                                System.out.println("Invalid Input.");
                                String againNine = reader.nextLine();
                            }
                        }
                        // If the user inputed an invalid input
                        else{
                            System.out.println("Invalid input.");
                            String againTen = reader.nextLine();
                        }
                    }
                // If the user inputed an invalid input
                else {
                    System.out.println("Invalide input.");
                    String againEleven = reader.nextLine();
                }
            }
        }
        // If the user inputed an invalid input
        else {
            System.out.println("Invalide input.");
            String againTwelve = reader.nextLine();
        }

        // Closes the stream and rekease the resources that were busy in the stream
        reader.close();
    }
}