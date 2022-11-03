package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] mainUnsortedArray = {5,1,3,2,4};
        Cycle_Sort(mainUnsortedArray);
        System.out.println(Arrays.toString(mainUnsortedArray));
    }

    public static void Cycle_Sort(int[] BunchOfUnsortedValues){
        int indexOfValue = 0;
        while(indexOfValue < BunchOfUnsortedValues.length){
            int rightPosition = BunchOfUnsortedValues[indexOfValue] - 1;

            if(indexOfValue != rightPosition){
                swapToRightPosition(BunchOfUnsortedValues,indexOfValue,rightPosition);
            }
            else{
                indexOfValue++;
            }

        }
    }

    private static void swapToRightPosition(int[] bunchOfUnsortedValues, int indexOfValue, int rightPosition) {
        int temp = bunchOfUnsortedValues[indexOfValue];
        bunchOfUnsortedValues[indexOfValue] = bunchOfUnsortedValues[rightPosition];
        bunchOfUnsortedValues[rightPosition] = temp;
    }
}