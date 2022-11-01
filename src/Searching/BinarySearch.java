package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] BunchOfValues = {0,1,7,8,9,10,11};
        int targetValue = 17;
        boolean result = Binary_Search(BunchOfValues,targetValue);
        System.out.println(result);
    }


    public static boolean Binary_Search(int[] BunchOfSortedValues ,int TargetValue){
        int FirstIndexOfSortedValues = 0;
        int LastIndexOfSortedValues = BunchOfSortedValues.length - 1;

        while(FirstIndexOfSortedValues <= LastIndexOfSortedValues){
            // calculate the middle of the sorted array
            int MiddleOfSortedValues = FirstIndexOfSortedValues + (LastIndexOfSortedValues - FirstIndexOfSortedValues) / 2;

            // checking the visibility
            if(TargetValue == BunchOfSortedValues[MiddleOfSortedValues]){
                return true;
            }
            else if(TargetValue < BunchOfSortedValues[MiddleOfSortedValues]){
                LastIndexOfSortedValues = MiddleOfSortedValues - 1;
            }
            else {
                FirstIndexOfSortedValues = MiddleOfSortedValues + 1;
            }

        }

        // cannot find it
        return false;
    }
}