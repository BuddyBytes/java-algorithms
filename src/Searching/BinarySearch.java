package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] BunchOfValues = {0,1,7,8,9,10,11};
        int[] SecondBunchOfValues = {11,10,9,8,7,1,0};
        int targetValue = 7;
        boolean result = Binary_Search(BunchOfValues,targetValue);
        System.out.println(result);
        boolean result_1 = Binary_Search(SecondBunchOfValues,targetValue);
        System.out.println(result_1);
    }


    public static boolean Binary_Search(int[] BunchOfSortedValues ,int TargetValue){
        boolean descendingOrInverse = false;
        if(BunchOfSortedValues[0] > BunchOfSortedValues[BunchOfSortedValues.length-1]){
            descendingOrInverse = true;
        }
        int FirstIndexOfSortedValues = 0;
        int LastIndexOfSortedValues = BunchOfSortedValues.length - 1;

        while(FirstIndexOfSortedValues <= LastIndexOfSortedValues){
            // calculate the middle of the sorted array
            int MiddleOfSortedValues = FirstIndexOfSortedValues + (LastIndexOfSortedValues - FirstIndexOfSortedValues) / 2;

            // checking the visibility
            if(TargetValue == BunchOfSortedValues[MiddleOfSortedValues]){
                return true;
            }

            if(!descendingOrInverse){
                if(TargetValue < BunchOfSortedValues[MiddleOfSortedValues]){
                    LastIndexOfSortedValues = MiddleOfSortedValues - 1;
                }
                else {
                    FirstIndexOfSortedValues = MiddleOfSortedValues + 1;
                }
            }
            else {
                if(TargetValue < BunchOfSortedValues[MiddleOfSortedValues]){
                    FirstIndexOfSortedValues = MiddleOfSortedValues + 1;
                }
                else {
                    LastIndexOfSortedValues = MiddleOfSortedValues - 1;
                }
            }

        }

        // cannot find it
        return false;
    }
}