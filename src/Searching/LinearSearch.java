package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] BunchOfValues = {1,7,2,9,4,3,0,8,11};
        int targetValue = 11;
        boolean result = LinearS(BunchOfValues,targetValue);
        System.out.println(result);
    }


    public static boolean LinearS(int[] BunchOfValues, int targetValue){
        for (int eachIndexInBunchOfValues = 0; eachIndexInBunchOfValues < BunchOfValues.length; eachIndexInBunchOfValues++) {
            if(BunchOfValues[eachIndexInBunchOfValues] == targetValue){
                return true;
            }
        }
        return false;
    }
}