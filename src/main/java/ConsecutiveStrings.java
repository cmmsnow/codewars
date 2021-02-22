public class ConsecutiveStrings {

    // still needs debugging

    /**
     * @param array
     * @param k
     * @return the first longest string consisting of k consecutive strings taken in the array.
     */
    public String concatLongest(String[] array, Integer k){
        //if ((array.length < k) || (k == 0)){ return ""; }
        String firstLongest = "";
        //concat number of strings together via for loops, and compare length to length of saved String
        for (int i=0; i<array.length-(k-1); i++){
            String concatted = array[i];
            for (int j=i+1; j<k; j++){
                concatted += array[j];
            }
            //save longest string to variable if greater than length of current saved
            if (concatted.length() > firstLongest.length()){ firstLongest = concatted; }
        }
        return firstLongest;
    }
}
