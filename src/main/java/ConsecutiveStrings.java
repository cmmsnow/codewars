public class ConsecutiveStrings {

    //Return the first longest string consisting of k consecutive strings taken in the array.
    public String concatLongest(String[] array, Integer numOfStrings){
        String firstLongest = array[0] + array[1];
        //concat number of strings together via for loops, and compare length to length of saved String
        for (int i=1; i<array.length-(numOfStrings-1); i++){
            String concatted = array[i];
            for (int j=i+1; j<=numOfStrings; j++){
                concatted += array[j];
            }
            //save longest string to variable if greater than length of current saved
            if (concatted.length() > firstLongest.length()){
                firstLongest = concatted;
            }
        }
        //return longest string
        return firstLongest;
    }
}
