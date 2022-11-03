package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] mainUnsortedArray = {8,7,6,1,0};
        InsertionSort(mainUnsortedArray);
        System.out.println(Arrays.toString(mainUnsortedArray));
    }

    public static void InsertionSort(int[] BunchOfUnsortedValues){
        for (int eachIndexOfUnsortedValues = 0; eachIndexOfUnsortedValues < BunchOfUnsortedValues.length; eachIndexOfUnsortedValues++) {
            int maxElement = maxElementInUnsortedArray(BunchOfUnsortedValues,BunchOfUnsortedValues.length-eachIndexOfUnsortedValues);
            if(maxElement == Integer.MAX_VALUE){
                System.out.println("all sorted");
                return;
            }
            swapRightPosition(BunchOfUnsortedValues, maxElement,BunchOfUnsortedValues.length-eachIndexOfUnsortedValues-1);

        }

    }



    private static int maxElementInUnsortedArray(int[] UnsortedArray,int lastIndexOfUnsortedArray) {
        int indexOfMaxValue = 0;
        boolean rightPosition = false;
        for (int firstIndexOfSecondUnsortedArray = 1 ; firstIndexOfSecondUnsortedArray < lastIndexOfUnsortedArray; firstIndexOfSecondUnsortedArray++) {
            if(UnsortedArray[indexOfMaxValue] < UnsortedArray[firstIndexOfSecondUnsortedArray]){
                rightPosition = true;
                indexOfMaxValue = firstIndexOfSecondUnsortedArray;
            }
        }
        if (!rightPosition){
            return Integer.MAX_VALUE;
        }
        
        return indexOfMaxValue;
    }

    private static void swapRightPosition(int[] UnsortedArray,int maxElement, int lastIndex) {
        int temp = UnsortedArray[maxElement];
        UnsortedArray[maxElement] = UnsortedArray[lastIndex];
        UnsortedArray[lastIndex] = temp;

    }


}