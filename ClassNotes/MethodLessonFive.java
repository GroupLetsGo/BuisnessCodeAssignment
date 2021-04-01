/*
* Date: 2021 March 24 2021
* Name: William Wu
* Teacher: Mr.Ho
* Descriptino: String Methods and Typecasting
**/

package ClassNotes;

class MethodLessonFive {
    public static void main(String[] args){
        // We use Typecasting b/c a street name is a combination of numbers and letters and thus must be a String
        // String nums cant do math sp we just Typecasting to convert string nums into nums that can do math
        String placeOne = "100 Donald Sim Aves";
        String placeTwo = "101 Donald Sim Aves";

        System.out.println(isNeighbour(placeOne, placeTwo));

        // To be neighbours, you must share the same street name AND your street num must be +/- 1 from each other
        // 1. Get the street number
        //         a) Search for the blank space between the street number and name
                    int location  = findSpace(placeOne);
                    System.out.println(location);
        //         b) Convert the String into a number that we can use
                    int num = getStreetNum(placeOne, location);
                    System.out.println(num);
        // 2. Compare street numbers to each other
    }
    /*
    * Checks for neighbours by checking if they have the following characteristics
    * your street num must be +/- 1 from each other
    * Optional: same street name
    *
    * @param addressOne - Address formated with the street number before street name
    * @param addressTwo - Address formated with the street number before street name
    *
    * @returns - boolean indicating whether these two addresses are next to reach other
    */
    public static boolean isNeighbour(String addressOne, String addressTwo){
        int addressOneIndex = findSpace(addressOne);
        int addressOneNum = getStreetNum(addressOne, addressOneIndex);

        int addressTwoIndex = findSpace(addressTwo);
        int addressTwoNum = getStreetNum(addressTwo, addressTwoIndex);

        int diff = addressOneNum - addressTwoNum;

        if (diff == 1 || diff == -1){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    * Find the first blank space within a String
    *
    * @param address - A string containing a number at the beginning, seperated by a space
    * @return num - the index of the blank space
    */
    public static int findSpace(String address){
        int len = address.length();
        for (int i = 0; i < len; i++){
            // If statement to check for the blank space
            // Chars must use only == and ' ', do not use .equal and " "
            if(address.charAt(i) == ' '){
                return i;
            }
        }
        // Base case for if there is a string that has no spaces
        return 0;
    }
    /*
    * Gets the street number of an address and outputs it as a string
    *
    * @param address - A string containing a street number and street name
    * @param loc - index where the street number is split from the street name
    * @return num - The integer value of the street number
    */
    public static int getStreetNum(String address, int loc){
        String streetNum = address.substring(0, loc);
        int num = Integer.parseInt(streetNum);
        return num;
    }
}